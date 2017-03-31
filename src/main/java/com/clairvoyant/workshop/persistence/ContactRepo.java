package com.clairvoyant.workshop.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by imteyaz on 31/3/17.
 */
public interface ContactRepo extends JpaRepository<Contact, Long> {

}
