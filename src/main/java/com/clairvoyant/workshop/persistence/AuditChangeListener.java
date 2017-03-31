package com.clairvoyant.workshop.persistence;

import java.util.Date;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * Created by imteyaz on 24/2/17.
 */
public class AuditChangeListener {

  @PrePersist
  public void onCreate(AbstractAuditableEntity target) {
    Date now = new Date();
    target.setCreatedDate(now);
    target.setModifiedDate(now);
  }

  @PreUpdate
  public void onUpdate(AbstractAuditableEntity target) {
    target.setModifiedDate(new Date());
  }

}
