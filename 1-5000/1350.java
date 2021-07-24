import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		long[] num = new long[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
		
		int n = Integer.parseInt(br.readLine());
		
		long answer = 0;
		for(int i = 0; i < size; i++) {
			if(num[i] != 0) {
				answer += num[i] % n == 0 ? num[i] : n * (num[i] / n + 1);
			}
		}
		System.out.print(answer);
	}
}
