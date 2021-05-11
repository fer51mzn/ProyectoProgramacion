import com.piramide.dao.DAOFactory;
import com.piramide.entities.Patrocinador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DAOPatrocinadoresORMTest {
    @BeforeAll
    @AfterAll
    static void clearDatabase(){
        DAOFactory.getInstance().getDaoPatrocinadores().clear();
    }

    @Test
    void addPatrocinador(){
        Patrocinador expected = new Patrocinador("1100","Gabriel");
        DAOFactory.getInstance().getDaoPatrocinadores().add(expected);
        Patrocinador patrocinador = DAOFactory.getInstance().getDaoPatrocinadores().get(expected.getCodigo());
        assertEquals(expected.getCodigo(), patrocinador.getCodigo());
    }

    @Test
    public void insertarYExtraer(){
        Patrocinador patrocinadorEsperado = new Patrocinador("1000","George");
        List<Patrocinador> patrocinadores = DAOFactory.getInstance().getDaoPatrocinadores().list();
        DAOFactory.getInstance().getDaoPatrocinadores().add(patrocinadorEsperado);
        Patrocinador obtenido = DAOFactory.getInstance().getDaoPatrocinadores().get(patrocinadores.get(patrocinadores.size()-1).getCodigo());
        assertEquals(patrocinadores.get(patrocinadores.size()-1).getCodigo(),obtenido.getCodigo());
    }

    @Test
    public void todosPatrocinadores(){
        DAOFactory.getInstance().getDaoPatrocinadores().clear();
        Patrocinador patrocinadorEsperado = new Patrocinador("100","Pedro");
        DAOFactory.getInstance().getDaoPatrocinadores().add(patrocinadorEsperado);
        List<Patrocinador> patrocinadores = DAOFactory.getInstance().getDaoPatrocinadores().list();
        int tamañoEsperado = 1;
        assertEquals(tamañoEsperado,patrocinadores.size());
    }



    @Test
    public void actualizaPatrocinador(){
        Patrocinador patrocinador = new Patrocinador("200","Pablo");
        DAOFactory.getInstance().getDaoPatrocinadores().add(patrocinador);
        List<Patrocinador> patrocinadores = DAOFactory.getInstance().getDaoPatrocinadores().list();
        Patrocinador patrocinador1 = new Patrocinador(patrocinadores.get(patrocinadores.size()-1).getCodigo(),"Sergio");
        DAOFactory.getInstance().getDaoPatrocinadores().update(patrocinador1);
        Patrocinador patrocinadorEsperado = DAOFactory.getInstance().getDaoPatrocinadores().get(patrocinadores.get(patrocinadores.size()-1).getCodigo());
        assertEquals(patrocinador1.getNombre(),patrocinadorEsperado.getNombre());
    }


    @Test
    public void borrarPatrocinador(){
        Patrocinador patrocinadorEsperado = new Patrocinador("300","Juan");
        DAOFactory.getInstance().getDaoPatrocinadores().add(patrocinadorEsperado);
        DAOFactory.getInstance().getDaoPatrocinadores().eliminarPatrocinador("300");
        Patrocinador patrocinador = DAOFactory.getInstance().getDaoPatrocinadores().get("300");
        assertEquals(patrocinador,null);
    }
}
