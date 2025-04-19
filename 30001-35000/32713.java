import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		ArrayList<Node> arr = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int idx = Integer.parseInt(st.nextToken()), count = 1;
		for(int i = 1; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(idx != num) {
				arr.add(new Node(idx, count));
				idx = num;
				count = 1;
			}
			else {
				count++;
			}
		}
		arr.add(new Node(idx, count));
		
		int answer = 0;
		for(int i = 0; i < arr.size(); i++) {
			int temp = k;
			int sum = arr.get(i).count;
			for(int j = i + 1; j < arr.size(); j++) {
				if(arr.get(j).num != arr.get(i).num) {
					temp -= arr.get(j).count;
					if(temp < 0) {
						break;
					}
				}
				else {
					sum += arr.get(j).count;
				}
			}
			answer = Math.max(answer, sum);
		}
		System.out.print(answer);
	}
}

class Node {
	int num, count;
	
	public Node(int num, int count) {
		this.num = num;
		this.count = count;
	}
}
