import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int idx = 1;
			while(true) {
				if(n > idx * 3) {
					n -= idx * 3;
				}
				else {
					break;
				}
				idx++;
			}
			
			if(n > idx * 2) {
				sb.append("splash");
			}
			else {
				sb.append(idx).append(" ").append(n > idx ? "jump" : "dolphin").append(idx > 1 ? "s" : "");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
