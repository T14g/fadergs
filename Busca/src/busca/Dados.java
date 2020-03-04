
package busca;


public class Dados {
    //Pesquisa binária precisa de vetor ordernado 
    int vetor[] = {37,91,12,95,66,54,19,83};
    
    //Método sequencial
    public int sequencial(int val) {

        for(int pos = 0; pos < vetor.length; pos++){
            if(val == vetor[pos]){
                return pos;
            }
        }
        
        return -1;
    }
    
    
    
    
}
