import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        if ((deci.equals("codi") == true||deci.equals("deco") == true) && (deci2.equals("1") == true || deci2.equals("2") == true))  {
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
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == 'a') {
                indice[i] = 1;
            } else if (l.charAt(i) == 'b') {
                indice[i] = 2;
            } else if (l.charAt(i) == 'c') {
                indice[i] = 3;
            } else if (l.charAt(i) == 'd') {
                indice[i] = 4;
            } else if (l.charAt(i) == 'e') {
                indice[i] = 5;
            } else if (l.charAt(i) == 'f') {
                indice[i] = 6;
            } else if (l.charAt(i) == 'g') {
                indice[i] = 7;
            } else if (l.charAt(i) == 'h') {
                indice[i] = 8;
            } else if (l.charAt(i) == 'i') {
                indice[i] = 9;
            } else if (l.charAt(i) == 'j') {
                indice[i] = 10;
            } else if (l.charAt(i) == 'k') {
                indice[i] = 11;
            } else if (l.charAt(i) == 'l') {
                indice[i] = 12;
            } else if (l.charAt(i) == 'm') {
                indice[i] = 13;
            } else if (l.charAt(i) == 'n') {
                indice[i] = 14;
            } else if (l.charAt(i) == 'ñ') {
                indice[i] = 15;
            } else if (l.charAt(i) == 'o') {
                indice[i] = 16;
            } else if (l.charAt(i) == 'p') {
                indice[i] = 17;
            } else if (l.charAt(i) == 'q') {
                indice[i] = 18;
            } else if (l.charAt(i) == 'r') {
                indice[i] = 19;
            } else if (l.charAt(i) == 's') {
                indice[i] = 20;
            } else if (l.charAt(i) == 't') {
                indice[i] = 21;
            } else if (l.charAt(i) == 'u') {
                indice[i] = 22;
            } else if (l.charAt(i) == 'v') {
                indice[i] = 23;
            } else if (l.charAt(i) == 'w') {
                indice[i] = 24;
            } else if (l.charAt(i) == 'x') {
                indice[i] = 25;
            } else if (l.charAt(i) == 'y') {
                indice[i] = 26;
            } else if (l.charAt(i) == 'z') {
                indice[i] = 27;
            } else if (l.charAt(i) == ' ') {
                indice[i] = 0;
            }
        }
        String codificar = "";
        String decodificar = "";
        if (df.equals("codi")) {
            for (int j = 0; j < indice.length; j++) {
                { if (d.equals("1") == true) {
                    codificar = codificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), codificar);
                } else if (d.equals("2") == true) {
                    indice[j] = indice[j] + 1;
                    codificar= codificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), codificar);
                }
            }
        } else if (df.equals("deco")) {
            for (int j = 0; j < indice.length; j++) {

                if (d.equals("1") == true) {
                    indice[j] = indice[j] - 2;
                    decodificar = decodificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), decodificar);
                } else if (d.equals("2") == true) {
                    indice[j] = indice[j] - 3;
                    decodificar = decodificar + ABC.charAt(indice[(j)]);
                    Files.writeString(Paths.get(s), decodificar);
                }
            }
        }
    }
}
//RESOLVER EL PROBLEMA DEL " " Y DE LA Z