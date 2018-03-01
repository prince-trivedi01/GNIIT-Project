/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Prince
 */
@Entity
@Table(name = "SHOWROOMMAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Showroomman.findAll", query = "SELECT s FROM Showroomman s")
    , @NamedQuery(name = "Showroomman.findBySrmId", query = "SELECT s FROM Showroomman s WHERE s.srmId = :srmId")
    , @NamedQuery(name = "Showroomman.findByFname", query = "SELECT s FROM Showroomman s WHERE s.fname = :fname")
    , @NamedQuery(name = "Showroomman.findByLname", query = "SELECT s FROM Showroomman s WHERE s.lname = :lname")
    , @NamedQuery(name = "Showroomman.findByMob", query = "SELECT s FROM Showroomman s WHERE s.mob = :mob")
    , @NamedQuery(name = "Showroomman.findByEmail", query = "SELECT s FROM Showroomman s WHERE s.email = :email")
    , @NamedQuery(name = "Showroomman.findByDateofbirth", query = "SELECT s FROM Showroomman s WHERE s.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "Showroomman.findByUsername", query = "SELECT s FROM Showroomman s WHERE s.username = :username")
    , @NamedQuery(name = "Showroomman.findByPassword", query = "SELECT s FROM Showroomman s WHERE s.password = :password")})
public class Showroomman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SRM_ID")
    private Integer srmId;
    @Size(max = 50)
    @Column(name = "FNAME")
    private String fname;
    @Size(max = 50)
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "MOB")
    private Integer mob;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Size(max = 15)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 10)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "srmId")
    private Collection<Ordercaronsale> ordercaronsaleCollection;
    @OneToMany(mappedBy = "srmId")
    private Collection<Caronshowroom> caronshowroomCollection;
    @OneToMany(mappedBy = "srmId")
    private Collection<Ordercaronshowroom> ordercaronshowroomCollection;
    @OneToMany(mappedBy = "srmId")
    private Collection<Testdrivecarshowroom> testdrivecarshowroomCollection;
    @OneToMany(mappedBy = "srmId")
    private Collection<Testdrivecarsale> testdrivecarsaleCollection;
    @OneToMany(mappedBy = "srmId")
    private Collection<Caronsale> caronsaleCollection;

    public Showroomman(int srmId,String fname,String lname,int mob,Date dateofbirth,String email,String username,String password) {
        this.srmId= srmId;
        this.fname= fname;
        this.lname= lname;
        this.mob= mob;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.username= username;
        this.password = password;
    
    }

    public Showroomman(Integer srmId) {
        this.srmId = srmId;
    }

    public Integer getSrmId() {
        return srmId;
    }

    public void setSrmId(Integer srmId) {
        this.srmId = srmId;
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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
        hash += (srmId != null ? srmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Showroomman)) {
            return false;
        }
        Showroomman other = (Showroomman) object;
        if ((this.srmId == null && other.srmId != null) || (this.srmId != null && !this.srmId.equals(other.srmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Showroomman[ srmId=" + srmId + " ]";
    }
    
}
