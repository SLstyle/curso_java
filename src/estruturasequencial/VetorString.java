package estruturasequencial;

public class VetorString {
    public static void main(String[] x) {
        String texto = "Texto comum";

        String[] vetorTexto = new String[2];

        vetorTexto[0] = "posição 0 do vetor";
        vetorTexto[1] = "posição 1 do vetor";

        System.out.println("String comum: " + texto);

        System.out.println("String vetor 0: " + vetorTexto[0]);
        System.out.println("String vetor 1: " + vetorTexto[1]);
        String[][] matrizDeTexto = new String[2][2];

        matrizDeTexto[0][0] = "yago aprendeu";
        matrizDeTexto[0][1] = "Texto na linha 0 coluna 1";
        matrizDeTexto[1][0] = "Texto na linha 1 coluna 0";
        matrizDeTexto[1][1] = "Texto na linha 1 coluna 1";

        System.out.println("matriz na linha 1, coluna 0;" + matrizDeTexto[1][0]);
    }

}
