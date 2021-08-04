import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] n = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(st.nextToken());
			sum += n[i];
		}
		
		int answer = 0;
		while(sum != 0) {
			int num = 0;
			for(int i = 0; i < size; i++) {
				if(n[i] % 2 == 1) {
					n[i]--;
					num++;
				}
			}
			
			if(num > 0) {
				sum -= num;
				answer += num;
			}
			else {
				for(int i = 0; i < size; i++) {
					n[i] /= 2;
				}
				sum /= 2;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
