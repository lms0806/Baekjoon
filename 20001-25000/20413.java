import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		int[] arr = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		String s = br.readLine();
		int answer = 0, before = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int idx = c == 'B' ? 0 : c == 'S' ? 1 : c == 'G' ? 2 : c == 'P' ? 3 : 4;
			
			if(idx == 4) {
				answer += arr[idx - 1];
			}
			else {
				before = arr[idx] - 1 - before;
				answer += before;	
			}
		}
		System.out.print(answer);
	}
}
