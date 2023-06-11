import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Калькулятор---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        while (!scanner.hasNextInt()){
            System.out.println("Если вы хотите завершить программу нажмите - q");
            if("q".equals(scanner.next())) {
                System.out.println("\nПрограмма закончена !");
                System.exit(0);
            }
            System.out.println("Введите число: ");
        }
        int result = scanner.nextInt();
        while (true){
            System.out.println("----------------------------------");
            System.out.println("Если вы хотите завершить программу нажмите - q");
            System.out.println("Введите арифметическую операцию:");
            System.out.println("+ или - или * или / ");
            String airthmeticOperation = scanner.next();
            if(("q".equals(airthmeticOperation))) {
                System.out.println("\nПрограмма закончена !");
                System.out.println("Окончательный результат = " + result);
                break;
            }
            System.out.println("Введите число:");

            while (!scanner.hasNextInt()){
                System.out.println("Если вы хотите завершить программу нажмите - q");
                System.out.println("Введите число: ");
                if("q".equals(scanner.next())) {
                    System.out.println("\nПрограмма закончена !");
                    System.out.println("Окончательный результат = " + result);
                    System.exit(0);
                }
            }
            int number = scanner.nextInt();
            if(("q".equals(number))) {
                System.out.println("\nПрограмма закончена !");
                System.out.println("Окончательный результат = " + result);
                break;
            }
            switch (airthmeticOperation) {
                case "+": {
                    result += number;
                    break;
                }
                case "-": {
                    result -= number;
                    break;
                }
                case  "*": {
                    result *= number;
                    break;
                }
                case "/": {
                    if(number == 0) {
                        System.out.println("На ноль делить нельзя");
                        continue;
                    }
                    else {
                        result /= number;
                        break;
                    }
                }
                default: {
                    System.out.println("-----------------------------------------");
                    System.out.println("Неизвестная операция " + airthmeticOperation);
                    System.out.println("Если вы хотите завершить программу нажмите - q");
                }
            }
            System.out.println("Текущий результат = " + result);
        }
    }
}