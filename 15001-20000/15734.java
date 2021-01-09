import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		while(true) {
			if(l == r && a >= 0) {
				l += a/2;
				r += a/2;
				result = l + r;
				break;
			}
			if(l > r && a > 0) {
				a--;
				r++;
			}
			if(l < r && a > 0) {
				a--;
				l++;
			}
			if(a == 0 && l > r) {
				result = r*2;
				break;
			}
			if(a == 0 && l < r) {
				result = l*2;
				break;
			}
		}
		
		System.out.println(result);
	}
}
