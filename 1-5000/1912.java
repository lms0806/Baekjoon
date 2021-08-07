import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sum = new int[size + 1];
		sum[1] = num[0];
		
		int answer = Math.max(-1000, sum[1]);
		for(int i = 1; i <= size; i++) {
			sum[i] = Math.max(sum[i - 1] + num[i - 1], num[i - 1]);
			answer = Math.max(answer, sum[i]);
		}
		System.out.print(answer);
	}
}
