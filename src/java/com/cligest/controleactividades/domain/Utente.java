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
@Table(name = "UtenteMerge")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u"),
    @NamedQuery(name = "Utente.findByIDUtente", query = "SELECT u FROM Utente u WHERE u.iDUtente = :iDUtente"),
    @NamedQuery(name = "Utente.findByIDUtenteexterno", query = "SELECT u FROM Utente u WHERE u.iDUtenteexterno = :iDUtenteexterno"),
    @NamedQuery(name = "Utente.findByIDEntidade", query = "SELECT u FROM Utente u WHERE u.iDEntidade = :iDEntidade"),
    @NamedQuery(name = "Utente.findByProfiss\u00e3o", query = "SELECT u FROM Utente u WHERE u.profiss\u00e3o = :profiss\u00e3o"),
    @NamedQuery(name = "Utente.findByIDEstatuto", query = "SELECT u FROM Utente u WHERE u.iDEstatuto = :iDEstatuto"),
    @NamedQuery(name = "Utente.findByIDTitular", query = "SELECT u FROM Utente u WHERE u.iDTitular = :iDTitular"),
    @NamedQuery(name = "Utente.findByNome", query = "SELECT u FROM Utente u WHERE u.nome = :nome"),
    @NamedQuery(name = "Utente.findByDataNascimento", query = "SELECT u FROM Utente u WHERE u.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Utente.findBySexo", query = "SELECT u FROM Utente u WHERE u.sexo = :sexo"),
    @NamedQuery(name = "Utente.findByNaturalidade", query = "SELECT u FROM Utente u WHERE u.naturalidade = :naturalidade"),
    @NamedQuery(name = "Utente.findByBi", query = "SELECT u FROM Utente u WHERE u.bi = :bi"),
    @NamedQuery(name = "Utente.findByMorada", query = "SELECT u FROM Utente u WHERE u.morada = :morada"),
    @NamedQuery(name = "Utente.findByCidade", query = "SELECT u FROM Utente u WHERE u.cidade = :cidade"),
    @NamedQuery(name = "Utente.findByTelefone", query = "SELECT u FROM Utente u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Utente.findByTelefone2", query = "SELECT u FROM Utente u WHERE u.telefone2 = :telefone2"),
    @NamedQuery(name = "Utente.findByLocaldeTrabalho", query = "SELECT u FROM Utente u WHERE u.localdeTrabalho = :localdeTrabalho"),
    @NamedQuery(name = "Utente.findByDataActualiza\u00e7\u00e3o", query = "SELECT u FROM Utente u WHERE u.dataActualiza\u00e7\u00e3o = :dataActualiza\u00e7\u00e3o"),
    @NamedQuery(name = "Utente.findByDataFimdecontrato", query = "SELECT u FROM Utente u WHERE u.dataFimdecontrato = :dataFimdecontrato"),
    @NamedQuery(name = "Utente.findByDatadeAberturadaficha", query = "SELECT u FROM Utente u WHERE u.datadeAberturadaficha = :datadeAberturadaficha"),
    @NamedQuery(name = "Utente.findBy\u00daltimaconsultadeficha", query = "SELECT u FROM Utente u WHERE u.\u00faltimaconsultadeficha = :\u00faltimaconsultadeficha"),
    @NamedQuery(name = "Utente.findByNomedoTitular", query = "SELECT u FROM Utente u WHERE u.nomedoTitular = :nomedoTitular"),
    @NamedQuery(name = "Utente.findByObserva\u00e7\u00f5es", query = "SELECT u FROM Utente u WHERE u.observa\u00e7\u00f5es = :observa\u00e7\u00f5es"),
    @NamedQuery(name = "Utente.findByActivo", query = "SELECT u FROM Utente u WHERE u.activo = :activo"),
    @NamedQuery(name = "Utente.findByEstado", query = "SELECT u FROM Utente u WHERE u.estado = :estado"),
    @NamedQuery(name = "Utente.findByIDRaz\u00e3o", query = "SELECT u FROM Utente u WHERE u.iDRaz\u00e3o = :iDRaz\u00e3o"),
    @NamedQuery(name = "Utente.findByIDFuncion\u00e1rio", query = "SELECT u FROM Utente u WHERE u.iDFuncion\u00e1rio = :iDFuncion\u00e1rio"),
    @NamedQuery(name = "Utente.findByFichaCl\u00ednica", query = "SELECT u FROM Utente u WHERE u.fichaCl\u00ednica = :fichaCl\u00ednica"),
    @NamedQuery(name = "Utente.findByConfirmado", query = "SELECT u FROM Utente u WHERE u.confirmado = :confirmado"),
    @NamedQuery(name = "Utente.findByGrupoSanguineo", query = "SELECT u FROM Utente u WHERE u.grupoSanguineo = :grupoSanguineo"),
    @NamedQuery(name = "Utente.findByAlergias", query = "SELECT u FROM Utente u WHERE u.alergias = :alergias"),
    @NamedQuery(name = "Utente.findByRa\u00e7a", query = "SELECT u FROM Utente u WHERE u.ra\u00e7a = :ra\u00e7a"),
    @NamedQuery(name = "Utente.findByPeso", query = "SELECT u FROM Utente u WHERE u.peso = :peso"),
    @NamedQuery(name = "Utente.findByAltura", query = "SELECT u FROM Utente u WHERE u.altura = :altura"),
    @NamedQuery(name = "Utente.findByBairro", query = "SELECT u FROM Utente u WHERE u.bairro = :bairro"),
    @NamedQuery(name = "Utente.findByEmail", query = "SELECT u FROM Utente u WHERE u.email = :email"),
    @NamedQuery(name = "Utente.findByNacionalidade", query = "SELECT u FROM Utente u WHERE u.nacionalidade = :nacionalidade"),
    @NamedQuery(name = "Utente.findByLocalizacao", query = "SELECT u FROM Utente u WHERE u.localizacao = :localizacao"),
    @NamedQuery(name = "Utente.findByBIPath", query = "SELECT u FROM Utente u WHERE u.bIPath = :bIPath"),
    @NamedQuery(name = "Utente.findByCartaoPath", query = "SELECT u FROM Utente u WHERE u.cartaoPath = :cartaoPath"),
    @NamedQuery(name = "Utente.findByBIUpload", query = "SELECT u FROM Utente u WHERE u.bIUpload = :bIUpload"),
    @NamedQuery(name = "Utente.findByCartaoUpload", query = "SELECT u FROM Utente u WHERE u.cartaoUpload = :cartaoUpload"),
    @NamedQuery(name = "Utente.findByBIDataUploadFirst", query = "SELECT u FROM Utente u WHERE u.bIDataUploadFirst = :bIDataUploadFirst"),
    @NamedQuery(name = "Utente.findByBIDataUploadLast", query = "SELECT u FROM Utente u WHERE u.bIDataUploadLast = :bIDataUploadLast"),
    @NamedQuery(name = "Utente.findByCartaoDataUploadFirst", query = "SELECT u FROM Utente u WHERE u.cartaoDataUploadFirst = :cartaoDataUploadFirst"),
    @NamedQuery(name = "Utente.findByCartaoDataUploadLast", query = "SELECT u FROM Utente u WHERE u.cartaoDataUploadLast = :cartaoDataUploadLast"),
    @NamedQuery(name = "Utente.findByBIIDUploadFirst", query = "SELECT u FROM Utente u WHERE u.bIIDUploadFirst = :bIIDUploadFirst"),
    @NamedQuery(name = "Utente.findByBIIDUploadLast", query = "SELECT u FROM Utente u WHERE u.bIIDUploadLast = :bIIDUploadLast"),
    @NamedQuery(name = "Utente.findByCartaoIDUploadFirst", query = "SELECT u FROM Utente u WHERE u.cartaoIDUploadFirst = :cartaoIDUploadFirst"),
    @NamedQuery(name = "Utente.findByCartaoIDUploadLast", query = "SELECT u FROM Utente u WHERE u.cartaoIDUploadLast = :cartaoIDUploadLast")})
public class Utente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID Utente")
    private Integer iDUtente;
    @Column(name = "ID Utente externo")
    private String iDUtenteexterno;
    @Column(name = "ID Entidade")
    private Integer iDEntidade;
    @Column(name = "Profiss\u00e3o")
    private String profissão;
    @Column(name = "ID Estatuto")
    private Short iDEstatuto;
    @Column(name = "ID Titular")
    private Integer iDTitular;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Data Nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Column(name = "Sexo")
    private String sexo;
    @Column(name = "Naturalidade")
    private String naturalidade;
    @Column(name = "BI")
    private String bi;
    @Column(name = "Morada")
    private String morada;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Telefone 2")
    private String telefone2;
    @Column(name = "Local de Trabalho")
    private Integer localdeTrabalho;
    @Column(name = "Data Actualiza\u00e7\u00e3o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataActualização;
    @Column(name = "Data Fim de contrato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFimdecontrato;
    @Column(name = "Data de Abertura da ficha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeAberturadaficha;
    @Column(name = "\u00daltima consulta de ficha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date últimaconsultadeficha;
    @Column(name = "Nome do Titular")
    private String nomedoTitular;
    @Column(name = "Observa\u00e7\u00f5es")
    private String observações;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Column(name = "Estado")
    private Integer estado;
    @Column(name = "ID Raz\u00e3o")
    private Integer iDRazão;
    @Column(name = "ID Funcion\u00e1rio")
    private Integer iDFuncionário;
    @Basic(optional = false)
    @Column(name = "Ficha Cl\u00ednica")
    private boolean fichaClínica;
    @Basic(optional = false)
    @Column(name = "Confirmado")
    private boolean confirmado;
    @Column(name = "Grupo Sanguineo")
    private String grupoSanguineo;
    @Column(name = "Alergias")
    private String alergias;
    @Column(name = "Ra\u00e7a")
    private String raça;
    @Column(name = "Peso")
    private String peso;
    @Column(name = "Altura")
    private String altura;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "E-mail")
    private String email;
    @Column(name = "Nacionalidade")
    private String nacionalidade;
    @Column(name = "Localizacao")
    private String localizacao;
    @Column(name = "BIPath")
    private String bIPath;
    @Column(name = "CartaoPath")
    private String cartaoPath;
    @Column(name = "BIUpload")
    private String bIUpload;
    @Column(name = "CartaoUpload")
    private String cartaoUpload;
    @Column(name = "BIDataUploadFirst")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bIDataUploadFirst;
    @Column(name = "BIDataUploadLast")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bIDataUploadLast;
    @Column(name = "CartaoDataUploadFirst")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cartaoDataUploadFirst;
    @Column(name = "CartaoDataUploadLast")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cartaoDataUploadLast;
    @Column(name = "BIIDUploadFirst")
    private Integer bIIDUploadFirst;
    @Column(name = "BIIDUploadLast")
    private Integer bIIDUploadLast;
    @Column(name = "CartaoIDUploadFirst")
    private Integer cartaoIDUploadFirst;
    @Column(name = "CartaoIDUploadLast")
    private Integer cartaoIDUploadLast;

    public Utente() {
    }

    public Utente(Integer iDUtente) {
        this.iDUtente = iDUtente;
    }

    public Utente(Integer iDUtente, boolean activo, boolean fichaClínica, boolean confirmado) {
        this.iDUtente = iDUtente;
        this.activo = activo;
        this.fichaClínica = fichaClínica;
        this.confirmado = confirmado;
    }

    public Integer getIDUtente() {
        return iDUtente;
    }

    public void setIDUtente(Integer iDUtente) {
        this.iDUtente = iDUtente;
    }

    public String getIDUtenteexterno() {
        return iDUtenteexterno;
    }

    public void setIDUtenteexterno(String iDUtenteexterno) {
        this.iDUtenteexterno = iDUtenteexterno;
    }

    public Integer getIDEntidade() {
        return iDEntidade;
    }

    public void setIDEntidade(Integer iDEntidade) {
        this.iDEntidade = iDEntidade;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public Short getIDEstatuto() {
        return iDEstatuto;
    }

    public void setIDEstatuto(Short iDEstatuto) {
        this.iDEstatuto = iDEstatuto;
    }

    public Integer getIDTitular() {
        return iDTitular;
    }

    public void setIDTitular(Integer iDTitular) {
        this.iDTitular = iDTitular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public Integer getLocaldeTrabalho() {
        return localdeTrabalho;
    }

    public void setLocaldeTrabalho(Integer localdeTrabalho) {
        this.localdeTrabalho = localdeTrabalho;
    }

    public Date getDataActualização() {
        return dataActualização;
    }

    public void setDataActualização(Date dataActualização) {
        this.dataActualização = dataActualização;
    }

    public Date getDataFimdecontrato() {
        return dataFimdecontrato;
    }

    public void setDataFimdecontrato(Date dataFimdecontrato) {
        this.dataFimdecontrato = dataFimdecontrato;
    }

    public Date getDatadeAberturadaficha() {
        return datadeAberturadaficha;
    }

    public void setDatadeAberturadaficha(Date datadeAberturadaficha) {
        this.datadeAberturadaficha = datadeAberturadaficha;
    }

    public Date getÚltimaconsultadeficha() {
        return últimaconsultadeficha;
    }

    public void setÚltimaconsultadeficha(Date últimaconsultadeficha) {
        this.últimaconsultadeficha = últimaconsultadeficha;
    }

    public String getNomedoTitular() {
        return nomedoTitular;
    }

    public void setNomedoTitular(String nomedoTitular) {
        this.nomedoTitular = nomedoTitular;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIDRazão() {
        return iDRazão;
    }

    public void setIDRazão(Integer iDRazão) {
        this.iDRazão = iDRazão;
    }

    public Integer getIDFuncionário() {
        return iDFuncionário;
    }

    public void setIDFuncionário(Integer iDFuncionário) {
        this.iDFuncionário = iDFuncionário;
    }

    public boolean getFichaClínica() {
        return fichaClínica;
    }

    public void setFichaClínica(boolean fichaClínica) {
        this.fichaClínica = fichaClínica;
    }

    public boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getBIPath() {
        return bIPath;
    }

    public void setBIPath(String bIPath) {
        this.bIPath = bIPath;
    }

    public String getCartaoPath() {
        return cartaoPath;
    }

    public void setCartaoPath(String cartaoPath) {
        this.cartaoPath = cartaoPath;
    }

    public String getBIUpload() {
        return bIUpload;
    }

    public void setBIUpload(String bIUpload) {
        this.bIUpload = bIUpload;
    }

    public String getCartaoUpload() {
        return cartaoUpload;
    }

    public void setCartaoUpload(String cartaoUpload) {
        this.cartaoUpload = cartaoUpload;
    }

    public Date getBIDataUploadFirst() {
        return bIDataUploadFirst;
    }

    public void setBIDataUploadFirst(Date bIDataUploadFirst) {
        this.bIDataUploadFirst = bIDataUploadFirst;
    }

    public Date getBIDataUploadLast() {
        return bIDataUploadLast;
    }

    public void setBIDataUploadLast(Date bIDataUploadLast) {
        this.bIDataUploadLast = bIDataUploadLast;
    }

    public Date getCartaoDataUploadFirst() {
        return cartaoDataUploadFirst;
    }

    public void setCartaoDataUploadFirst(Date cartaoDataUploadFirst) {
        this.cartaoDataUploadFirst = cartaoDataUploadFirst;
    }

    public Date getCartaoDataUploadLast() {
        return cartaoDataUploadLast;
    }

    public void setCartaoDataUploadLast(Date cartaoDataUploadLast) {
        this.cartaoDataUploadLast = cartaoDataUploadLast;
    }

    public Integer getBIIDUploadFirst() {
        return bIIDUploadFirst;
    }

    public void setBIIDUploadFirst(Integer bIIDUploadFirst) {
        this.bIIDUploadFirst = bIIDUploadFirst;
    }

    public Integer getBIIDUploadLast() {
        return bIIDUploadLast;
    }

    public void setBIIDUploadLast(Integer bIIDUploadLast) {
        this.bIIDUploadLast = bIIDUploadLast;
    }

    public Integer getCartaoIDUploadFirst() {
        return cartaoIDUploadFirst;
    }

    public void setCartaoIDUploadFirst(Integer cartaoIDUploadFirst) {
        this.cartaoIDUploadFirst = cartaoIDUploadFirst;
    }

    public Integer getCartaoIDUploadLast() {
        return cartaoIDUploadLast;
    }

    public void setCartaoIDUploadLast(Integer cartaoIDUploadLast) {
        this.cartaoIDUploadLast = cartaoIDUploadLast;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUtente != null ? iDUtente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utente)) {
            return false;
        }
        Utente other = (Utente) object;
        if ((this.iDUtente == null && other.iDUtente != null) || (this.iDUtente != null && !this.iDUtente.equals(other.iDUtente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.controleactividades.domain.Utente[ iDUtente=" + iDUtente + " ]";
    }
    
}
