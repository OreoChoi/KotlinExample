public class User {
    public static void main(String[] args) {
        UserStatus status = (userName, age) ->  userName + " " + age;
        System.out.println(status.printStatus("Choi", 28));
    }

    interface UserStatus {
        String printStatus(String userName, int age);
    }
}