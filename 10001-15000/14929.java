import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		long[] arr = new long[size + 1];
		
		long sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		long answer = 0;
		for(int i = 1; i < size; i++) {
			sum -= arr[i];
			answer += arr[i] * sum;
		}
		System.out.print(answer);
	}
}
