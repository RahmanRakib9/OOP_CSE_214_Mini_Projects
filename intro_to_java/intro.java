import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter userName");
        String userName = myObj.nextLine();

        System.out.println("Enter Id");
        int id = myObj.nextInt();

        System.out.println("userName is "+ userName);
        System.out.println("id is "+id);

    }
}
