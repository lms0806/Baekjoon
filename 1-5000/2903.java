import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1};
	static int n, m;
	static boolean[] visited = new boolean[100001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 2;
		for(int i = 0; i < n; i++) {
			num += Math.pow(2, i);
		}
		System.out.print((int)Math.pow(num, 2));
	}
}
