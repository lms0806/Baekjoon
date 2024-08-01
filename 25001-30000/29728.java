import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[n + 1];
		prime[1] = true;
		
		for(int i = 2; i * i <= n; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}
		
		boolean flag = false;
		Deque<Character> deque = new ArrayDeque<>();
		for(int i = 1; i <= n; i++) {
			if(!deque.isEmpty() && !prime[i]) {
				if(flag) {
					if(deque.peekFirst() == 'B') {
						deque.pollFirst();
						deque.addFirst('S');
					}
					deque.addFirst('S');
				}
				else {
					if(deque.peekLast() == 'B') {
						deque.pollLast();
						deque.addLast('S');
					}
					deque.addLast('S');
				}
				
				flag = !flag;
			}
			else {
				if(flag) {
					deque.addFirst('B');
				}
				else {
					deque.addLast('B');
				}
			}
		}
		
		int b = 0, s = 0;
		
		for(char c : deque) {
			if(c == 'B') {
				b++;
			}
			else if(c == 'S') {
				s++;
			}
		}
		System.out.print(b + " " + s);
	}
} 
