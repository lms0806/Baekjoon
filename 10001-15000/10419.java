import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int count = 0;
			for(int i = 0; i < 100; i++) {
				if(i * i + i <= n) {
					count = i;
				}
				else {
					break;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
