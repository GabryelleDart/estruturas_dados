package materialComplementar.exerciciosDeRevisaoArray;
public class MaiorMenor {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,8};
        int ma= array[0];
        int me= array[0];
        for (int numero : array) {
            if(numero>=ma){
                ma=numero;
            }else if(numero<=me){
                me=numero;
            }
            
        }
        System.out.println("---MAIOR ----");
        System.out.println(ma);
        System.out.println("---MENOR ----");
        System.out.println(me);
        }
}
