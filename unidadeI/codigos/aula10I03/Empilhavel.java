public interface Empilhavel {
    //op.principais 
    void empilhar(Object dado); //push
    Object desempilhar(); //pop
    Object topo(); //top
    void atualizar(Object dado); //update
    
    //op. auxiliar
    Boolean estaCheia(); //isFull
    Boolean estaVazia(); //isEmpty
    String imprimir(); //print

    // CUIDADO COM O PARÂMETRO PASSADO : EM ALGUNS LIVROS SE PASSA A PILHA COMO PARÂMETRO EM OUTROS N
    //Passar a pilha como parâmetro - opcional
}

/*CONJUNTO BÁSICO DE ESTRUTURA DE DADOS
C- create (criar)
R- read (ler)
U- update (atualizar)
D- delete (apagar)
S- sort (ordenar)*/
