package em.dev.panels;

import em.dev.domain.Funcionario;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;

public class PanelDetalhes extends javax.swing.JPanel implements Printable{
    
    public PanelDetalhes(Funcionario funcionario) {
        initComponents();
        preencheFormulario(funcionario);
    }
    
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
        if(pageIndex > 0){
            return NO_SUCH_PAGE;
        }
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        
        this.printAll(g);
        
        return PAGE_EXISTS;
    }
    
    private void preencheFormulario(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          
        //dados pessoais
        tf_nome.setText(f.getNome());
        tf_matricula.setText(f.getMatricula());
        tf_email.setText(f.getEmail());
        tf_telefone.setText(f.getTelefone());
        tf_estadoCivil.setText(f.getEstadoCivil());
        tf_sexo.setText(f.getSexo());
        tf_dataNascimento.setText(sdf.format(f.getDataDeNascimento()));
        tf_nomePai.setText(f.getNomeDoPai());
        tf_nomeMae.setText(f.getNomeDaMae());
        tf_nacionalidade.setText(f.getNacionalidade());
        tf_naturalidade.setText(f.getNaturalidade());
        tf_raca.setText(f.getRaca());
        tf_escolaridade.setText(f.getEscolaridade());
        tf_aposentado.setText(f.getAposentado() ? "Sim" : "Não");
        tf_deficiente.setText(f.getPossuiDeficiencia() ? "Sim" : "Não");
        
        //endereço
        tf_endereco.setText(f.getEndereco().getEnderecoResidencial());
        tf_numero.setText(f.getEndereco().getNumero());
        tf_bairro.setText(f.getEndereco().getBairro());
        tf_complemento.setText(f.getEndereco().getComplemento());
        tf_cep.setText(f.getEndereco().getCEP());
        tf_estado.setText(f.getEndereco().getUF());
        tf_cidade.setText(f.getEndereco().getCidade());
        
        //documentos
        tf_pis.setText(f.getDocumentos().getPIS());
        tf_cpf.setText(f.getDocumentos().getCPF());
        tf_rg.setText(f.getDocumentos().getRG());
        tf_orgaoEmissor.setText(f.getDocumentos().getOrgaoEmissor());
        tf_uf.setText(f.getDocumentos().getUF());
        tf_dataEmissao.setText(sdf.format(f.getDocumentos().getDataEmissao()));
        tf_titulo.setText(f.getDocumentos().getTituloEleitor());
        tf_zona.setText(f.getDocumentos().getZona());
        tf_secao.setText(f.getDocumentos().getSecao());
        tf_contrato.setText(f.getDocumentos().getPortaria());
        tf_ctps.setText(f.getDocumentos().getCTPS());
        
        //dados funcionais
        tf_regime.setText(f.getDadosFuncionais().getRegime());
        tf_lotacao.setText(f.getDadosFuncionais().getLotacao());
        tf_localTrabalho.setText(f.getDadosFuncionais().getLocalDeTrabalho());
        tf_cargoProvimento.setText(f.getDadosFuncionais().getCargoProvimento());
        tf_cargoAtual.setText(f.getDadosFuncionais().getCargoOcupado());
        tf_dataAdmissao.setText(sdf.format(f.getDadosFuncionais().getDataAdmissao()));
        tf_acumulacao.setText(f.getDadosFuncionais().getAcumulacaoDeCargos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelText2 = new javax.swing.JLabel();
        labelText3 = new javax.swing.JLabel();
        labelText4 = new javax.swing.JLabel();
        labelText5 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JLabel();
        tf_matricula = new javax.swing.JLabel();
        tf_email = new javax.swing.JLabel();
        labelText6 = new javax.swing.JLabel();
        labelText7 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JLabel();
        labelText8 = new javax.swing.JLabel();
        labelText9 = new javax.swing.JLabel();
        labelText10 = new javax.swing.JLabel();
        labelText11 = new javax.swing.JLabel();
        tf_estadoCivil = new javax.swing.JLabel();
        tf_nomePai = new javax.swing.JLabel();
        tf_nomeMae = new javax.swing.JLabel();
        tf_naturalidade = new javax.swing.JLabel();
        tf_raca = new javax.swing.JLabel();
        tf_aposentado = new javax.swing.JLabel();
        labelText15 = new javax.swing.JLabel();
        tf_dataNascimento = new javax.swing.JLabel();
        labelText12 = new javax.swing.JLabel();
        tf_sexo = new javax.swing.JLabel();
        labelText13 = new javax.swing.JLabel();
        labelText17 = new javax.swing.JLabel();
        labelText18 = new javax.swing.JLabel();
        labelText19 = new javax.swing.JLabel();
        tf_nacionalidade = new javax.swing.JLabel();
        tf_escolaridade = new javax.swing.JLabel();
        tf_deficiente = new javax.swing.JLabel();
        labelText14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelText16 = new javax.swing.JLabel();
        labelText20 = new javax.swing.JLabel();
        labelText21 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JLabel();
        tf_bairro = new javax.swing.JLabel();
        tf_cep = new javax.swing.JLabel();
        labelText22 = new javax.swing.JLabel();
        tf_estado = new javax.swing.JLabel();
        labelText23 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JLabel();
        labelText24 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JLabel();
        labelText25 = new javax.swing.JLabel();
        tf_complemento = new javax.swing.JLabel();
        labelText26 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelText27 = new javax.swing.JLabel();
        tf_pis = new javax.swing.JLabel();
        labelText28 = new javax.swing.JLabel();
        labelText29 = new javax.swing.JLabel();
        tf_cpf = new javax.swing.JLabel();
        labelText30 = new javax.swing.JLabel();
        labelText31 = new javax.swing.JLabel();
        labelText32 = new javax.swing.JLabel();
        labelText33 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JLabel();
        tf_contrato = new javax.swing.JLabel();
        tf_ctps = new javax.swing.JLabel();
        labelText34 = new javax.swing.JLabel();
        tf_zona = new javax.swing.JLabel();
        labelText35 = new javax.swing.JLabel();
        tf_secao = new javax.swing.JLabel();
        tf_rg = new javax.swing.JLabel();
        tf_uf = new javax.swing.JLabel();
        labelText36 = new javax.swing.JLabel();
        labelText37 = new javax.swing.JLabel();
        tf_orgaoEmissor = new javax.swing.JLabel();
        tf_dataEmissao = new javax.swing.JLabel();
        labelText38 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelText39 = new javax.swing.JLabel();
        labelText40 = new javax.swing.JLabel();
        labelText41 = new javax.swing.JLabel();
        labelText42 = new javax.swing.JLabel();
        labelText43 = new javax.swing.JLabel();
        labelText44 = new javax.swing.JLabel();
        tf_localTrabalho = new javax.swing.JLabel();
        tf_cargoProvimento = new javax.swing.JLabel();
        tf_cargoAtual = new javax.swing.JLabel();
        tf_dataAdmissao = new javax.swing.JLabel();
        tf_acumulacao = new javax.swing.JLabel();
        tf_regime = new javax.swing.JLabel();
        labelText45 = new javax.swing.JLabel();
        tf_lotacao = new javax.swing.JLabel();

        labelText2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText2.setText("Nome Completo:");

        labelText3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText3.setText("Matrícula:");

        labelText4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText4.setText("Email:");

        labelText5.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText5.setText("Estado Civil:");

        tf_nome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_nome.setText("text");

        tf_matricula.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_matricula.setText("text");

        tf_email.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_email.setText("text");

        labelText6.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText6.setText("Nome do Pai:");

        labelText7.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText7.setText("Telefone:");

        tf_telefone.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_telefone.setText("text");

        labelText8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText8.setText("Nome da Mãe:");

        labelText9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText9.setText("Nacionalidade:");

        labelText10.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText10.setText("Raça/Cor:");

        labelText11.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText11.setText("Aposentado:");

        tf_estadoCivil.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_estadoCivil.setText("text");

        tf_nomePai.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_nomePai.setText("text");

        tf_nomeMae.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_nomeMae.setText("text");

        tf_naturalidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_naturalidade.setText("text");

        tf_raca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_raca.setText("text");

        tf_aposentado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_aposentado.setText("text");

        labelText15.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        labelText15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText15.setText("INFORMAÇÕES PESSOAIS");

        tf_dataNascimento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_dataNascimento.setText("text");

        labelText12.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText12.setText("Sexo:");

        tf_sexo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_sexo.setText("text");

        labelText13.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText13.setText("Data de Nascimento:");

        labelText17.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText17.setText("Naturalidade:");

        labelText18.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText18.setText("Escolaridade:");

        labelText19.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText19.setText("Deficiente:");

        tf_nacionalidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_nacionalidade.setText("text");

        tf_escolaridade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_escolaridade.setText("text");

        tf_deficiente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_deficiente.setText("text");

        labelText14.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText14.setText("Endereço:");

        labelText16.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        labelText16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText16.setText("DADOS FUNCIONAIS");

        labelText20.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText20.setText("Bairro:");

        labelText21.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText21.setText("CEP:");

        tf_endereco.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_endereco.setText("text");

        tf_bairro.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_bairro.setText("text");

        tf_cep.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_cep.setText("text");

        labelText22.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText22.setText("Estado:");

        tf_estado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_estado.setText("text");

        labelText23.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText23.setText("Cidade:");

        tf_cidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_cidade.setText("text");

        labelText24.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText24.setText("Número:");

        tf_numero.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_numero.setText("text");

        labelText25.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText25.setText("Complemento:");

        tf_complemento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_complemento.setText("text");

        labelText26.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText26.setText("PIS/PASSEP:");

        labelText27.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        labelText27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText27.setText("ENDEREÇO");

        tf_pis.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_pis.setText("text");

        labelText28.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText28.setText("Portaria/Contrato:");

        labelText29.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText29.setText("CPF:");

        tf_cpf.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_cpf.setText("text");

        labelText30.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText30.setText("RG:");

        labelText31.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText31.setText("UF:");

        labelText32.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText32.setText("Título de Eleitor:");

        labelText33.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText33.setText("Regime:");

        tf_titulo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_titulo.setText("text");

        tf_contrato.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_contrato.setText("text");

        tf_ctps.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_ctps.setText("text");

        labelText34.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText34.setText("Zona:");

        tf_zona.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_zona.setText("text");

        labelText35.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText35.setText("Seção:");

        tf_secao.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_secao.setText("text");

        tf_rg.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_rg.setText("text");

        tf_uf.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_uf.setText("text");

        labelText36.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText36.setText("Orgão Emissor:");

        labelText37.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText37.setText("Data da Emissão:");

        tf_orgaoEmissor.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_orgaoEmissor.setText("text");

        tf_dataEmissao.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_dataEmissao.setText("text");

        labelText38.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText38.setText("CTPS Número:");

        labelText39.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        labelText39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText39.setText("DOCUMENTOS");

        labelText40.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText40.setText("Local de Trabalho:");

        labelText41.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText41.setText("Cargo Provimento em Concurso:");

        labelText42.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText42.setText("Cargo Ocupado Atual:");

        labelText43.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText43.setText("Data de Admissão:");

        labelText44.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText44.setText("Possui outro vínculo público:");

        tf_localTrabalho.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_localTrabalho.setText("text");

        tf_cargoProvimento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_cargoProvimento.setText("text");

        tf_cargoAtual.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_cargoAtual.setText("text");

        tf_dataAdmissao.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_dataAdmissao.setText("text");

        tf_acumulacao.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_acumulacao.setText("text");

        tf_regime.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_regime.setText("text");

        labelText45.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelText45.setText("Lotação:");

        tf_lotacao.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tf_lotacao.setText("text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelText27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelText16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelText15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelText40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelText43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelText42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelText41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelText44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_localTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_cargoProvimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_cargoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_dataAdmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_acumulacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelText33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_regime, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelText45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_lotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labelText38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tf_ctps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                .addComponent(tf_contrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelText34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelText35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_secao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelText8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_nomeMae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_nomePai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelText7))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(labelText3))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(tf_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelText12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(labelText13)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tf_raca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                    .addComponent(tf_nacionalidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(labelText18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(labelText17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_escolaridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_aposentado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelText19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_deficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labelText23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelText14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(labelText22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tf_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tf_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(labelText25))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(labelText24)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(labelText30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                    .addComponent(labelText31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tf_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelText37))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tf_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelText36))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelText26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_pis, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelText29)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_dataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_orgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 36, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelText39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelText15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText2)
                    .addComponent(tf_nome)
                    .addComponent(labelText3)
                    .addComponent(tf_matricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText4)
                    .addComponent(tf_telefone)
                    .addComponent(labelText7)
                    .addComponent(tf_email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText5)
                    .addComponent(tf_estadoCivil)
                    .addComponent(tf_dataNascimento)
                    .addComponent(labelText12)
                    .addComponent(tf_sexo)
                    .addComponent(labelText13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText6)
                    .addComponent(tf_nomePai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText8)
                    .addComponent(tf_nomeMae))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText9)
                    .addComponent(tf_naturalidade)
                    .addComponent(labelText17)
                    .addComponent(tf_nacionalidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText10)
                    .addComponent(tf_raca)
                    .addComponent(labelText18)
                    .addComponent(tf_escolaridade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText11)
                    .addComponent(tf_aposentado)
                    .addComponent(labelText19)
                    .addComponent(tf_deficiente))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelText27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText14)
                    .addComponent(tf_endereco)
                    .addComponent(labelText24)
                    .addComponent(tf_numero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText20)
                    .addComponent(tf_bairro)
                    .addComponent(labelText25)
                    .addComponent(tf_complemento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText21)
                    .addComponent(tf_cep)
                    .addComponent(labelText22)
                    .addComponent(tf_estado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText23)
                    .addComponent(tf_cidade))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(labelText39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText26)
                    .addComponent(tf_pis)
                    .addComponent(labelText29)
                    .addComponent(tf_cpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText30)
                    .addComponent(tf_rg)
                    .addComponent(labelText36)
                    .addComponent(tf_orgaoEmissor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText31)
                    .addComponent(tf_uf)
                    .addComponent(labelText37)
                    .addComponent(tf_dataEmissao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText32)
                    .addComponent(tf_titulo)
                    .addComponent(tf_secao)
                    .addComponent(labelText34)
                    .addComponent(tf_zona)
                    .addComponent(labelText35))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText28)
                    .addComponent(tf_contrato))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ctps)
                    .addComponent(labelText38))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelText16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText33)
                    .addComponent(tf_regime)
                    .addComponent(labelText45)
                    .addComponent(tf_lotacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText40)
                    .addComponent(tf_localTrabalho))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText41)
                    .addComponent(tf_cargoProvimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText42)
                    .addComponent(tf_cargoAtual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText43)
                    .addComponent(tf_dataAdmissao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelText44)
                    .addComponent(tf_acumulacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelText10;
    private javax.swing.JLabel labelText11;
    private javax.swing.JLabel labelText12;
    private javax.swing.JLabel labelText13;
    private javax.swing.JLabel labelText14;
    private javax.swing.JLabel labelText15;
    private javax.swing.JLabel labelText16;
    private javax.swing.JLabel labelText17;
    private javax.swing.JLabel labelText18;
    private javax.swing.JLabel labelText19;
    private javax.swing.JLabel labelText2;
    private javax.swing.JLabel labelText20;
    private javax.swing.JLabel labelText21;
    private javax.swing.JLabel labelText22;
    private javax.swing.JLabel labelText23;
    private javax.swing.JLabel labelText24;
    private javax.swing.JLabel labelText25;
    private javax.swing.JLabel labelText26;
    private javax.swing.JLabel labelText27;
    private javax.swing.JLabel labelText28;
    private javax.swing.JLabel labelText29;
    private javax.swing.JLabel labelText3;
    private javax.swing.JLabel labelText30;
    private javax.swing.JLabel labelText31;
    private javax.swing.JLabel labelText32;
    private javax.swing.JLabel labelText33;
    private javax.swing.JLabel labelText34;
    private javax.swing.JLabel labelText35;
    private javax.swing.JLabel labelText36;
    private javax.swing.JLabel labelText37;
    private javax.swing.JLabel labelText38;
    private javax.swing.JLabel labelText39;
    private javax.swing.JLabel labelText4;
    private javax.swing.JLabel labelText40;
    private javax.swing.JLabel labelText41;
    private javax.swing.JLabel labelText42;
    private javax.swing.JLabel labelText43;
    private javax.swing.JLabel labelText44;
    private javax.swing.JLabel labelText45;
    private javax.swing.JLabel labelText5;
    private javax.swing.JLabel labelText6;
    private javax.swing.JLabel labelText7;
    private javax.swing.JLabel labelText8;
    private javax.swing.JLabel labelText9;
    private javax.swing.JLabel tf_acumulacao;
    private javax.swing.JLabel tf_aposentado;
    private javax.swing.JLabel tf_bairro;
    private javax.swing.JLabel tf_cargoAtual;
    private javax.swing.JLabel tf_cargoProvimento;
    private javax.swing.JLabel tf_cep;
    private javax.swing.JLabel tf_cidade;
    private javax.swing.JLabel tf_complemento;
    private javax.swing.JLabel tf_contrato;
    private javax.swing.JLabel tf_cpf;
    private javax.swing.JLabel tf_ctps;
    private javax.swing.JLabel tf_dataAdmissao;
    private javax.swing.JLabel tf_dataEmissao;
    private javax.swing.JLabel tf_dataNascimento;
    private javax.swing.JLabel tf_deficiente;
    private javax.swing.JLabel tf_email;
    private javax.swing.JLabel tf_endereco;
    private javax.swing.JLabel tf_escolaridade;
    private javax.swing.JLabel tf_estado;
    private javax.swing.JLabel tf_estadoCivil;
    private javax.swing.JLabel tf_localTrabalho;
    private javax.swing.JLabel tf_lotacao;
    private javax.swing.JLabel tf_matricula;
    private javax.swing.JLabel tf_nacionalidade;
    private javax.swing.JLabel tf_naturalidade;
    private javax.swing.JLabel tf_nome;
    private javax.swing.JLabel tf_nomeMae;
    private javax.swing.JLabel tf_nomePai;
    private javax.swing.JLabel tf_numero;
    private javax.swing.JLabel tf_orgaoEmissor;
    private javax.swing.JLabel tf_pis;
    private javax.swing.JLabel tf_raca;
    private javax.swing.JLabel tf_regime;
    private javax.swing.JLabel tf_rg;
    private javax.swing.JLabel tf_secao;
    private javax.swing.JLabel tf_sexo;
    private javax.swing.JLabel tf_telefone;
    private javax.swing.JLabel tf_titulo;
    private javax.swing.JLabel tf_uf;
    private javax.swing.JLabel tf_zona;
    // End of variables declaration//GEN-END:variables
}