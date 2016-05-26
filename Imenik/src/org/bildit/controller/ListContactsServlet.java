package org.bildit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.model.bo.ContactBoImp;
import org.bildit.model.dto.Contact;
import org.bildit.model.dto.User;

/**
 * Servlet implementation class ListContactsServlet
 */
@WebServlet("/listcontacts")
public class ListContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get the user from the session
		User user = (User) request.getSession(false).getAttribute("user");

		ContactBoImp bo = new ContactBoImp();

		List<Contact> contacts = bo.readAllContacts(user.getId());

		request.setAttribute("contacts", contacts);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("listcontacts.jsp").forward(request, response);

	}
}
