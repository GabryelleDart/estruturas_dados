package unidadeI.codigos.aula24I03;

public class Main {
    public static void main(String[] args) {
        FilaEstaticaCircular fl=new FilaEstaticaCircular(5); 
        fl.enfileirar(1);
        fl.enfileirar(1);
        fl.enfileirar(1);
        fl.enfileirar(1);
        fl.enfileirar(1);
        fl.desenfileirar();
        fl.imprimir();
    }
    
}
