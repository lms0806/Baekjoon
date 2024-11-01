import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String a = br.readLine(), b = br.readLine();
		
		System.out.print(Math.min(solve(a, b), solve(b, a)));
	}
	
	public static int solve(String sa, String sb) {
		LinkedList<Integer> a = new LinkedList<>(), b = new LinkedList<>();
		
		for(char c : sa.toCharArray()) {
			a.add(c - '0');
		}
		for(char c : sb.toCharArray()) {
			b.add(c - '0');
		}
		
		int aLen = a.size(), bLen = b.size();
		
		for(int i = 0; i < bLen - 1; i++) {
			a.addFirst(0);
		}
		for(int i = 0; i < aLen - 1; i++) {
			b.addLast(0);
		}
		
		int temp = bLen - 1;
		int answer = aLen + bLen;
		for(int i = 0; i < aLen; i++) {
			int count = 0;
			boolean flag = true;
			Iterator<Integer> ia = a.iterator();
			Iterator<Integer> ib = b.iterator();
			while(ia.hasNext()) {
				count++;
				if(ia.next() + ib.next() == 4) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer = Math.min(answer, count);
			}
			
			if(--temp >= 0) {
				a.removeFirst();
			}
			b.removeLast();
			
			if(b.size() < a.size()) {
				b.addFirst(0);
			}
		}
		return answer;
	}
}
