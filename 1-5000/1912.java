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
		int answer = Integer.parseInt(st.nextToken());
		num[0] = answer;
		for(int i = 1; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			num[i] = Math.max(num[i] + num[i - 1], num[i]);
			answer = Math.max(answer, num[i]);
		}
		System.out.print(answer);
	}
}
