package com.piramide.gui.jugadores;

import com.piramide.entities.Jugador;
import javax.swing.*;

public class GUIMuestraJugador extends JFrame{
    private JPanel root;
    private JTextField inputPais;
    private JTextField inputFechaNac;
    private JTextField inputActivo;
    private JTextField inputPosicion;
    private JTextField inputPuntos;
    private JTextField inputCodigo;
    private JLabel infoCodigo;
    private JTextField inputNombre;
    private JTextField inputLugar;
    private JTextField inputFecha;
    private JLabel infoNombre;
    private JLabel infoPais;
    private JLabel infoFechaNac;
    private JLabel infoActivo;
    private JLabel infoPosicion;
    private JLabel infoPuntos;
    private JLabel infoLugar;
    private JLabel infoFecha;

    public GUIMuestraJugador(Jugador jugador){
        setSize(400,400);
        inputCodigo.setText(jugador.getCodigo());
        inputNombre.setText(jugador.getNombre());
        inputPais.setText(jugador.getPais());
        inputFechaNac.setText(String.valueOf(jugador.getFechanacimiento()));
        inputActivo.setText(jugador.getActivo());
        infoPosicion.setText(String.valueOf(jugador.getPosicionranking()));
        inputPuntos.setText(String.valueOf(jugador.getPuntos()));


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(root);
    }
}
