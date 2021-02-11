import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int num = a * 30 + b;
		
		StringBuilder sb = new StringBuilder();
		if(num == 78) {
			sb.append("Special");
		}
		else if(num > 78) {
			sb.append("After");
		}
		else {
			sb.append("Before");
		}
		System.out.print(sb);
	}
}
