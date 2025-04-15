import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		boolean flag = false;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			double num = Double.parseDouble(st.nextToken());
			
			if(num == 0) {
				continue;
			}
			
			int temp = (int)num;
			
			if(flag) {
				answer += temp;
			}
			else {
				answer += temp + (temp == num ? 0 : 1);
				flag = true;
			}
		}
		System.out.print(answer);
	}
}
