import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
        scanner.nextLine();

        try{
            contar(parametroUm, parametroDois);
        }catch (Exception e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws InvalidParameterException{
        if(parametroUm >= parametroDois)
            throw new InvalidParameterException();

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
