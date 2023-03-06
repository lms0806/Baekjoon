import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		boolean[] visited = new boolean[200001];
		
		int answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()) - 1, io = Integer.parseInt(st.nextToken());
			
			if(io == 1) {
				if(visited[n]) {
					answer++;
				}
				visited[n] = true;
			}
			else {
				if(!visited[n]) {
					answer++;
				}
				visited[n] = false;
			}
		}
		
		for(boolean v : visited) {
			if(v) {
				answer++;
			}
		}
		
		System.out.print(answer);
	}
}
