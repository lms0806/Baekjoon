import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			br.readLine();
			
			int num = Integer.parseInt(br.readLine());
			long sum = 0;
			
			for(int i = 0; i < num; i++) {
				sum += Long.parseLong(br.readLine()) % num;
			}
			sb.append(sum % num == 0 ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
