public class Generica_Comparar<E extends Comparable<E>> {

	E info;
	
	Generica_Comparar(E fo){info=fo;}
	
	int comparar(E x)
	{
		
		return info.compareTo(x);
		
	}
	
	
	public static void main(String[] args) {
	
		
		Generica_Comparar<String> x=new Generica_Comparar<String>("Bola");
		
		
		System.out.println(x.comparar("Adios"));
		
		Generica_Comparar<Integer> y=new Generica_Comparar<Integer>(5);
		
		System.out.println(y.comparar(4));
		
		
			
}

}
