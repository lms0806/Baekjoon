import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("-1")) {
				break;
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
            
			StringTokenizer st = new StringTokenizer(s);
			while(true) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == 0) {
					break;
				}
				
				arr.add(num);
			}
			
			int answer = 0;
			for(int i = 0; i < arr.size(); i++) {
				if(arr.contains(arr.get(i) * 2)) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
