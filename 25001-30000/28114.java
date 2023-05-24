import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] year = new int[3];
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int solve = Integer.parseInt(st.nextToken());

            year[i] = Integer.parseInt(st.nextToken()) % 100;

            map.put(solve, st.nextToken());
        }

        Arrays.sort(year);

        StringBuilder sb = new StringBuilder();
        for(int y : year){
            sb.append(y);
        }
        sb.append("\n");
        for(Integer key : map.keySet()){
            sb.append(map.get(key).charAt(0));
        }
        System.out.print(sb);
    }
}
