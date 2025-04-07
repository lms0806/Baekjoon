import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> answer = new HashSet<>();
		while(n --> 0) {
			HashSet<String> set = new HashSet<>();
			String str = br.readLine();
			
			for(int i = str.length() - 1; i >= 0; i--) {
				set.add(str.substring(i, str.length()));
			}
			
			for(String s : set) {
				if(answer.contains(s)) {
					answer.remove(s);
				}
				else {
					answer.add(s);
				}
			}
		}
		System.out.print(answer.size());
	}
}
