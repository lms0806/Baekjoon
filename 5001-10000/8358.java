import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashSet<String> set = new HashSet<>();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			String s = br.readLine().replaceAll("-", "").toLowerCase();
			
			set.add(s);
		}
		
		System.out.print(set.size());
	}
}
