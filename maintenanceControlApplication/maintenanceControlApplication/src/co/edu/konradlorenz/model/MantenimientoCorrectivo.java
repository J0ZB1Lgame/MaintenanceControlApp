package co.edu.konradlorenz.model;

public class MantenimientoCorrectivo extends Mantenimiento{

	public MantenimientoCorrectivo() {
		
	}
	
	public MantenimientoCorrectivo(int idMantenimiento, String fecha, String descripcion, Maquina maquina) {
        super(idMantenimiento, fecha, descripcion, maquina);
    }
	
	@Override
	public void ejecutarMantenimiento() {
		
		System.out.println("Ejecutando mantenimiento correctivo para la máquina: " + maquina.getNombre());
		
	}

}
