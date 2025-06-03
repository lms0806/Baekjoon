import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		HashSet<Integer> like = new HashSet<>(), disLike = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			like.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		while(b --> 0) {
			disLike.add(Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		int l = 0, d = 0;
		for(int i = 0; i <= n; i++) {
			if(like.contains(arr[i])) {
				l++;
			}
			else {
				if(l > 2) {
					answer += l;
				}
				l = 0;
			}
			
			if(disLike.contains(arr[i])) {
				d++;
			}
			else {
				if(d > 2) {
					answer -= d;
				}
				d = 0;
			}
		}
		System.out.print(answer);
	}
}
