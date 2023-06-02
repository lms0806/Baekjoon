import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while(t --> 0) {
            String s = br.readLine();
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c == '@') {
                    sb.append('a');
                }
                else if(c == '[') {
                    sb.append('c');
                }
                else if(c == '!') {
                    sb.append('i');
                }
                else if(c == ';') {
                    sb.append('j');
                }
                else if(c == '^') {
                    sb.append('n');
                }
                else if(c == '0') {
                    sb.append('o');
                }
                else if(c == '7') {
                    sb.append('t');
                }
                else if(c == '\\') {
                    if(i < s.length() - 2 && s.charAt(i + 1) == '\\' && s.charAt(i + 2) == '\'') {
                        sb.append('w');
                        i += 2;
                    }
                    else if(i < s.length() - 1 && s.charAt(i + 1) == '\'') {
                        sb.append('v');
                        i++;
                    }
                }
                else {
                    sb.append(c);
                    count++;
                }
            }
            answer.append(count <= (double)(sb.length() / 2.0)? "I don't understand" : sb).append("\n");
        }
        System.out.print(answer);
    }
}
