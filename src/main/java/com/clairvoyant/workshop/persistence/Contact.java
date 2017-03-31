package com.clairvoyant.workshop.persistence;

import javax.persistence.Entity;

/**
 * Created by imteyaz on 31/3/17.
 */
@Entity
public class Contact extends AbstractAuditableEntity {

  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String city;
  private String emailAddress;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", city='" + city + '\'' +
        ", emailAddress='" + emailAddress + '\'' +
        '}';
  }
}
