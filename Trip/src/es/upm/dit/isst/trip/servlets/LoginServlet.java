package es.upm.dit.isst.trip.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import es.upm.dit.isst.trip.dao.EmpleadoDAO;
import es.upm.dit.isst.trip.dao.EmpleadoDAOImplementation;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet({ "/LoginServlet", "/" })
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Subject currentUser = SecurityUtils.getSubject();
		if ( !currentUser.isAuthenticated() ) {
			getServletContext().getRequestDispatcher( "/LoginView.jsp" ).forward( req, resp );
		} else {
			if ( currentUser.hasRole( "admin" ) )
				resp.sendRedirect( req.getContextPath() + "/AdminServlet" );
			else if ( currentUser.hasRole( "employer" ) )
				resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + currentUser.getPrincipal() );
			else
				resp.sendRedirect( req.getContextPath() + "/HomeServlet?email=" + currentUser.getPrincipal() );
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter( "email" );
		String pass = req.getParameter( "password" );
		Subject currentUser = SecurityUtils.getSubject();
		
		if ( !currentUser.isAuthenticated() ) {
			UsernamePasswordToken token = new UsernamePasswordToken( id, pass );
			try {
				currentUser.login( token );
				if ( currentUser.hasRole( "admin" ) )
					resp.sendRedirect( req.getContextPath() + "/AdminServlet" );
				else if ( currentUser.hasRole( "employer" ) )
					resp.sendRedirect( req.getContextPath() + "/HomeEncargadoServlet?email=" + currentUser.getPrincipal() );
				else
					resp.sendRedirect( req.getContextPath() + "/HomeServlet?email=" + currentUser.getPrincipal() );
			} catch ( Exception e ) {
				resp.sendRedirect( req.getContextPath() + "/LoginErrorServlet" );
			}
		} else
			resp.sendRedirect( req.getContextPath() + "/LoginErrorServlet" );
	}
}
