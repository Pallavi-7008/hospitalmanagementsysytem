package controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectrole")
public class selectrole extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String role=req.getParameter("role");
		if(role.equals("staff"))
			req.getRequestDispatcher("staffsignup.html").forward(req, resp);
		else
			req.getRequestDispatcher("doctorsignup.html").forward(req, resp);
	}

}
