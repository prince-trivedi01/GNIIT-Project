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
@Table(name = "TESTDRIVECARSHOWROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Testdrivecarshowroom.findAll", query = "SELECT t FROM Testdrivecarshowroom t")
    , @NamedQuery(name = "Testdrivecarshowroom.findByTdcsrId", query = "SELECT t FROM Testdrivecarshowroom t WHERE t.tdcsrId = :tdcsrId")
    , @NamedQuery(name = "Testdrivecarshowroom.findByDate", query = "SELECT t FROM Testdrivecarshowroom t WHERE t.date = :date")
    , @NamedQuery(name = "Testdrivecarshowroom.findByJobprofile", query = "SELECT t FROM Testdrivecarshowroom t WHERE t.jobprofile = :jobprofile")
    , @NamedQuery(name = "Testdrivecarshowroom.findByStatus", query = "SELECT t FROM Testdrivecarshowroom t WHERE t.status = :status")})
public class Testdrivecarshowroom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TDCSR_ID")
    private Integer tdcsrId;
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Size(max = 50)
    @Column(name = "JOBPROFILE")
    private String jobprofile;
    @Size(max = 10)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    @ManyToOne
    private Custinfo custId;
    @JoinColumn(name = "SRM_ID", referencedColumnName = "SRM_ID")
    @ManyToOne
    private Showroomman srmId;

    public Testdrivecarshowroom(int tdcsrId , Date date , String jobprofile , String status) {
        this.tdcsrId=tdcsrId;
        this.date=date;
        this.jobprofile=jobprofile;
        this.status=status;
    }

     public Testdrivecarshowroom( Date date , String jobprofile , String status ) {
      
        this.date=date;
        this.jobprofile=jobprofile;
        this.status=status;
    }
    
    
    public Testdrivecarshowroom(Integer tdcsrId) {
        this.tdcsrId = tdcsrId;
    }

    public Integer getTdcsrId() {
        return tdcsrId;
    }

    public void setTdcsrId(Integer tdcsrId) {
        this.tdcsrId = tdcsrId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJobprofile() {
        return jobprofile;
    }

    public void setJobprofile(String jobprofile) {
        this.jobprofile = jobprofile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (tdcsrId != null ? tdcsrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Testdrivecarshowroom)) {
            return false;
        }
        Testdrivecarshowroom other = (Testdrivecarshowroom) object;
        if ((this.tdcsrId == null && other.tdcsrId != null) || (this.tdcsrId != null && !this.tdcsrId.equals(other.tdcsrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartservices.sabc.entities.Testdrivecarshowroom[ tdcsrId=" + tdcsrId + " ]";
    }
    
}
