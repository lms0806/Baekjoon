import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String x = st.nextToken();
			String y = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Distances: ");
			for(int j = 0; j < x.length(); j++) {
				int cx = x.charAt(j) - 'A';
				int cy = y.charAt(j) - 'A';
				
				if(cx > cy) {
					sb.append(cy+26-cx).append(" ");
				}
				else {
					sb.append(cy-cx).append(" ");
				}
			}
			System.out.print(sb);
		}
	}
}
