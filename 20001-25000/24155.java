import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() { 
			@Override 
			public int compare(int[] o1, int[] o2) { 
				if(o1[0] == o2[0]) { 
					return o1[1] - o2[1]; 
				}else { 
					return o2[0] - o1[0]; 
				} 
			} 
		});

		
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i][0] == arr[i - 1][0]) {
				answer[arr[i][1]] = answer[arr[i - 1][1]];
			}
			else {
				answer[arr[i][1]] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a + 1).append("\n");
		}
		System.out.print(sb);
	}
}
