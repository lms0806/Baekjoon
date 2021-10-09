import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		TreeSet<String> set = new TreeSet<String>();
		
		StringTokenizer st;
		while(size --> 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			
			if(st.nextToken().equals("enter")) {
				set.add(a);
			}
			else {
				set.remove(a);
			}
		}
		
		ArrayList<String> arr = new ArrayList<String>(set);
		Collections.reverse(arr);
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
