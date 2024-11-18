package co.edu.konradlorenz.model;

public class MantenimientoPreventivo extends Mantenimiento{

	public MantenimientoPreventivo () {
		
	}
	
	public MantenimientoPreventivo(int idMantenimiento, String fecha, String descripcion, Maquina maquina) {
        super(idMantenimiento, fecha, descripcion, maquina);
    }

    @Override
    public void ejecutarMantenimiento() {
        
    	System.out.println("Ejecutando mantenimiento preventivo para la máquina: " + maquina.getNombre());
    }
}
