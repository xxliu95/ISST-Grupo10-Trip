package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import es.upm.dit.isst.trip.model.Viaje;

public interface ViajeDAO {
	
	public void create(Viaje viaje);
		
	public Viaje read(int nViaje);

	public void update(Viaje viaje);
	
	public void delete(Viaje viaje);
	
	public Collection<Viaje> readAll();
}
