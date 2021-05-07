
import com.piramide.dao.DAOFactory;
import com.piramide.entities.Campeonato;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DAOCampeonatosORMTest {
    @BeforeAll
    @AfterAll
    static void clearDatabase(){
        DAOFactory.getInstance().getDaoCampeonatos().clear();
    }

    @Test
    void addCampeonato(){
        Campeonato expected = new Campeonato("0","Great Ocean");
        DAOFactory.getInstance().getDaoCampeonatos().add(expected);
        Campeonato campeonato = DAOFactory.getInstance().getDaoCampeonatos().get(expected.getCodigo());
        assertEquals(expected.getCodigo(), campeonato.getCodigo());

    }

    @Test
    public void insertarYExtraer(){
        Campeonato campeonatoEsperado = new Campeonato("1","India","Tata Open","2010-01-01");
        List<Campeonato> campeonatos = DAOFactory.getInstance().getDaoCampeonatos().list();
        DAOFactory.getInstance().getDaoCampeonatos().add(campeonatoEsperado);
        Campeonato obtenido = DAOFactory.getInstance().getDaoCampeonatos().get(campeonatos.get(campeonatos.size()-1).getCodigo());
        assertEquals(campeonatos.get(campeonatos.size()-1).getCodigo(),obtenido.getCodigo());
    }

    @Test
    public void todosCampeonatos(){
        DAOFactory.getInstance().getDaoCampeonatos().clear();
        Campeonato campeonatoEsperado = new Campeonato("2","Estados Unidos","New York Open","2012-01-01");
        DAOFactory.getInstance().getDaoCampeonatos().add(campeonatoEsperado);
        List<Campeonato> campeonatos = DAOFactory.getInstance().getDaoCampeonatos().list();
        int tamañoEsperado = 1;
        assertEquals(tamañoEsperado,campeonatos.size());
    }



    @Test
    public void actualizaCampeonato(){
        Campeonato campeonato = new Campeonato("3","Brasil","Rio Open","2013-01-01");
        DAOFactory.getInstance().getDaoCampeonatos().add(campeonato);
        List<Campeonato> campeonatos = DAOFactory.getInstance().getDaoCampeonatos().list();
        Campeonato campeonato1 = new Campeonato(campeonatos.get(campeonatos.size()-1).getCodigo(),"Singapore","Singapore open","2014-01-01");
        DAOFactory.getInstance().getDaoCampeonatos().update(campeonato1);
        Campeonato campeonatoEsperado = DAOFactory.getInstance().getDaoCampeonatos().get(campeonatos.get(campeonatos.size()-1).getCodigo());
        assertEquals(campeonato1.getNombre(),campeonatoEsperado.getNombre());
    }


    @Test
    public void borrarCampeonato(){
        Campeonato campeonatoEsperado = new Campeonato("5","Argentina","Cordoba Open","2015-01-0");
        DAOFactory.getInstance().getDaoCampeonatos().add(campeonatoEsperado);
        DAOFactory.getInstance().getDaoCampeonatos().eliminarCampeonato("5");
        Campeonato campeonato = DAOFactory.getInstance().getDaoCampeonatos().get("5");
        assertEquals(campeonato,null);
    }


}
