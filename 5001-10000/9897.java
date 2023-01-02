import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int l = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		boolean[] number = new boolean[l + 1];
		while(m --> 0) {
			String s = br.readLine();
			
			int num = 0, dif = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i].name.equals(s)) {
					num = arr[i].num;
					dif = arr[i].dif;
					break;
				}
			}
			
			while(num <= l) {
				number[num] = number[num] ? false : true;
				
				num += dif;
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= l; i++) {
			if(number[i]) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

class Node{
	String name;
	int num, dif;
	
	public Node(String name, int num, int dif) {
		this.name = name;
		this.num = num;
		this.dif = dif;
	}
}
