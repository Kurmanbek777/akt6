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
@Table(name = "tovar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tovar.findAll", query = "SELECT t FROM Tovar t")
    , @NamedQuery(name = "Tovar.findByIdtovar", query = "SELECT t FROM Tovar t WHERE t.idtovar = :idtovar")
    , @NamedQuery(name = "Tovar.findByInvnumber", query = "SELECT t FROM Tovar t WHERE t.invnumber = :invnumber")
    , @NamedQuery(name = "Tovar.findByName", query = "SELECT t FROM Tovar t WHERE t.name = :name")
    , @NamedQuery(name = "Tovar.findByDescription", query = "SELECT t FROM Tovar t WHERE t.description = :description")})
public class Tovar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtovar")
    private Integer idtovar;
    @Basic(optional = false)
    @Column(name = "invnumber")
    private int invnumber;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "idtovar")
    private Collection<Form> formCollection;

    public Tovar() {
    }

    public Tovar(Integer idtovar) {
        this.idtovar = idtovar;
    }

    public Tovar(Integer idtovar, int invnumber) {
        this.idtovar = idtovar;
        this.invnumber = invnumber;
    }

    public Integer getIdtovar() {
        return idtovar;
    }

    public void setIdtovar(Integer idtovar) {
        this.idtovar = idtovar;
    }

    public int getInvnumber() {
        return invnumber;
    }

    public void setInvnumber(int invnumber) {
        this.invnumber = invnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Form> getFormCollection() {
        return formCollection;
    }

    public void setFormCollection(Collection<Form> formCollection) {
        this.formCollection = formCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtovar != null ? idtovar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tovar)) {
            return false;
        }
        Tovar other = (Tovar) object;
        if ((this.idtovar == null && other.idtovar != null) || (this.idtovar != null && !this.idtovar.equals(other.idtovar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.akt6.Tovar[ idtovar=" + idtovar + " ]";
    }
    
}
