import java.util.ArrayList;

public class SchleifenErsten100Quadratzahlen {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i*i);
        }

        System.out.println(numbers);

    }

}
