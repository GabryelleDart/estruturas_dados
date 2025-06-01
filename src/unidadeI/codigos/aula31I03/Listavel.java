//Listas Estáticas
//toda pilha e toda fila sao listas
//a lista tambem é circular 
//é contigua , não pode ter buracos- como se tem na fila
public interface Listavel{
    void inserir(Object dado, int posição);//c
    void anexar(Object dado);//em ingles append
    Object selecionar(int posição);//r
    Object[] selecionar todos(); //select all
    void atualizar(Object dado, int posição) ;//u
    Object apagar(int posição);//d
    boolean contem(Object x);
    void Limpar();

    //int primeiraOcorrencia(Object dado);

   // estaCheia
   // estaVazia
   // imprimir
}