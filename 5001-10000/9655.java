import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		if(a % 2 == 1) {
			System.out.println("SK");
		}
		else {
			System.out.println("CY");
		}
		br.close();
	}
}
