import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Valor de x:");
	double x = sc.nextDouble();


System.out.println("Valor de y:");
	double y = sc.nextDouble();



double z = (1 + (x * x) / y) / ((x * x * x) / 1 + y);



System.out.println("El valor de z es: " + z  );



}
}