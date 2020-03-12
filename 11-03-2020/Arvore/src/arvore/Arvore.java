package arvore;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arvore {

    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    System.out.println("Digite um número");
    int val = s.nextInt();
    int pos = 0 ;
        
    //vetor
    int x = 15;// posições vetor
    int[] vetor = new int[x];
    Random r = new Random();
    
    for(int i = 0; i < x ;i++){
        vetor[i] = r.nextInt(50) + 1;
    }
    
    //ordenar o vetor
    Arrays.sort(vetor);
    
    //imprimir o array
    for(int valor: vetor){
        System.out.println(valor + " ");
    }
    
    int inicio, meio, fim;
    inicio = 0;
    fim = vetor.length -1;
    meio = (inicio + fim)/2;
    
    // meio do vetor 
    System.out.println("O valor do meio é " + vetor[meio] + " na pos " + meio);;
        
    while(inicio <= fim){
        meio = (inicio + fim)/2;
        
        if(val == vetor[meio]){
            pos = meio;
        }else if(val > vetor[meio]){
            inicio = meio + 1;
        }else{
            fim = meio -1;
            pos =  -1;
        }
    }//fim while
        if(pos == -1){
            System.out.println("Valor não encontrado");
        }else{
            System.out.println("Valor encontrado na pos: " + pos);
        }
    }
    
}
