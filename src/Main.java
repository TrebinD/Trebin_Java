import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        try {
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                System.out.println("Введите число: ");
                try {
                    int number = sc.nextInt();
                    while (number != 0) {
                        System.out.println(number > 7 ? "Привет" : "(");
                        System.out.println("Введите следующее число или 0 для выхода: ");
                        number = sc.nextInt();
                    }
                } catch (InputMismatchException o) {
                    System.out.println("Вы ввели не число:( ");
                }
            } else if (num == 2) {
                System.out.println("Введите ваше имя: ");
                String name = sc.nextLine().strip();
                System.out.println(name.equals("Вячеслав") ? "Привет, " + name : "Нет такого имени");
            } else if (num == 3) {
                System.out.println("Введите числа через пробел: ");
                String[] number = sc.nextLine().split(" ");
                sc.close();
                if (number.length > 0) {
                    System.out.print("Числа кратные 3: ");
                    for (var i : number) {
                        try {
                            if (Integer.parseInt(i) % 3 == 0) {
                                System.out.print(i + " ");
                            }
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                } else {
                    System.out.println("Вы ничего не ввели :(");
                }
            }else{
                System.out.println("Такого задания я не делал :(");
            }
            sc.close();
        }catch (InputMismatchException o){
            sc.close();
            System.out.println("Вы ввели не число :(");
        }
        System.out.println("Спасибо!!! До встречи...");
    }
}
