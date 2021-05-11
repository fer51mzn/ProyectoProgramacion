package com.piramide.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "campeonatos")
public class Campeonato {

    @DatabaseField(id = true)
    private String codigo;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String lugar;
    @DatabaseField
    private String fecha;

    public Campeonato() {
    }

    public Campeonato(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Campeonato(String codigo, String nombre, String lugar, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }



    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
