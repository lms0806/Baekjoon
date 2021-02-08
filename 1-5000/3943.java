import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int a = Integer.parseInt(br.readLine());
			
			int max = a;
			while(a != 1) {
				if(a % 2 == 0) {
					a/=2;
				}
				else if(a % 2 != 0) {
					a*=3;
					a++;
				}
				max = Math.max(max, a);
			}
			
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
}
