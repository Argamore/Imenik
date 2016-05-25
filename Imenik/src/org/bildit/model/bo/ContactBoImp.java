package org.bildit.model.bo;

import java.sql.SQLException;
import java.util.List;

import org.bildit.model.dao.ContactDao;
import org.bildit.model.dao.ContactDaoImp;
import org.bildit.model.dto.Contact;

public class ContactBoImp implements ContactBo {

	ContactDao dao = new ContactDaoImp();

	@Override
	public boolean createContact(Contact contact, int userId) {

		if (HelperBo.isContactNotNull(contact) && HelperBo.isValidId(userId) && HelperBo.isValidContact(contact)) {

			try {

				if (dao.create(contact, userId)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return false;
	}

	@Override
	public Contact readContact(int id) {

		Contact contact = null;

		if (HelperBo.isValidId(id)) {
			try {
				contact = dao.read(id);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return contact;
	}

	@Override
	public List<Contact> readAllContacts(int userId) {
		List<Contact> contacts = null;

		if (HelperBo.isValidId(userId)) {

			try {

				contacts = dao.readAll(userId);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return contacts;
	}

	@Override
	public boolean updateContact(Contact contact) {

		if (HelperBo.isContactNotNull(contact) && HelperBo.isValidContact(contact)) {

			try {
				if (dao.update(contact)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteContact(Contact contact) {

		if (HelperBo.isContactNotNull(contact)) {

			try {
				if (dao.delete(contact)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public List<Contact> searchContacts(String name, int userId) {

		List<Contact> contacts = null;

		try {

			contacts = dao.search(name, userId);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return contacts;
	}

}
