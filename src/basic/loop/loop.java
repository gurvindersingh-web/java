import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input != null && !input.trim().isEmpty()) {
            int i = Integer.parseInt(input.trim());
            if (i % 2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        br.close();
    }
}
