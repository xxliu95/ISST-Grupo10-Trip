package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.trip.model.Viaje;

public class ViajeDAOImplementation implements ViajeDAO{

	private static ViajeDAOImplementation instancia = null;
	private ViajeDAOImplementation() {}
	public static ViajeDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new ViajeDAOImplementation();
		return instancia;
	}
	
	@Override
	public void create(Viaje viaje) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(viaje);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@SuppressWarnings("finally")
	@Override
	public Viaje read(String nViaje) {
		Viaje professor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			professor = session.load( Viaje.class, nViaje ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return professor;
		}
	}

	@Override
	public void update(Viaje viaje) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( viaje ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@Override
	public void delete(Viaje viaje) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( viaje ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}			
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public Collection<Viaje> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Viaje> empleados = null;
		try {
			session.beginTransaction(); 
			empleados = session.createQuery( "from Viaje" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return empleados;
		}	
	}

}
