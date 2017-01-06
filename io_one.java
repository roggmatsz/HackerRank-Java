//Reading input from stdin and stdout
//goal: read 3 integers from stdin and 
//      print 'em to stdout
import java.util.*;

public class io_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        a = scanner.nextInt();
        System.out.println(a);
        a = scanner.nextInt();
        System.out.println(a);
    }
}