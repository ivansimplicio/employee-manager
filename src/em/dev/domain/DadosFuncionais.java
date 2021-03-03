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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "dados_funcionais")
public class DadosFuncionais implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String regime;
    
    private String lotacao;
    
    @Column(name = "local_de_trabalho")
    private String localDeTrabalho;
    
    @Column(name = "cargo_provimento")
    private String cargoProvimento;
    
    @Column(name = "cargo_ocupado_atual")
    private String cargoOcupado;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_de_admissao")
    private Date dataAdmissao;
    
    @Column(name = "acumulacao_de_cargos")
    private String acumulacaoDeCargos;
    
    @OneToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) throws EmptyFieldException {
        this.regime = validaCampo(regime);
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) throws EmptyFieldException {
        this.lotacao = validaCampo(lotacao);
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) throws EmptyFieldException {
        this.localDeTrabalho = validaCampo(localDeTrabalho);
    }

    public String getCargoProvimento() {
        return cargoProvimento;
    }

    public void setCargoProvimento(String cargoProvimento) {
        this.cargoProvimento = cargoProvimento;
    }

    public String getCargoOcupado() {
        return cargoOcupado;
    }

    public void setCargoOcupado(String cargoOcupado) throws EmptyFieldException {
        this.cargoOcupado = validaCampo(cargoOcupado);
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) throws EmptyFieldException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dataAdmissao = sdf.parse(dataAdmissao);
        }catch(ParseException e){
            throw new EmptyFieldException();
        }
    }

    public String getAcumulacaoDeCargos() {
        return acumulacaoDeCargos;
    }

    public void setAcumulacaoDeCargos(String acumulacaoDeCargos) throws EmptyFieldException {
        this.acumulacaoDeCargos = validaCampo(acumulacaoDeCargos);
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