//Algorítimo de varredura sequêncial 

package busca;

import java.util.Scanner;


public class Busca {

    public static void main(String[] args) {
        
      Scanner in = new Scanner(System.in);
      
      //Instanciou um objeto
      Dados busca = new Dados();
      
      int val;
      System.out.println("Digite o valor:");
      val = in.nextInt();
      
      System.out.println("--------------BUSCA SEQUENCIAL------------");
      
      //Não achou o val procurado se -1
      if(busca.sequencial(val) == -1 ){
          System.out.println("Valor não encontrado");
      }else{
          System.out.println("Valor encontrado na posição " + busca.sequencial(val));
      }
      
      System.out.println("--------------BUSCA Binária------------");
      
      //Não achou o val procurado se -1
      if(busca.binario(val) == -1 ){
          System.out.println("Valor não encontrado");
      }else{
          System.out.println("Valor encontrado na posição " + busca.binario(val));
      }
      
        
    }
    
}
