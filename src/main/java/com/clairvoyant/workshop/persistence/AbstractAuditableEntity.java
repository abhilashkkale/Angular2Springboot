package com.clairvoyant.workshop.persistence;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * Created by imteyaz on 24/2/17.
 */
@MappedSuperclass
@EntityListeners(AuditChangeListener.class)
public class AbstractAuditableEntity {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  @Column(name = "transaction_id")
  private Long txnId;

  @Column(name = "created_date")
  @CreatedDate
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date createdDate;

  @LastModifiedDate
  @Column(name = "modified_date")
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date modifiedDate;

  @CreatedBy
  @Column(name = "created_by", nullable = false)
  private String createdBy = "";

  @LastModifiedBy
  @Column(name = "modified_by", nullable = false)
  private String modifiedBy = "";

  public Long getId() {
    return id;
  }

  public Long getTxnId() {
    return txnId;
  }

  public void setTxnId(Long txnId) {
    this.txnId = txnId;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
