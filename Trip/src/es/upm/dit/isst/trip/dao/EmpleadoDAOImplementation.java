package es.upm.dit.isst.trip.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.trip.model.Empleado;

public class EmpleadoDAOImplementation implements EmpleadoDAO{

	private static EmpleadoDAOImplementation instancia = null;
	private EmpleadoDAOImplementation() {}
	public static EmpleadoDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new EmpleadoDAOImplementation();
		return instancia;
	}
	
	@Override
	public void create(Empleado empleado) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@SuppressWarnings("finally")
	@Override
	public Empleado read(String email) {
		Empleado professor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			professor = session.load( Empleado.class, email ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return professor;
		}
	}
	
	@SuppressWarnings("finally")
	@Override
	public Empleado read(int id) {
		Empleado professor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			professor = session.load( Empleado.class, id ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return professor;
		}
	}

	@Override
	public void update(Empleado empleado) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( empleado ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@Override
	public void delete(Empleado empleado) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( empleado ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}			
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public Collection<Empleado> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Empleado> empleados = null;
		try {
			session.beginTransaction(); 
			empleados = session.createQuery( "from Empleado" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return empleados;
		}	
	}

}
