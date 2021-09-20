public class ATM {
    public int countBanknotes(int sum) {
        int[] arr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int i = 0;
        while (sum > 0) {
            result += sum / arr[i];
            sum %= arr[i];
            i++;
        }
        return result;
    }
}
