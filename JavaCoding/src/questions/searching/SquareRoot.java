package questions.searching;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(10));
        System.out.println(squareRootEfficientWay(10));
    }

    public static int squareRootEfficientWay(int x) {
        int low = 1, high = x, ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int msq = mid * mid;
            if (msq == x) return mid;
            else if (msq > x) high = mid - 1;
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    //naive approach
    public static int squareRoot(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
    }
}
