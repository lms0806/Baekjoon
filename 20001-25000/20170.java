import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[6], b = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int win = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(a[i] > b[j]) {
					win++;
				}
			}
		}
		
		int n = 36;
		int[] num = {36, 18, 12, 9, 6, 4, 3, 2};
		for(int i = 0; i < num.length; i++) {
			if(win % num[i] == 0) {
				win /= num[i];
				n /= num[i];
				break;
			}
		}
		System.out.print(win + "/" + n);
	}
}
