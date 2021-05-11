package com.piramide.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatrocinadorTest {
    @Test
    public void asignaDatos(){
        Patrocinador patrocinador = new Patrocinador();
        String codigoEsperado = "100";
        patrocinador.setCodigo(codigoEsperado);
        String nombreEsperado = "Pedro";
        patrocinador.setNombre(nombreEsperado);
        assertEquals(codigoEsperado,patrocinador.getCodigo());
        assertEquals(nombreEsperado,patrocinador.getNombre());
    }
}
