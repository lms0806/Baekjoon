import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int[] n = new int[size];
		
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		
		for(int i = size - 1; i >= 0; i--) {
			if(n[i] <= num) {
				answer += num/n[i];
				num %= n[i];
			}
			if(num == 0) {
				break;
			}
		}
		System.out.print(answer);
	}
}
