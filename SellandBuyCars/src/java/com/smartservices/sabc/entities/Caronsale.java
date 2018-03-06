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
@Table(name = "CARONSALE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caronsale.findAll", query = "SELECT c FROM Caronsale c")
    , @NamedQuery(name = "Caronsale.findByCosaId", query = "SELECT c FROM Caronsale c WHERE c.cosaId = :cosaId")
    , @NamedQuery(name = "Caronsale.findByModel", query = "SELECT c FROM Caronsale c WHERE c.model = :model")
    , @NamedQuery(name = "Caronsale.findByName", query = "SELECT c FROM Caronsale c WHERE c.name = :name")
    , @NamedQuery(name = "Caronsale.findByRegno", query = "SELECT c FROM Caronsale c WHERE c.regno = :regno")
    , @NamedQuery(name = "Caronsale.findByMilage", query = "SELECT c FROM Caronsale c WHERE c.milage = :milage")
    , @NamedQuery(name = "Caronsale.findByCondition", query = "SELECT c FROM Caronsale c WHERE c.condition = :condition")
    , @NamedQuery(name = "Caronsale.findByStatus", query = "SELECT c FROM Caronsale c WHERE c.status = :status")
    , @NamedQuery(name = "Caronsale.findByAmount", query = "SELECT c FROM Caronsale c WHERE c.amount = :amount")})
public class Caronsale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COSA_ID")
    private Integer cosaId;
    @Size(max = 50)
    @Column(name = "MODEL")
    private String model;
    @Size(max = 50)
    @Column(name = "NAME")
    private String name;
    @Size(max = 50)
    @Column(name = "REGNO")
    private String regno;
    @Size(max = 50)
    @Column(name = "MILAGE")
    private String milage;
    @Size(max = 50)
    @Column(name = "CONDITION")
    private String condition;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "AMOUNT")
    private Integer amount;
    @JoinColumn(name = "CAR_ID", referencedColumnName = "CAR_ID")
    @ManyToOne
    private Carinfo carId;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    @ManyToOne
    private Custinfo custId;
    @JoinColumn(name = "SRM_ID", referencedColumnName = "SRM_ID")
    @ManyToOne
    private Showroomman srmId;

    public Caronsale(int cosaId,String model,String name,String regno,String milage,String condition,String status,int amount) {
        this.cosaId=cosaId;
        this.model=model;
        this.name=name;
        this.regno=regno;
        this.milage=milage;
        this.condition=condition;
        this.status=status;
        this.amount=amount;
    }
    
     public Caronsale(String model,String name,String regno,String milage,String condition,String status,int amount) {
        
        this.model=model;
        this.name=name;
        this.regno=regno;
        this.milage=milage;
        this.condition=condition;
        this.status=status;
        this.amount=amount;
    }
    

    public Caronsale(Integer cosaId) {
        this.cosaId = cosaId;
    }

    public Integer getCosaId() {
        return cosaId;
    }

    public void setCosaId(Integer cosaId) {
        this.cosaId = cosaId;
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

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
        hash += (cosaId != null ? cosaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caronsale)) {
            return false;
        }
        Caronsale other = (Caronsale) object;
        if ((this.cosaId == null && other.cosaId != null) || (this.cosaId != null && !this.cosaId.equals(other.cosaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Caronsale[ cosaId=" + cosaId + " ]";
    }
    
}
