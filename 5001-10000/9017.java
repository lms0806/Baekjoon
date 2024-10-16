import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int max = 0;
        	int[] rank = new int[n];
        	HashMap<Integer, Integer> countMap = new HashMap<>();
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < n; i++) {
        		rank[i] = Integer.parseInt(st.nextToken());
        		countMap.put(rank[i], countMap.getOrDefault(rank[i], 0) + 1);
        		max = Math.max(max, rank[i]);
        	}

        	int num = 1;
        	int[] fivePlayer = new int[max + 1];
        	HashMap<Integer, Integer> scoreMap = new HashMap<>(), tempMap = new HashMap<>();
        	for(int r : rank) {
        		if(countMap.get(r) == 6) {
        			tempMap.put(r, tempMap.getOrDefault(r, 0) + 1);
        			
        			if(tempMap.get(r) < 5) {
        				scoreMap.put(r, scoreMap.getOrDefault(r, 0) + num);
        			}
        			else if(tempMap.get(r) == 5) {
        				fivePlayer[r] = num; 
        			}
            		num++;
        		}
        	}
        	
        	int answer = 0;
        	int result = Integer.MAX_VALUE, fiveScore = Integer.MAX_VALUE;
        	for(int key : scoreMap.keySet()) {
        		int score = scoreMap.get(key);
        		
        		if(score < result) {
        			answer = key;
        			fiveScore = fivePlayer[key];
        			result = score;
        		}
        		else if(score == result) {
        			if(fivePlayer[key] < fiveScore) {
        				answer = key;
        			}
        		}
        	}
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
