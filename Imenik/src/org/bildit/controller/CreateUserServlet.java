package org.bildit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.model.bo.HelperBo;
import org.bildit.model.bo.UserBoImp;
import org.bildit.model.dto.User;

@WebServlet("/create")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (HelperBo.isValidUsername(username) && HelperBo.isValidPassword(password)) {

			// create a new user
			User user = new User(username, password);

			UserBoImp bo = new UserBoImp();

			if (bo.createUser(user)) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return; // end the execution of the doPost
				
			} else {
				request.getRequestDispatcher("signup.jsp").forward(request, response);
				return; // end the execution of the doPost
			}

		} else {
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
	}
}