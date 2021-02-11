import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(a % 2 == 0) {
			sb.append("SK");
		}
		else {
			sb.append("CY");
		}
		System.out.print(sb);
	}
}
