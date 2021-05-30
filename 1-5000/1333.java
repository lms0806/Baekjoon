import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		boolean[] b = new boolean[n*l + (n-1)*5];
		int num = 0;
		while(n --> 0) {
			for(int j = num; j < num + l; j++) {
				b[j] = true;
			}
			num += l + 5;
		}
		
		int answer = 0;
		while(answer < b.length) {
			if(!b[answer]) { 
				break;
			}
			answer+=d;
		}
		System.out.print(answer);
	}
}
