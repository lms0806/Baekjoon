import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>(), set1 = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = t;
		for(int i = 1; i <= t; i++) {
			String s = br.readLine();
			
			if(set.contains(s)) {
				if(!set1.contains(s)) {
					set1.add(s);
					
					if(set1.size() == (n % 2 == 0 ? n / 2 : n / 2 + 1)) {
						answer = i;
						break;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
