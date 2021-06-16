import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			sb.append("Test set ").append(i).append(":\n");
			
			int n = Integer.parseInt(br.readLine());
			
			String[] str = new String[n];

			for(int j = 0; j < n; j++) {
				str[j] = br.readLine();
			}
			
			n = Integer.parseInt(br.readLine());
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					arr.add(st.nextToken());
				}
			}
			
			for(int j = 0; j < str.length; j++) {
				sb.append(str[j]).append(" is ").append(arr.contains(str[j]) ? "present" : "absent").append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
