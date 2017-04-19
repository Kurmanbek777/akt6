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
@Table(name = "ofic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ofic.findAll", query = "SELECT o FROM Ofic o")
    , @NamedQuery(name = "Ofic.findByIdofic", query = "SELECT o FROM Ofic o WHERE o.idofic = :idofic")
    , @NamedQuery(name = "Ofic.findByOfic", query = "SELECT o FROM Ofic o WHERE o.ofic = :ofic")})
public class Ofic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idofic")
    private Integer idofic;
    @Size(max = 45)
    @Column(name = "ofic")
    private String ofic;
    @OneToMany(mappedBy = "oficID")
    private Collection<Form> formCollection;
    @OneToMany(mappedBy = "ofic2ID")
    private Collection<Form> formCollection1;

    public Ofic() {
    }

    public Ofic(Integer idofic) {
        this.idofic = idofic;
    }

    public Integer getIdofic() {
        return idofic;
    }

    public void setIdofic(Integer idofic) {
        this.idofic = idofic;
    }

    public String getOfic() {
        return ofic;
    }

    public void setOfic(String ofic) {
        this.ofic = ofic;
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
        hash += (idofic != null ? idofic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ofic)) {
            return false;
        }
        Ofic other = (Ofic) object;
        if ((this.idofic == null && other.idofic != null) || (this.idofic != null && !this.idofic.equals(other.idofic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.akt6.Ofic[ idofic=" + idofic + " ]";
    }
    
}
