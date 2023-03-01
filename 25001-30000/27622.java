import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[1001];
		
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < 0) {
				if(check[-num]) {
					check[-num] = false;
				}
				else {
					answer++;
				}
			}
			else {
				check[num] = true;
			}
		}
		System.out.print(answer);
	}
}
