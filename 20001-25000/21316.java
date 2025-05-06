import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		ArrayList<Integer>[] arr = new ArrayList[13];
		for(int i = 1; i < 13; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < 12; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int answer = 1;
		for(int i = 1; i < 13; i++) {
			if(arr[i].size() != 3) {
				continue;
			}
			
			boolean[] flag = new boolean[4];
			for(int j = 0; j < arr[i].size(); j++) {
				flag[arr[arr[i].get(j)].size()] = true;
			}
			
			if(flag[1] && flag[2] && flag[3]) {
				answer = i;
				break;
			}
		}
		System.out.print(answer);
	}
}
