package es.upm.dit.isst.trip.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Reembolso {
	
	@Id
	private String nViaje; //duda asociacion con empleado y viaje
	
	private double importe;
	

	
	public Reembolso() {}

	//getters y setters



}
