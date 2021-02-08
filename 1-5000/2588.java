import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int a, b;
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(a*(b%10)).append("\n");
		sb.append(a*((b%100)/10)).append("\n");
		sb.append(a*(b/100)).append("\n");
		sb.append(a*b).append("\n");
		
		System.out.print(sb);
	}
}
