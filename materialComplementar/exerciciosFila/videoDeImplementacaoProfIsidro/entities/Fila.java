package materialComplementar.exerciciosFila.videoDeImplementacaoProfIsidro.entities;


    public class Fila {
        private int[] valores;
        private int primeiro;
        private int ultimo;
        private int total;
    
        public Fila() {
            valores =new int[10]; // defini um tamanho hipotético
            primeiro=0;
            ultimo=0;
            total=0;
        }
        public void inserir(int a){
            valores[ultimo]=a;
            //ultimo++ aqui tem-se um problema
            ultimo=(ultimo+1)%valores.length; //não entendi 
            total++;
    
        }
        public int remover(){
            int elemento =valores[primeiro];
            primeiro=(primeiro+1)%valores.length;
            total --;
            return elemento;
        }
    
        public boolean isEmpty(){
            return total==0;
           
        }
        public boolean isFull(){
           return total==valores.length;
        }
    }
    
    

