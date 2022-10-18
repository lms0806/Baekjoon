import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s;
		StringBuilder answer = new StringBuilder();
		while((s = br.readLine()) != null) {
			int t = Integer.parseInt(s);
			
			HashSet<String> set = new HashSet<>();
			
			while(t --> 0) {
				int[] num = new int[10];
				
				for(char c : br.readLine().toCharArray()) {
					num[c - '0']++;
				}
				
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < num.length; i++) {
					if(num[i] > 0) {
						sb.append(i);
					}
				}
				set.add(sb.toString());
			}
			
			answer.append(set.size()).append("\n");
		}
		System.out.print(answer);
	}
}
