package com.piramide.dao.ORM.campeonatos;

import com.piramide.entities.Campeonato;
import java.util.List;

public interface DAOCampeonatos {
    public List<Campeonato> list();
    public Campeonato get(String codigo);
    public void add(Campeonato campeonato);
    public void update(Campeonato campeonato);
    public void clear();
    public void eliminarCampeonato(String codigo);
}
