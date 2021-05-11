package com.piramide.dao.Serializable;

import com.piramide.entities.Partido;

import java.util.List;

public interface DAOPartidos {
    public void add(Partido partido);
    public void update(Partido partido);
    public List<Partido> getAll();
    public Partido get(String codigo);
    public void clear();
}
