import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static int[][] pi;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        
        TreeSet<Integer> set = new TreeSet<>();
        int[] arr = new int[n], rank = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	
        	set.add(arr[i]);
        }
        
        int idx = 1;
        for(Integer a : set) {
        	int count = 0;
        	for(int i = 0; i < n; i++) {
        		if(arr[i] == a) {
        			rank[i] = idx;
        			count++;
        		}
        	}
        	idx += count;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	sb.append(rank[i]).append("\n");
        }
        System.out.print(sb);
    }
}
