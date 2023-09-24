import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] arr = new int[1260];
		
		for(int t = 0; t < size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			
			for(int i = s; i <= e; i++) {
				arr[i]++;
			}
		}
		
		int as = 0, ae = 0;
		for(int i = 0; i < arr.length; i++) {
			if(as == 0 && arr[i] == size) {
				as = i;
			}
			if(arr[i] == size) {
				ae = i;
			}
		}
		
		System.out.print(as == ae ? "NE" : "TAIP\n" + (as / 60) + " " + (as % 60) + " " + (ae / 60) + " " + (ae % 60));	}
}
