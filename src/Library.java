import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/13/12
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    public void dispose(){
        Scanner sc = new Scanner(System.in);
        int menuNum = sc.nextInt();
        if(menuNum == 3){
            System.out.print("Please talk to the librarian.");
        }

    }
}
