public class Ans4 {
    public static void main(String[] args) {
        
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {5, 1, 1}
        };

        int result = maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + result);
    }
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int pr = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > pr)
                pr = sum;
        }
        return pr;
    }
}

