package src;

public class ByteShort {
    public static void main(String[] args) {
        int test = calculate(300);

        System.out.println(test);
    }

    public static int calculate (int score) {
        if (score > 1000 ) {
            return 1;
            }
        else if (score > 500 && score < 1000) {
            return 2;
            }
        else if (score > 100 && score < 500) {
            return 3;
            }
        return 4;
    }
}
