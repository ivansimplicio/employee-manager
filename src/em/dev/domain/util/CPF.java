package em.dev.domain.util;

public class CPF{
    
    private static final int[] WEIGHT_CPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calculate(final String str, final int[] weight) {
        int sum = 0;
        for (int i = str.length() - 1, digit; i >= 0; i--) {
            digit = Integer.parseInt(str.substring(i, i + 1));
            sum += digit * weight[weight.length - str.length() + i];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }
    
    public static boolean isValid(String cpf) {        
        cpf = cpf.replace(".", "").replace("-", "");
        
        if ((cpf == null) || (cpf.length() != 11) || cpf.matches(cpf.charAt(0) + "{11}")) return false;

        final Integer digit1 = calculate(cpf.substring(0, 9), WEIGHT_CPF);
        final Integer digit2 = calculate(cpf.substring(0, 9) + digit1, WEIGHT_CPF);
        return cpf.equals(cpf.substring(0, 9) + digit1.toString() + digit2.toString());
    }
}