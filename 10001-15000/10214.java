import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		int n = 0, n1 = 0;
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int k = 0; k < num; k++) {
			for(int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				if(count != num) {
					if(a != 0 || b != 0) {
						count++;
						n+=a;
						n1+=b;
					}
				}
			}
			if(n > n1) {
				sb.append("Yonsei").append("\n");
			}
			else if(n == n1) {
				sb.append("Korea").append("\n");
			}
			else {
				sb.append("Draw").append("\n");
			}
		}
		System.out.print(sb);
	}
}
