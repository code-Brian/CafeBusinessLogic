import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeLogic = new CafeUtil();
        System.out.println(cafeLogic.greeting());
        System.out.println(cafeLogic.getStreakGoal());
        System.out.println(cafeLogic.getStreakGoal(15));
        double[] order1 = {1.95, 1.05};
        System.out.println(cafeLogic.getOrderTotal(order1));
        ArrayList<String> menuList = new ArrayList<String>();
        menuList.add("Drip Coffee");
        menuList.add("Cappuccino");
        menuList.add("Latte");
        menuList.add("Mocha");
        cafeLogic.displayMenu(menuList);
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Billy Bob");
        customers.add("Jenna Rae");
        customers.add("Susie Q");
        cafeLogic.addCustomer(customers);
    }
}