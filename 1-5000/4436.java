import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			int[] num = new int[10];
			
			long n = Long.parseLong(str);
			long b = n;
			
			int answer = 1;
			while(true) {
				long a = n;
				while(n / 10 > 0) {
					num[(int) (n % 10)] = 1;
					n /= 10;
				}
				num[(int)n] = 1;
				
				n = a;
				
				int count = 0;
				for(int nnn : num) {
					if(nnn == 1) {
						count++;
					}
				}
				if(count == 10) {
					break;
				}
				
				answer++;
				n += b;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
