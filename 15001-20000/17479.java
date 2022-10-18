import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static HashMap<String, Integer> normal = new HashMap<>(), special = new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			normal.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			special.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		while(c --> 0) {
			br.readLine();
		}
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		System.out.print(solve(str));
	}
	
	public static String solve(String[] str) {
		long sum = 0;
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(normal.containsKey(str[i])) {
				sum += normal.get(str[i]);
				str[i] = "";
				count++;
			}
		}
		
		if(count == str.length) {
			return "Okay";
		}
		if(sum < 20000) {
			return "No";
		}
		
		for(int i = 0; i < str.length; i++) {
			if(special.containsKey(str[i])) {
				sum += special.get(str[i]);
				str[i] = "";
				count++;
			}
		}
		
		if(count == str.length) {
			return "Okay";
		}
		if(sum < 50000) {
			return "No";
		}
		
		int servicecount = 0;
		for(String s : str) {
			if(!s.equals("")) {
				servicecount++;
			}
		}
		
		return servicecount > 1 ? "No" : "Okay";
	}
}
