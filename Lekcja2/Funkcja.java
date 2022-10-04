import java.util.Scanner;

public class Funkcja {
	public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Podaj a,b,c:");
    	int a = scn.nextInt();
    	int b = scn.nextInt();
    	int c = scn.nextInt();
    	
    	double delta = (b*b)-(4*a*c);
    	
    	if (delta>0){
    		double x1 = (-b - Math.sqrt(delta))/(2*a);
    		double x2 = (-b + Math.sqrt(delta))/(2*a);
    		System.out.println(x1 + " " + x2);
    	} else if (delta == 0){
    		System.out.println("Brak rozwiazan");
    	} else{
    		double x1= -b/(2*a);
    		System.out.println(x1);
    	}
	}
}