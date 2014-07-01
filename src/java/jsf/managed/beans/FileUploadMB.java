/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rob.utiles.Utilidades;
import value.objects.FicheroSubido;
import value.objects.ListaFicherosSubidos;

/**
 *
 * @author Roberto
 */
@Named(value = "fileUploadMB")
@ViewScoped
public class FileUploadMB {

    private static final Logger _LOG = LoggerFactory.getLogger(FileUploadMB.class);

    private Part fichSubido1;
    private String fichOriginal;
    private String carpetaDestino;
    private String fichDestino;

    @Inject
    private MiSesionMB sesionMB;

    /**
     * Creates a new instance of FileUploadMB
     */
    public FileUploadMB() {
    }

    public Part getFichSubido1() {
        return fichSubido1;
    }

    public void setFichSubido1(Part fichSubido1) {
        this.fichSubido1 = fichSubido1;
    }

    public String getFichOriginal() {
        return fichOriginal;
    }

    public void setFichOriginal(String fichOriginal) {
        this.fichOriginal = fichOriginal;
    }

    public String getCarpetaDestino() {
        return carpetaDestino;
    }

    public void setCarpetaDestino(String carpetaDestino) {
        this.carpetaDestino = carpetaDestino;
    }

    public String getFichDestino() {
        return fichDestino;
    }

    public void setFichDestino(String fichDestino) {
        this.fichDestino = fichDestino;
    }

    public MiSesionMB getSesionMB() {
        return sesionMB;
    }

    public void setSesionMB(MiSesionMB sesionMB) {
        this.sesionMB = sesionMB;
    }

    private String extraeNombreFichero(Part part) {
        Integer indexFinal;
        Integer indexInicio;
        // En el mapa de Request, la propiedad "content-disposition" debe contener un valor 
        // similar a ==> form-data; name="formUploadJSF:j_idt6"; filename="miFicheroUpload.txt"
        String extractoCabecera = part.getHeader("content-disposition");
        String claveBuscada = "; filename=\"";

        indexInicio = extractoCabecera.indexOf(claveBuscada);
        if (indexInicio > -1) {
            indexInicio += claveBuscada.length();
            indexFinal = extractoCabecera.indexOf("\"", indexInicio + 1);
            return extractoCabecera.substring(indexInicio, indexFinal);
        }
        return null;
    }

    public String subirFich() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File outputFilePath = null;

        try {
            this.setFichOriginal(extraeNombreFichero(fichSubido1));
            _LOG.info("Ordenado upload del fichero ==> \"" + getFichOriginal() + "\"");

            this.setFichDestino("PACIENTE-" + Utilidades.timestampAsString() + getFichOriginal());
            _LOG.info("\"" + getFichOriginal() + "\": asignado nombre en destino: " + getFichDestino());

            // La ruta basePath debe existir en el filesystem, de lo contrario salta una Excepción
            setCarpetaDestino("C:" + File.separator + "temp" + File.separator);
            outputFilePath = new File(getCarpetaDestino() + getFichOriginal());
            _LOG.info("Ruta destino del fichero a subir ==> \"" + outputFilePath + "\"");

            inputStream = fichSubido1.getInputStream();
            _LOG.info("Creado input stream para fich. con características ==> \"" + getFichOriginal() + "\"");

            outputStream = new FileOutputStream(outputFilePath);
            _LOG.info("Creado un output stream al fichero ==> \"" + outputFilePath + "\"");

            int read = 0;
            final byte[] buffer = new byte[1024];

            _LOG.info("Comienzo de la lectura del stream de input para subir el fichero ==> \"" + outputFilePath + "\"");
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, read);
            }
            FacesMessage message = new FacesMessage("Subido fichero ", "\"" + getFichOriginal() + "\" con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);

            guardarReferenciaUpload();
        } catch (IOException e) {
            e.printStackTrace();
            _LOG.error("Excepción durante el upload del fichero ==> \"" + outputFilePath + "\"\n" + e.getMessage());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        return null;    // Tras upload, vuelve a la misma página
    }

    private void guardarReferenciaUpload() {

//        this.setFichDestino("PACIENTE-" + "FECHA-" + "DOCTOR-" + "TIPO.DOC");
        _LOG.info("Aquí va la creación de una referencia ÚNICA y de un título HUMANAMENTE LEGIBLE al fichero destino");
        
        if (sesionMB.getUltimosUploads() == null) {
            sesionMB.setUltimosUploads(new ListaFicherosSubidos());
        }
        FicheroSubido auxFichSubido = new FicheroSubido(getFichOriginal(), "Paciente uploaded", "Arriba");
        sesionMB.getUltimosUploads().addUploadRef(getFichOriginal(), auxFichSubido);
    }

}
