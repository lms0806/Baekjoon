import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[201];
		
		int size = Integer.parseInt(br.readLine());
		
		int n = 0;
		while(size --> 0) {
			n = Integer.parseInt(br.readLine());
			num[n - 1]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(num[i] == 0) {
				sb.append(i + 1).append("\n");
			}
		}
		System.out.print(sb.length() == 0 ? "good job" : sb);
	}
}
