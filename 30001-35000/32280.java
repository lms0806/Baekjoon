import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) + 1;
		
		Node[] arr = new Node[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] time = st.nextToken().split(":");
			String kind = st.nextToken();
			
			arr[i] = new Node(Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]), kind);
		}
		
		String[] lastTime = br.readLine().split(":");
		int perTime = Integer.parseInt(lastTime[0]) * 60 + Integer.parseInt(lastTime[1]);
		
		Arrays.sort(arr);
		
		int answer = 0;
		boolean teacherCheck = false;
		for(int i = 0; i < n; i++) {
			if(teacherCheck) {
				if(arr[i].time >= perTime) {
					answer++;	
				}
			}
			
			if(arr[i].kind.equals("teacher")) {
				teacherCheck = true;
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int time;
	String kind;
	
	public Node(int time, String kind) {
		this.time = time;
		this.kind = kind;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.time == o.time) {
			return o.kind.compareTo(this.kind);
		}
		return this.time - o.time;
	}
	
}
