package duoc;

import duoc.basicas.Operaciones;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op = new Operaciones();
		
		System.out.println("la suma de 10 + 5 es: "+ op.suma(10, 5));
		System.out.println();
		System.out.println("la suma de 10 + 0 es: "+ op.suma(10, 0));
		
		System.out.println("######restaaaaaaaaaaaaaaaa##############");
		System.out.println();
		System.out.println("la resta de "+op.restar(10, 10));

	}

}
