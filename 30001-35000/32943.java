import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int x = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[k][3];
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] == o2[0] ? o1[1] - o2[2] : o1[0] - o2[0];
			}
		});

		int[] seat = new int[c + 1], people = new int[x + 1];
		for(int i = 0; i < k; i++) {
			if(seat[arr[i][1]] == 0) {
				seat[arr[i][1]] = arr[i][2];
				
				if(people[arr[i][2]] != -1) {
					seat[people[arr[i][2]]] = 0;
				}

				people[arr[i][2]] = arr[i][1];
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= x; i++) {
			if(people[i] != 0) {
				sb.append(i).append(" ").append(people[i]).append("\n");
			}
		}
		System.out.print(sb);
	}
}
