package com.clairvoyant.workshop.service;

import com.clairvoyant.workshop.persistence.Contact;
import com.clairvoyant.workshop.persistence.ContactRepo;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by imteyaz on 31/3/17.
 */
@Service
public class ContactServiceImpl implements ContactService {

  private final ContactRepo contactRepo;

  @Autowired
  public ContactServiceImpl(ContactRepo contactRepo) {
    this.contactRepo = contactRepo;
  }

  @Override
  public Contact saveOrUpdateContact(Contact contact) {
    Contact contact1;
    if (Objects.nonNull(contact.getId())) {
      contact1 = contactRepo.findOne(contact.getTxnId());
    } else {
      contact1 = contact;
    }
    contact1 = contactRepo.save(contact1);
    if (Objects.nonNull(contact1)) {
      return contact1;
    } else {
      throw new ContactServiceException("Failed to save contact information");
    }
  }

  @Override
  public List<Contact> getContactList() {
    return contactRepo.findAll();
  }

  @Override
  public void deleteContact(Long contactId) {
    contactRepo.delete(contactId);
  }

}
