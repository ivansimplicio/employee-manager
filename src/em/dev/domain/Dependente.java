package em.dev.domain;

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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "dependentes")
public class Dependente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_de_nascimento")
    private Date dataNascimento;
    
    private String sexo;
    
    @Column(name = "grau_de_parentesco")
    private String grauDeParentesco;
    
    @Column(name = "possui_deficiencia")
    private Boolean possuiDeficiencia;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws EmptyFieldException {
        this.nome = validaCampo(nome);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws EmptyFieldException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dataNascimento = sdf.parse(dataNascimento);
        }catch(ParseException e){
            throw new EmptyFieldException();
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws EmptyFieldException {
        this.sexo = validaCampo(sexo);
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(String grauDeParentesco) throws EmptyFieldException {
        this.grauDeParentesco = validaCampo(grauDeParentesco);
    }

    public Boolean getPossuiDeficiencia() {
        return possuiDeficiencia;
    }

    public void setPossuiDeficiencia(Boolean possuiDeficiencia) throws EmptyFieldException {
        if(possuiDeficiencia != null)
            this.possuiDeficiencia = possuiDeficiencia;
        else
            throw new EmptyFieldException();
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