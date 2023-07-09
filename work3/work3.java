// В калькулятор добавьте возможность отменить последнюю операцию.

package work3;

import java.util.LinkedList;
import java.util.Scanner;


public class work3 {
    public static void main(String[] args) {
        System.out.printf ("Для отмены последней операции, введите: 'Отмена'" + ". " + "Для выхода из приложения введите: 'Стоп'");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> results = new LinkedList<>();
        int a;
        int b;
        String zn;
        boolean firts_or_not = true;
        while(true){
            if (firts_or_not==true){
                System.out.print("Введите 1 число ->");
                System.out.println();
                a = sc.nextInt();
                sc.nextLine();
                firts_or_not = false;
            }
            else {
                a = results.getLast();
            }
            System.out.print("Введите знак ->");
            System.out.println();
            zn = sc.nextLine();
            if(zn.equals("Отмена")){
                results.removeLast();
                System.out.println(results.getLast());
                System.out.println();
                if(results.size()==0) firts_or_not=true;
                continue;
            }
            if(zn.equals("Стоп")) break;
            System.out.print("Введите 2 число ->");
            System.out.println();
            b = sc.nextInt();
            sc.nextLine();
            if (zn.equals("+")) {  
                System.out.printf("%d %s %d = %d \n", a, "+", b, a + b);
                results.add(a+b);
            }
            else if (zn.equals("-")){
                System.out.printf("%d %s %d = %d \n", a, "-", b, a - b);   
                results.add(a-b);
            }
            else if (zn.equals("*")) {
                System.out.printf("%d %s %d = %d \n", a, "*", b, a * b);
                results.add(a*b);
            }
            else if (zn.equals("/")) {
                System.out.printf("%d %s %d = %d \n", a, "/", b, a / b);
                results.add(a/b);
            }
        }
        sc.close();
    }
}
