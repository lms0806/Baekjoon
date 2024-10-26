import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	ArrayList<String> arr = new ArrayList<>();
    	String s = br.readLine();
    	
    	int size = n / 5;
    	for(int i = 0; i < n; i += size) {
    		arr.add(s.substring(i, i + size));
    	}
    	
    	Map<String, Integer> map = Map.of(
    			"####.##.##.####", 0,
    			"###..#####..###", 2,
    			"###..####..####", 3,
    			"#.##.####..#..#", 4,
    			"####..###..####", 5,
    			"####..####.####", 6,
    			"###..#..#..#..#", 7,
    			"####.#####.####", 8,
    			"####.####..####", 9
    	);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < size; i++) {
    		if(arr.get(0).charAt(i) == '#') {
    			if(i == size - 1 || (arr.get(0).charAt(i + 1) == '.' && arr.get(3).charAt(i) == '#')) {
    				sb.append(1);
    				continue;
    			}
    			
    			StringBuilder check = new StringBuilder();
    			for(int j = 0; j < 5; j++) {
    				check.append(arr.get(j).substring(i, i + 3));
    			}
    			
    			if(map.containsKey(check.toString())) {
    				sb.append(map.get(check.toString()));
    				i += 2;
    			}
    		}
    	}
    	System.out.print(sb);
    }
}
