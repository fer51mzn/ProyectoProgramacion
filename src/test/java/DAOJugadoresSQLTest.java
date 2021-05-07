
import com.piramide.dao.DAOFactory;
import com.piramide.entities.Jugador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DAOJugadoresSQLTest {

    @BeforeAll
    @AfterAll
    static void clearJugador(){
        DAOFactory.getInstance().getDaoJugador().clear();
    }

    @Test
    void addJugador(){
        Jugador expected = new Jugador("110","Pedro","1986-01-01","Rusia","Si",12,2000);
        DAOFactory.getInstance().getDaoJugador().add(expected);
        Jugador jugador = DAOFactory.getInstance().getDaoJugador().get(expected.getCodigo());
        assertEquals(expected.getCodigo(), jugador.getCodigo());
    }

    @Test
    public void insertarYExtraer(){
        Jugador jugadorEsperado = new Jugador("10","Novak","1987-01-01","Serbia","Si",1,12130);
        List<Jugador> jugadores = DAOFactory.getInstance().getDaoJugador().list();
        DAOFactory.getInstance().getDaoJugador().add(jugadorEsperado);
        Jugador obtenido = DAOFactory.getInstance().getDaoJugador().get(jugadores.get(jugadores.size()-1).getCodigo());
        assertEquals(jugadores.get(jugadores.size()-1).getCodigo(),obtenido.getCodigo());
    }

    @Test
    public void todosJugadores(){
        DAOFactory.getInstance().getDaoJugador().clear();
        Jugador jugadorEsperado = new Jugador("20","Rafael","1986-01-01","España","Si",2,9950);
        DAOFactory.getInstance().getDaoJugador().add(jugadorEsperado);
        List<Jugador> jugadores = DAOFactory.getInstance().getDaoJugador().list();
        int tamañoEsperado = 1;
        assertEquals(tamañoEsperado,jugadores.size());
    }



    @Test
    public void actualizaJugador(){
        Jugador jugador = new Jugador("30","Daniil","1987-01-01","Rusia","Si",3,9899);
        DAOFactory.getInstance().getDaoJugador().add(jugador);
        List<Jugador> jugadores = DAOFactory.getInstance().getDaoJugador().list();
        Jugador jugador1 = new Jugador(jugadores.get(jugadores.size()-1).getCodigo(),"Daniil","1988-01-01","Rusia","Si",3,9890);
        DAOFactory.getInstance().getDaoJugador().update(jugador1);
        Jugador jugadorEsperado = DAOFactory.getInstance().getDaoJugador().get(jugadores.get(jugadores.size()-1).getCodigo());
        assertEquals(jugador1.getNombre(),jugadorEsperado.getNombre());
    }


    @Test
    public void borrarJugador(){
        Jugador jugadorEsperado = new Jugador("50","Roger","1989-01-01","Suecia","Si",5,6780);
        DAOFactory.getInstance().getDaoJugador().add(jugadorEsperado);
        DAOFactory.getInstance().getDaoJugador().eliminarJugador("50");
        Jugador jugador = DAOFactory.getInstance().getDaoJugador().get("50");
        assertEquals(jugador,null);
    }



}
