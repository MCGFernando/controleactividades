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
@Table(name = "Entidade Assistida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntidadeAssistida.findAll", query = "SELECT e FROM EntidadeAssistida e"),
    @NamedQuery(name = "EntidadeAssistida.findByIDEntidade", query = "SELECT e FROM EntidadeAssistida e WHERE e.iDEntidade = :iDEntidade"),
    @NamedQuery(name = "EntidadeAssistida.findByEntidade", query = "SELECT e FROM EntidadeAssistida e WHERE e.entidade = :entidade"),
    @NamedQuery(name = "EntidadeAssistida.findByTipodecontracto", query = "SELECT e FROM EntidadeAssistida e WHERE e.tipodecontracto = :tipodecontracto"),
    @NamedQuery(name = "EntidadeAssistida.findByActiva", query = "SELECT e FROM EntidadeAssistida e WHERE e.activa = :activa"),
    @NamedQuery(name = "EntidadeAssistida.findBySigla", query = "SELECT e FROM EntidadeAssistida e WHERE e.sigla = :sigla"),
    @NamedQuery(name = "EntidadeAssistida.findByN\u00badecontacorrente", query = "SELECT e FROM EntidadeAssistida e WHERE e.n\u00badecontacorrente = :n\u00badecontacorrente"),
    @NamedQuery(name = "EntidadeAssistida.findByClienteExterno", query = "SELECT e FROM EntidadeAssistida e WHERE e.clienteExterno = :clienteExterno"),
    @NamedQuery(name = "EntidadeAssistida.findByActualizada", query = "SELECT e FROM EntidadeAssistida e WHERE e.actualizada = :actualizada"),
    @NamedQuery(name = "EntidadeAssistida.findByProtocolo", query = "SELECT e FROM EntidadeAssistida e WHERE e.protocolo = :protocolo"),
    @NamedQuery(name = "EntidadeAssistida.findByTipodeatendimento", query = "SELECT e FROM EntidadeAssistida e WHERE e.tipodeatendimento = :tipodeatendimento"),
    @NamedQuery(name = "EntidadeAssistida.findByDatadeactualiza\u00e7\u00e3o", query = "SELECT e FROM EntidadeAssistida e WHERE e.datadeactualiza\u00e7\u00e3o = :datadeactualiza\u00e7\u00e3o"),
    @NamedQuery(name = "EntidadeAssistida.findByPre\u00e7\u00e1rio", query = "SELECT e FROM EntidadeAssistida e WHERE e.pre\u00e7\u00e1rio = :pre\u00e7\u00e1rio"),
    @NamedQuery(name = "EntidadeAssistida.findByLocaliza\u00e7\u00e3o", query = "SELECT e FROM EntidadeAssistida e WHERE e.localiza\u00e7\u00e3o = :localiza\u00e7\u00e3o"),
    @NamedQuery(name = "EntidadeAssistida.findByDestinat\u00e1rio1", query = "SELECT e FROM EntidadeAssistida e WHERE e.destinat\u00e1rio1 = :destinat\u00e1rio1"),
    @NamedQuery(name = "EntidadeAssistida.findByDestinat\u00e1rio2", query = "SELECT e FROM EntidadeAssistida e WHERE e.destinat\u00e1rio2 = :destinat\u00e1rio2"),
    @NamedQuery(name = "EntidadeAssistida.findByIDFooter", query = "SELECT e FROM EntidadeAssistida e WHERE e.iDFooter = :iDFooter"),
    @NamedQuery(name = "EntidadeAssistida.findByGestordeConta", query = "SELECT e FROM EntidadeAssistida e WHERE e.gestordeConta = :gestordeConta"),
    @NamedQuery(name = "EntidadeAssistida.findByProtocoloFactura\u00e7\u00e3o", query = "SELECT e FROM EntidadeAssistida e WHERE e.protocoloFactura\u00e7\u00e3o = :protocoloFactura\u00e7\u00e3o"),
    @NamedQuery(name = "EntidadeAssistida.findByN\u00badeContribuinte", query = "SELECT e FROM EntidadeAssistida e WHERE e.n\u00badeContribuinte = :n\u00badeContribuinte"),
    @NamedQuery(name = "EntidadeAssistida.findByMorada", query = "SELECT e FROM EntidadeAssistida e WHERE e.morada = :morada"),
    @NamedQuery(name = "EntidadeAssistida.findByIDPre\u00e7\u00e1rio", query = "SELECT e FROM EntidadeAssistida e WHERE e.iDPre\u00e7\u00e1rio = :iDPre\u00e7\u00e1rio"),
    @NamedQuery(name = "EntidadeAssistida.findByForceCode", query = "SELECT e FROM EntidadeAssistida e WHERE e.forceCode = :forceCode"),
    @NamedQuery(name = "EntidadeAssistida.findByMaskCode", query = "SELECT e FROM EntidadeAssistida e WHERE e.maskCode = :maskCode"),
    @NamedQuery(name = "EntidadeAssistida.findByCodeExample", query = "SELECT e FROM EntidadeAssistida e WHERE e.codeExample = :codeExample"),
    @NamedQuery(name = "EntidadeAssistida.findByIDS\u00e9rie", query = "SELECT e FROM EntidadeAssistida e WHERE e.iDS\u00e9rie = :iDS\u00e9rie"),
    @NamedQuery(name = "EntidadeAssistida.findByGeraFactura", query = "SELECT e FROM EntidadeAssistida e WHERE e.geraFactura = :geraFactura"),
    @NamedQuery(name = "EntidadeAssistida.findByBi", query = "SELECT e FROM EntidadeAssistida e WHERE e.bi = :bi"),
    @NamedQuery(name = "EntidadeAssistida.findByCartao", query = "SELECT e FROM EntidadeAssistida e WHERE e.cartao = :cartao"),
    @NamedQuery(name = "EntidadeAssistida.findByGuia", query = "SELECT e FROM EntidadeAssistida e WHERE e.guia = :guia"),
    @NamedQuery(name = "EntidadeAssistida.findByCheckup", query = "SELECT e FROM EntidadeAssistida e WHERE e.checkup = :checkup"),
    @NamedQuery(name = "EntidadeAssistida.findByUsd", query = "SELECT e FROM EntidadeAssistida e WHERE e.usd = :usd"),
    @NamedQuery(name = "EntidadeAssistida.findByIva", query = "SELECT e FROM EntidadeAssistida e WHERE e.iva = :iva"),
    @NamedQuery(name = "EntidadeAssistida.findByFlag1", query = "SELECT e FROM EntidadeAssistida e WHERE e.flag1 = :flag1"),
    @NamedQuery(name = "EntidadeAssistida.findByFlag2", query = "SELECT e FROM EntidadeAssistida e WHERE e.flag2 = :flag2")})
public class EntidadeAssistida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID Entidade")
    private Integer iDEntidade;
    @Basic(optional = false)
    @Column(name = "Entidade")
    private String entidade;
    @Basic(optional = false)
    @Column(name = "Tipo de contracto")
    private int tipodecontracto;
    @Basic(optional = false)
    @Column(name = "Activa")
    private boolean activa;
    @Column(name = "Sigla")
    private String sigla;
    @Column(name = "N\u00ba de conta corrente")
    private String nºdecontacorrente;
    @Basic(optional = false)
    @Column(name = "Cliente Externo")
    private boolean clienteExterno;
    @Basic(optional = false)
    @Column(name = "Actualizada")
    private boolean actualizada;
    @Column(name = "Protocolo")
    private Integer protocolo;
    @Column(name = "Tipo de atendimento")
    private Integer tipodeatendimento;
    @Column(name = "Data de actualiza\u00e7\u00e3o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeactualização;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Pre\u00e7\u00e1rio")
    private Double preçário;
    @Column(name = "Localiza\u00e7\u00e3o")
    private String localização;
    @Column(name = "Destinat\u00e1rio1")
    private String destinatário1;
    @Column(name = "Destinat\u00e1rio2")
    private String destinatário2;
    @Column(name = "ID Footer")
    private Integer iDFooter;
    @Column(name = "Gestor de Conta")
    private Integer gestordeConta;
    @Column(name = "Protocolo Factura\u00e7\u00e3o")
    private String protocoloFacturação;
    @Column(name = "N\u00ba de Contribuinte")
    private String nºdeContribuinte;
    @Column(name = "Morada")
    private String morada;
    @Column(name = "ID Pre\u00e7\u00e1rio")
    private Integer iDPreçário;
    @Basic(optional = false)
    @Column(name = "Force Code")
    private boolean forceCode;
    @Column(name = "Mask Code")
    private Integer maskCode;
    @Column(name = "Code Example")
    private String codeExample;
    @Column(name = "ID S\u00e9rie")
    private Integer iDSérie;
    @Basic(optional = false)
    @Column(name = "Gera Factura")
    private boolean geraFactura;
    @Basic(optional = false)
    @Column(name = "BI")
    private boolean bi;
    @Basic(optional = false)
    @Column(name = "Cartao")
    private boolean cartao;
    @Basic(optional = false)
    @Column(name = "Guia")
    private boolean guia;
    @Column(name = "Checkup")
    private Boolean checkup;
    @Column(name = "USD")
    private Boolean usd;
    @Column(name = "IVA")
    private Boolean iva;
    @Column(name = "Flag1")
    private Boolean flag1;
    @Column(name = "Flag2")
    private Boolean flag2;

    public EntidadeAssistida() {
    }

    public EntidadeAssistida(Integer iDEntidade) {
        this.iDEntidade = iDEntidade;
    }

    public EntidadeAssistida(Integer iDEntidade, String entidade, int tipodecontracto, boolean activa, boolean clienteExterno, boolean actualizada, boolean forceCode, boolean geraFactura, boolean bi, boolean cartao, boolean guia) {
        this.iDEntidade = iDEntidade;
        this.entidade = entidade;
        this.tipodecontracto = tipodecontracto;
        this.activa = activa;
        this.clienteExterno = clienteExterno;
        this.actualizada = actualizada;
        this.forceCode = forceCode;
        this.geraFactura = geraFactura;
        this.bi = bi;
        this.cartao = cartao;
        this.guia = guia;
    }

    public Integer getIDEntidade() {
        return iDEntidade;
    }

    public void setIDEntidade(Integer iDEntidade) {
        this.iDEntidade = iDEntidade;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public int getTipodecontracto() {
        return tipodecontracto;
    }

    public void setTipodecontracto(int tipodecontracto) {
        this.tipodecontracto = tipodecontracto;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNºdecontacorrente() {
        return nºdecontacorrente;
    }

    public void setNºdecontacorrente(String nºdecontacorrente) {
        this.nºdecontacorrente = nºdecontacorrente;
    }

    public boolean getClienteExterno() {
        return clienteExterno;
    }

    public void setClienteExterno(boolean clienteExterno) {
        this.clienteExterno = clienteExterno;
    }

    public boolean getActualizada() {
        return actualizada;
    }

    public void setActualizada(boolean actualizada) {
        this.actualizada = actualizada;
    }

    public Integer getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Integer protocolo) {
        this.protocolo = protocolo;
    }

    public Integer getTipodeatendimento() {
        return tipodeatendimento;
    }

    public void setTipodeatendimento(Integer tipodeatendimento) {
        this.tipodeatendimento = tipodeatendimento;
    }

    public Date getDatadeactualização() {
        return datadeactualização;
    }

    public void setDatadeactualização(Date datadeactualização) {
        this.datadeactualização = datadeactualização;
    }

    public Double getPreçário() {
        return preçário;
    }

    public void setPreçário(Double preçário) {
        this.preçário = preçário;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public String getDestinatário1() {
        return destinatário1;
    }

    public void setDestinatário1(String destinatário1) {
        this.destinatário1 = destinatário1;
    }

    public String getDestinatário2() {
        return destinatário2;
    }

    public void setDestinatário2(String destinatário2) {
        this.destinatário2 = destinatário2;
    }

    public Integer getIDFooter() {
        return iDFooter;
    }

    public void setIDFooter(Integer iDFooter) {
        this.iDFooter = iDFooter;
    }

    public Integer getGestordeConta() {
        return gestordeConta;
    }

    public void setGestordeConta(Integer gestordeConta) {
        this.gestordeConta = gestordeConta;
    }

    public String getProtocoloFacturação() {
        return protocoloFacturação;
    }

    public void setProtocoloFacturação(String protocoloFacturação) {
        this.protocoloFacturação = protocoloFacturação;
    }

    public String getNºdeContribuinte() {
        return nºdeContribuinte;
    }

    public void setNºdeContribuinte(String nºdeContribuinte) {
        this.nºdeContribuinte = nºdeContribuinte;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Integer getIDPreçário() {
        return iDPreçário;
    }

    public void setIDPreçário(Integer iDPreçário) {
        this.iDPreçário = iDPreçário;
    }

    public boolean getForceCode() {
        return forceCode;
    }

    public void setForceCode(boolean forceCode) {
        this.forceCode = forceCode;
    }

    public Integer getMaskCode() {
        return maskCode;
    }

    public void setMaskCode(Integer maskCode) {
        this.maskCode = maskCode;
    }

    public String getCodeExample() {
        return codeExample;
    }

    public void setCodeExample(String codeExample) {
        this.codeExample = codeExample;
    }

    public Integer getIDSérie() {
        return iDSérie;
    }

    public void setIDSérie(Integer iDSérie) {
        this.iDSérie = iDSérie;
    }

    public boolean getGeraFactura() {
        return geraFactura;
    }

    public void setGeraFactura(boolean geraFactura) {
        this.geraFactura = geraFactura;
    }

    public boolean getBi() {
        return bi;
    }

    public void setBi(boolean bi) {
        this.bi = bi;
    }

    public boolean getCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }

    public boolean getGuia() {
        return guia;
    }

    public void setGuia(boolean guia) {
        this.guia = guia;
    }

    public Boolean getCheckup() {
        return checkup;
    }

    public void setCheckup(Boolean checkup) {
        this.checkup = checkup;
    }

    public Boolean getUsd() {
        return usd;
    }

    public void setUsd(Boolean usd) {
        this.usd = usd;
    }

    public Boolean getIva() {
        return iva;
    }

    public void setIva(Boolean iva) {
        this.iva = iva;
    }

    public Boolean getFlag1() {
        return flag1;
    }

    public void setFlag1(Boolean flag1) {
        this.flag1 = flag1;
    }

    public Boolean getFlag2() {
        return flag2;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEntidade != null ? iDEntidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadeAssistida)) {
            return false;
        }
        EntidadeAssistida other = (EntidadeAssistida) object;
        if ((this.iDEntidade == null && other.iDEntidade != null) || (this.iDEntidade != null && !this.iDEntidade.equals(other.iDEntidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.controleactividades.domain.EntidadeAssistida[ iDEntidade=" + iDEntidade + " ]";
    }
    
}
