import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static int[] check;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        check = new int[n];
        Arrays.fill(check, -1);
        
        arr = new ArrayList[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
            arr[Integer.parseInt(st.nextToken()) - 1].add(Integer.parseInt(st.nextToken()) - 1);
        }
        
        bfs();
        
    	System.out.print(check[n - 1]);
    }
    
    public static void bfs() {
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(0);
    	check[0] = 0;
    	
    	while(!queue.isEmpty()) {
    		int now = queue.poll();
    		
    		for(int a : arr[now]) {
    			if(check[a] == -1) {
    				queue.add(a);
    				check[a] = check[now] + 1;
    			}
    		}
    	}
    }
}
