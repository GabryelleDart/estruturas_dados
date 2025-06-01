package materialComplementar.exerciciosDeRevisaoArray;
import java.util.Scanner;

public class ArrayOrdemInversa{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Insira o tamanho do vetor:");
        int numero= sc.nextInt();
        int[] array =new int[numero];
        for (int i=(array.length-1);i>=0;i--){
            System.out.println("Insira o valor do index "+ i );
            array[i]=sc.nextInt();
        }
        for(int nmr:array){
            System.out.println(nmr);
        }
        
        sc.close();
    }
}