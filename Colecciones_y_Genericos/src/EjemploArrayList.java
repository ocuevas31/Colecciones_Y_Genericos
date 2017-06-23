import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

	
	public static void main(String v[])
	
	{
		
		//http://jarroba.com/arraylist-en-java-ejemplos/
		/*
		// Declaraci�n de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		// A�ade el elemento al ArrayList
		nombreArrayList.add("Elemento");
		// A�ade el elemento al ArrayList en la posici�n 'n'
		nombreArrayList.add(n, "Elemento 2");
		// Devuelve el numero de elementos del ArrayList
		nombreArrayList.size();
		// Devuelve el elemento que esta en la posici�n '2' del ArrayList
		nombreArrayList.get(1);
		// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
		nombreArrayList.contains("Elemento");
		// Devuelve la posici�n de la primera ocurrencia ('Elemento') en el ArrayList  
		nombreArrayList.indexOf("Elemento");
		// Devuelve la posici�n de la �ltima ocurrencia ('Elemento') en el ArrayList   
		nombreArrayList.lastIndexOf("Elemento");
		// Borra el elemento de la posici�n '5' del ArrayList   
		nombreArrayList.remove(1); 
		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
		nombreArrayList.remove("Elemento");
		//Borra todos los elementos de ArrayList   
		nombreArrayList.clear();
		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		nombreArrayList.isEmpty();  
		nombreArrayList.clone();  
		nombreArrayList.toArray();   
		*/
		
		// Declaraci�n el ArrayList
		ArrayList<String> nombreArrayList = new ArrayList<String>();

		
		// A�adimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			nombreArrayList.add("Elemento "+i); 
		}

		// A�adimos un nuevo elemento al ArrayList en la posici�n 2
		nombreArrayList.add(2, "Elemento 3");

		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}
		
		// Recordar que previamente ya hemos declarado el ArrayList y el Iterator de la siguiente forma:
		// ArrayList<String> nombreArrayList = new ArrayList<String>();
		// Iterator<String> nombreIterator = nombreArrayList.iterator();

		// Obtenemos el numero de elementos del ArrayList
		int numElementos = nombreArrayList.size();
		System.out.println("nnEl ArrayList tiene "+numElementos+" elementos");

		// Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posici�n '0'
		System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
		nombreArrayList.remove(0);

		// Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
		System.out.println("n... Eliminamos los elementos de ArrayList que sean iguales a Elemento 3...");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			if(elemento.equals("Elemento 3"))
				nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
		}

		// Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
		System.out.println("nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}

		// Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
		numElementos = nombreArrayList.size();
		System.out.println();
		System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
		
	}
}
