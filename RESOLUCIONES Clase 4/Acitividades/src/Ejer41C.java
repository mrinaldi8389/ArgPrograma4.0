import java.util.Scanner;
public class Ejer41C {
    public static void main(String[] args) {
        int num1=-4;//tomamos como variable no inicializa con valor 0
        int num2=6;
        int num3=12;
        String orden="decre";
        Scanner lectura = new Scanner (System.in);
        if (ingreso(num1,num2,num3)==true)
        {ordena(num1,num2,num3,orden);}
            else
            {System.out.println("Ingrese un numero:"); num1=lectura.nextInt();
        System.out.println("Ingrese un numero:"); num2=lectura.nextInt();
        System.out.println("Ingrese un numero:"); num3=lectura.nextInt();
        System.out.println("Ingrese decre o asc:"); String ord=lectura.next();
        ordena(num1,num2,num3,ord);}
    }

    public static boolean ingreso (int x, int y, int z)
    {
        if((x>0||x<0)&&(y>0||y<0)&&(z>0||z<0))
        {return true;}
        else {
            return false;
        }
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
