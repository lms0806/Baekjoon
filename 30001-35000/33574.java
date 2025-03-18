import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		while(test --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			if(op == 1) {
				if(x == 1) {
					Collections.sort(arr);
				}
				else {
					Collections.sort(arr, Collections.reverseOrder());
				}
			}
			else {
				int t = Integer.parseInt(st.nextToken());
				
				arr.add(x, t);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
