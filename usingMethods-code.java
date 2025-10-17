import java.util.Scanner;
class Main {
    public static double sum(double a, double b){
        return(a+b);
    }
    public static double difference(double a, double b){
        return(a-b);
    }
    public static double product(double a, double b){
        return(a*b);
    }
    public static double quotient(double a, double b){
        return(a/b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, result;
        int choice;
        String again;
  
        do{
            System.out.println("-------------------------");
            System.out.println("    SIMPLE CALCULATOR    ");
            System.out.println("-------------------------");
            System.out.print("Enter first number: ");
            a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            b = scanner.nextDouble();
            
            System.out.println("\n==== SELECT OPERATION ===");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. DIVIDE");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            switch (choice){
                case 1:
                    result = sum(a,b);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = difference(a,b);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = product(a,b);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = quotient(a,b);
                    System.out.println("Result: " + result);
                    break;
                default: 
                    System.out.println("[ERROR] Invalid operation");
                    break;
            }
            
            System.out.print("\nDo you want to continue? (yes/no): ");
            again = scanner.nextLine();
            System.out.println();
        } while (again.equals("yes") || again.equals("YES"));
        
        System.out.println("--- Exit Program ---");
        scanner.close();
        } 
}
