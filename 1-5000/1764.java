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
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> strs = new HashSet<>();
		ArrayList<String> strss = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			strs.add(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		int answer = 0;
		String str = "";
		for(int i = 0; i < m; i++) {
			str = br.readLine();
			if(strs.contains(str)) {
				strss.add(str);
				answer++;
			}
		}
		
		Collections.sort(strss);
		
		sb.append(answer).append("\n");
		for(int i = 0; i < strss.size(); i++) {
			sb.append(strss.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
