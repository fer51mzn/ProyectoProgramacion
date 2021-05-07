package com.piramide.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "jugadores")
public class Jugador {

    @DatabaseField(id = true)
    private String codigo;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String pais;
    @DatabaseField
    private String fechanacimiento;
    @DatabaseField
    private String activo;
    @DatabaseField
    private Integer posicionranking;
    @DatabaseField
    private Integer puntos;

    public Jugador(String codigo, String nombre, String fechanacimiento, String pais, String activo, Integer posicionranking, Integer puntos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.pais = pais;
        this.activo = activo;
        this.posicionranking = posicionranking;
        this.puntos = puntos;
    }

    public Jugador() {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public String getActivo() {
        return activo;
    }

    public Integer getPosicionranking() {
        return posicionranking;
    }

    public Integer getPuntos() {
        return puntos;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public void setPosicionranking(Integer posicionranking) {
        this.posicionranking = posicionranking;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", pais='" + pais + '\'' +
                ", activo='" + activo + '\'' +
                ", posicionranking=" + posicionranking +
                ", puntos=" + puntos +
                '}';
    }
}
