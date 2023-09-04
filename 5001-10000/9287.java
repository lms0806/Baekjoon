import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int n = Integer.parseInt(br.readLine());
			
			boolean flag = true;
			while(n --> 0) {
				String s = br.readLine();
				
				if(flag && (s.equals("000") || s.equals("100") || s.equals("001"))) {
					flag = false;
				}
			}
			sb.append("Case ").append(t).append(": ").append(flag ? "Standing" : "Fallen").append("\n");
		}
		System.out.print(sb);
	}
}
