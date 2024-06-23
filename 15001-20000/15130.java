import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int s = 0, e = 0;
		int sIdx = 0, eIdx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] != 0) {
				if(s == 0) {
					s = arr[i];
					sIdx = i;
				}
				else {
					e = arr[i];
					eIdx = i;
				}
			}
		}
		
		System.out.print(solve(s, sIdx, e, eIdx));
	}
	
	public static String solve(int s, int sIdx, int e, int eIdx) {
		if((e - s) % (eIdx - sIdx) != 0) {
			return "-1";
		}
		
		int dif = (e - s) / (eIdx - sIdx);
		int num = s - (dif * sIdx);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			sb.append(num).append(" ");
			num += dif;
		}
		return sb.toString();
	}
}
