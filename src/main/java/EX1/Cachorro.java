package EX1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cachorro implements Animal {
    private String nome;
    private float peso;

    public Cachorro(String nome, float peso) {
        this.setNome(nome);
        this.setPeso(peso);
    }


    public String som() {
        return "Au au au au .....";
    }

    public float quantidadeRacao() {
        if (this.getPeso() <= 4){
            return 40 * this.getPeso();
        }
        else if(this.getPeso() > 4 && this.getPeso() <= 12){
            return 45 * this.getPeso();
        }
        else{
            return 55 * this.getPeso();
        }
    }

}
