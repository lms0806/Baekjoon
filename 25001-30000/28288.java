import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[5];

        for(int i = 0; i < n; i++){
            int idx = 0;
            for(char c : br.readLine().toCharArray()){
                num[idx++] += c == 'Y' ? 1 : 0;
            }
        }

        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            if(max < num[i]){
                max = num[i];
                arr.clear();
                arr.add(i + 1);
            }
            else if(max == num[i]){
                arr.add(i + 1);
            }
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int a : arr){
            sb.append(a).append(",");
        }
        System.out.print(sb.deleteCharAt(sb.length() - 1));
    }
}
