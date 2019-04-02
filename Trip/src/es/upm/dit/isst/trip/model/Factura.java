package es.upm.dit.isst.trip.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Factura {
	
	@Id
	private String nViaje;

	private String descripcion;
	private double importe;

	@Lob
	private byte[] pdf;
	
	@ManyToOne
	private Viaje viaje;
	
	public Factura() {}

	
	

}
