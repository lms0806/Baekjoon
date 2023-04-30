import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int q = Integer.parseInt(br.readLine());
		
		long num = 1, plus = 0, mul = 1;
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 3) {
				sb.append(num * mul + plus).append("\n");
			}
			else {
				int x = Integer.parseInt(st.nextToken());
				
				if(choice == 0) {
					plus += x;
				}
				else if(choice == 1) {
					mul *= x;
					plus *= x;
				}
				else {
					num += x;
				}
			}
		}
		System.out.print(sb);
	}
}
