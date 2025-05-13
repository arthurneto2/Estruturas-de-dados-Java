package Vetores;


public class Vetor<T> {
    private T [] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }


    public void adiciona(T elemento){
        if(tamanho == elementos.length){
            aumentaVetor();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona(int posicao, T elemento){
        if(posicao < tamanho && posicao >= 0) {
            if (elementos[posicao] != null) {
                for (int i = tamanho; i > posicao; i--) {
                    elementos[i] = elementos[i - 1];
                }
            }
            elementos[posicao] = elemento;
            tamanho++;
        }else {
            System.out.println("Posição invalida!");
        }
    }

    public void remove(int posicao){
        if(posicao < tamanho && posicao >= 0){
            if (elementos[posicao] != null) {
                for (int i = posicao; i < tamanho; i++) {
                    elementos[i] = elementos[i + 1];
                }
            }
            tamanho--;
        }

    }

    public void remove(T elemento){
        int posicao = busca(elemento);
        remove(posicao);
    }

    private void aumentaVetor(){
        T[] newVector = (T[]) new Object[elementos.length * 2];

        for (int i = 0; i < tamanho; i++) {
            newVector[i] = elementos[i];
        }

        elementos = newVector;

    }

    public T obtem(int posicao){
        if(!(posicao >= 0 && posicao < tamanho )){
            System.out.println("Posição inválida");
        }
        return elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < tamanho; i++){
            if(elemento.equals(elementos[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains (T elemento){
        for (T e : elementos){
            if(elemento.equals(e)){
                return true;
            }
        }
        return false;
    }

    public int ultimoIndice(){
        return tamanho - 1;
    }

    public void limpar(){
        elementos = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        s.append(elementos[tamanho - 1]);
        return s.toString();
    }







    public int getTamanho() {
        return tamanho;
    }

    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }
}
