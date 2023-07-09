// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package work5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class work5 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,-4,-7));
        work5 num = new work5();
         Deque<Integer> result = num.sum(d1, d2);
        System.out.println(result);
    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
         while (!d1.isEmpty() || !d2.isEmpty()) { 
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            result.addLast(sum % 10);
            carry = sum / 10; 
        }
        if (carry != 0) {
            result.addLast(carry);
        }
        return result;
    }
}
