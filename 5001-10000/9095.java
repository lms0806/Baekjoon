import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[11];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 4;
		
		for(int i = 3; i <= 10; i++) {
			num[i] = num[i - 1] +  num[i - 2] + num[i - 3];
		}
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(num[Integer.parseInt(br.readLine()) - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
