/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitTest.EntityTest;

import Entity.Llamada;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 *
 * @author EDGAR
 */
public class LLamadaTest extends TestCase {
    public static Test suite(){
		return (Test) new TestSuite( LLamadaTest.class );
	}
	public void testLlamada(){
		Llamada llamada	= new Llamada("llamada test");
		assertTrue(llamada.getDuracion()>=Llamada.MIN_DURACION);
		assertTrue(llamada.getDuracion()<=Llamada.MAX_DURACION);
	}
}
