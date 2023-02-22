package questions.recursion;

public class Factors {

    public int factor(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factor(n - 1);
    }
}
