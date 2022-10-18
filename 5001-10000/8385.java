import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		
		while(t --> 0) {
			set.add(br.readLine());
		}
		
		int answer = 0;
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			StringBuilder sb = new StringBuilder();
			for(char c : iter.next().toCharArray()) {
				int n = c + 13;
				sb.append((char)(n > 'z' ? n - 26 : n));
			}
			
			if(set.contains(sb.toString())) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
