import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0, length =0;
		int min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int a = n % num, b = num - n % num;
			
			if(a < min) {
				min = a;
				answer = num;
				length = n / num * num;
			}
			
			if(b < min) {
				min = b;
				answer = num;
				length = num * (n / num + 1);
			}
		}
		System.out.print(answer + " " + length);
	}
}
