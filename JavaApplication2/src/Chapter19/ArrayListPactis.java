package Chapter19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPactis {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList num1 = new ArrayList();
        ArrayList num2 = new ArrayList();

        //add();
        list.add("red");
        list.add("Green");
        list.add(1234);

        num1.add(5);
        num1.add(7);
        num1.add(9);
        num1.add(13);
        num1.add(15);
        System.out.println("num1 :" + num1);

        num2.add(40);
        num2.add(50);
        num2.add(30);
        num2.add(57);
        num2.add(48);
        num2.add(23);
        num2.add(18);
        System.out.println("num2 :" + num2);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //isEmpty();
        boolean check = num1.isEmpty();
        System.out.println("num1 is empty? " + check);

        //comtains();
        boolean pos = num2.contains(60);
        System.out.println("60 is in the num2? " + pos);

        //indexOf();
        int position = num1.indexOf(9);
        System.out.println("position of 9 is : " + position);

        //remove();
        num2.remove(4);
        System.out.println("After removing position 4 in num2 :" + num2);

        //addAll();
        ArrayList num3 = new ArrayList();
        num3.addAll(num1);
        System.out.println("num3 is : " + num3);

        //equals();
        boolean result = num1.equals(num2);
        System.out.println("num1==num2 ? " + result);

        boolean result1 = num1.equals(num3);
        System.out.println("num1==num3 ? " + result1);

        //Asinding ----- sort();
        Collections.sort(num1);
        System.out.println("Acending num1 : " + num1);
        
        
        //Decending----reversOrder();
        Collections.sort(num2,Collections.reverseOrder());
        System.out.println("Decending num2 : "+ num2);

    }
}
