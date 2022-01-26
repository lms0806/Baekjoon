import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int m = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			
			if(flag) {
				m = k;
				flag = false;
			}
			else if(k % m == 0){
				sb.append(k).append("\n");
				flag = true;
			}
		}
		System.out.print(sb);
	}
}
