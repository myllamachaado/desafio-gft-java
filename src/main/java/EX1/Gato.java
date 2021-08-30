package EX1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gato implements Animal {

    private String nome;
    private float peso;

    public Gato(String nome, float peso) {
        this.setNome(nome);
        this.setPeso(peso);
    }


    public String som() {
        return "Miaaaauuuu .....";
    }

    public float quantidadeRacao() {
        if (this.getPeso() <= 3){
            return 10 * this.getPeso();
        }
        else{
            return 13 * this.getPeso();
        }
    }
}
