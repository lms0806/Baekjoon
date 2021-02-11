import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 1) {
				a++;
			}
			else {
				b++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(a > b) {
			sb.append("Junhee is cute!");
		}
		else {
			sb.append("Junhee is not cute!");
		}
		System.out.print(sb);
	}
}
