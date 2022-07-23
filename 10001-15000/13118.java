import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] arr = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = 0; i < 4; i++) {
			if(x == arr[i]) {
				answer = i + 1;
				break;
			}
		}
		System.out.print(answer);
	}
}
