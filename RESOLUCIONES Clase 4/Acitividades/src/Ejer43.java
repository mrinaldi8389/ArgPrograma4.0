
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejer43 {

    public static void main(String[] args) throws IOException {
        Scanner lecturaF = new Scanner(System.in);
        Scanner lecturaD = new Scanner(System.in);
        Scanner lecturaP = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase = lecturaF.nextLine();
        System.out.println("Desea codificar o decodificar, codi/deco: ");
        String deci = lecturaD.nextLine();
        System.out.println("Con desplazamiento de 1 o de 2, 1/2: ");
        String deci2 = lecturaP.nextLine();
        String Entrada = "C:\\Users\\rmart\\ArgPrograma4.0\\RESOLUCIONES Clase 4\\EntradaEjer3.txt";
        String Salida = "C:\\Users\\rmart\\ArgPrograma4.0\\RESOLUCIONES Clase 4\\SalidaEjer3.txt";
        Files.writeString(Paths.get(Entrada), frase);
        if ((deci.equals("codi") == true || deci.equals("deco") == true) && (deci2.equals("1") == true || deci2.equals("2") == true)) {
            for (String linea : Files.readAllLines(Paths.get(Entrada))) {
                codificar(linea, deci2, Salida, deci);
                System.out.println("datos grabados en archivo");
            }
        } else System.out.println("Error en la carga de datos");
    }

    //funcion Codificar
    public static void codificar(String l, String d, String s, String df) throws IOException {
        String ABC = "abcdefghijklmnñopqrstuvwxyz"; //int desp=1;

        int indice[] = new int[l.length()];
        // do {
        for (int i = 0; i < l.length(); i++) {
            for (int y = 0; y < ABC.length(); y++) {
                if ((l.charAt(i) == ABC.charAt(y)) && (l.charAt(i) != ' ') && (l.charAt(i) != 'z')) {
                    indice[i] = ABC.indexOf(ABC.charAt(y));
                } else if (l.charAt(i) == ' ') {
                    indice[i] = -1;
                } else if (l.charAt(i) == 'z') {
                    indice[i] = -1;
                }
            }
        }
        String codificar = "";
        String decodificar = "";
        if (df.equals("codi")) {
            for (int j = 0; j < indice.length; j++) {
                if (d.equals("1") == true) {
                    indice[j] = indice[j] + 1;
                    codificar = codificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), codificar);
                } else if (d.equals("2") == true) {
                    indice[j] = indice[j] + 2;
                    codificar = codificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), codificar);
                }
            }
        } else if (df.equals("deco")) {
            for (int j = 0; j < indice.length; j++) {
                if ((d.equals("1") == true) && (indice[j] != 0)) {
                    indice[j] = indice[j] - 1;
                    decodificar = decodificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), decodificar);
                } else if (indice[j] == 0) {
                    decodificar = decodificar + ' ';
                    Files.writeString(Paths.get(s), decodificar);
                } else if ((d.equals("2") == true) && (indice[j] != 0)) {
                    indice[j] = indice[j] - 2;
                    decodificar = decodificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), decodificar);
                } else if (indice[j] == 0) {
                    decodificar = decodificar + ' ';
                    Files.writeString(Paths.get(s), decodificar);
                }
            }
        }
    }
}
