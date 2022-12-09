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
}