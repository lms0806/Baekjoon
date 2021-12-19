import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			int[] num = new int[str.length()];
			int sum = 0, count = 1;
			
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(c == 'O') {
					num[j] += count;
				}
				count = c == 'O' ? count + 1 : 1; 
			}
			
			for(int n : num) {
				sum += n;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
