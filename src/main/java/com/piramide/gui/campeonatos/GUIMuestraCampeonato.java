package com.piramide.gui.campeonatos;

import com.piramide.entities.Campeonato;

import javax.swing.*;

public class GUIMuestraCampeonato extends JFrame {
    private JPanel root;
    private JTextField inputCodigo;
    private JLabel infoCodigo;
    private JTextField inputNombre;
    private JTextField inputLugar;
    private JTextField inputFecha;
    private JLabel infoNombre;
    private JLabel infoLugar;
    private JLabel infoFecha;

    public GUIMuestraCampeonato(Campeonato campeonato){
        setSize(400,400);
        inputCodigo.setText(campeonato.getCodigo());
        inputNombre.setText(campeonato.getNombre());
        inputLugar.setText(campeonato.getLugar());
        inputFecha.setText(String.valueOf(campeonato.getFecha()));

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(root);
        this.setTitle("Muestra Campeonato");
    }
}
