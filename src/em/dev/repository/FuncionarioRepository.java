package em.dev.repository;

import em.dev.domain.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class FuncionarioRepository {
    
    private static FuncionarioRepository instance = null;
    
    private EntityManagerFactory emf = null;
    
    private FuncionarioRepository(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public static FuncionarioRepository getInstance(EntityManagerFactory emf){
        if(instance == null){
            instance = new FuncionarioRepository(emf);
        }
        return instance;
    }
    
    public void salvarFuncionario(Funcionario f){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }catch(Exception e){
            if(em.isOpen()){
                em.getTransaction().rollback();
            }
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    public void excluirFuncionario(Funcionario f){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.find(Funcionario.class, f.getId()));
            em.getTransaction().commit();
        }catch(Exception e){
            if(em.isOpen()){
                em.getTransaction().rollback();
            }
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
    }
    
    public List<Object[]> getAllFuncionarios(){
        String sql = "SELECT f.matricula, f.nome, d.cpf, df.cargo_ocupado_atual, "
                + "df.lotacao, df.regime FROM funcionarios AS f INNER JOIN documentos AS d "
                + "ON f.id = d.funcionario_id INNER JOIN dados_funcionais as df ON f.id = df.funcionario_id";
        return getFuncionarios(sql);
    }
    
    public List<Object[]> getAllFuncionarios(String secretaria){
        String sql = "SELECT f.matricula, f.nome, d.cpf, df.cargo_ocupado_atual, "
                + "df.lotacao, df.regime FROM funcionarios AS f INNER JOIN documentos AS d "
                + "ON f.id = d.funcionario_id INNER JOIN dados_funcionais as df ON f.id = df.funcionario_id";
        
        sql = sql.concat(String.format(" WHERE df.lotacao = '%s'", secretaria));
        return getFuncionarios(sql);
    }
    
    private List<Object[]> getFuncionarios(String sql){
        EntityManager em = emf.createEntityManager();
        List<Object[]> list = null;
        
        try{
            em.getTransaction().begin();
            Query query = em.createNativeQuery(sql);
            list = query.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            if(em.isOpen()){
                em.getTransaction().rollback();
            }
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
        return list;
    }
    
    public Funcionario getFuncionario(String matricula){
        EntityManager em = emf.createEntityManager();
        List<Funcionario> list;
        Funcionario f = null;
        try{
            em.getTransaction().begin();
            String jpql = String.format("SELECT f FROM funcionarios f WHERE f.matricula = '%s'", matricula);
            Query query = em.createQuery(jpql);
            list = query.getResultList();
            if(!list.isEmpty()){
                f = list.get(0);
                f.getDependentes().size();
            }
            em.getTransaction().commit();
        }catch(Exception e){
            if(em.isOpen()){
                em.getTransaction().rollback();
            }
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
        return f;
    }
}