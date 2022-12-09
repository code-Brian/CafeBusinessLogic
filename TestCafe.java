public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeLogic = new CafeUtil();
        System.out.println(cafeLogic.greeting());
        System.out.println(cafeLogic.getStreakGoal());
        System.out.println(cafeLogic.getStreakGoal(15));
    }
}