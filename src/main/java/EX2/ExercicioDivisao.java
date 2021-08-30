package EX2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args){

        Divisao divisivel = new Divisao();
        int num1;
        ArrayList<Integer> retorno = new ArrayList<>();

        System.out.println("Insira um número: ");
        Scanner entrada = new Scanner(System.in);
        try{
            num1 = entrada.nextInt();
            //System.out.println("O número inseriudo é:" + num1);
            retorno = divisivel.validaDivisao(num1);

            if (retorno.size() > 0){
                System.out.print("Divisível por ");
                for (int item: retorno) {
                    System.out.print(item + " ");
                }
            }
            else{
                System.out.println("O número " + num1 + " não é divisível por 3, 6 nem 7");
            }

        }
        catch (InputMismatchException ex){
            throw new InputMismatchException("O número inserido não é inteiro!");
        }
    }
}
