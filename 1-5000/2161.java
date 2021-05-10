import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr.add(i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		while(arr.size() > 1) {
			sb.append(arr.pollFirst()).append(" ");
			arr.addLast(arr.pollFirst());
		}
		sb.append(arr.poll());
		
		System.out.print(sb);
	}
}
