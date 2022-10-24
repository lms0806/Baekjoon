import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<Integer>[] arr = new ArrayList[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int size = 0;
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			while(n --> 0) {
				arr[i].add(Integer.parseInt(st.nextToken()));
				size++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int min = Integer.MAX_VALUE, idx = 0;
			for(int i = 0; i < t; i++) {
				if(arr[i].size() == 0) {
					continue;
				}
				if(min > arr[i].get(0)) {
					min = arr[i].get(0);
					idx = i;
				}
			}
			arr[idx].remove(0);
			sb.append((char)(idx + 'A'));
		}
		System.out.print(sb);
	}
}
