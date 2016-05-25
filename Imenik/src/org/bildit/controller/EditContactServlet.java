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
 * Servlet implementation class EditContactServlet
 */
@WebServlet("/edit")
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ContactBoImp bo = new ContactBoImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get user id
		int id = Integer.parseInt(request.getParameter("id"));

		Contact contact = bo.readContact(id);

		request.setAttribute("contact", contact);
		request.getRequestDispatcher("editcontact.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		Contact contact = new Contact();
		contact.setContactId(id);
		contact.setName(name);
		contact.setLastname(lastname);
		contact.setEmail(email);
		contact.setPhone(phone);

		if (bo.updateContact(contact)) {
			request.getRequestDispatcher("contactedited.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("contactnotedited.jsp").forward(request, response);

		}

	}
}
