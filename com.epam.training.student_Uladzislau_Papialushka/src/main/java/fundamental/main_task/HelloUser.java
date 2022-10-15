package fundamental.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main( String[] args )
{
    Scanner cons = new Scanner(System.in);
    System.out.println( "Ввидите имя :");
    String name = cons.nextLine();

    System.out.println( "Привет " + name );
    cons.close();
}
}

