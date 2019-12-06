package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana");        // retorna false
		fila.offer("Bia");      // lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek());     // Retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());  // lança uma exceção
		System.out.println(fila.element());
		
		// poll e remove -> obter o próximo elemento da fila e remove!
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll());     // Retorna false
		System.out.println(fila.remove());   // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
}
}
