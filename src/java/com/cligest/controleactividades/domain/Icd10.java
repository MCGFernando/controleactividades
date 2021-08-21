/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.controleactividades.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mfernando
 */
@Entity
@Table(name = "ICD10")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Icd10.findAll", query = "SELECT i FROM Icd10 i"),
    @NamedQuery(name = "Icd10.findByIdIcd10", query = "SELECT i FROM Icd10 i WHERE i.idIcd10 = :idIcd10"),
    @NamedQuery(name = "Icd10.findByCapitulo", query = "SELECT i FROM Icd10 i WHERE i.capitulo = :capitulo"),
    @NamedQuery(name = "Icd10.findBySubCapitulo", query = "SELECT i FROM Icd10 i WHERE i.subCapitulo = :subCapitulo"),
    @NamedQuery(name = "Icd10.findByIcd10", query = "SELECT i FROM Icd10 i WHERE i.icd10 = :icd10"),
    @NamedQuery(name = "Icd10.findByICD10semcode", query = "SELECT i FROM Icd10 i WHERE i.iCD10semcode = :iCD10semcode")})
public class Icd10 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID ICD10")
    private Integer idIcd10;
    @Column(name = "Capitulo")
    private String capitulo;
    @Column(name = "Sub-Capitulo")
    private String subCapitulo;
    @Column(name = "ICD 10")
    private String icd10;
    @Column(name = "ICD 10 sem code")
    private String iCD10semcode;

    public Icd10() {
    }

    public Icd10(Integer idIcd10) {
        this.idIcd10 = idIcd10;
    }

    public Integer getIdIcd10() {
        return idIcd10;
    }

    public void setIdIcd10(Integer idIcd10) {
        this.idIcd10 = idIcd10;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getSubCapitulo() {
        return subCapitulo;
    }

    public void setSubCapitulo(String subCapitulo) {
        this.subCapitulo = subCapitulo;
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10;
    }

    public String getICD10semcode() {
        return iCD10semcode;
    }

    public void setICD10semcode(String iCD10semcode) {
        this.iCD10semcode = iCD10semcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIcd10 != null ? idIcd10.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Icd10)) {
            return false;
        }
        Icd10 other = (Icd10) object;
        if ((this.idIcd10 == null && other.idIcd10 != null) || (this.idIcd10 != null && !this.idIcd10.equals(other.idIcd10))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.controleactividades.domain.Icd10[ idIcd10=" + idIcd10 + " ]";
    }
    
}
