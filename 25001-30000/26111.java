import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        long answer = 0;
        String s = br.readLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(stack.isEmpty() || c == '('){
                stack.add(c);
            }
            else{
                if(s.charAt(i - 1) == '('){
                    answer += stack.size() - 1;
                }
                stack.pop();
            }
        }
        System.out.print(answer);
    }
}
