import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		System.out.print(n - set.size());
	}
}
