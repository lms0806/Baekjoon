import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] n = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num > n[i]) {
				answer += num - n[i];
			}
		}
		
		System.out.print(answer);
	}
}
