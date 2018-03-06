/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.entities;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Prince
 */
@Entity
@Table(name = "CARONSHOWROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caronshowroom.findAll", query = "SELECT c FROM Caronshowroom c")
    , @NamedQuery(name = "Caronshowroom.findByCosrId", query = "SELECT c FROM Caronshowroom c WHERE c.cosrId = :cosrId")
    , @NamedQuery(name = "Caronshowroom.findByModel", query = "SELECT c FROM Caronshowroom c WHERE c.model = :model")
    , @NamedQuery(name = "Caronshowroom.findByName", query = "SELECT c FROM Caronshowroom c WHERE c.name = :name")
    , @NamedQuery(name = "Caronshowroom.findByType", query = "SELECT c FROM Caronshowroom c WHERE c.type = :type")
    , @NamedQuery(name = "Caronshowroom.findByAmount", query = "SELECT c FROM Caronshowroom c WHERE c.amount = :amount")
    , @NamedQuery(name = "Caronshowroom.findByColor", query = "SELECT c FROM Caronshowroom c WHERE c.color = :color")})
public class Caronshowroom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COSR_ID")
    private Integer cosrId;
    @Size(max = 50)
    @Column(name = "MODEL")
    private String model;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;
    @Size(max = 50)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "AMOUNT")
    private Integer amount;
    @Size(max = 50)
    @Column(name = "COLOR")
    private String color;
    @JoinColumn(name = "CAR_ID", referencedColumnName = "CAR_ID")
    @ManyToOne
    private Carinfo carId;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    @ManyToOne
    private Custinfo custId;
    @JoinColumn(name = "SRM_ID", referencedColumnName = "SRM_ID")
    @ManyToOne
    private Showroomman srmId;

    public Caronshowroom(int cosrId,String model,String name,String type,String color,int amount) {
   
    this.cosrId=cosrId;
    this.model=model;
    this.name=name;
    this.type=type;
    this.color=color;
    this.amount=amount;
    }
    
     public Caronshowroom(String model,String name,String type,String color,int amount) {
   
    
    this.model=model;
    this.name=name;
    this.type=type;
    this.color=color;
    this.amount=amount;
    }
    

    public Caronshowroom(Integer cosrId) {
        this.cosrId = cosrId;
    }

    public Integer getCosrId() {
        return cosrId;
    }

    public void setCosrId(Integer cosrId) {
        this.cosrId = cosrId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        hash += (cosrId != null ? cosrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caronshowroom)) {
            return false;
        }
        Caronshowroom other = (Caronshowroom) object;
        return !((this.cosrId == null && other.cosrId != null) || (this.cosrId != null && !this.cosrId.equals(other.cosrId)));
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Caronshowroom[ cosrId=" + cosrId + " ]";
    }
    
}
