import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()) + 1, m = Integer.parseInt(st.nextToken());
        
        int[] check = new int[n];
        ArrayList<Integer>[] arr = new ArrayList[n];
        for(int i = 1; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	check[b]++;
        	arr[a].add(b);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 1; i < n; i++) {
        	if(check[i] == 0) {
        		queue.add(i);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
        	int now = queue.poll();
        	
        	sb.append(now).append(" ");
        	for(int i = 0; i < arr[now].size(); i++) {
        		int next = arr[now].get(i);

        		if(--check[next] == 0) {
        			queue.add(next);
        		}
        	}
        }
        System.out.print(sb);
    }
}
