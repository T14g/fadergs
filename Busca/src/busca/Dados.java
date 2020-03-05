
package busca;


public class Dados {
    //Pesquisa binária precisa de vetor ordernado 
    private int vetor[] = {1,2,3,4,5,6,7,8,9,20,21,93,105,202};
    
    //Método sequencial
    public int sequencial(int val) {
        
        int iteracoes = 1;
        
        for(int pos = 0; pos < vetor.length; pos++){
            if(val == vetor[pos]){
                System.out.println("Iteracoes: " + iteracoes);
                return pos;
            }
            
            iteracoes++;
        }
        return -1;//not found
    }
    
//    Método binário 
    public int binario(int val){
        
        int inicio = 0, meio, fim = vetor.length -1;
        int iteracoes = 1;
        
        //enquanto o início for menor que o fim
        while(inicio <= fim){
            iteracoes++;
            meio = (inicio + fim)/2;
            
            //Verifica o meio sempre
            if(val == vetor[meio]){
              System.out.println("Iteracoes: " + iteracoes);
                return meio; 
            }else if(val > vetor[meio]){//direita
                inicio = meio + 1;
            }else{//esquerda
                fim = meio -1;
            }
//            iteracoes++;
        }
        System.out.println("Iteracoes: " + iteracoes);
        return -1;//not found
    }
    
    
    
    
}
