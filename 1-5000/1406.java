import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		int size = Integer.parseInt(br.readLine());
		
		Stack<Character> l = new Stack<>(), r = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			l.add(ch);
		}
		
		while(size --> 0) {
			String str = br.readLine();
			char ch = str.charAt(0);
			
			if(ch == 'L') {
				if(!l.isEmpty()) {
					r.add(l.pop());
				}
			}
			else if(ch == 'D') {
				if(!r.isEmpty()) {
					l.add(r.pop());
				}
			}
			else if(ch == 'B') {
				if(!l.empty()) {
					l.pop();
				}
			}
			else {
				l.add(str.charAt(2));
			}
		}
		
		while(!l.isEmpty()) {
			r.add(l.pop());
		}
		
		StringBuilder sb = new StringBuilder();
		while(!r.isEmpty()) {
			sb.append(r.pop());
		}
		System.out.print(sb);
	}
}
