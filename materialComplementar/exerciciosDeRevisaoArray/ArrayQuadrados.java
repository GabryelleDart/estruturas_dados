package materialComplementar.exerciciosDeRevisaoArray;
import java.util.Scanner;

public class ArrayQuadrados {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Insira numero:");
        int nmr=sc.nextInt();
        int[] vet = new int [nmr];
        for(int i=0;i<vet.length;i++){
            vet[i]=(int) Math.pow((i+1),2);
            System.out.println(vet[i]);
        }
        
        sc.close();
    }
}
