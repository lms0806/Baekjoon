import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int num = 1, count = 0;
		
		StringBuilder sb  = new StringBuilder();
		while(a+1 != num) {
			if(a%num == 0) {
				count++;
				if(count == b) {
					sb.append(num).append("\n");
					break;
				}
			}
			num++;
		}
		
		if(num == a+1) {
			sb.append(0).append("\n");
		}
		
		System.out.print(sb);
	}
}
