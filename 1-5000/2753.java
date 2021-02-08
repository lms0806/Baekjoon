import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if((a%4 == 0 && a%100 != 0) || a%400 == 0) { 
			sb.append("1");
		}
		else {
			sb.append("0");
		}
		System.out.print(sb);
	}
}
