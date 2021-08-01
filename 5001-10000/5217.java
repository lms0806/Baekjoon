import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append("Pairs for ").append(n).append(": ");
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 1; i <= n / 2; i++) {
				if(i != n - i) {
					arr.add(i);
					arr.add(n - i);
				}
			}
			
			for(int i = 0; i < arr.size(); i+=2) {
				if(i > 0) {
					sb.append(", ");
				}
				sb.append(arr.get(i)).append(" ").append(arr.get(i + 1));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
