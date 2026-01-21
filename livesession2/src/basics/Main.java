package basics;

public class Main {
    static void main() {
        User u = new User();
        u.setId(1L);
        u.setName("Enrico");
        System.out.println(u);

        UserAnnotation ua = new  UserAnnotation(11L, "Fred");
        System.out.println(ua);

        var ua2 = new UserAnnotation();

        var point = new Point(1, 1);
    }
}