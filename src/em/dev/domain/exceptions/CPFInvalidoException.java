package em.dev.domain.exceptions;

public class CPFInvalidoException extends Exception{
    
    public CPFInvalidoException(){
        super("O CPF informado é inválido!");
    }
    
    public CPFInvalidoException(String message){
        super(message);
    }
}