import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		ArrayList<Long> arr = new ArrayList<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			long s = Long.parseLong(st.nextToken()), i = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			
			for(int j = 0; j < c; j++) {
				arr.add(s + i * j);
			}
		}
		
		Collections.sort(arr);
		
		long answer = 0;
		if(arr.get(0) >= t) {
			answer = arr.get(0) - t;
		}
		else if(arr.get(arr.size() - 1) < t) {
			answer = -1;
		}
		else {
			boolean flag = true;
			int start = 0, end = arr.size() - 1;
			while(start < end) {
				int mid = (start + end) / 2;
				
				if(arr.get(mid) == t) {
					flag = false;
					break;
				}
				else if(arr.get(mid) > t) {
					end = mid;
				}
				else {
					start = mid + 1;
				}
			}
			answer = flag ? arr.get(end) - t : 0;
		}
		System.out.print(answer);
	}
}
