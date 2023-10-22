import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class lesson4 {
    static int a;
    static int b;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Меню:");
            System.out.println("1.Сложение");
            System.out.println("2.Разность");
            System.out.println("3.Умножение");
            System.out.println("4.Делине");
            System.out.println("5.Выход из программы");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Введите первое число: ");
                    a = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    b = scanner.nextInt();
                    int c = a + b;
                    System.out.printf("%d + %d = %d\n", a, b, c);
                    break;
                case 2:
                    System.out.print("Введите первое число: ");
                    a = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    b = scanner.nextInt();
                    int d = a - b;
                    System.out.printf("%d - %d = %d\n", a, b, d);
                    break;
                case 3:
                    System.out.print("Введите первое число: ");
                    a = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    b = scanner.nextInt();
                    int r = a * b;
                    System.out.printf("%d * %d = %d\n", a, b, r);
                    break;
                case 4:
                    System.out.print("Введите первое число: ");
                    a = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    b = scanner.nextInt();
                    int q = a / b;
                    System.out.printf("%d : %d = %d\n", a, b, q);
                    break;
                case 5:
                    System.out.println("Выход");
                    break;
                    default:
                        System.out.println("Не правильный выбор, доступны выборы от 1 до 5.");


                }
                if(choose==5){
                    break;
                }

            }

        scanner.close(); }
    }
