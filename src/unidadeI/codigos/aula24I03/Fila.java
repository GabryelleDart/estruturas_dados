package unidadeI.codigos.aula24I03;

public interface Fila {
    /*
     * enfileirar // C de crud
     * frente // similar ao espiar -> R de crud
     * atualizar //U
     * desenfileirar //D
     */
    void enfileirar(Object dado);

    Object frente();

    void atualizarFinal(Object dado);

    void atualizarInicio(Object dado);

    Object desenfileirar();

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();
}