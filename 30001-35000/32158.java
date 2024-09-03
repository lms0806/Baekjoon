import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		char[] ch = br.readLine().toCharArray();
		
		Queue<Integer> c = new LinkedList<>(), p = new LinkedList<>();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'P') {
				p.add(i);
			}
			if(ch[i] == 'C') {
				c.add(i);
			}
			
			if(!p.isEmpty() && !c.isEmpty()) {
				int cIdx = c.poll(), pIdx = p.poll();
				
				char temp = ch[cIdx];
				ch[cIdx] = ch[pIdx];
				ch[pIdx] = temp;
			}
		}
		System.out.print(ch);
	}
}
