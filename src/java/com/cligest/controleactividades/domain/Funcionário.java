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
@Table(name = "Funcion\u00e1rio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcion\u00e1rio.findAll", query = "SELECT f FROM Funcion\u00e1rio f"),
    @NamedQuery(name = "Funcion\u00e1rio.findByIDFuncion\u00e1rio", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.iDFuncion\u00e1rio = :iDFuncion\u00e1rio"),
    @NamedQuery(name = "Funcion\u00e1rio.findByIDUtente", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.iDUtente = :iDUtente"),
    @NamedQuery(name = "Funcion\u00e1rio.findByN\u00badeFuncion\u00e1rio", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.n\u00badeFuncion\u00e1rio = :n\u00badeFuncion\u00e1rio"),
    @NamedQuery(name = "Funcion\u00e1rio.findByTipodetrabalhador", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.tipodetrabalhador = :tipodetrabalhador"),
    @NamedQuery(name = "Funcion\u00e1rio.findByEstatutodetrabalhador", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.estatutodetrabalhador = :estatutodetrabalhador"),
    @NamedQuery(name = "Funcion\u00e1rio.findByNome", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcion\u00e1rio.findByNomeAbreviado", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.nomeAbreviado = :nomeAbreviado"),
    @NamedQuery(name = "Funcion\u00e1rio.findByContratoN\u00ba", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.contratoN\u00ba = :contratoN\u00ba"),
    @NamedQuery(name = "Funcion\u00e1rio.findByContaBanc\u00e1ria", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.contaBanc\u00e1ria = :contaBanc\u00e1ria"),
    @NamedQuery(name = "Funcion\u00e1rio.findByCargo", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.cargo = :cargo"),
    @NamedQuery(name = "Funcion\u00e1rio.findByEspecialidade", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.especialidade = :especialidade"),
    @NamedQuery(name = "Funcion\u00e1rio.findByEscal\u00e3o", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.escal\u00e3o = :escal\u00e3o"),
    @NamedQuery(name = "Funcion\u00e1rio.findByLogin", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.login = :login"),
    @NamedQuery(name = "Funcion\u00e1rio.findByPassword", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.password = :password"),
    @NamedQuery(name = "Funcion\u00e1rio.findByTelefone", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Funcion\u00e1rio.findByMorada", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.morada = :morada"),
    @NamedQuery(name = "Funcion\u00e1rio.findByResponsabilidade", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.responsabilidade = :responsabilidade"),
    @NamedQuery(name = "Funcion\u00e1rio.findByActivo", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.activo = :activo"),
    @NamedQuery(name = "Funcion\u00e1rio.findByCidade", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Funcion\u00e1rio.findByCentrodecusto", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.centrodecusto = :centrodecusto"),
    @NamedQuery(name = "Funcion\u00e1rio.findByReceitar", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.receitar = :receitar"),
    @NamedQuery(name = "Funcion\u00e1rio.findByDataAdmiss\u00e3o", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.dataAdmiss\u00e3o = :dataAdmiss\u00e3o"),
    @NamedQuery(name = "Funcion\u00e1rio.findByDatadeSa\u00edda", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.datadeSa\u00edda = :datadeSa\u00edda"),
    @NamedQuery(name = "Funcion\u00e1rio.findByDataNascimento", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Funcion\u00e1rio.findByEstadoCivil", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Funcion\u00e1rio.findByArea", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.area = :area"),
    @NamedQuery(name = "Funcion\u00e1rio.findByLocal", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.local = :local"),
    @NamedQuery(name = "Funcion\u00e1rio.findByN\u00badeBenefici\u00e1rioFiscal", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.n\u00badeBenefici\u00e1rioFiscal = :n\u00badeBenefici\u00e1rioFiscal"),
    @NamedQuery(name = "Funcion\u00e1rio.findByN\u00badeSeguran\u00e7aSocial", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.n\u00badeSeguran\u00e7aSocial = :n\u00badeSeguran\u00e7aSocial"),
    @NamedQuery(name = "Funcion\u00e1rio.findByBoletimdesanidade", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.boletimdesanidade = :boletimdesanidade"),
    @NamedQuery(name = "Funcion\u00e1rio.findByObserva\u00e7\u00f5es", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.observa\u00e7\u00f5es = :observa\u00e7\u00f5es"),
    @NamedQuery(name = "Funcion\u00e1rio.findByAdenda", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.adenda = :adenda"),
    @NamedQuery(name = "Funcion\u00e1rio.findByVencimentoReal", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.vencimentoReal = :vencimentoReal"),
    @NamedQuery(name = "Funcion\u00e1rio.findByVencimentoBaseKZR", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.vencimentoBaseKZR = :vencimentoBaseKZR"),
    @NamedQuery(name = "Funcion\u00e1rio.findByDiasUteis", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.diasUteis = :diasUteis"),
    @NamedQuery(name = "Funcion\u00e1rio.findByN\u00badeCC", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.n\u00badeCC = :n\u00badeCC"),
    @NamedQuery(name = "Funcion\u00e1rio.findByMapaInterno", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.mapaInterno = :mapaInterno"),
    @NamedQuery(name = "Funcion\u00e1rio.findByAgenda", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.agenda = :agenda"),
    @NamedQuery(name = "Funcion\u00e1rio.findByEMail", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.eMail = :eMail"),
    @NamedQuery(name = "Funcion\u00e1rio.findByGenassinatura", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.genassinatura = :genassinatura"),
    @NamedQuery(name = "Funcion\u00e1rio.findByGencarimbo", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.gencarimbo = :gencarimbo"),
    @NamedQuery(name = "Funcion\u00e1rio.findByGenObserva\u00e7\u00f5es", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.genObserva\u00e7\u00f5es = :genObserva\u00e7\u00f5es"),
    @NamedQuery(name = "Funcion\u00e1rio.findBySGUID", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.sGUID = :sGUID"),
    @NamedQuery(name = "Funcion\u00e1rio.findByAenassinatura", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.aenassinatura = :aenassinatura"),
    @NamedQuery(name = "Funcion\u00e1rio.findByAencarimbo", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.aencarimbo = :aencarimbo"),
    @NamedQuery(name = "Funcion\u00e1rio.findByAenObserva\u00e7\u00f5es", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.aenObserva\u00e7\u00f5es = :aenObserva\u00e7\u00f5es"),
    @NamedQuery(name = "Funcion\u00e1rio.findBySGeneration", query = "SELECT f FROM Funcion\u00e1rio f WHERE f.sGeneration = :sGeneration")})
public class Funcionário implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID Funcion\u00e1rio")
    private Integer iDFuncionário;
    @Column(name = "ID Utente")
    private Integer iDUtente;
    @Column(name = "N\u00ba de Funcion\u00e1rio")
    private String nºdeFuncionário;
    @Column(name = "Tipo de trabalhador")
    private String tipodetrabalhador;
    @Column(name = "Estatuto de trabalhador")
    private Integer estatutodetrabalhador;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Nome Abreviado")
    private String nomeAbreviado;
    @Column(name = "Contrato N\u00ba")
    private String contratoNº;
    @Column(name = "Conta Banc\u00e1ria")
    private String contaBancária;
    @Column(name = "cargo")
    private Integer cargo;
    @Column(name = "Especialidade")
    private Integer especialidade;
    @Column(name = "escal\u00e3o")
    private Integer escalão;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "morada")
    private String morada;
    @Column(name = "Responsabilidade")
    private Integer responsabilidade;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Column(name = "Cidade")
    private Integer cidade;
    @Column(name = "Centro de custo")
    private Integer centrodecusto;
    @Basic(optional = false)
    @Column(name = "Receitar")
    private boolean receitar;
    @Column(name = "DataAdmiss\u00e3o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAdmissão;
    @Column(name = "Data de Sa\u00edda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeSaída;
    @Column(name = "Data Nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Column(name = "Estado Civil")
    private String estadoCivil;
    @Column(name = "Area")
    private Integer area;
    @Column(name = "Local")
    private Integer local;
    @Column(name = "N\u00ba de Benefici\u00e1rio Fiscal")
    private String nºdeBeneficiárioFiscal;
    @Column(name = "N\u00ba de Seguran\u00e7a Social")
    private String nºdeSegurançaSocial;
    @Column(name = "Boletim de sanidade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date boletimdesanidade;
    @Column(name = "Observa\u00e7\u00f5es")
    private String observações;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Adenda")
    private Double adenda;
    @Column(name = "Vencimento Real")
    private Double vencimentoReal;
    @Column(name = "Vencimento Base KZR")
    private Double vencimentoBaseKZR;
    @Column(name = "Dias Uteis")
    private Integer diasUteis;
    @Column(name = "N\u00ba de CC")
    private Integer nºdeCC;
    @Basic(optional = false)
    @Column(name = "Mapa Interno")
    private boolean mapaInterno;
    @Column(name = "Agenda")
    private Integer agenda;
    @Column(name = "e-mail")
    private String eMail;
    @Lob
    @Column(name = "assinatura")
    private byte[] assinatura;
    @Lob
    @Column(name = "carimbo")
    private byte[] carimbo;
    @Column(name = "Gen_assinatura")
    private Integer genassinatura;
    @Column(name = "Gen_carimbo")
    private Integer gencarimbo;
    @Column(name = "Gen_Observa\u00e7\u00f5es")
    private Integer genObservações;
    @Column(name = "s_GUID")
    private String sGUID;
    @Column(name = "Aen_assinatura")
    private Integer aenassinatura;
    @Column(name = "Aen_carimbo")
    private Integer aencarimbo;
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

    public Funcionário() {
    }

    public Funcionário(Integer iDFuncionário) {
        this.iDFuncionário = iDFuncionário;
    }

    public Funcionário(Integer iDFuncionário, boolean activo, boolean receitar, boolean mapaInterno) {
        this.iDFuncionário = iDFuncionário;
        this.activo = activo;
        this.receitar = receitar;
        this.mapaInterno = mapaInterno;
    }

    public Integer getIDFuncionário() {
        return iDFuncionário;
    }

    public void setIDFuncionário(Integer iDFuncionário) {
        this.iDFuncionário = iDFuncionário;
    }

    public Integer getIDUtente() {
        return iDUtente;
    }

    public void setIDUtente(Integer iDUtente) {
        this.iDUtente = iDUtente;
    }

    public String getNºdeFuncionário() {
        return nºdeFuncionário;
    }

    public void setNºdeFuncionário(String nºdeFuncionário) {
        this.nºdeFuncionário = nºdeFuncionário;
    }

    public String getTipodetrabalhador() {
        return tipodetrabalhador;
    }

    public void setTipodetrabalhador(String tipodetrabalhador) {
        this.tipodetrabalhador = tipodetrabalhador;
    }

    public Integer getEstatutodetrabalhador() {
        return estatutodetrabalhador;
    }

    public void setEstatutodetrabalhador(Integer estatutodetrabalhador) {
        this.estatutodetrabalhador = estatutodetrabalhador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    public String getContratoNº() {
        return contratoNº;
    }

    public void setContratoNº(String contratoNº) {
        this.contratoNº = contratoNº;
    }

    public String getContaBancária() {
        return contaBancária;
    }

    public void setContaBancária(String contaBancária) {
        this.contaBancária = contaBancária;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public Integer getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Integer especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getEscalão() {
        return escalão;
    }

    public void setEscalão(Integer escalão) {
        this.escalão = escalão;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public String getNºdeBeneficiárioFiscal() {
        return nºdeBeneficiárioFiscal;
    }

    public void setNºdeBeneficiárioFiscal(String nºdeBeneficiárioFiscal) {
        this.nºdeBeneficiárioFiscal = nºdeBeneficiárioFiscal;
    }

    public String getNºdeSegurançaSocial() {
        return nºdeSegurançaSocial;
    }

    public void setNºdeSegurançaSocial(String nºdeSegurançaSocial) {
        this.nºdeSegurançaSocial = nºdeSegurançaSocial;
    }

    public Date getBoletimdesanidade() {
        return boletimdesanidade;
    }

    public void setBoletimdesanidade(Date boletimdesanidade) {
        this.boletimdesanidade = boletimdesanidade;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public Double getAdenda() {
        return adenda;
    }

    public void setAdenda(Double adenda) {
        this.adenda = adenda;
    }

    public Double getVencimentoReal() {
        return vencimentoReal;
    }

    public void setVencimentoReal(Double vencimentoReal) {
        this.vencimentoReal = vencimentoReal;
    }

    public Double getVencimentoBaseKZR() {
        return vencimentoBaseKZR;
    }

    public void setVencimentoBaseKZR(Double vencimentoBaseKZR) {
        this.vencimentoBaseKZR = vencimentoBaseKZR;
    }

    public Integer getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(Integer diasUteis) {
        this.diasUteis = diasUteis;
    }

    public Integer getNºdeCC() {
        return nºdeCC;
    }

    public void setNºdeCC(Integer nºdeCC) {
        this.nºdeCC = nºdeCC;
    }

    public boolean getMapaInterno() {
        return mapaInterno;
    }

    public void setMapaInterno(boolean mapaInterno) {
        this.mapaInterno = mapaInterno;
    }

    public Integer getAgenda() {
        return agenda;
    }

    public void setAgenda(Integer agenda) {
        this.agenda = agenda;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public byte[] getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(byte[] assinatura) {
        this.assinatura = assinatura;
    }

    public byte[] getCarimbo() {
        return carimbo;
    }

    public void setCarimbo(byte[] carimbo) {
        this.carimbo = carimbo;
    }

    public Integer getGenassinatura() {
        return genassinatura;
    }

    public void setGenassinatura(Integer genassinatura) {
        this.genassinatura = genassinatura;
    }

    public Integer getGencarimbo() {
        return gencarimbo;
    }

    public void setGencarimbo(Integer gencarimbo) {
        this.gencarimbo = gencarimbo;
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

    public Integer getAenassinatura() {
        return aenassinatura;
    }

    public void setAenassinatura(Integer aenassinatura) {
        this.aenassinatura = aenassinatura;
    }

    public Integer getAencarimbo() {
        return aencarimbo;
    }

    public void setAencarimbo(Integer aencarimbo) {
        this.aencarimbo = aencarimbo;
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
        hash += (iDFuncionário != null ? iDFuncionário.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionário)) {
            return false;
        }
        Funcionário other = (Funcionário) object;
        if ((this.iDFuncionário == null && other.iDFuncionário != null) || (this.iDFuncionário != null && !this.iDFuncionário.equals(other.iDFuncionário))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.controleactividades.domain.Funcion\u00e1rio[ iDFuncion\u00e1rio=" + iDFuncionário + " ]";
    }
    
}
