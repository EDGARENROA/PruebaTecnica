package Entity;

import pruebacallcenter18.DispatcherCall;

/**
 *
 * @author EDGAR
 */
public class Director extends AbstractEmpleado {

    public Director(DispatcherCall dispatcher, String nombre) {
        super(dispatcher, nombre);
        this.tipoEmpleado = TipoEmpleado.DIRECTOR;
    }

    @Override
    void addEmpleadoDisponible(DispatcherCall dispatcher) {
        dispatcher.addEmpleadoDisponible(new Director(dispatcher, nombre));
    }
}
