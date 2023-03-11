public class Ejer31C {
    public static void main(String[] args)
    {
        int numeros []= {1,4,6,8,10};
        int x=4; int suma=0;
        for(int i=0;i< numeros.length;i++) {
            if (numeros[i]>x){
                suma=suma+numeros[i];
            }
        }
        System.out.println("La suma de los numeros mayores a "+x+" es:");
        System.out.println(suma);
    }
}
