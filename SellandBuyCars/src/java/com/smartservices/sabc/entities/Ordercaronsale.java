/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Prince
 */
@Entity
@Table(name = "ORDERCARONSALE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordercaronsale.findAll", query = "SELECT o FROM Ordercaronsale o")
    , @NamedQuery(name = "Ordercaronsale.findByOcsaId", query = "SELECT o FROM Ordercaronsale o WHERE o.ocsaId = :ocsaId")
    , @NamedQuery(name = "Ordercaronsale.findByDate", query = "SELECT o FROM Ordercaronsale o WHERE o.date = :date")
    , @NamedQuery(name = "Ordercaronsale.findByAmount", query = "SELECT o FROM Ordercaronsale o WHERE o.amount = :amount")
    , @NamedQuery(name = "Ordercaronsale.findByQuantity", query = "SELECT o FROM Ordercaronsale o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "Ordercaronsale.findByStatus", query = "SELECT o FROM Ordercaronsale o WHERE o.status = :status")})
public class Ordercaronsale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OCSA_ID")
    private Integer ocsaId;
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "AMOUNT")
    private Integer amount;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Size(max = 100)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CAR_ID", referencedColumnName = "CAR_ID")
    @ManyToOne
    private Carinfo carId;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    @ManyToOne
    private Custinfo custId;
    @JoinColumn(name = "SRM_ID", referencedColumnName = "SRM_ID")
    @ManyToOne
    private Showroomman srmId;

    public Ordercaronsale(int ocsaId, Date date,int amount,int quantity,String status ) {
   
    this.ocsaId=ocsaId;
    this.date=date;
    this.amount=amount;
    this.quantity=quantity;
    this.status=status;
    }
    
     public Ordercaronsale( Date date,int amount,int quantity,String status ) {
   
    //this.ocsaId=ocsaId;
    this.date=date;
    this.amount=amount;
    this.quantity=quantity;
    this.status=status;
    }

    public Ordercaronsale(Integer ocsaId) {
        this.ocsaId = ocsaId;
    }

    public Integer getOcsaId() {
        return ocsaId;
    }

    public void setOcsaId(Integer ocsaId) {
        this.ocsaId = ocsaId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Carinfo getCarId() {
        return carId;
    }

    public void setCarId(Carinfo carId) {
        this.carId = carId;
    }

    public Custinfo getCustId() {
        return custId;
    }

    public void setCustId(Custinfo custId) {
        this.custId = custId;
    }

    public Showroomman getSrmId() {
        return srmId;
    }

    public void setSrmId(Showroomman srmId) {
        this.srmId = srmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocsaId != null ? ocsaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordercaronsale)) {
            return false;
        }
        Ordercaronsale other = (Ordercaronsale) object;
        if ((this.ocsaId == null && other.ocsaId != null) || (this.ocsaId != null && !this.ocsaId.equals(other.ocsaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Ordercaronsale[ ocsaId=" + ocsaId + " ]";
    }
    
}
