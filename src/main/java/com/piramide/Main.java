package com.piramide;

import com.piramide.dao.DAOFactory;
import com.piramide.entities.Campeonato;
import com.piramide.entities.Jugador;
import com.piramide.gui.campeonatos.GUIAltaCampeonato;
import com.piramide.gui.campeonatos.GUIMuestraCampeonato;
import com.piramide.gui.jugadores.GUIAltaJugador;
import com.piramide.gui.jugadores.GUIMuestraJugador;

public class Main {

    public static void main(String[] args) {
        GUIAltaCampeonato guiAltaCampeonato = new GUIAltaCampeonato();
        guiAltaCampeonato.setVisible(true);

       Campeonato campeonato = new Campeonato("0","Great Ocean","Australia","2010-01-01");
       GUIMuestraCampeonato muestraCampeonato = new GUIMuestraCampeonato(campeonato);
       muestraCampeonato.setVisible(true);

        GUIAltaJugador guiAltaJugador = new GUIAltaJugador();
        guiAltaJugador.setVisible(true);

        Jugador jugador = new Jugador("10","Novak","1987-01-01","Serbia","Si",1,12130);
        GUIMuestraJugador muestraJugador = new GUIMuestraJugador(jugador);
        muestraJugador.setVisible(true);


        Jugador jugador1 = new Jugador("10","Novak","1987-01-01","Serbia","Si",1,12130);
        DAOFactory.getInstance().getDaoJugador().update(jugador);

    }
}
