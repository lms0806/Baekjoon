import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = 0;
		StringBuilder sb = new StringBuilder();
		while((n = Integer.parseInt(br.readLine())) != -1) {
			int answer = 0;
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 1; i < n; i++) {
				if(n%i == 0) {
					arr.add(i);
					answer += i;
				}
			}
			
			sb.append(n);
			if(answer == n) {
				sb.append(" = ").append(arr.get(0));
				for(int i = 1; i < arr.size(); i++) {
					sb.append(" + ").append(arr.get(i));
				}
			}
			else {
				sb.append(" is NOT perfect.");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
