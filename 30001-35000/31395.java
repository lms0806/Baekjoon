import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int before = -1;
		long answer = 0, count = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(before != -1) {
				if(before < num) {
					count++;
				}
				else {
					answer += count * (count + 1) / 2;
					count = 1;
				}
			}
			
			before = num;
		}
		System.out.print(answer + (count * (count + 1) / 2));
	}
}
