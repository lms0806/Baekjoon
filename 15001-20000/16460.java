import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		String type = st.nextToken();
		int num = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String ty = st.nextToken();
			
			if(Integer.parseInt(st.nextToken()) <= num && type.contains(ty)) {
				arr.add(name);
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(String a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb.length() == 0 ? "No one yet" : sb);
	}
}
