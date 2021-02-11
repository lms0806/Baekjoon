import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int num1 = a*p;
		int num2 = b;
		
		if(p > c) {
			p-=c;
			num2 += d*p;
		}
		
		StringBuilder sb = new StringBuilder();
		if(num1 > num2) {
			sb.append(num2);
		}
		else {
			sb.append(num1);
		}
		System.out.print(sb);
	}
}
