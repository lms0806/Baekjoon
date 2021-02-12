import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, b;
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(a > 0) {
			sb.append(b > 0 ? 1 : 4);
		}
		else {
			sb.append(b > 0 ? 2 : 3);
		}
		System.out.print(sb);
	}
}
