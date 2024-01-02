import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		List<Node>[] arr = new ArrayList[301];
		
		int idx = 0;
		while(p --> 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			String n = st.nextToken();
			
			boolean flag = false;
			for(int i = 0; i < idx; i++) {
				if(arr[i].size() == m) {
					continue;
				}
				
				if(arr[i].get(0).level - 10 <= l && l <= arr[i].get(0).level + 10) {
					arr[i].add(new Node(n, l));
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				arr[idx] = new ArrayList<>();
				arr[idx++].add(new Node(n, l));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < idx; i++) {
			sb.append(arr[i].size() == m ? "Started!" : "Waiting!").append("\n");
			
			Collections.sort(arr[i]);
			
			for(int j = 0; j < arr[i].size(); j++) {
				sb.append(arr[i].get(j).level).append(" ").append(arr[i].get(j).nickname).append("\n");
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String nickname;
	int level;
	
	public Node(String nickname, int level) {
		this.nickname = nickname;
		this.level = level;
	}

	@Override
	public int compareTo(Node o) {
		return this.nickname.compareTo(o.nickname);
	}
}
