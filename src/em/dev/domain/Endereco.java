package em.dev.domain;

import em.dev.domain.exceptions.EmptyFieldException;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "enderecos")
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "endereco_residencial")
    private String enderecoResidencial;
    private String numero;
    private String CEP;
    private String UF;
    private String cidade;
    private String complemento;
    private String bairro;
    
    @OneToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) throws EmptyFieldException {
        this.enderecoResidencial = validaCampo(enderecoResidencial);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws EmptyFieldException {
        this.numero = validaCampo(numero); 
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) throws EmptyFieldException {
        this.CEP = validaCampo(CEP);
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) throws EmptyFieldException {
        this.UF = validaCampo(UF);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws EmptyFieldException {
        this.cidade = validaCampo(cidade);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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