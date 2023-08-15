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
		
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			set.add(st.nextToken());
			set.add(st.nextToken());
		}
		
		ArrayList<String> arr = new ArrayList<>();
		for(String a : set) {
			for(String b : set) {
				arr.add(a + " " + b);
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
