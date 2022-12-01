import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static ArrayList<Integer> know = new ArrayList<>();
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		while(t --> 0) {
			know.add(Integer.parseInt(st.nextToken()));
		}
		
		parent = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		arr = new ArrayList[m];
		for(int i = 0; i < m; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			t = Integer.parseInt(st.nextToken());
			
			int num = 0, prev = 0;
			for(int j = 0; j < t; j++) {
				if(j > 0) {
					prev = num;
					num = Integer.parseInt(st.nextToken());
					Union(prev, num);
				}
				else {
					num = Integer.parseInt(st.nextToken());
				}
				arr[i].add(num);
			}
		}
		
		for(ArrayList<Integer> list : arr) {
			boolean flag = false;
			for(int num : list) {
				for(int knows : know) {
					if(Find(knows) == Find(num)) {
						flag = true;
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			
			if(flag) {
				m--;
			}
		}
		
		System.out.print(m);
	}
	
	public static int Find(int n) {
		if(parent[n] == n) {
			return n;
		}
		return n = Find(parent[n]);
	}
	
	public static void Union(int a, int b) {
		int pa = Find(a);
		int pb = Find(b);
		
		parent[pa] = pb;
	}
}
