package entities;

public interface Empilhavel<T extends String> {
        void push(T dado);
		T top();
		T pop();
		void update(T dado);
		
		boolean isEmpty();
		boolean isFull();
		String imprimir();
		
}
