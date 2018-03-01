/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Prince
 */
@Entity
@Table(name = "CARINFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carinfo.findAll", query = "SELECT c FROM Carinfo c")
    , @NamedQuery(name = "Carinfo.findByCarId", query = "SELECT c FROM Carinfo c WHERE c.carId = :carId")
    , @NamedQuery(name = "Carinfo.findByModel", query = "SELECT c FROM Carinfo c WHERE c.model = :model")
    , @NamedQuery(name = "Carinfo.findByName", query = "SELECT c FROM Carinfo c WHERE c.name = :name")
    , @NamedQuery(name = "Carinfo.findByType", query = "SELECT c FROM Carinfo c WHERE c.type = :type")
    , @NamedQuery(name = "Carinfo.findByAmount", query = "SELECT c FROM Carinfo c WHERE c.amount = :amount")})
public class Carinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CAR_ID")
    private Integer carId;
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
    @OneToMany(mappedBy = "carId")
    private Collection<Ordercaronsale> ordercaronsaleCollection;
    @OneToMany(mappedBy = "carId")
    private Collection<Caronshowroom> caronshowroomCollection;
    @OneToMany(mappedBy = "carId")
    private Collection<Ordercaronshowroom> ordercaronshowroomCollection;
    @OneToMany(mappedBy = "carId")
    private Collection<Caronsale> caronsaleCollection;

    public Carinfo(int  carId,String Model,String Name,String Type,int Amount) {
    this.carId= carId;    
    this.model= Model;
    this.name=Name;
    this.type=Type;
    this.amount=Amount;
    }
    
      public Carinfo(String Model,String Name,String Type,int Amount) {
        
    this.model= Model;
    this.name=Name;
    this.type=Type;
    this.amount=Amount;
    }
    
    
    
    
    public Carinfo(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
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

    @XmlTransient
    public Collection<Ordercaronsale> getOrdercaronsaleCollection() {
        return ordercaronsaleCollection;
    }

    public void setOrdercaronsaleCollection(Collection<Ordercaronsale> ordercaronsaleCollection) {
        this.ordercaronsaleCollection = ordercaronsaleCollection;
    }

    @XmlTransient
    public Collection<Caronshowroom> getCaronshowroomCollection() {
        return caronshowroomCollection;
    }

    public void setCaronshowroomCollection(Collection<Caronshowroom> caronshowroomCollection) {
        this.caronshowroomCollection = caronshowroomCollection;
    }

    @XmlTransient
    public Collection<Ordercaronshowroom> getOrdercaronshowroomCollection() {
        return ordercaronshowroomCollection;
    }

    public void setOrdercaronshowroomCollection(Collection<Ordercaronshowroom> ordercaronshowroomCollection) {
        this.ordercaronshowroomCollection = ordercaronshowroomCollection;
    }

    @XmlTransient
    public Collection<Caronsale> getCaronsaleCollection() {
        return caronsaleCollection;
    }

    public void setCaronsaleCollection(Collection<Caronsale> caronsaleCollection) {
        this.caronsaleCollection = caronsaleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carId != null ? carId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carinfo)) {
            return false;
        }
        Carinfo other = (Carinfo) object;
        if ((this.carId == null && other.carId != null) || (this.carId != null && !this.carId.equals(other.carId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Carinfo[ carId=" + carId + " ]";
    }
    
}
