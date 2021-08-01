import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashSet<String> strs = new HashSet<>();
		ArrayList<String> strss = new ArrayList<>();
		
		while(n --> 0) {
			strs.add(br.readLine());
		}
		
		int answer = 0;
		String str = "";
		while(m --> 0) {
			str = br.readLine();
			if(strs.contains(str)) {
				strss.add(str);
				answer++;
			}
		}
		
		Collections.sort(strss);
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer).append("\n");
		for(String s : strss) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
