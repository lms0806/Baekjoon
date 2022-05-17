import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int num = 3;
		while(true) {
			if(k < num) {
				m--;
				num--;
				if(m < 1) {
					m = n;
				}
			}
			else if(k > num) {
				m++;
				num++;
				if(m > n) {
					m = 1;
				}
			}
			else {
				break;
			}
		}
		System.out.print(m);
	}
}
