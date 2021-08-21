/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.controleactividades.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mfernando
 */
@Entity
@Table(name = "Operador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operador.findAll", query = "SELECT o FROM Operador o"),
    @NamedQuery(name = "Operador.findByIDUser", query = "SELECT o FROM Operador o WHERE o.iDUser = :iDUser"),
    @NamedQuery(name = "Operador.findByCredentials", query = "SELECT o FROM Operador o "
            + "WHERE o.login = :login AND o.password = :password"),
    @NamedQuery(name = "Operador.findByUsername", query = "SELECT o FROM Operador o WHERE o.username = :username"),
    @NamedQuery(name = "Operador.findByCargo", query = "SELECT o FROM Operador o WHERE o.cargo = :cargo"),
    @NamedQuery(name = "Operador.findByEscal\u00e3o", query = "SELECT o FROM Operador o WHERE o.escal\u00e3o = :escal\u00e3o"),
    @NamedQuery(name = "Operador.findByAccessLevel", query = "SELECT o FROM Operador o WHERE o.accessLevel = :accessLevel"),
    @NamedQuery(name = "Operador.findByLogin", query = "SELECT o FROM Operador o WHERE o.login = :login"),
    @NamedQuery(name = "Operador.findByPassword", query = "SELECT o FROM Operador o WHERE o.password = :password"),
    @NamedQuery(name = "Operador.findByResponsabilidade", query = "SELECT o FROM Operador o WHERE o.responsabilidade = :responsabilidade"),
    @NamedQuery(name = "Operador.findByActivo", query = "SELECT o FROM Operador o WHERE o.activo = :activo"),
    @NamedQuery(name = "Operador.findByAgenda", query = "SELECT o FROM Operador o WHERE o.agenda = :agenda"),
    @NamedQuery(name = "Operador.findByCidade", query = "SELECT o FROM Operador o WHERE o.cidade = :cidade"),
    @NamedQuery(name = "Operador.findByCentrodecusto", query = "SELECT o FROM Operador o WHERE o.centrodecusto = :centrodecusto"),
    @NamedQuery(name = "Operador.findByReceitar", query = "SELECT o FROM Operador o WHERE o.receitar = :receitar"),
    @NamedQuery(name = "Operador.findByDataAdmiss\u00e3o", query = "SELECT o FROM Operador o WHERE o.dataAdmiss\u00e3o = :dataAdmiss\u00e3o"),
    @NamedQuery(name = "Operador.findByDatadeSa\u00edda", query = "SELECT o FROM Operador o WHERE o.datadeSa\u00edda = :datadeSa\u00edda"),
    @NamedQuery(name = "Operador.findByDataNascimento", query = "SELECT o FROM Operador o WHERE o.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Operador.findByArea", query = "SELECT o FROM Operador o WHERE o.area = :area"),
    @NamedQuery(name = "Operador.findByLocal", query = "SELECT o FROM Operador o WHERE o.local = :local"),
    @NamedQuery(name = "Operador.findByObserva\u00e7\u00f5es", query = "SELECT o FROM Operador o WHERE o.observa\u00e7\u00f5es = :observa\u00e7\u00f5es"),
    })
public class Operador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_User")
    private Integer iDUser;
    @Column(name = "User_name")
    private String username;
    @Column(name = "cargo")
    private Integer cargo;
    @Column(name = "Escal\u00e3o")
    private String escalão;
    @Column(name = "access_level")
    private Integer accessLevel;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "Responsabilidade")
    private Integer responsabilidade;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Column(name = "Agenda")
    private Integer agenda;
    @Column(name = "Cidade")
    private Integer cidade;
    @Column(name = "\"Centro de custo\"")
    private Integer centrodecusto;
    @Basic(optional = false)
    @Column(name = "Receitar")
    private boolean receitar;
    @Column(name = "DataAdmiss\u00e3o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAdmissão;
    @Column(name = "\"Data de Sa\u00edda\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeSaída;
    @Column(name = "\"Data Nascimento\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Column(name = "Area")
    private Integer area;
    @Column(name = "Local")
    private Integer local;
    @Column(name = "Observa\u00e7\u00f5es")
    private String observações;
    @Column(name = "Gen_Observa\u00e7\u00f5es")
    private Integer genObservações;
    @Column(name = "s_GUID")
    private String sGUID;
    @Column(name = "Aen_Observa\u00e7\u00f5es")
    private Integer aenObservações;
    @Lob
    @Column(name = "s_ColLineage")
    private byte[] sColLineage;
    @Column(name = "s_Generation")
    private Integer sGeneration;
    @Lob
    @Column(name = "s_Lineage")
    private byte[] sLineage;

    public Operador() {
    }

    public Operador(Integer iDUser) {
        this.iDUser = iDUser;
    }

    public Operador(Integer iDUser, boolean activo, boolean receitar) {
        this.iDUser = iDUser;
        this.activo = activo;
        this.receitar = receitar;
    }

    public Integer getIDUser() {
        return iDUser;
    }

    public void setIDUser(Integer iDUser) {
        this.iDUser = iDUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public String getEscalão() {
        return escalão;
    }

    public void setEscalão(String escalão) {
        this.escalão = escalão;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(Integer responsabilidade) {
        this.responsabilidade = responsabilidade;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getAgenda() {
        return agenda;
    }

    public void setAgenda(Integer agenda) {
        this.agenda = agenda;
    }

    public Integer getCidade() {
        return cidade;
    }

    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }

    public Integer getCentrodecusto() {
        return centrodecusto;
    }

    public void setCentrodecusto(Integer centrodecusto) {
        this.centrodecusto = centrodecusto;
    }

    public boolean getReceitar() {
        return receitar;
    }

    public void setReceitar(boolean receitar) {
        this.receitar = receitar;
    }

    public Date getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(Date dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public Date getDatadeSaída() {
        return datadeSaída;
    }

    public void setDatadeSaída(Date datadeSaída) {
        this.datadeSaída = datadeSaída;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public Integer getGenObservações() {
        return genObservações;
    }

    public void setGenObservações(Integer genObservações) {
        this.genObservações = genObservações;
    }

    public String getSGUID() {
        return sGUID;
    }

    public void setSGUID(String sGUID) {
        this.sGUID = sGUID;
    }

    public Integer getAenObservações() {
        return aenObservações;
    }

    public void setAenObservações(Integer aenObservações) {
        this.aenObservações = aenObservações;
    }

    public byte[] getSColLineage() {
        return sColLineage;
    }

    public void setSColLineage(byte[] sColLineage) {
        this.sColLineage = sColLineage;
    }

    public Integer getSGeneration() {
        return sGeneration;
    }

    public void setSGeneration(Integer sGeneration) {
        this.sGeneration = sGeneration;
    }

    public byte[] getSLineage() {
        return sLineage;
    }

    public void setSLineage(byte[] sLineage) {
        this.sLineage = sLineage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUser != null ? iDUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operador)) {
            return false;
        }
        Operador other = (Operador) object;
        if ((this.iDUser == null && other.iDUser != null) || (this.iDUser != null && !this.iDUser.equals(other.iDUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.controleactividades.domain.Operador[ iDUser=" + iDUser + " ]";
    }
    
}
