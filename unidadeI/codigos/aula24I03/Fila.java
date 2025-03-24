package unidadeI.codigos.aula24I03;

public interface Fila {
    /* 
    enfileirar // C de crud
    frente // similar ao espiar -> R de crud
    atualizar //U
    desenfileirar //D
    */
    void enfileirar(Object dado);
    Object frente();
    void  atualizar(Object dado);
    Object desenfileirar();
    boolean estaCheia();
    boolean estaVazia();
}