import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Node> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			
			int date = Integer.parseInt(st.nextToken()) * 7 + Integer.parseInt(st.nextToken());
			
			map.put(name, new Node(date, Integer.parseInt(st.nextToken())));
		}
		
		boolean[] check = new boolean[77];
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int money = Integer.parseInt(st.nextToken());
			if(map.get(name).money <= money) {
				check[map.get(name).date] = true;
			}
		}
		
		int answer = 0, count = 0;
		for(int i = 0; i < check.length; i++) {
			if(check[i]) {
				count++;
				answer = Math.max(answer, count);
			}
			else {
				count = 0;
			}
		}
		System.out.print(answer);
	}
}

class Node {
	int date, money;
	
	public Node(int date, int money) {
		this.date = date;
		this.money = money;
	}
}
