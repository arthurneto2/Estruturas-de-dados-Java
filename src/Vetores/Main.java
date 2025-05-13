package Vetores;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<>(5);


        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(0, 5);
        vetor.adiciona(6);
        vetor.remove(2);
        vetor.remove(6);

        boolean contem = vetor.contains(6);
        if (contem){
            System.out.println("Elemento existe no Array!");
        }else{
            System.out.println("Elemento não existe no Array!");
        }



    }
}