import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int a = Integer.parseInt(br.readLine());
			
			int b = 0;
			for(int i = 1; i < a; i++) {
				if(a % i == 0) {
					b+=i;
				}
			}
			
			sb.append(a).append(" is ").append(a > b ? "a deficient" : a == b ? "a perfect" : "an abundant").append(" number.").append("\n\n");
		}
		System.out.print(sb);
	}
}
