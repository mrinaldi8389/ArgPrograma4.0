import java.util.Scanner;
public class Ejer41B {

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese un numero:"); int num1=lectura.nextInt();
        System.out.println("Ingrese un numero:"); int num2=lectura.nextInt();
        System.out.println("Ingrese un numero:"); int num3=lectura.nextInt();
        System.out.println("Ingrese decre o asc:"); String orden=lectura.next();
        ordena(num1,num2,num3,orden);
    }

    public static void ordena(int x, int y, int z, String or) {
        int numeros[] = new int[3];
        int i = 0;
        if (or.equals("asc")==true) {
            int a = Math.min(Math.min(x, y), z);//calculo el minimo de los 3
            int c = Math.max(Math.max(x, y), z);//calculo el maximo de los 3
            int b = (x + y + z) - a - c; // la suma de los 3 menos minimo y maximo es el del medio
            numeros[i] = a;
            numeros[i + 1] = b;
            numeros[i + 2] = c;
            System.out.println("Numeros ascendentes");
            for (int j = 0; j < 3; j++) {
                System.out.println(numeros[j]);
            }
        } else if (or.equals("decre")==true) {
            int a = Math.min(Math.min(x, y), z);
            int c = Math.max(Math.max(x, y), z);
            int b = (x + y + z) - a - c;
            numeros[i] = c;
            numeros[i + 1] = b;
            numeros[i + 2] = a;
            System.out.println("Numeros decrecientes");
            for (int j = 0; j < 3; j++) {
                System.out.println(numeros[j]);
            }

        }
    }
}
