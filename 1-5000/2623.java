import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
        	int size = Integer.parseInt(st.nextToken());
        	
        	int[] num = new int[size];
        	
        	for(int i = 0; i < size; i++) {
        		num[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	for(int i = 0; i < size - 1; i++) {
        		check[num[i + 1]]++;
    			arr[num[i]].add(num[i + 1]);
        	}
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < n; i++) {
        	if(check[i] == 0) {
        		queue.add(i);
        	}
        }
        
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
        	int now = queue.poll();
        	
        	count++;
        	sb.append(now).append("\n");
        	for(int next : arr[now]) {
        		if(--check[next] == 0) {
        			queue.add(next);
        		}
        	}
        }
        System.out.print(count != n - 1 ? 0 : sb);
    }
}
