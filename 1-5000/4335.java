import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			ArrayList<Integer> high = new ArrayList<>();
			ArrayList<Integer> low = new ArrayList<>();
			int right = 0;
			
			while(true) {
				int n = Integer.parseInt(br.readLine());
				
				if(n == 0) {
					return;
				}
				
				String check = br.readLine();
				
				if(check.charAt(4) == 'h') {
					high.add(n);
				}
				else if(check.charAt(4) == 'l') {
					low.add(n);
				}
				else {
					right = n;
					break;
				}
			}
			
			System.out.println(solve(high, low, right));
		}
	}
	
	public static String solve(ArrayList<Integer> high, ArrayList<Integer> low, int right) {
		for(int i = 0; i < high.size(); i++) {
			if(right >= high.get(i)) {
				return "Stan is dishonest";
			}
		}
		
		for(int i = 0; i < low.size(); i++) {
			if(right <= low.get(i)) {
				return "Stan is dishonest";
			}
		}
		return "Stan may be honest";
	}
}
