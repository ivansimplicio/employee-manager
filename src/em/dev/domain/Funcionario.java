package em.dev.domain;

import em.dev.domain.exceptions.EmptyFieldException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "funcionarios")
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    private String matricula;
    private String email;
    private String telefone;
    
    @Column(name = "estado_civil")
    private String estadoCivil;
    private String sexo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_de_nascimento")
    private Date dataDeNascimento;
    
    @Column(name = "nome_do_pai")
    private String nomeDoPai;
    
    @Column(name = "nome_da_mae")
    private String nomeDaMae;
    
    private String nacionalidade;
    private String naturalidade;
    private String raca;
    private String escolaridade;
    
    @Column(name = "possui_deficiencia")
    private Boolean possuiDeficiencia;
    
    private Boolean aposentado;
    
    @Column(name = "path_anexos")
    private String pathAnexos;
    
    @OneToOne(cascade=CascadeType.ALL, mappedBy="funcionario")
    private Endereco endereco;
    
    @OneToOne(cascade=CascadeType.ALL, mappedBy="funcionario")
    private FichaDeDocumentos documentos;
    
    @OneToOne(cascade=CascadeType.ALL, mappedBy="funcionario")
    private DadosFuncionais dadosFuncionais;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "funcionario")
    private List<Dependente> dependentes = new ArrayList<>();

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws EmptyFieldException {
        this.matricula = validaCampo(matricula);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) throws EmptyFieldException {
        this.estadoCivil = validaCampo(estadoCivil);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws EmptyFieldException {
        this.sexo = validaCampo(sexo);
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) throws EmptyFieldException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.dataDeNascimento = sdf.parse(dataDeNascimento);
        }catch(ParseException e){
            throw new EmptyFieldException();
        }
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai){
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae){
        this.nomeDaMae = nomeDaMae;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) throws EmptyFieldException {
        this.nacionalidade = validaCampo(nacionalidade);
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) throws EmptyFieldException {
        this.naturalidade = validaCampo(naturalidade);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) throws EmptyFieldException {
        this.raca = validaCampo(raca);
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) throws EmptyFieldException {
        this.escolaridade = validaCampo(escolaridade);
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

    public Boolean getAposentado() {
        return aposentado;
    }

    public void setAposentado(Boolean aposentado) throws EmptyFieldException {
        if(aposentado != null)
            this.aposentado = aposentado;
        else
            throw new EmptyFieldException();
    }

    public String getPathAnexos() {
        return pathAnexos;
    }

    public void setPathAnexos(String pathAnexos) {
        this.pathAnexos = pathAnexos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public FichaDeDocumentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(FichaDeDocumentos documentos) {
        this.documentos = documentos;
    }

    public DadosFuncionais getDadosFuncionais() {
        return dadosFuncionais;
    }

    public void setDadosFuncionais(DadosFuncionais dadosFuncionais) {
        this.dadosFuncionais = dadosFuncionais;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    
    public void addDependente(Dependente dependente){
        if(dependente != null){
            this.dependentes.add(dependente);
        }
    }
    
    private String validaCampo(String campo) throws EmptyFieldException{
        if(!campo.trim().isEmpty())
            return campo;
        else
            throw new EmptyFieldException();
    }
}