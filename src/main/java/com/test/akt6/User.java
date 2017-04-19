/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.akt6;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByIduser", query = "SELECT u FROM User u WHERE u.iduser = :iduser")
    , @NamedQuery(name = "User.findByFName", query = "SELECT u FROM User u WHERE u.fName = :fName")
    , @NamedQuery(name = "User.findByLName", query = "SELECT u FROM User u WHERE u.lName = :lName")
    , @NamedQuery(name = "User.findByOtdelID", query = "SELECT u FROM User u WHERE u.otdelID = :otdelID")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iduser")
    private Integer iduser;
    @Size(max = 45)
    @Column(name = "FName")
    private String fName;
    @Size(max = 45)
    @Column(name = "LName")
    private String lName;
    @Column(name = "otdelID")
    private Integer otdelID;
    @OneToMany(mappedBy = "userID")
    private Collection<Form> formCollection;
    @OneToMany(mappedBy = "user2ID")
    private Collection<Form> formCollection1;

    public User() {
    }

    public User(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public Integer getOtdelID() {
        return otdelID;
    }

    public void setOtdelID(Integer otdelID) {
        this.otdelID = otdelID;
    }

    @XmlTransient
    public Collection<Form> getFormCollection() {
        return formCollection;
    }

    public void setFormCollection(Collection<Form> formCollection) {
        this.formCollection = formCollection;
    }

    @XmlTransient
    public Collection<Form> getFormCollection1() {
        return formCollection1;
    }

    public void setFormCollection1(Collection<Form> formCollection1) {
        this.formCollection1 = formCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.akt6.User[ iduser=" + iduser + " ]";
    }
    
}
