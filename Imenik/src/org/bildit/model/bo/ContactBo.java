package org.bildit.model.bo;

import java.util.List;

import org.bildit.model.dto.Contact;

public interface ContactBo {
	
	public boolean createContact(Contact contact, int userId);

	public Contact readContact(int id);

	public List<Contact> readAllContacts(int userId);

	public boolean updateContact(Contact contact);

	public boolean deleteContact(Contact contact);
	
	public List<Contact> searchContacts(String name, int userId);
}