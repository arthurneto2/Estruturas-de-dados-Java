package Vetores;

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

        System.out.println(vetor);

        //exercício 1
        boolean contem = vetor.contains(6);
        if (contem){
            System.out.println("Elemento " + 6 + " existe no Array!");
        }else{
            System.out.println("Elemento não existe no Array!");
        }

        //exercício 2
        System.out.println(vetor.ultimoIndice());

        //exercício 3
        Integer num = 6;
        vetor.remove(num);
        System.out.println(vetor);

        //exercício 4
        System.out.println(vetor.obtem(2));

        //exercício 5





    }
}