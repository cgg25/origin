import java.util.Scanner;
public class Ejercicio3{
	public static void main (String [] args){
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un precio");
		int precio=entrada.nextInt();
		if (precio>80){
			precio=precio-(precio*10/100);
			System.out.println(precio);
		}
		if(precio<6){
			precio=precio+2;
			System.out.println("Precio + gastos de gestion " + precio);
		}
	}
}