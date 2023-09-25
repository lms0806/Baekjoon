import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int INF = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
        	Arrays.fill(arr[i], INF);
        	
        	arr[i][i] = 0;
        }
        
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
        	int c = Integer.parseInt(st.nextToken());
        	
        	arr[a][b] = Math.min(arr[a][b], c);
        }
        
        int t = Integer.parseInt(br.readLine());
        
        int[] city = new int[t];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < t; i++) {
        	city[i] = Integer.parseInt(st.nextToken()) - 1;
        }
        
        for(int k = 0; k < n; k++) {
        	for(int i = 0; i < n; i++) {
        		if(arr[i][k] == INF) {
        			continue;
        		}
        		
        		for(int j = 0; j < n; j++) {
        			if(arr[k][j] == INF) {
        				continue;
        			}
        			
        			arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
        		}
        	}
        }
        
        int[] max = new int[n];
        int min = INF;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < t; j++) {
        		int a = arr[city[j]][i];
        		int b = arr[i][city[j]];
        		
        		if(a == INF || b == INF) {
        			continue;
        		}
        		
        		max[i] = Math.max(max[i], a + b);
        	}
        	
        	min = Math.min(min, max[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	if(min == max[i]) {
        		list.add(i + 1);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for(int l : list) {
        	sb.append(l).append(" ");
        }
        System.out.print(sb);
    }
}
