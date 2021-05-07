package com.piramide.gui.campeonatos;

import com.piramide.entities.Campeonato;

import javax.swing.*;

public class GUIAltaCampeonato extends JFrame {
    private JTextField inputCodigo;
    private JTextField inputNombre;
    private JTextField inputLugar;
    private JTextField inputFecha;
    private JButton publicarCampeonatoButton;
    private JLabel infoCodigo;
    private JLabel infoFecha;
    private JLabel infoLugar;
    private JLabel infoNomnbre;
    private JPanel root;

    public GUIAltaCampeonato(){
        setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(root);
        this.setHandlers();
        this.setTitle("Alta Campeonato");
    }

    private void setHandlers(){
        publicarCampeonatoButton.addActionListener(e->{
            buildCampeonato();
        });
    }

    private void buildCampeonato() {
        try {
            String codigo = inputCodigo.getText();
            String nombre = inputNombre.getText();
            String lugar = inputLugar.getText();
            String fecha = inputFecha.getText();
            Campeonato campeonato = new Campeonato(codigo, nombre, lugar, fecha);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al crear el campeonato",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            inputFecha.setText(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
