package org.bildit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.model.bo.ContactBoImp;
import org.bildit.model.dto.Contact;

/**
 * Servlet implementation class DeleteContactServlet
 */
@WebServlet("/delete")
public class DeleteContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ContactBoImp bo = new ContactBoImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get user id
		int id = Integer.parseInt(request.getParameter("id"));

		Contact contact = bo.readContact(id);

		request.setAttribute("contact", contact);
		request.getRequestDispatcher("deletecontact.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		Contact contact = bo.readContact(id);

		if (bo.deleteContact(contact)) {
			request.getRequestDispatcher("listcontacts.jsp").forward(request, response);
		}

	}

}
