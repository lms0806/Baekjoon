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
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		long answer = 0;
		for(int i = 0; i < size; i++) {
			answer++;
			num[i] -= a;
			if(num[i] > 0) {
				if(num[i] % b == 0) {
					answer += num[i]/b;
				}
				else {
					answer += num[i]/b + 1;
				}
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}
}
