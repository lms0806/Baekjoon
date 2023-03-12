import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0, r = 0, i = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int t = 0; t < n; t++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				a++;
			}
			else if(num == -1) {
				r++;
			}
			else if(num == 0){
				i++;
			}
		}
		
		System.out.print(i >= a + r ? "INVALID" : a > r ? "APPROVED" : "REJECTED");
	}
}
