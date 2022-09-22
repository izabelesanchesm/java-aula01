package exemplo04;

public class Exemplo04 {

    public static void main(String[] args) {
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i;
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
