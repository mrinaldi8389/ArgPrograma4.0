public class Ejer41A {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        int num3 = 6;
        String orden = "decre";
        ordena(num1,num2,num3,orden);
    }

    public static void ordena(int x, int y, int z, String or) {
        int numeros[] = new int[3];
        int i = 0;
        if (or == "asc") {
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
        } else if (or == "decre") {
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

