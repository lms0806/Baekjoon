import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int l = Integer.parseInt(br.readLine().trim());
			
			if(l == 0) {
				break;
			}
			
			int t = Integer.parseInt(br.readLine());
			
			sb.append("User ").append(idx++).append("\n");
			while(t --> 0) {
				sb.append(String.format("%.5f", (Double.parseDouble(br.readLine()) * l) / 100000)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
