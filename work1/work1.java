// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class work1 {
    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<>();
            for (int i = 0; i < 10; i++){
            int ranNum = ThreadLocalRandom.current().nextInt(0, 20);
            list1.add(ranNum);
            }  
            System.out.println(list1);

            LinkedList <Integer> list2 = new LinkedList<>();
            for (int i = list1.size() - 1; i >= 0; i-- ) {
                list2.add(list1.get(i));
            }
            System.out.println(list2);
        }
}
