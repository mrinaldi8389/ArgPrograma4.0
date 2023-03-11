public interface Ejer3_2 {
    public static void main(String[] args)
    {
        String ABC="abcdefghijklmnñopqrstuvwxyz"; int desp=1;
        String frase="hola que tal";   int indice[]=new int[frase.length()];
        for (int i=0; i<frase.length();i++)
        {if(frase.charAt(i)=='a')
        {indice[i]=1;}else if(frase.charAt(i)=='b'){indice[i]=2;}else if(frase.charAt(i)=='c'){indice[i]=3;}
        else if(frase.charAt(i)=='d'){indice[i]=4;}else if(frase.charAt(i)=='e'){indice[i]=5;}
        else if(frase.charAt(i)=='f'){indice[i]=6;}else if(frase.charAt(i)=='g'){indice[i]=7;}
        else if(frase.charAt(i)=='h'){indice[i]=8;}else if(frase.charAt(i)=='i'){indice[i]=9;}
        else if(frase.charAt(i)=='j'){indice[i]=10;}else if(frase.charAt(i)=='k'){indice[i]=11;}
        else if(frase.charAt(i)=='l'){indice[i]=12;}else if(frase.charAt(i)=='m'){indice[i]=13;}
        else if(frase.charAt(i)=='n'){indice[i]=14;}else if(frase.charAt(i)=='ñ'){indice[i]=15;}
        else if(frase.charAt(i)=='o'){indice[i]=16;}else if(frase.charAt(i)=='p'){indice[i]=17;}
        else if(frase.charAt(i)=='q'){indice[i]=18;}else if(frase.charAt(i)=='r'){indice[i]=19;}
        else if(frase.charAt(i)=='s'){indice[i]=20;}else if(frase.charAt(i)=='t'){indice[i]=21;}
        else if(frase.charAt(i)=='u'){indice[i]=22;}else if(frase.charAt(i)=='v'){indice[i]=23;}
        else if(frase.charAt(i)=='w'){indice[i]=24;}else if(frase.charAt(i)=='x'){indice[i]=25;}
        else if(frase.charAt(i)=='y'){indice[i]=26;}else if(frase.charAt(i)=='z'){indice[i]=27;}
        else if(frase.charAt(i)==' '){indice[i]=0;}}
        System.out.println("La frase ''"+frase+"'' codificada con desplazo de "+desp+" es:");
        for (int j=0;j<indice.length;j++)
        {if(desp==1)
        {System.out.print(ABC.charAt(indice[(j)]));}
        else if (desp==2)
        {indice[j]=indice[j]+1;
            System.out.print(ABC.charAt(indice[(j)]));}
        }
    }
}


