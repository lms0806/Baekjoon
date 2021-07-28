import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int N, origin[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		N = Integer.parseInt(br.readLine());
		
		origin = new int[N];
		for(int i = 0; i < N; i++) {
			origin[i] = i + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		do {
			for(int n : origin) {
				sb.append(n).append(" ");
			}
			sb.append("\n");
		}while(next_permutation());
		System.out.print(sb);
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
