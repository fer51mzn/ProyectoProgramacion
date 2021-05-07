package com.piramide.dao.SQL.jugadores;

import com.piramide.db.DBConnectionSQL;
import com.piramide.entities.Jugador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOJugadorDatabase implements DAOJugador{

    @Override
    public List<Jugador> list() {
        List<Jugador> jugadores = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from jugadores");
            while (resultSet.next()){
                Jugador jugador = new Jugador();
                String codigoJugador = resultSet.getString("codigo");
                String nombreJugador = resultSet.getString("nombre");
                String fechaJugador = resultSet.getString("fechanacimiento");
                String paisJugador = resultSet.getString("pais");
                String activoJugador = resultSet.getString("activo");
                Integer posicionJugador = resultSet.getInt("posicionranking");
                Integer puntosJugador = resultSet.getInt("puntos");
                jugador.setCodigo(codigoJugador);
                jugador.setNombre(nombreJugador);
                jugador.setFechanacimiento(fechaJugador);
                jugador.setPais(paisJugador);
                jugador.setActivo(activoJugador);
                jugador.setPosicionranking(posicionJugador);
                jugador.setPuntos(puntosJugador);
                jugadores.add(jugador);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jugadores;
    }

    @Override
    public Jugador get(String codigo) {
        Jugador jugador = null;
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            String sql = "select * from jugadores where codigo = " + codigo + ";";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                jugador = new Jugador();
                jugador.setCodigo(codigo);
                String nombre = rs.getString("nombre");
                jugador.setNombre(nombre);
                String fechanacimiento = rs.getString("fechanacimiento");
                jugador.setFechanacimiento(fechanacimiento);
                String pais = rs.getString("pais");
                jugador.setPais(pais);
                String activo = rs.getString("activo");
                jugador.setActivo(activo);
                Integer posicionranking = rs.getInt("posicionranking");
                jugador.setPosicionranking(posicionranking);
                Integer puntos = rs.getInt("puntos");
                jugador.setPuntos(puntos);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jugador;
    }

    @Override
    public Boolean add(Jugador jugador) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            String sql = "insert into jugadores (codigo,nombre,fechanacimiento,pais,activo,posicionranking,puntos) " +
                    "values ('"+jugador.getCodigo()+"','"+jugador.getNombre()+"','"+jugador.getFechanacimiento()+"','"+jugador.getPais()+"','"+jugador.getActivo()+"','"+jugador.getPosicionranking()+"','"+jugador.getPuntos()+"')";
            statement.execute(sql);
        } catch (SQLException exception) {
            //SQLError duplicate PK
            if(exception.getErrorCode() == 1062){
                System.err.println("Ya existe un jugador con ese codigo");
            }
            else {
                System.err.println(exception.getMessage());
            }
            return false;
        }
        return true;
    }

    @Override
    public void update(Jugador jugador) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            String sql = "update jugadores set nombre = '"+jugador.getNombre()+"', fechanacimiento = '"+jugador.getFechanacimiento()+"', pais = '"+jugador.getPais()+"', activo = '"+jugador.getActivo()+"', posicionranking ='"+jugador.getPosicionranking()+"', puntos = '"+jugador.getPuntos()+"' where codigo = '"+jugador.getCodigo()+"'";
            System.out.println("Executing:\n"+sql);
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from jugadores");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void eliminarJugador(String codigo) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            String sql = "delete from jugadores where codigo = " + codigo + ";";
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
