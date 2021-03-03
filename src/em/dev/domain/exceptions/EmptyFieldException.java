package em.dev.domain.exceptions;

public class EmptyFieldException extends Exception{
    
    public EmptyFieldException(){
        super("Preencha todos os campos obrigatórios!");
    }
    
    public EmptyFieldException(String message){
        super(message);
    }  
}