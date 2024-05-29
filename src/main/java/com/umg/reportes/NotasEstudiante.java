
package com.umg.reportes;

/**
 *
 * @author DELL
 */
public class NotasEstudiante {
String noCarne;
String nombreApellidos;
Integer primerParcial;
Integer segundoParcial;
Integer actividades;
Integer evaluacionFinal;

    public NotasEstudiante() {
    }

    public NotasEstudiante(String noCarne, String nombreApellidos, Integer primerParcial, Integer segundoParcial, Integer actividades, Integer evaluacionFinal) {
        this.noCarne = noCarne;
        this.nombreApellidos = nombreApellidos;
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.actividades = actividades;
        this.evaluacionFinal = evaluacionFinal;
    }

    public String getNoCarne() {
        return noCarne;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public Integer getPrimerParcial() {
        return primerParcial;
    }

    public Integer getSegundoParcial() {
        return segundoParcial;
    }

    public Integer getActividades() {
        return actividades;
    }

    public Integer getEvaluacionFinal() {
        return evaluacionFinal;
    }

    public void setNoCarne(String noCarne) {
        this.noCarne = noCarne;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public void setPrimerParcial(Integer primerParcial) {
        this.primerParcial = primerParcial;
    }

    public void setSegundoParcial(Integer segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public void setActividades(Integer actividades) {
        this.actividades = actividades;
    }

    public void setEvaluacionFinal(Integer evaluacionFinal) {
        this.evaluacionFinal = evaluacionFinal;
    }

}
