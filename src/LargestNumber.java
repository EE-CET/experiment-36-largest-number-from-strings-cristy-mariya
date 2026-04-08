import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Build result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result.toString());

        sc.close();
    }
}
