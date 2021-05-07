package com.piramide.dao;

import com.piramide.dao.ORM.campeonatos.DAOCampeonatos;
import com.piramide.dao.ORM.campeonatos.DAOCampeonatosORM;
import com.piramide.dao.SQL.jugadores.DAOJugador;
import com.piramide.dao.SQL.jugadores.DAOJugadorDatabase;

import java.sql.SQLException;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOCampeonatos daoCampeonatos;

    private DAOJugador daoJugador;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOCampeonatos getDaoCampeonatos() {
        if(daoCampeonatos == null){
            try {
                daoCampeonatos = new DAOCampeonatosORM();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return daoCampeonatos;
    }

    public DAOJugador getDaoJugador() {
        if (daoJugador == null){
            daoJugador = new DAOJugadorDatabase();
        }
        return daoJugador;
    }
}
