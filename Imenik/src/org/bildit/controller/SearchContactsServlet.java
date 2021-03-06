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
 * Servlet implementation class SearchContactsServlet
 */
@WebServlet("/search")
public class SearchContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactBoImp bo = new ContactBoImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		User user = (User) request.getSession(false).getAttribute("user");
		int userId = user.getId();

		response.getWriter().print(name);

		List<Contact> contacts = bo.searchContacts(name, userId);

		request.getSession().setAttribute("user", user);
		request.setAttribute("contacts", contacts);
		request.getRequestDispatcher("listsearch.jsp").forward(request, response);
	}

}
