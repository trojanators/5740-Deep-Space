package main.java.com.DsClient;
import java.io.IOException;
import java.util.Scanner;

import main.java.com.DsClient.udp.client;
import main.java.com.DsClient.udp.server; 
public class Main {

    public static void main(String[] args) throws IOException  {

        Scanner in = new Scanner(System.in);

        // print menu

        for (int i = 1; i <= 5; i++)

              System.out.println(i + ". Menu item #" + i);

        System.out.println("0. Quit");

        // handle user commands

        boolean quit = false;

        int menuItem;

        do {

              System.out.print("Choose menu item: ");

              menuItem = in.nextInt();

              switch (menuItem) {

              case 1:

                    System.out.println("You've chosen item #1"); 
                server.main(args);
                    // do something...

                    break;

              case 2:

                    System.out.println("You've chosen item #2");

                    // do something...
                    client.main(args);
                    break;

              case 3:

                    System.out.println("You've chosen item #3");

                    // do something...

                    break;

              case 4:

                    System.out.println("You've chosen item #4");

                    // do something...

                    break;

              case 5:

                    System.out.println("You've chosen item #5");

                    // do something...

                    break;

              case 0:

                    quit = true;

                    break;

              default:

                    System.out.println("Invalid choice.");

              }

        } while (!quit);

        System.out.println("Bye-bye!");

  }

}