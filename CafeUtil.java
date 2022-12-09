import java.util.ArrayList;

public class CafeUtil {
    // Logic will go here :)
    public String greeting() {
        return"Hello! Welcome to the Java Cafe!";
    }

    public int getStreakGoal() {
        int streakGoal = 0;
        int[] streakArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < streakArray.length; i++) {
            streakGoal += streakArray[i];
        }
        return streakGoal;
    }

    public int getStreakGoal(int weeks) {
        int sum = 0;
        ArrayList<Integer> streakArrayList = new ArrayList<Integer>();
        for (int i = 0; i < weeks; i++) {
            streakArrayList.add(i + 1);
            System.out.println(streakArrayList.get(i));
        }

        for (int i = 0; i < streakArrayList.size(); i++) {
            sum += streakArrayList.get(i);
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotal = 0.0;
        ArrayList<Double> orderTotalArrayList = new ArrayList<Double>();

        for (int i = 0; i < prices.length; i++) {
            orderTotalArrayList.add(prices[i]);
            System.out.println(orderTotalArrayList.get(i));
        }

        for (int i = 0; i < orderTotalArrayList.size(); i++) {
            orderTotal += orderTotalArrayList.get(i);
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }
}