
package potenciacao;

import java.util.Scanner;


public class Potenciacao {

    
    public static void main(String[] args) {
        
            Scanner leia = new Scanner (System.in);
      
       int resultado = 1;   
      int numero = 10;  
      int  expoente = 4;
      
      System.out.println("Digite a base para o Cálculo");
      numero = leia.nextInt();
      
      System.out.println("Digite o expoente para o Cálculo");
      expoente = leia.nextInt();
      
        for (int i = 1; i <= expoente; i++) {
         resultado = resultado * numero;
            }
        System.out.println ("O resultado é: "+resultado);
    }
    
}
