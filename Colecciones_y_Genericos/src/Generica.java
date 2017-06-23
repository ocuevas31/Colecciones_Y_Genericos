public class Generica<E> {

	
	E info;
	
	Generica(E f){info=f;}
	
	public String toString()
	{
		
		
		return info.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generica<String> x=new Generica<String>("hola");
		
		System.out.println(x);
		
		
		Generica<Integer> y=new Generica<Integer>(5);
		

		System.out.println(y);
	}

}