import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static Node[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new Node[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		for(int i = 1; i < 101; i++) {
			if(!check(i)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(int num) {
		for(int i = 0; i < n; i++) {
			Node now = arr[i];
			
			if(now.choice.equals("ADD")) {
				num += now.num;
			}
			else if(now.choice.equals("SUBTRACT")) {
				num -= now.num;
				
				if(num < 0) {
					return false;
				}
			}
			else if(now.choice.equals("MULTIPLY")) {
				num *= now.num;
			}
			else {
				if(num % now.num != 0) {
					return false;
				}
				
				num /= now.num;
			}
		}
		return true;
	}
}

class Node{
	String choice;
	int num;
	
	public Node(String choice, int num) {
		this.choice = choice;
		this.num = num;
	}
}
