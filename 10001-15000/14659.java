import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0, count = 0, check = num[0];
		for(int i = 1; i < size; i++) {
			if(check < num[i]) {
				count = 0;
				check = num[i];
				continue;
			}
			count++;
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
