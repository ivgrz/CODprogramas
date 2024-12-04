package org.example;

public class matrices_cod {
    public static void main(String[] args) {
        int[][]tablero;
        tablero =new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,1,0,0}
        };
        recorrerTablero(tablero);
    }
private static void recorrerTablero(int [][]aux_tablero){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (aux_tablero[i][j]>0){
                    if (i == 4){
                        System.out.println("Es un portaaviones" +i + j);
                    }
                    if (i == 2){
                        System.out.println("Es un submarino" + i + j);
                    }
                    if (i == 1){
                        System.out.println("Es un buque" + i + j);
                    }


                }else {
                    System.out.println("Error");
                }

            }

        }

    }
}








