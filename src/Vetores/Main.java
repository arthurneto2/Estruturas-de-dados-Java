package Vetores;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<>(5);


        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);
        System.out.println(Arrays.toString(vetor.getElementos()));

        vetor.adiciona(0, 5);
        System.out.println(Arrays.toString(vetor.getElementos()));

        vetor.adiciona(6);
        System.out.println(Arrays.toString(vetor.getElementos()));

        vetor.remove(2);
        System.out.println(Arrays.toString(vetor.getElementos()));

        vetor.remove(6);
        System.out.println(Arrays.toString(vetor.getElementos()));

    }
}