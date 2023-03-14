import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;

public class Ejer42A {
    public static void main(String[] args) throws IOException {
        Files.writeString(Paths.get("C:\\Users\\rmart\\ArgPrograma4.0\\RESOLUCIONES Clase 4\\ArchivoAct4.txt"), "6\n6\n");
        String archivo = "C:\\Users\\rmart\\ArgPrograma4.0\\RESOLUCIONES Clase 4\\ArchivoAct4.txt";
        int suma = 0;
        Scanner operacion = new Scanner(System.in);
        int pro = 0;
        System.out.println("Desea Multiplicar o sumar los datos? mul/sum ");
        String deci = operacion.next();
        if (deci.equals("sum")==true) {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                int num = Integer.parseInt(linea);//convierto el String en int para realizar la suma
                suma = suma + num;
            }System.out.println("La suma de los numeros del archivo: " + suma);
        } else if (deci.equals("mul")==true) {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                int num = Integer.parseInt(linea);//convierto el String en int para realizar la suma
                int cont = num;
                pro = cont * num;
            }System.out.println("La multiplicacion de los numeros del archivo: " + pro);
        }
    }
}