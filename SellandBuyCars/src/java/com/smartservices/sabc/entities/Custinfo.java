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
@Table(name = "CUSTINFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Custinfo.findAll", query = "SELECT c FROM Custinfo c")
    , @NamedQuery(name = "Custinfo.findByCustId", query = "SELECT c FROM Custinfo c WHERE c.custId = :custId")
    , @NamedQuery(name = "Custinfo.findByFname", query = "SELECT c FROM Custinfo c WHERE c.fname = :fname")
    , @NamedQuery(name = "Custinfo.findByLname", query = "SELECT c FROM Custinfo c WHERE c.lname = :lname")
    , @NamedQuery(name = "Custinfo.findByAddr", query = "SELECT c FROM Custinfo c WHERE c.addr = :addr")
    , @NamedQuery(name = "Custinfo.findByMob", query = "SELECT c FROM Custinfo c WHERE c.mob = :mob")
    , @NamedQuery(name = "Custinfo.findByEmail", query = "SELECT c FROM Custinfo c WHERE c.email = :email")
    , @NamedQuery(name = "Custinfo.findByUsername", query = "SELECT c FROM Custinfo c WHERE c.username = :username")
    , @NamedQuery(name = "Custinfo.findByPassword", query = "SELECT c FROM Custinfo c WHERE c.password = :password")})
public class Custinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private Integer custId;
    @Size(max = 50)
    @Column(name = "FNAME")
    private String fname;
    @Size(max = 50)
    @Column(name = "LNAME")
    private String lname;
    @Size(max = 100)
    @Column(name = "ADDR")
    private String addr;
    @Column(name = "MOB")
    private Integer mob;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 15)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 10)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "custId")
    private Collection<Ordercaronsale> ordercaronsaleCollection;
    @OneToMany(mappedBy = "custId")
    private Collection<Caronshowroom> caronshowroomCollection;
    @OneToMany(mappedBy = "custId")
    private Collection<Ordercaronshowroom> ordercaronshowroomCollection;
    @OneToMany(mappedBy = "custId")
    private Collection<Testdrivecarshowroom> testdrivecarshowroomCollection;
    @OneToMany(mappedBy = "custId")
    private Collection<Testdrivecarsale> testdrivecarsaleCollection;
    @OneToMany(mappedBy = "custId")
    private Collection<Caronsale> caronsaleCollection;

    public Custinfo(int custId,String fname,String lname,String addr,int mob,String email,String username,String password) {
    this.custId=custId;
    this.fname=fname;
    this.lname=lname;
    this.addr=addr;
    this.mob=mob;
    this.email=email;
    this.username=username;
    this.password=password;
    }
    
    
    public Custinfo(String fname,String lname,String addr,int mob,String email,String username,String password) {
   
    this.fname=fname;
    this.lname=lname;
    this.mob=mob;
    this.email=email;
    this.username=username;
    this.password=password;
    }
    
    
    
    

    public Custinfo(Integer custId) {
        this.custId = custId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getMob() {
        return mob;
    }

    public void setMob(Integer mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    public Collection<Testdrivecarshowroom> getTestdrivecarshowroomCollection() {
        return testdrivecarshowroomCollection;
    }

    public void setTestdrivecarshowroomCollection(Collection<Testdrivecarshowroom> testdrivecarshowroomCollection) {
        this.testdrivecarshowroomCollection = testdrivecarshowroomCollection;
    }

    @XmlTransient
    public Collection<Testdrivecarsale> getTestdrivecarsaleCollection() {
        return testdrivecarsaleCollection;
    }

    public void setTestdrivecarsaleCollection(Collection<Testdrivecarsale> testdrivecarsaleCollection) {
        this.testdrivecarsaleCollection = testdrivecarsaleCollection;
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
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Custinfo)) {
            return false;
        }
        Custinfo other = (Custinfo) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Custinfo[ custId=" + custId + " ]";
    }
    
}
