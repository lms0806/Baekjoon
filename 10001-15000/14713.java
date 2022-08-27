import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int n;
	static Queue<String>[] queue;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		queue = new LinkedList[n + 1];
		for(int i = 0; i <= n; i++) {
			queue[i] = new LinkedList<>();
			
			for(String s : br.readLine().split(" ")) {
				queue[i].add(s);
			}
		}
		
		System.out.print(solve());
	}
	
	public static String solve() {
		while(!allclear()) {
			boolean flag = false;
			String s = queue[n].poll();
			
			for(int i = 0; i < n; i++) {
				if(!queue[i].isEmpty() && queue[i].peek().equals(s)) {
					queue[i].poll();
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				return "Impossible";
			}
		}
		return !allclear() ? "Impossible" : "Possible";
	}
	
	public static boolean allclear() {
		for(int i = 0; i <= n; i++) {
			if(!queue[i].isEmpty()) {
				return false;
			}
		}
		return true;
	}
}
