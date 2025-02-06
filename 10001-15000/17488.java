import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashSet<Integer>[] set = new HashSet[m];
		int[] size = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			set[i] = new HashSet<>();
			size[i] = Integer.parseInt(st.nextToken());
		}	
	
		for(int t = 0; t < 2; t++) {
			ArrayList<Integer>[] arr = new ArrayList[m];
			for(int i = 0; i < m; i++) {
				arr[i] = new ArrayList<>();
			}
			
			for(int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				while(true) {
					int num = Integer.parseInt(st.nextToken());
					
					if(num == -1) {
						break;
					}
					
					if(size[num - 1] == 0) {
						continue;
					}
					
					arr[num - 1].add(i);
				}
			}
			
			for(int i = 0; i < m; i++) {
				if(arr[i].size() + set[i].size() <= size[i]) {
					for(int a : arr[i]) {
						set[i].add(a);
					}
				}
				else if(arr[i].size() > size[i]){
					size[i] = 0;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			boolean flag = false;
			for(int j = 0; j < m; j++) {
				if(set[j].contains(i)) {
					flag = true;
					sb.append(j + 1).append(" ");
				}
			}
			
			if(!flag) {
				sb.append("망했어요");
			}
			sb.append("\n");
		}
		System.out.print(sb);		
	}
}
