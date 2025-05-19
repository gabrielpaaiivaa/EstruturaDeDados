package Array;

public class MaiorEMenor {
    public static void main(String[] args) {
        int[] numeros = {40, 100, 30, 60, 20, 10, 70, 80, 90, 50};
        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("Maior numero: "+ maior);
        System.out.println("Menor numero: "+ menor);
    }
}
