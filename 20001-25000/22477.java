import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		while(t --> 0) {
			set.add(br.readLine());
		}
		
		t = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			if(set.contains(s)) {
				sb.append(flag ? "Opened" : "Closed").append(" by ");
				flag = !flag;
			}
			else {
				sb.append("Unknown ");
			}
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
