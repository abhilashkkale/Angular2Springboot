package com.clairvoyant.workshop.controller;

import com.clairvoyant.workshop.persistence.Contact;
import com.clairvoyant.workshop.service.ContactService;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by imteyaz on 31/3/17.
 */
@CrossOrigin(origins = "http://127.0.0.1:4200")
@RestController
public class ContactController {

  private final ContactService contactService;

  @Autowired
  public ContactController(ContactService contactService) {
    this.contactService = contactService;
  }


  @PostMapping(value = "/contact", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity saveContact(@RequestBody Contact contact) {
    ResponseEntity responseEntity;
    Contact contact1 = contactService.saveOrUpdateContact(contact);
    if (Objects.nonNull(contact1)) {
      responseEntity = ResponseEntity.ok().body(contact1);
    } else {
      responseEntity = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    return responseEntity;
  }

  @GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity getContactList() {
    ResponseEntity responseEntity;
    List<Contact> contacts = contactService.getContactList();
      responseEntity = ResponseEntity.ok().body(contacts);

    return responseEntity;
  }

  @DeleteMapping(value = "/contact", produces = MediaType.APPLICATION_JSON_VALUE)
  public void deleteContact(Long contactId) {
    contactService.deleteContact(contactId);
  }
}