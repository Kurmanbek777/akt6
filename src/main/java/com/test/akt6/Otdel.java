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
@Table(name = "otdel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Otdel.findAll", query = "SELECT o FROM Otdel o")
    , @NamedQuery(name = "Otdel.findByIdOtdel", query = "SELECT o FROM Otdel o WHERE o.idOtdel = :idOtdel")
    , @NamedQuery(name = "Otdel.findByOtdelcol", query = "SELECT o FROM Otdel o WHERE o.otdelcol = :otdelcol")
    , @NamedQuery(name = "Otdel.findByOficID", query = "SELECT o FROM Otdel o WHERE o.oficID = :oficID")})
public class Otdel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idOtdel")
    private Integer idOtdel;
    @Size(max = 45)
    @Column(name = "Otdelcol")
    private String otdelcol;
    @Column(name = "OficID")
    private Integer oficID;
    @OneToMany(mappedBy = "otdelID")
    private Collection<Form> formCollection;
    @OneToMany(mappedBy = "otdel2ID")
    private Collection<Form> formCollection1;

    public Otdel() {
    }

    public Otdel(Integer idOtdel) {
        this.idOtdel = idOtdel;
    }

    public Integer getIdOtdel() {
        return idOtdel;
    }

    public void setIdOtdel(Integer idOtdel) {
        this.idOtdel = idOtdel;
    }

    public String getOtdelcol() {
        return otdelcol;
    }

    public void setOtdelcol(String otdelcol) {
        this.otdelcol = otdelcol;
    }

    public Integer getOficID() {
        return oficID;
    }

    public void setOficID(Integer oficID) {
        this.oficID = oficID;
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
        hash += (idOtdel != null ? idOtdel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Otdel)) {
            return false;
        }
        Otdel other = (Otdel) object;
        if ((this.idOtdel == null && other.idOtdel != null) || (this.idOtdel != null && !this.idOtdel.equals(other.idOtdel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.akt6.Otdel[ idOtdel=" + idOtdel + " ]";
    }
    
}
