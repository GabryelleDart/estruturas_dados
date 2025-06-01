package unidadeI.codigos.aula24I03;

public interface FilaDupla {
    void enfileirarInicio(Object dado);
    void enfileirarFim(Object dado);

    Object desenfileirarInicio();
    Object desenfileirarFim();

    Object frente();
    Object tras();

    void atualizarFinal(Object dado);
    void atualizarInicio(Object dado);


    boolean estaCheia();
    boolean estaVazia();


    String imprimirTrasFrente();
    String imprimirFrenteTras();
}
