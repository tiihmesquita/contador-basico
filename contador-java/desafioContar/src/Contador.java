import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        try{
            contar(numero1, numero2);

        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = num2 - num1;
            for(int x = 0; x < contagem; x++){
                System.out.println("Imprimindo o número "+ (x+1));
            }
        }
    }
    
}
