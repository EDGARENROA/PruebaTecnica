package Entity;

import pruebacallcenter18.DispatcherCall;

/**
 *
 * @author EDGAR
 */
public class Operador extends AbstractEmpleado {

    	public Operador(DispatcherCall dispatcher, String nombre){
		super(dispatcher, nombre);
		super.tipoEmpleado = TipoEmpleado.OPERADOR;
	}

	@Override
	void addEmpleadoDisponible(DispatcherCall dispatcher) {
		dispatcher.addEmpleadoDisponible(new Operador(dispatcher, nombre));
	}
}
