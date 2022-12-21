
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate mydate = new SimpleDate(10,11,1993);
        System.out.println("Initial ======");
        System.out.println(mydate);
        System.out.println("Plus 1 day ======");
        mydate.advance();
        System.out.println(mydate);
        System.out.println("Plus 50 days ======");
        mydate.advance(50);
        System.out.println(mydate);
    }
}
