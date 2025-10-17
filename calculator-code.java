import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum, secondNum;
        char operation, loop;
        
        do{
        System.out.println("-------------------------");
        System.out.println("    Simple Calculator");
        System.out.println("-------------------------");
        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();
        System.out.print("Choose an operation [+, -, *, /]: ");
        operation = scanner.next().charAt(0);
        System.out.println("-------------------------");
            
        switch (operation){
            case '+': 
                double sum = firstNum+secondNum;
                System.out.printf("Sum: %.2f\n", sum);
                break;
            case '-':
                double difference = firstNum-secondNum;
                System.out.printf("Difference: %.2f\n", difference);
                break;
            case '*':
                double product = firstNum*secondNum;
                System.out.printf("product: %.2f\n", product);
                break;
            case '/':
                double quotient = firstNum/secondNum;
                System.out.printf("Quotient: %.2f\n", quotient);
                break;
        }
        System.out.println("-------------------------");
        System.out.print("Do you want to continue [y/n]; ");
        loop = scanner.next().charAt(0);
        if(loop == 'y' || loop == 'Y'){
            System.out.println();
        }
        } while (loop != 'n' && loop != 'N');
        
        scanner.close();
    }
}
