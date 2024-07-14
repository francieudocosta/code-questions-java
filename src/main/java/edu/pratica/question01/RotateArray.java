package edu.pratica.question01;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
       
        int[] array = {1,2,3,4,5,6,7};
        rotateArray(array, 3);
    }

    public static void rotateArray(int [] array, int k){


        int[] deslocadoParaDireita = Arrays.copyOfRange(array, 0, k+1);
        int[] descoladoParaEsquerda = Arrays.copyOfRange(array, k+1, array.length);

        System.arraycopy(descoladoParaEsquerda, 0, array, 0, descoladoParaEsquerda.length);
        System.arraycopy(deslocadoParaDireita, 0, array, descoladoParaEsquerda.length, deslocadoParaDireita.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

}
