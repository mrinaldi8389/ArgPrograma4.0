public class Ejer31A {
    public static void main(String[] args)
    {
        String tex1 = "Argentina gaaaaaaano la 3";
        char letra = 'a';
        int c = 0;
        for (int i = 0; i < tex1.length(); i++) {
            if (tex1.charAt(i) == letra) {
                c++;
            }
        }
        System.out.println("Cantidad de veces que se repite la letra "+letra);
        System.out.println(c);
    }
}
