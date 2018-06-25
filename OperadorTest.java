package JunitTest.EntityTest;

import Entity.Llamada;
import Entity.Operador;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import pruebacallcenter18.DispatcherCall;

/**
 *
 * @author EDGAR
 */
public class OperadorTest extends TestCase {
public static Test suite(){
		return (Test) new TestSuite( OperadorTest.class );
	}

	public void testOperador(){
		Llamada llamada = new Llamada("llamada test");
		llamada.setDuracion(5);
		DispatcherCall dispatcher = new DispatcherCall();
		Operador operador = new Operador(dispatcher, "operador test");
		try {
			operador.atenderLlamada(llamada);
			Thread.sleep(6000);
			assertTrue(dispatcher.getEmpleadosDisponibles().size()==1);
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail();
		}
	}
}
