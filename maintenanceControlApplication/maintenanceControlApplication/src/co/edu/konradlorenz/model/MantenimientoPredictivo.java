package co.edu.konradlorenz.model;

public class MantenimientoPredictivo extends Mantenimiento{

	public MantenimientoPredictivo () {
		
	}
	
	public MantenimientoPredictivo(int idMantenimiento, String fecha, String descripcion, Maquina maquina) {
        super(idMantenimiento, fecha, descripcion, maquina);
    }

    @Override
    public void ejecutarMantenimiento() {
        
    	System.out.println("Ejecutando mantenimiento predictivo para la máquina: " + maquina.getNombre());
    }
}
