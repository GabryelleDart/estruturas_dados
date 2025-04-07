package estruturas_dados.unidadeI.codigos.aula07I04;
//listas estáticas

public class ListaEncadeada {
//selecionar ->percorrer para chegar ao elemento
Object selecionar(int posicao){
    if(!estaVazia()){
        Object aux = null
        if (posicao >=0 && posicao < quantidade){ 
            //mapeamento da posição lógica para a posição fisica
            int posicaoFisica = mapeamento(posição);//esse mapeamento é o deslocamento do ponteiro inicio que ai modifica a logica da fisica
            aux=dados[posicaoFisica];
        }
        return aux;
}
}
//esse selecionar é muito parecido com o atualizar 
//função de mapeamento
private int mapeamento (int posição){
    return(posição+ ponteiro inicio)%dados.lenght; //se faz a divisão pois a soma funciona do ponteiro inicio ate o final fisico do array , deppois do final é necessario usar o mod para voltar ao inicio
}


Object selecionarTODOS(){
    
        Object []aux = new Object[quantidade];
        int ponteiroaux= ponteiro inicio
         //mapeamento da posição lógica para a posição fisica
        for(int i=0; i<quantidade; i++){
              int posicaoFisica = mapeamento(i);//esse mapeamento é o deslocamento do ponteiro inicio que ai modifica a logica da fisica
              aux[i]=dados[pponteiroinicio];  
              ponteiroaux =avançar(ponteiroaux);
            }
            
        }
        
}
}