package com.piramide.dao.ORM.campeonatos;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.piramide.db.DBConnectionORM;
import com.piramide.entities.Campeonato;

import java.sql.SQLException;
import java.util.List;

public class DAOCampeonatosORM implements DAOCampeonatos{

    Dao<Campeonato, String> daoCampeonatosORM;

    public DAOCampeonatosORM() throws SQLException {
        this.daoCampeonatosORM = DaoManager.createDao(
                DBConnectionORM.getInstance(),
                Campeonato.class
        );
        DaoManager.registerDao(
                DBConnectionORM.getInstance(),
                daoCampeonatosORM);
    }

    @Override
    public List<Campeonato> list() {
        try {
            return daoCampeonatosORM.queryForAll();
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public Campeonato get(String codigo) {
        try {
            return daoCampeonatosORM.queryForId(codigo);
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public void add(Campeonato campeonato) {
        try {
            daoCampeonatosORM.create(campeonato);
        } catch (SQLException throwables) {
        }
    }

    @Override
    public void update(Campeonato campeonato) {
        try {
            daoCampeonatosORM.update(campeonato);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            daoCampeonatosORM.delete(list());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void eliminarCampeonato(String codigo){
        try {
            daoCampeonatosORM.delete(get(codigo));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
