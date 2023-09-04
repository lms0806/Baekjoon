import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		boolean[] flag = new boolean[1000000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			for(int j = a; j <= b; j++) {
				flag[j] = true;
			}
		}
		
		int answer = 0;
		for(boolean f : flag) {
			if(f) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
