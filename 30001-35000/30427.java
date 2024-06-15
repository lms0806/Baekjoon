import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
	static int n;
	static ArrayList<String> home = new ArrayList<>();
	static TreeSet<String> see = new TreeSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			home.add(br.readLine());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			see.add(br.readLine());
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		if(home.contains("dongho")) {
			return "dongho";
		}
		
		ArrayList<String> no = new ArrayList<>();
		
		for(String a : home) {
			if(!see.contains(a)) {
				no.add(a);
			}
		}
		
		if(no.size() == 1) {
			return no.get(0);
		}
		
		if(!see.contains("bumin") && home.contains("bumin")) {
			return "bumin";
		}
		
		if(!see.contains("cake") && home.contains("cake")) {
			return "cake";
		}
		
		if(!see.contains("lawyer") && home.contains("lawyer")) {
			return "lawyer";
		}
		
		Collections.sort(no);
		
		return no.size() == 0 ? "swi" : no.get(0);
	}
}
