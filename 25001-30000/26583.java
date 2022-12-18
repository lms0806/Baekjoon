import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			ArrayList<Integer> arr = new ArrayList<>();
			
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int i = 0; i < arr.size(); i++) {
				int sum = arr.get(i);
				
				if(i > 0) {
					sum *= arr.get(i - 1);
				}
				if(i < arr.size() - 1) {
					sum *= arr.get(i + 1);
				}
				
				sb.append(sum).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
