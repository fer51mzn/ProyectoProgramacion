package com.piramide.gui.jugadores;
import com.piramide.entities.Jugador;
import javax.swing.*;

public class GUIAltaJugador extends JFrame{


    private JTextField inputCodigo;
    private JLabel infoCodigo;
    private JTextField inputNombre;
    private JTextField inputPais;
    private JTextField inputFechaNac;
    private JTextField inputActivo;
    private JTextField inputPosicion;
    private JLabel infoNombre;
    private JLabel infoPais;
    private JLabel infoFechaNac;
    private JLabel infoActivo;
    private JLabel infoPosicion;
    private JButton publicarJugadorButton;
    private JPanel root;
    private JTextField inputPuntos;
    private JLabel infoPuntos;

    public GUIAltaJugador(){
        setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(root);
        this.setHandlers();
    }

    private void setHandlers(){
        publicarJugadorButton.addActionListener(e->{
            buildJugador();
        });
    }

    private void buildJugador() {
        try {
            String codigo = inputCodigo.getText();
            String nombre = inputNombre.getText();
            String fechaNac = inputFechaNac.getText();
            String pais = inputPais.getText();
            String activo = inputActivo.getText();
            //Nose si hay que cambiar el number a String
            Integer posicionranking = Integer.parseInt(inputPosicion.getText());
            Integer puntos = Integer.parseInt(inputPuntos.getText());
            Jugador jugador = new Jugador(codigo, nombre, fechaNac, pais, activo, posicionranking, puntos);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al crear el jugador",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            inputFechaNac.setText(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
