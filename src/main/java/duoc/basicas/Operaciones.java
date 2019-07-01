package duoc.basicas;



public class Operaciones {
	
	public int suma(int a, int b) {
		
		if (a==0 || b==0) {
			return 0;
		}
		return a+b;
	}
	
	public int restar(int a, int b) {
		
		if (a==0 || b==0) {
			return 0;
		}
		return a-b;
	}

}
