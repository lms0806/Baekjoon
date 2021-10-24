import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] tree, arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		String str = "";
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			arr = new int[n + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				arr[i] = num > 0 ? 1 : num == 0 ? 0 : -1;
			}
			
			tree = new int[n * 4];
			
			init(1, n, 1);
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				char c = st.nextToken().charAt(0);
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				if(c == 'C') {
					b = b > 0 ? 1 : b == 0 ? 0 : -1;
					
					update(1, n, 1, a, b);
				}
				else {
					int answer = mul(1, n, 1, a, b);
					sb.append(answer > 0 ? "+" : answer == 0 ? 0 : "-");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = arr[start];
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = init(start, mid, node * 2) * init(mid + 1, end, node * 2 + 1);
	}
	
	public static int mul(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return 1;
		}
		
		if(left <= start && end <= right) {
			return tree[node];
		}
		
		int mid = (start + end) / 2;
		
		return mul(start, mid, node * 2, left, right) * mul(mid + 1, end, node * 2 + 1, left, right);
	}
	
	public static int update(int start, int end, int node, int idx, int val) {
		if(idx < start || idx > end) {
			return tree[node];
		}
		
		if(start == end) {
			return tree[node] = val;
		}
		
		int mid = (start + end) / 2;
		return tree[node] = update(start, mid, node * 2, idx, val) * update(mid + 1, end, node * 2 + 1, idx, val);
	}
}
