// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package work2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class work2 {
    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<>();
            for (int i = 0; i < 10; i++){
            int ranNum = ThreadLocalRandom.current().nextInt(0, 20);
            list1.add(ranNum);
            }  
            System.out.println(list1);

            Scanner sc = new Scanner(System.in);
            System.out.println("Ввод номера элемента:");
            enqueue(list1, sc.nextInt());
            System.out.println(list1); // - помещает элемент в конец очереди
            System.out.println(dequeue(list1)); // - возвращает первый элемент из очереди и удаляет его
            System.out.println(list1);
            System.out.println(first(list1)); // - возвращает первый элемент из очереди, не удаляя
            System.out.println(list1);
            sc.close();
        }
        public static void enqueue(LinkedList<Integer> list1, int element){
            list1.add(element);
        }
        public static int dequeue(LinkedList<Integer> list1){
            int num = list1.getFirst();
            list1.removeFirst();
            return num;

        }
        public static int first(LinkedList<Integer> list1){
            return list1.getFirst();
        }
}

