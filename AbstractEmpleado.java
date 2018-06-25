package Entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import pruebacallcenter18.DispatcherCall;

/**
 *
 * @author EDGAR ROA - 24 de junio de 2018
 */
public abstract class AbstractEmpleado extends Thread implements Comparable<AbstractEmpleado> {

    protected TipoEmpleado tipoEmpleado;
    protected String nombre;
    private Llamada llamadaAtendida;
    private DispatcherCall dispatcher;

    public AbstractEmpleado(DispatcherCall dispatcher, String nombre) {
        this.dispatcher = dispatcher;
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return this.tipoEmpleado.getPrioridad();
    }

    public int compareTo(AbstractEmpleado e2) {
        if (this.getPrioridad() < e2.getPrioridad()) {
            return -1;
        }
        if (this.getPrioridad() > e2.getPrioridad()) {
            return 1;
        }
        return 0;
    }

    public void atenderLlamada(Llamada llamada) throws InterruptedException {
        this.llamadaAtendida = llamada;
        this.start();
    }
	//Cuando se ejecuta el hilo, significa que esta atendiendo la llamada. El hilo que en espera (sleep) la duracion de la llamada.
    public void run() {
        try {
            Thread.sleep(1000 * llamadaAtendida.getDuracion());
        } catch (InterruptedException ex) {
            Logger.getLogger(AbstractEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Llamada " + llamadaAtendida.getDescripcion() + " finalizada. Duracion :" + llamadaAtendida.getDuracion());
        this.addEmpleadoDisponible(dispatcher);
        System.out.println("Empleado " + this.getNombre() + " disponible");
    }
	//Este metodo tiene que ser implementado por los hijos porque tiene que agregar a la cola una nueva instancia de empleado
	abstract void addEmpleadoDisponible(DispatcherCall dispatcher);

	public String getNombre() {
		return nombre;
	}    
}
