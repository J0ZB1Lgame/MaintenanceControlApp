package co.edu.konradlorenz.model;

public abstract class Mantenimiento implements Reporte, Programable{
	
	private int idMantenimiento;
	private String fecha;
	private String descripcion;
	protected Maquina maquina;
	
	public Mantenimiento() {
		super();
	}

	public Mantenimiento(int idMantenimiento, String fecha, String descripcion, Maquina maquina) {
		this.idMantenimiento = idMantenimiento;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.maquina = maquina;
	}
    
	public int getIdMantenimiento() {
		return idMantenimiento;
	}

	public void setIdMantenimiento(int idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Maquina getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public abstract void ejecutarMantenimiento();
	
	@Override
    public void generarReporte() {
        System.out.println("Generando reporte para el mantenimiento: " + idMantenimiento);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Máquina: " + maquina.getNombre());
    }

    @Override
    public void programarMantenimiento(String fecha) {
        System.out.println("Mantenimiento programado para la fecha: " + fecha);
    }

	@Override
	public String toString() {
		return "Mantenimiento numero: " + idMantenimiento 
				+ "\n Fecha: " + fecha 
				+ "\n Descripcion: " + descripcion
				+ "\n \n      Maquina a la que se le realizo: " + maquina;
	}
}
