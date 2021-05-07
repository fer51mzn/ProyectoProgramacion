package com.piramide.dao.SQL.jugadores;

import com.piramide.entities.Jugador;
import java.util.List;
public interface DAOJugador {
    public List<Jugador> list();
    public Jugador get(String codigo);
    public Boolean add(Jugador jugador);
    public void update(Jugador jugador);
    public void clear();
    public void eliminarJugador(String codigo);
}
