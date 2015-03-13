package Quest3;

import java.util.Scanner;

public class GoogleDois {
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	int dia = read.nextInt(),mes = read.nextInt(),ano = read.nextInt();
	Google d = new Google(dia,mes,ano);
	
	read.close();
	if(d.isValida()) { System.out.println(d);}
	
	
	
	}
}