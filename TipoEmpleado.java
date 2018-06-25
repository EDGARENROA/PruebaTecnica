package Entity;

/**
 *
 * @author EDGAR
 */
public class TipoEmpleado {
    static TipoEmpleado DIRECTOR;
    static TipoEmpleado SUPERVISOR;
    static TipoEmpleado OPERADOR;

//    	OPERADOR(1),SUPERVISOR(2),
//                DIRECTOR(3);
	private int prioridad;
	
	TipoEmpleado(int prioridad){
		this.prioridad=prioridad;
	}
	
	public int getPrioridad(){
		return prioridad;
	}
}
