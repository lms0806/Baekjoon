import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken()) + 1;
			
			int[][] arr = new int[p][m];
			Node[] total = new Node[p];
			
			for(int i = 0; i < p; i++) {
				total[i] = new Node(0, 0, 0);
			}
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				int people = Integer.parseInt(st.nextToken()), problem = st.nextToken().charAt(0) - 'A';
				int time = Integer.parseInt(st.nextToken()), result = Integer.parseInt(st.nextToken());
				
				if(arr[people][problem] == -1) {
					continue;
				}
				
				if(result == 1) {
					Node now = total[people];
						
					total[people] = new Node(people, now.sum + time + (arr[people][problem] * 20), now.count + 1);
					arr[people][problem] = -1;
				}
				else {
					arr[people][problem]++;
				}
			}
			
			Arrays.sort(total);
			
			sb.append("Data Set ").append(t).append(":").append("\n");
			for(int i = 0; i < p - 1; i++) {
				sb.append(total[i].num).append(" ").append(total[i].count).append(" ").append(total[i].sum).append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int num, sum, count;
	
	public Node(int num, int sum, int count) {
		this.num = num;
		this.sum = sum;
		this.count = count;
	}

	@Override
	public int compareTo(Node o) {
		if(o.count == this.count) {
			return this.sum - o.sum;
		}
		return o.count - this.count;
	}
}
