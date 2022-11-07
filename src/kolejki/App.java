package kolejki;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        LIFO stos = new LIFO();

        //System.out.println(stos.pop());
        stos.push(10);
        stos.push(15);
        stos.push(7);

        System.out.println(stos.pop());
        System.out.println(stos.pop());

        stos.push(20);

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        //System.out.println(stos.pop());

        System.out.println("-------------------------------------");
        Stack<Integer> stosZJavy = new Stack<>();

        //System.out.println(stosZJavy.pop());
        stosZJavy.push(10);
        stosZJavy.push(15);
        stosZJavy.push(7);

        System.out.println(stosZJavy.pop());
        System.out.println(stosZJavy.pop());

        stosZJavy.push(20);

        System.out.println(stosZJavy.pop());
        System.out.println(stosZJavy.pop());
        //System.out.println(stosZJavy.pop());
    }
}
