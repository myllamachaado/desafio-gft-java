package EX4;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Pessoa {
    public String nome;
    public String cargo;

    public Pessoa(String nome, String cargo) {
        this.setNome(nome);
        this.setCargo(cargo);
    }

    public void setCargo(String cargo){
        if(!(cargo.equals("Starter")) && !(cargo.equals("Junior")) && !(cargo.equals("Sênior"))){
            this.cargo = "Sênior";
        }
        else{
            this.cargo = cargo;
        }
    }

    public void imprimeInformacoesPessoa(ArrayList<Pessoa> pessoas){
        for (Pessoa p: pessoas) {
            System.out.println("-----------------------------------");
            System.out.println(p.getNome());
            System.out.println(p.getCargo());
        }
    }

}
