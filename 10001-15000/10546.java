import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) * 2 - 1;
		
		HashSet<String> arr = new HashSet<>();
		while(n --> 0){
			String s = br.readLine();
			if(arr.contains(s)) {
				arr.remove(s);
			}
			else {
				arr.add(s);
			}
		}
		System.out.print(arr.iterator().next());
	}	
}
