package Entity;

import pruebacallcenter18.DispatcherCall;

/**
 *
 * @author EDGAR
 */
public class Supervisor extends AbstractEmpleado {

    	public Supervisor(DispatcherCall dispatcher, String nombre){
		super(dispatcher, nombre);
		super.tipoEmpleado = TipoEmpleado.SUPERVISOR;
	}

	@Override
	void addEmpleadoDisponible(DispatcherCall dispatcher) {
		dispatcher.addEmpleadoDisponible(new Supervisor(dispatcher, nombre));
	}
}
