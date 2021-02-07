import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[10];
		
		int d = Integer.parseInt(br.readLine());
		d *= Integer.parseInt(br.readLine());
		d *= Integer.parseInt(br.readLine());
		
		while(d != 0) {
			int number = d % 10;
			num[number]++;
			d/=10;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			sb.append(num[i]).append("\n");
		}
		System.out.print(sb);
	}
}
