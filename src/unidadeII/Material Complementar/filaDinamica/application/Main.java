import unidadeII.MaterialComplementar.filaDinamica.entities.FilaDinamica;
import unidadeII.MaterialComplementar.filaDinamica.interf.Enfileiravel;
public class Main {
    
    public static void main(String[] args) {
        Enfileiravel fila = new FilaDinamica(5);
        fila.enfileirar("Primeiro");
        fila.enfileirar("Segundo");
        fila.enfileirar("Terceiro");
        fila.enfileirar("Quarto");
        fila.enfileirar("Quinto");
        System.out.println(fila.isFull());
    }
    
}
