package Collection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nums n = new Nums();
        int operation;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Текущий список: " + n.toString() + "\n");
            if (n.size() != 0) {
                System.out.println("Меню: \n" +
                        "1. Добавить число\n" +
                        "2. Удалить число\n" +
                        "3. Поиск приближенного числа\n" +
                        "4. Выход\n" +
                        "Выбор: ");
                operation = sc.nextInt();
            }
            else {
                System.out.println("Меню: \n" +
                        "1. Добавить число\n" +
                        "2. Выход\n" +
                        "Выбор: ");
                operation = sc.nextInt();
                if (operation != 1 && operation != 2)
                    operation = 0;
                if (operation == 2)
                    operation = 4;
            }
            switch (operation){
                case 1: {
                    int t;
                    System.out.println("Число: ");
                    t = sc.nextInt();
                    n.addNum(t);
                    System.out.println("Добавлено\n");
                    break;
                }
                case 2:{
                    int t;
                    System.out.println("Число: ");
                    t = sc.nextInt();
                    if (n.delNum(t))
                        System.out.println("Удалено\n");
                    else
                        System.out.println("Число не найдено!\n");
                    break;
                }
                case 3:{
                    int t;
                    System.out.println("Число: ");
                    t = sc.nextInt();
                    t = n.search(t);
                    System.out.println("Результат: " + t + "\n");
                    break;
                }
                case 4:
                    break;
                default:
                    System.out.println("Неверный номер операции!\n");
            }
        }
        while (operation != 4);
    }
}
