package em.dev.repository;

import em.dev.domain.Usuario;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class UsuarioRepository {
    
    private static UsuarioRepository instance = null;
    
    private EntityManagerFactory emf = null;
    
    private UsuarioRepository(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public static UsuarioRepository getInstance(EntityManagerFactory emf){
        if(instance == null){
            instance = new UsuarioRepository(emf);
        }
        return instance;
    }
    
    
    public boolean autenticar(String username, String password){
        boolean autenticado = false;
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            String jpql = String.format("SELECT u FROM usuarios u where u.username = '%s'", username);
            Query query = em.createQuery(jpql);
            List<Usuario> list = query.getResultList();
            em.getTransaction().commit();
            
            if(!list.isEmpty()){
                Usuario user = list.get(0);
                if(user.getPassword().equals(password)){
                    autenticado = true;
                }
            }
        }catch(Exception ex){
            if(em.isOpen()){
                em.getTransaction().rollback();
            }
        }finally{
            if(em.isOpen()){
                em.close();
            }
        }
        return autenticado;
    }
}