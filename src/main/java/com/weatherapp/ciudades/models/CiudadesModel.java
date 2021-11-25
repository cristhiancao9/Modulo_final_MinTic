package com.weatherapp.ciudades.models;

public class CiudadesModel {

    @Ciudades
    private String ciudades;
    private String fecha;
    private int horalocal;
    private int temperatura;
    private PaisesModel local;
    private CiudadesModel visitante;

    public String getCiudades() {
        return ciudades;
    }

    public void setCiudades(String ciudades) {
        this.ciudades = ciudades;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHoralocal() {
        return horalocal;
    }

    public void setHoralocal(int horalocal) {
        this.horalocal = horalocal;
    }

    public int getCiudadesvisitante() {
        return Ciudadesvisitante;
    }

    public void setCiudadesvisitante(int ciudadesvisitante) {
        this.ciudadesvisitante = ciudadesvisitante;
    }

    public PaisesModel getLocal() {
        return local;
    }

    public void setLocal(PaisesModel local) {
        this.local = local;
    }

    public PaisesModel getVisitante() {
        return visitante;
    }

    public void setVisitante(PaisesModel visitante) {
        this.visitante = visitante;
    }

}
