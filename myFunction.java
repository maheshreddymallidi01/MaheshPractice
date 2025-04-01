import java.util.*;
import java.util.Scanner;

public class myFunction {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		double q=scan.nextDouble();
		getValue(p,q);
	}
	
	public static void getValue(int p,double q) {
		System.out.println(p*q);
	}
}
