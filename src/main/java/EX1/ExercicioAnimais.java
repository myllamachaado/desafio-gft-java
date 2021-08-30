package EX1;

public class ExercicioAnimais {
    public static void main(String[] args){
        float soma;

        Gato Daphne = new Gato("Daphne", 20f);
        Gato Artemis = new Gato("Artemis", 3f);
        Cachorro Xereta = new Cachorro("Xereta", 10f);
        Gato VictorHugo = new Gato("VictorHugo", 5f);

        soma = Daphne.quantidadeRacao();
        soma += Artemis.quantidadeRacao();
        soma += Xereta.quantidadeRacao();
        soma+= VictorHugo.quantidadeRacao();


        System.out.printf("A média de ração consumida pelos animais foi: " + soma/4);

    }
}
