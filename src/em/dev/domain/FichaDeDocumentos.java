package em.dev.domain;

import em.dev.domain.exceptions.CPFInvalidoException;
import em.dev.domain.exceptions.EmptyFieldException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "documentos")
public class FichaDeDocumentos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String PIS;
    private String CPF;
    private String RG;
    
    @Column(name = "orgao_emissor_rg")
    private String orgaoEmissor;
    
    @Column(name = "uf_rg")
    private String UF;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_emissao_rg")
    private Date dataEmissao;
    
    @Column(name = "titulo_de_eleitor")
    private String tituloEleitor;
    private String zona;
    private String secao;
    private String portaria;
    private String CTPS;
    
    @OneToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) throws EmptyFieldException {
        this.PIS = validaCampo(PIS);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws EmptyFieldException, CPFInvalidoException {
        if(!CPF.trim().isEmpty()){
            if(em.dev.domain.util.CPF.isValid(CPF)){
                this.CPF = CPF;
            }else{
                throw new CPFInvalidoException();
            }
        }else{
            throw new EmptyFieldException();
        }
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) throws EmptyFieldException {
        this.RG = validaCampo(RG);
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) throws EmptyFieldException {
        this.orgaoEmissor = validaCampo(orgaoEmissor);
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) throws EmptyFieldException {
        this.UF = validaCampo(UF);
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) throws EmptyFieldException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dataEmissao = sdf.parse(dataEmissao);
        }catch(ParseException e){
            throw new EmptyFieldException();
        }
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor){
        this.tituloEleitor = tituloEleitor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona){
        this.zona = zona;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao){
        this.secao = secao;
    }

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    private String validaCampo(String campo) throws EmptyFieldException{
        if(!campo.trim().isEmpty())
            return campo;
        else
            throw new EmptyFieldException();
    }
}