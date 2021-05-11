import com.piramide.dao.DAOFactory;
import com.piramide.entities.Partido;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DAOPartidosSerializableTest {

    @Test
    void addPartido(){
        Partido expected = new Partido("1",1,1,1,"Novak vs Rafael",1,"Novak");
        DAOFactory.getInstance().getDaoPartidos().add(expected);
        Partido partido = DAOFactory.getInstance().getDaoPartidos().get(expected.getCodigo());
        assertEquals(expected.getCodigo(), partido.getCodigo());
    }


    @Test
    public void actualizaPartido(){
        Partido partido = new Partido("2",2,2,2,"Daniil vs Donomic",1,"Dominic");
        DAOFactory.getInstance().getDaoPartidos().add(partido);
        List<Partido> partidos = DAOFactory.getInstance().getDaoPartidos().getAll();
        Partido partido1 = new Partido(partidos.get(partidos.size()-1).getCodigo(),2,2,2,"Daniil vs Donomic",1,"Daniil");
        DAOFactory.getInstance().getDaoPartidos().update(partido1);
        Partido partidoEsperado = DAOFactory.getInstance().getDaoPartidos().get(partidos.get(partidos.size()-1).getCodigo());
        assertEquals(partido1.getCodigo(),partidoEsperado.getCodigo());
    }

    @Test
    public void todosPartidos(){
        DAOFactory.getInstance().getDaoPartidos().clear();
        Partido partidoEsperado = new Partido("2",2,2,2,"Daniil vs Donomic",1,"Dominic");
        DAOFactory.getInstance().getDaoPartidos().add(partidoEsperado);
        List<Partido> partidos = DAOFactory.getInstance().getDaoPartidos().getAll();
        int tamañoEsperado = 4;
        assertEquals(tamañoEsperado,partidos.size());
    }

}
