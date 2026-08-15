import java.util.Scanner;

public class CalculadoraBinario {
    public static void main(String[] args) {

        Scanner binarioScanner = new Scanner(System.in);

        System.out.println("Escolha qual converção deseja fazer.");
        System.out.println("1 - Decimal para Binario");
        System.out.println("2 - Decimal para Octal ");
        System.out.println("3 - Decimal para Hexadecimal");


        int binario = binarioScanner .nextInt();
        

        // Decimal para Binario
        if (binario == 1){
            System.out.println("coloque o valor em decimal");
            int valordecimal = binarioScanner .nextInt();

            int resolução = valordecimal / 2;

            while (valordecimal > 0 ) { 
            int resto = valordecimal % 2;
            System.out.println(resto);
            
            valordecimal = valordecimal / 2;
            }
            System.out.println("Base 2");
            System.out.println("lê-se debaixo para cima");

        }

        // Decimal  para Octal
        else if (binario == 2) {
            System.out.println("coloque o valor em decimal");
            int valorOctal = binarioScanner .nextInt();

            int resolução1 = valorOctal / 8;

            while (valorOctal > 0 ) { 
            int resto = valorOctal % 8;
            System.out.println(resto);
            
            valorOctal = valorOctal/ 8;
            
         }
         System.out.println("Base 8");
         System.out.println("lê-se debaixo para cima");
        }
        


         // Decimal para Hexadecimal
        else if (binario == 3) {
            System.out.println("coloque o valor em decimal");
            int valorHexadecimal = binarioScanner .nextInt();

            while (valorHexadecimal > 0) { 
                int resto = valorHexadecimal % 16;
                if(resto == 10){
                    System.out.println('A');
                    
                }else if (resto == 11) {
                        System.out.println('B');

                    }else if(resto == 12){
                        System.out.println('C');
                    }else if (resto == 13) {
                        System.out.println('D');

                    }else if(resto == 14){
                        System.out.println('E');
                    }else if(resto == 15){
                        System.out.println('F');
                    }else
                        System.out.println(resto);
                 
                valorHexadecimal = valorHexadecimal /16;
            }
            System.out.println("Base 16");
            System.out.println("lê-se debaixo para cima");
        }
    }
}
    
