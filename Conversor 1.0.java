import java.util.Scanner;

public class CalculadoraBinario {

    public static void main(String[] args) {

        Scanner binarioScanner = new Scanner(System.in);

        System.out.println("Escolha qual converção deseja fazer.");
        System.out.println("1 - Decimal para Binario");
        System.out.println("2 - Decimal para Octal ");
        System.out.println("3 - Decimal para Hexadecimal");

        System.out.println("4 - Hexadecimal para Decimal");
        System.out.println("5 - Hexadecimal para Octal");

        System.out.println("6 - Octal para Decimal");
        System.out.println("7 - Octal para Hexadeciomal");

        int escolha = binarioScanner.nextInt();

        // Decimal para Binario
        if (escolha == 1) {
            System.out.println("Coloque o valor em decimal");
            int valordecimal = binarioScanner.nextInt();
            System.out.println("\n");

            int resolução = valordecimal / 2;

            while (valordecimal > 0) {
                int resto = valordecimal % 2;
                System.out.println(resto);

                valordecimal = valordecimal / 2;
            }
            System.out.println("Base 2");
            System.out.println("lê-se debaixo para cima");

        } // Decimal  para Octal
         
        // Decimal para Octal
        else if (escolha == 2) {
            System.out.println("Coloque o valor em decimal");
            int valorOctal = binarioScanner.nextInt();
            System.out.println("\n");

            int resolução1 = valorOctal / 8;

            while (valorOctal > 0) {
                int resto = valorOctal % 8;
                System.out.println(resto);

                valorOctal = valorOctal / 8;

            }
            System.out.println("Base 8");
            System.out.println("lê-se debaixo para cima");


        }
         
        // Decimal para Hexadecimal
        else if (escolha == 3) {
            System.out.println("Coloque o valor em decimal");
            int valorHexadecimal = binarioScanner.nextInt();
            System.out.println("\n");
            
            while (valorHexadecimal > 0) {
                int resto = valorHexadecimal % 16;
                if (resto == 10) {
                    System.out.println('A');
                } else if (resto == 11) {
                    System.out.println('B');
                } else if (resto == 12) {
                    System.out.println('C');
                } else if (resto == 13) {
                    System.out.println('D');
                } else if (resto == 14) {
                    System.out.println('E');
                } else if (resto == 15) {
                    System.out.println('F');
                } else {
                    System.out.println(resto);
                }
                
                valorHexadecimal = valorHexadecimal / 16;
            }
            System.out.println("Base 16");
            System.out.println("lê-se debaixo para cima");
        }
         
        // Hexadecimal para Decimal
        else if (escolha == 4) {
            System.out.println("Coloque o Segundo valor do Hexadecimal");

            System.out.println("A = 10");
            System.out.println("B = 11");
            System.out.println("C = 12");
            System.out.println("D = 13");
            System.out.println("E = 14");
            System.out.println("F = 15");

            int segundoValor = binarioScanner.nextInt();
            
            
        
            System.out.println("Coloque o Primeiro valor do Hexadecimal");
            int primeiroValor = binarioScanner.nextInt();

            int calculo = primeiroValor * 16;
            int calculoTotal = calculo + segundoValor;

            System.out.println("\n" + calculoTotal);
            System.out.println("Base 10");
        }
         
        // Hexadecimal para Octal
        else if (escolha == 5) {
            System.out.println("Coloque o Segundo valor do Hexadecimal");
             System.out.println("\n" + "A = 10");
            System.out.println("B = 11");
            System.out.println("C = 12");
            System.out.println("D = 13");
            System.out.println("E = 14");
            System.out.println("F = 15");

            int segundoValor = binarioScanner.nextInt();
            
            
        
            System.out.println("Coloque o Primeiro valor do Hexadecimal");
            int primeiroValor = binarioScanner.nextInt();

            int calculo = primeiroValor * 16;
            int calculoTotal = calculo + segundoValor;

            int valorOctal = calculoTotal;
            System.out.println("\n");

            int resolução1 = valorOctal / 8;

            while (valorOctal > 0) {
                int resto = valorOctal % 8;
                System.out.println(resto);

                valorOctal = valorOctal / 8;

            }
            System.out.println("Base 8");
            System.out.println("lê-se debaixo para cima");

        }
        
        // Octal para Decimal
        else if(escolha == 6){
            System.out.println("Coloque o Segundo valor do Octal");
            int segundoValor = binarioScanner.nextInt();

            System.out.println("Coloque o Primeiro valor do Octal");
            int primeiroValor = binarioScanner.nextInt();

            int calculo =  primeiroValor * 8;
            int calculoTotal = calculo + segundoValor;

            System.out.println("\n" + calculoTotal);
            System.out.println("Base 10");

        }
        
        // Octal para Hexadecimal
        else if (escolha == 7) {
            System.out.println("Coloque o Segundo valor do Octal");
            int segundoValor = binarioScanner.nextInt();

            System.out.println("Coloque o Primeiro valor do Octal");
            int primeiroValor = binarioScanner.nextInt();
            System.out.println("\n");

            int calculo =  primeiroValor * 8;
            int calculoTotal = calculo + segundoValor;

             while (calculoTotal > 0) {
                int resto = calculoTotal % 16;
                if (resto == 10) {
                    System.out.println('A');
                } else if (resto == 11) {
                    System.out.println('B');
                } else if (resto == 12) {
                    System.out.println('C');
                } else if (resto == 13) {
                    System.out.println('D');
                } else if (resto == 14) {
                    System.out.println('E');
                } else if (resto == 15) {
                    System.out.println('F');
                } else {
                    System.out.println(resto);
                }
                
                calculoTotal = calculoTotal / 16;
            }
            System.out.println("Base 16");
            System.out.println("lê-se debaixo para cima");
            
        }

    }
}
