package com.clairvoyant.workshop.service;

import com.clairvoyant.workshop.persistence.Contact;
import java.util.List;

/**
 * Created by imteyaz on 31/3/17.
 */
public interface ContactService {

  Contact saveOrUpdateContact(Contact contact);

  List<Contact> getContactList();

  void deleteContact(Long contactId);
}
