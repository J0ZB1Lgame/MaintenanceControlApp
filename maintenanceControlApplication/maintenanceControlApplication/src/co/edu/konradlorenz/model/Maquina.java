package co.edu.konradlorenz.model;

public class Maquina implements Operable{
	
	private int idMaquina;
    private String nombre;
    private String descripcion;
    private String estado;
    private String fechaUltimoMantenimiento;
	
    public Maquina() {
	}

	public Maquina(int idMaquina, String nombre, String descripcion, String estado, String fechaUltimoMantenimiento) {
		this.idMaquina = idMaquina;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaUltimoMantenimiento() {
		return fechaUltimoMantenimiento;
	}

	public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
		this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
	}

	@Override
	public String toString() {
	    return "\n Maquina " + nombre 
	            + "\n Id Maquina: " + idMaquina 
	            + "\n Nombre: " + nombre 
	            + "\n Descripcion: " + (descripcion.isEmpty() ? "Sin descripción" : descripcion) 
	            + "\n Estado: " + (estado.isEmpty() ? "Sin estado" : estado) 
	            + "\n Fecha del ultimo mantenimiento: " + (fechaUltimoMantenimiento.isEmpty() ? "Sin fecha" : fechaUltimoMantenimiento);
	}



	@Override
	public String operarioMaquina(String nombre) {
		
		String nombreOperario = nombre;
		return nombreOperario;
		
	}

	@Override
	public void iniciarOperacion() {
		
		System.out.println("Iniciando operación de la máquina: " + nombre);
		
	}

	@Override
	public void detenerOperacion() {
		
		System.out.println("Deteniendo operación de la máquina: " + nombre);
		
	}

}
