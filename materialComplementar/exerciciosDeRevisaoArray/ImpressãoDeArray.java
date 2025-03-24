package materialComplementar.exerciciosDeRevisaoArray;
import java.util.Scanner;

public class ImpressãoDeArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Insira um número");
        int n= sc.nextInt();
        int[] array =new int[n];
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();

        }
        for (int num : array) {
            System.out.println(num);
        }
       
        sc.close();
    }
}
