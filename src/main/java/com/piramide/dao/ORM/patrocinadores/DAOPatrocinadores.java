package com.piramide.dao.ORM.patrocinadores;

import com.piramide.entities.Patrocinador;

import java.util.List;

public interface DAOPatrocinadores {
    public List<Patrocinador> list();
    public Patrocinador get(String codigo);
    public void add(Patrocinador patrocinador);
    public void update(Patrocinador patrocinador);
    public void clear();
    public void eliminarPatrocinador(String codigo);
}
