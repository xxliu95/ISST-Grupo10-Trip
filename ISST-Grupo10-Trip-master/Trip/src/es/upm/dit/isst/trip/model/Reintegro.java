package es.upm.dit.isst.trip.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Reintegro {
	
	@Id
	private String nViaje; //duda asociacion con empleado y viaje
	
	private double importe;
	
	
	public Reintegro() {}

	//getters y setters



}
