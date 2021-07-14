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
		
		int sum = 0, answer = 0;
		for(int i = 0; i < size - 1; i++) {	
			sum = num[i] < num[i + 1] ? sum + num[i + 1] - num[i] : 0;

			answer = Math.max(answer, sum);
		}
		System.out.print(answer);
	}
}
