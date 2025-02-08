package ObjectClass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);
        SecondUser secondUser1 = new SecondUser("Bob", 30);
        SecondUser secondUser2 = new SecondUser("Bob", 30);

        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);
        System.out.println("SecondUser1: " + secondUser1);
        System.out.println("SecondUser2: " + secondUser2);

        System.out.println("User1 equals User2: " + user1.equals(user2));
        System.out.println("SecondUser1 equals SecondUser2: " + secondUser1.equals(secondUser2));
    }
}
