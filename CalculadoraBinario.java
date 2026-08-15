
import java.util.Scanner;

public class CalculadoraBinario {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("coloque o valor em decimal");
        int valordecimal = scr .nextInt();
        
        
        int resolução = valordecimal / 2;

        while (valordecimal > 0 ) { 
            int resto = valordecimal % 2;
            System.out.println(resto);
            
            valordecimal = valordecimal / 2;
        }
    }
}
    

