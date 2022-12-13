import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] num = new int[n];
			
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			
			ArrayList<String> arr = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					for(int k = j + 1; k < n; k++) {
						if(num[i] * num[i] + num[j] * num[j] == num[k] * num[k]) {
							arr.add(num[i] + " " + num[j] + " " + num[k]);
						}
					}
				}
			}
			
			if(arr.size() == 0) {
				sb.append("No Pythogorean triples found in the sequence.");
			}
			else {
				Collections.sort(arr);
				
				sb.append("Found Pythogorean triples:  ");
				for(String s : arr) {
					sb.append("{").append(s).append("} ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
