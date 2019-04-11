package es.upm.dit.isst.trip.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;
import es.upm.dit.isst.trip.dao.ViajeDAO;
import es.upm.dit.isst.trip.dao.ViajeDAOImplementation;
import es.upm.dit.isst.trip.model.Empleado;
import es.upm.dit.isst.trip.model.Viaje;

@WebServlet({ "/HomeEncargadoServlet" })
public class HomeEncargadoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		EmpleadoDAO edao =  EmpleadoDAOImplementation.getInstance();
		Empleado responsable = edao.read(email);
		Collection<Empleado> subordinados = responsable.getSubordinados();
		req.setAttribute("subordinados", subordinados);

		ViajeDAO vdao = ViajeDAOImplementation.getInstance();
		//Viaje viaje = vdao.read(responsable.getSubordinados());
		Collection<Viaje> viaje = new ArrayList<Viaje>();
		
		//falla aqui
		System.out.println(subordinados);
		for (Empleado empleado : subordinados) {
			for(Viaje viajeEmpleado: empleado.getViajes()) {
				System.out.println(vdao.read(viajeEmpleado.getnViaje()).getnViaje());
				viaje.add(vdao.read(viajeEmpleado.getnViaje()));
			}
		}
		
		req.setAttribute("viajesEmpleados", viaje);
		getServletContext().getRequestDispatcher( "/HomeEncargado.jsp" ).forward( req, resp );
	}
	
		/*
		
		EmpleadoDAO edao =  EmpleadoDAOImplementation.getInstance();
		String email = req.getParameter("email");
		Empleado responsable = edao.read(email);
		req.setAttribute("subordinados", responsable.getSubordinados());
		Collection<Viaje> viaje = null;
		for (Empleado empleado: responsable.getSubordinados()) {
			ViajeDAO vdao =  ViajeDAOImplementation.getInstance();
			for(Viaje viajes: empleado.getViajes() ) {
				viaje.add(viajes);
			}
		}
		req.setAttribute("viajesResponsable", viaje);
		getServletContext().getRequestDispatcher( "/HomeEncargado.jsp" ).forward( req, resp );
		*/
	}

