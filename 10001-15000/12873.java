import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Deque<Integer> deque = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			deque.add(i);
		}
		
		for(int i = 1; i < n; i++) {
			long p = (long) (Math.pow(i, 3) - 1);
			
			p %= (n - i + 1);
			
			while(p --> 0) {
				deque.add(deque.pollFirst());
			}
			
			deque.pollFirst();
		}
		
		System.out.print(deque.pollFirst());
	}
}
