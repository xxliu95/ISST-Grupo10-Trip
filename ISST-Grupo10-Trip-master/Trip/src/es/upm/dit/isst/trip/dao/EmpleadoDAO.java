package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import es.upm.dit.isst.trip.model.Empleado;

public interface EmpleadoDAO {
	
	public void create(Empleado empleado);
	
	public Empleado read(String email);
	
	public Empleado read(int id);

	public void update(Empleado empleado);
	
	public void delete(Empleado empleado);
	
	public Collection<Empleado> readAll();
}
