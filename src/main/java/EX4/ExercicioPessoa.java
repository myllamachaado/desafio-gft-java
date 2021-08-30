package EX4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioPessoa {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner nome, cargo;
        String auxNome, auxCargo;

        for (int i=0; i<5; i++){
            System.out.println("Insira o nome da " + (i+1) + "ª pessoa: ");
            nome = new Scanner(System.in);
            auxNome = nome.nextLine();

            System.out.println("Insira o cargo da " + (i+1) + "ª pessoa: ");
            cargo = new Scanner(System.in);
            auxCargo = cargo.nextLine();

            pessoas.add(new Pessoa(auxNome, auxCargo));
        }

        analisaCargo(pessoas);

    }

    public static void analisaCargo(ArrayList<Pessoa> pessoas){
        int iStarter = 0;
        int iJunior = 0;
        int iSenior = 0;

        for (Pessoa p: pessoas) {
            if(p.getCargo().equals("Starter")){
                iStarter++;
            }
            else if(p.getCargo().equals("Junior")){
                iJunior++;
            }
            else{
                iSenior++;
            }
        }

        System.out.println("Starter: " + iStarter);
        System.out.println("Júnior: " + iJunior);
        System.out.println("Sênior: " + iSenior);
    }

}
