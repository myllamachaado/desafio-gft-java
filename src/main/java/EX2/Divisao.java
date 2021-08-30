package EX2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Divisao {

    private ArrayList<Integer> retorno = new ArrayList();

    public ArrayList<Integer> validaDivisao(int num1){
        if(num1 % 3 == 0){
            retorno.add(3);
        }

        if(num1 % 6 == 0){
            retorno.add(6);
        }

        if(num1 % 7 == 0){
            retorno.add(7);
        }

        return retorno;
    }
}
