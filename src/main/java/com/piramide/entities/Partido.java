package com.piramide.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "partidos")
public class Partido {

    @DatabaseField(id = true)
    private String codigo;
    @DatabaseField
    private Integer primerset;
    @DatabaseField
    private Integer segundoset;
    @DatabaseField
    private Integer tercerset;
    @DatabaseField
    private String enfrentamiento;
    @DatabaseField
    private Integer campeonato;
    @DatabaseField
    private String ganador;

    public Partido() {}

    public Partido(String codigo, Integer primerset, Integer segundoset, Integer tercerset, String enfrentamiento, Integer campeonato, String ganador) {
        this.codigo = codigo;
        this.primerset = primerset;
        this.segundoset = segundoset;
        this.tercerset = tercerset;
        this.enfrentamiento = enfrentamiento;
        this.campeonato = campeonato;
        this.ganador = ganador;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getPrimerset() {
        return primerset;
    }

    public Integer getSegundoset() {
        return segundoset;
    }

    public Integer getTercerset() {
        return tercerset;
    }

    public String getEnfrentamiento() {
        return enfrentamiento;
    }

    public Integer getCampeonato() {
        return campeonato;
    }

    public String getGanador() {
        return ganador;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrimerset(Integer primerset) {
        this.primerset = primerset;
    }

    public void setSegundoset(Integer segundoset) {
        this.segundoset = segundoset;
    }

    public void setTercerset(Integer tercerset) {
        this.tercerset = tercerset;
    }

    public void setEnfrentamiento(String enfrentamiento) {
        this.enfrentamiento = enfrentamiento;
    }

    public void setCampeonato(Integer campeonato) {
        this.campeonato = campeonato;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
}
