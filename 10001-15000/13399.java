import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        for(int i = n; i > 0; i--){
            stack.push(i);
        }

        while(m --> 0){
            stack.push(Integer.parseInt(br.readLine()));
        }

        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            int num = stack.pop();

            if(!set.contains(num)){
                sb.append(num).append("\n");
                set.add(num);
            }
        }
        System.out.print(sb);
    }
}
