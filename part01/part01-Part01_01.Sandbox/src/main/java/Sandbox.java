
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandbox {

    public static class Counter {

        public int addToNumber(int number) {
            return number + 1;
        }

        public int subtractFromNumber(int number) {
            return number - 1;
        }
    }

//----------------------
    public static class SuperCounter extends Counter {

        @Override
        public int addToNumber(int number) {
            return number + 5;
        }

    }

//----------------------
    public static void main(String[] args) {
//        Counter counter = new Counter();
//        Counter superCounter = new SuperCounter();
//        int number = 3;
            ArrayList<String> strings = new ArrayList<>();
            strings.add("1");
            int number = Integer.parseInt(strings.get(0));
        }
    }

