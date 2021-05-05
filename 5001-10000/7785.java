import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		Set<String> set = new TreeSet<String>();
		
		StringTokenizer st;
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			if(b.equals("enter")) {
				set.add(a);
			}
			else if(b.equals("leave")){
				set.remove(a);
			}
		}
		
		ArrayList<String> arr = new ArrayList<String>(set);
		Collections.reverse(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.print(sb);
	}
}
