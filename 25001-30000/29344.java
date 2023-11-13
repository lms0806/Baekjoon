import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		ArrayList<String> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			if(s.contains(".")) {
				sb.append(s.substring(0, s.length() - 1));
				for(int i = arr.size() - 1; i >= 0; i--) {
					sb.append(" ").append(arr.get(i));
				}
				sb.append(". ");
				
				arr.clear();
			}
			else {
				arr.add(s);
			}
		}
		System.out.print(sb);
	}
}
