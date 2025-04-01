import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class Example { public static void main(String[] args) { 
	String fileName = "D:\\Java\\Practise\\book.csv"; 
	File file = new File(fileName); 
	try { Scanner inputStream = new Scanner(file); 
	double sum = 0; double numberofMonths = 0; 
	while (inputStream.hasNext()){
		String data = inputStream.next(); 
		String[] values = data.split(","); 
		double avMonth = Double.parseDouble(values [0]); 
		sum += avMonth; numberofMonths++; 
		System.out.println(avMonth); } inputStream.close(); 
		System.out.println("Average - " + (sum / numberofMonths)); 
		} catch (FileNotFoundException e) { 
			e.printStackTrace(); } } 
	
	}

