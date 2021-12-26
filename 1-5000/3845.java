import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int nx, ny;
	static double w;
	static double[] a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nx = Integer.parseInt(st.nextToken());
			ny = Integer.parseInt(st.nextToken());
			w = Double.parseDouble(st.nextToken());
			
			if(nx == 0 && ny == 0) {
				break;
			}
			
			a = new double[nx];
			b = new double[ny];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < nx; i++) {
				a[i] = Double.parseDouble(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < ny; i++) {
				b[i] = Double.parseDouble(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			sb.append(solve()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve() {
		if(a[0] <= w / 2 && a[nx - 1] >= 75 - w / 2) {
			for(int i = 1; i < nx; i++) {
				if(a[i] - a[i - 1] > w) {
					return "NO";
				}
			}
		}
		else {
			return "NO";
		}
		
		if(b[0] <= w / 2 && b[ny - 1] >= 100 - w / 2) {
			for(int i = 1; i < ny; i++) {
				if(b[i] - b[i - 1] > w) {
					return "NO";
				}
			}
		}
		else {
			return "NO";
		}
		return "YES";
	}
}
