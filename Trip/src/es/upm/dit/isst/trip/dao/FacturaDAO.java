package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import es.upm.dit.isst.trip.model.Factura;

public interface FacturaDAO {
	
	public void create(Factura factura);
		
	public Factura read(int nViaje);

	public void update(Factura factura);
	
	public void delete(Factura factura);
	
	public Collection<Factura> readAll();
}
