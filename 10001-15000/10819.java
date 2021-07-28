import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N, origin[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		N = Integer.parseInt(br.readLine());
		
		origin = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			origin[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(origin);
		
		int max = 0;
		do {
			int num = 0;
			for(int i = 0; i < N - 1; i++) {
				num += Math.abs(origin[i] - origin[i + 1]);
			}
			max = Math.max(max, num);
		}while(next_permutation());
		System.out.print(max);
	}
	
	private static boolean next_permutation() {
		int i = N - 1;
		while(i > 0 && origin[i - 1] >= origin[i]) {
			--i;
		}
		if(i == 0) {
			return false;
		}
		
		int j = N - 1;
		while(origin[i - 1] >= origin[j]) {
			--j;
		}
		
		int tmp = origin[i - 1];
		origin[i - 1] = origin[j];
		origin[j] = tmp;
		
		int k = N - 1;
		while(i < k) {
			tmp = origin[i];
			origin[i] = origin[k];
			origin[k] = tmp;
			
			++i;
			--k;
		}
		return true;
	}
}
