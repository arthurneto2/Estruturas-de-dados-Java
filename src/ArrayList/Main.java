package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<>();


        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        System.out.println(vetor);

        vetor.add(1, "Elemento 3");
        System.out.println(vetor);

        boolean contem = vetor.contains("Elemento 3");
        int posicao = vetor.indexOf("Elemento 3");
        if(contem){
            System.out.println("Elemento existe no Array na posição: " + posicao );
        }else{
            System.out.println("Elemento não existe no Array!");
        }

        System.out.println(vetor.get(1));

        vetor.removeFirst();
        vetor.remove("Elemento 3");
        System.out.println(vetor);

        System.out.println(vetor.size());


    }
}
