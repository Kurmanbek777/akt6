/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.akt6;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findByIdform", query = "SELECT f FROM Form f WHERE f.idform = :idform")
    , @NamedQuery(name = "Form.findByDate", query = "SELECT f FROM Form f WHERE f.date = :date")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idform")
    private Integer idform;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "idtovar", referencedColumnName = "idtovar")
    @ManyToOne
    private Tovar idtovar;
    @JoinColumn(name = "otdelID", referencedColumnName = "idOtdel")
    @ManyToOne
    private Otdel otdelID;
    @JoinColumn(name = "userID", referencedColumnName = "iduser")
    @ManyToOne
    private User userID;
    @JoinColumn(name = "oficID", referencedColumnName = "idofic")
    @ManyToOne
    private Ofic oficID;
    @JoinColumn(name = "otdel2ID", referencedColumnName = "idOtdel")
    @ManyToOne
    private Otdel otdel2ID;
    @JoinColumn(name = "user2ID", referencedColumnName = "iduser")
    @ManyToOne
    private User user2ID;
    @JoinColumn(name = "ofic2ID", referencedColumnName = "idofic")
    @ManyToOne
    private Ofic ofic2ID;

    public Form() {
    }

    public Form(Integer idform) {
        this.idform = idform;
    }

    public Integer getIdform() {
        return idform;
    }

    public void setIdform(Integer idform) {
        this.idform = idform;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tovar getIdtovar() {
        return idtovar;
    }

    public void setIdtovar(Tovar idtovar) {
        this.idtovar = idtovar;
    }

    public Otdel getOtdelID() {
        return otdelID;
    }

    public void setOtdelID(Otdel otdelID) {
        this.otdelID = otdelID;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Ofic getOficID() {
        return oficID;
    }

    public void setOficID(Ofic oficID) {
        this.oficID = oficID;
    }

    public Otdel getOtdel2ID() {
        return otdel2ID;
    }

    public void setOtdel2ID(Otdel otdel2ID) {
        this.otdel2ID = otdel2ID;
    }

    public User getUser2ID() {
        return user2ID;
    }

    public void setUser2ID(User user2ID) {
        this.user2ID = user2ID;
    }

    public Ofic getOfic2ID() {
        return ofic2ID;
    }

    public void setOfic2ID(Ofic ofic2ID) {
        this.ofic2ID = ofic2ID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idform != null ? idform.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.idform == null && other.idform != null) || (this.idform != null && !this.idform.equals(other.idform))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.akt6.Form[ idform=" + idform + " ]";
    }
    
}
