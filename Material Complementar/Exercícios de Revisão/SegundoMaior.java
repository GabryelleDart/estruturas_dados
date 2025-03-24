public class SegundoMaior {
    public static void main(String[] args) {
        int [] array= {4,77,456,99,0,5,3};
        int ma1=0;
        for (int nm : array) {
            if(nm>ma1){
                ma1=nm;
            }
       }
       int[] arrays2=array;
       arrays2.remove(int.valueOf(ma1))


    }
    
}
