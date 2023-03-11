public class Ejer1C {
    public static void main(String[] args)
    {
        int numA=5;
        int numB=14;
        String deci="p";
        while ((numA<=numB)&&((deci=="p")||(deci=="i")))
        {
            if ((numA % 2 == 0)&&(deci=="p")) {
                System.out.println(numA);}
            else if ((deci=="i")&&(numA % 2!=0)) {
                System.out.println(numA);}
            numA++;
            }

        }

    }

