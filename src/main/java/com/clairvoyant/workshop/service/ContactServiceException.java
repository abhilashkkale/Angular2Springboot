package com.clairvoyant.workshop.service;

import com.clairvoyant.workshop.persistence.Contact;

/**
 * Created by imteyaz on 31/3/17.
 */
public class ContactServiceException extends RuntimeException {

  private String message;

  public ContactServiceException(String message) {
    this.message = message;
  }
}
