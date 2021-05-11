package com.piramide.dao.Serializable;

import com.piramide.entities.Partido;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DAOPartidosSerializable extends DAOSerializable implements DAOPartidos {

    private final List<Partido> partidos;

    public DAOPartidosSerializable() {
        super("partidos");
        Object obj = read();
        if(obj == null) {
            this.partidos = new ArrayList<>();
        }
        else this.partidos = (List<Partido>) obj;
    }

    @Override
    public void add(Partido partido) {
        this.partidos.add(partido);
        this.save(this.partidos);
    }

    @Override
    public void update(Partido partido) {
        List<Partido> partidos = getAll();
        for (int i = 0; i < partidos.size(); i++) {
            Partido actual = partidos.get(i);
            if (actual.getCodigo().equals(partido.getCodigo())){
                partidos.add(partido);
            }
            break;
        }
        save(partidos);
    }

    @Override
    public List<Partido> getAll() {
        return partidos;
    }

    public Partido get(String codigo) {
        List<Partido> partidos = getAll();
        Optional<Partido> posiblePartido = partidos.stream().filter(partido->{
            return partido.getCodigo().equals(codigo);
        }).findFirst();
        return posiblePartido.orElse(null);
    }

    public void clear(){
        List<Partido> partidos = getAll();
        partidos.remove(partidos);
    }
}
