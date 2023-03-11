public class Ejer31B {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        int num3 = 6;
        String orden = "decre";
        int numeros[] = new int[3];
        int i = 0;
        if (orden == "asc") {
            int a = Math.min(Math.min(num1, num2), num3);//calculo el minimo de los 3
            int c = Math.max(Math.max(num1, num2), num3);//calculo el maximo de los 3
            int b = (num1 + num2 + num3) - a - c; // la suma de los 3 menos minimo y maximo es el del medio
            numeros[i] = a;
            numeros[i + 1] = b;
            numeros[i + 2] = c;
            System.out.println("Numeros ascendentes");
            for (int j = 0; j < 3; j++) {
                System.out.println(numeros[j]);
            }
        } else if (orden == "decre") {
            int a = Math.min(Math.min(num1, num2), num3);
            int c = Math.max(Math.max(num1, num2), num3);
            int b = (num1 + num2 + num3) - a - c;
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