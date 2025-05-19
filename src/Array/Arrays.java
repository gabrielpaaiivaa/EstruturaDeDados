package Array;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0]  = 10;
        numeros[1]  = 20;
        numeros[2]  = 30;

        int soma = (numeros[0] + numeros[1] + numeros[2]);

        System.out.println(soma);
        System.out.println(java.util.Arrays.stream(numeros).sum());

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
