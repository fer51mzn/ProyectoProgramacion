package com.piramide.dao.ORM.patrocinadores;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.piramide.db.DBConnectionORM;
import com.piramide.entities.Patrocinador;

import java.sql.SQLException;
import java.util.List;

public class DAOPatrocinadoresORM implements DAOPatrocinadores{

    Dao<Patrocinador, String> daoPatrocinadoresORM;

    public DAOPatrocinadoresORM() throws SQLException {
        this.daoPatrocinadoresORM = DaoManager.createDao(
                DBConnectionORM.getInstance(),
                Patrocinador.class
        );
        DaoManager.registerDao(
                DBConnectionORM.getInstance(),
                daoPatrocinadoresORM);
    }

    @Override
    public List<Patrocinador> list() {
        try {
            return daoPatrocinadoresORM.queryForAll();
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public Patrocinador get(String codigo) {
        try {
            return daoPatrocinadoresORM.queryForId(codigo);
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public void add(Patrocinador patrocinador) {
        try {
            daoPatrocinadoresORM.create(patrocinador);
        } catch (SQLException throwables) {
        }
    }

    @Override
    public void update(Patrocinador patrocinador) {
        try {
            daoPatrocinadoresORM.update(patrocinador);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            daoPatrocinadoresORM.delete(list());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void eliminarPatrocinador(String codigo) {
        try {
            daoPatrocinadoresORM.delete(get(codigo));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
