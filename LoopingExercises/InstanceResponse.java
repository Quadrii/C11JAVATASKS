import java.util.Scanner;
public class InstanceResponse {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for english");
        System.out.println("Enter 2 for Igbo");
        System.out.println("Enter 3 for french");
        System.out.println("Enter 4 for yoruba");
        int language = input.nextInt();

        switch (language){
            case 1:
                System.out.println("Enter 1 for data: ");
                System.out.println("Enter 2 for transfer: ");
                System.out.println("press 0 to go back");
                int english = input.nextInt();
                switch (english){
                    case 1:
                        System.out.println("data");
                        break;
                    case 2: System.out.println("transfer");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter 1 for sharing: ");
                System.out.println("Enter 2 for caring: ");
                int igbo = input.nextInt();
                switch (igbo){
                    case 1:
                        System.out.println("sharing");
                        break;
                    case 2:
                        System.out.println("caring");
                        break;
                }
                break;
            case 3:
                System.out.println("Enter 1 for egg: ");
                System.out.println("Enter 2 for vodka: ");
                int french = input.nextInt();
                switch (french){
                    case 1:
                        System.out.println("egg");
                        break;
                    case 2:
                        System.out.println("vodka");
                        break;
                }
                break;
            case 4:
                System.out.println("Enter 1 for ewa: ");
                System.out.println("Enter 2 for goyin: ");
                int yoruba = input.nextInt();
                switch (yoruba){
                    case 1:
                        System.out.println("ewa");
                        break;
                    case 2:
                        System.out.println("goyin");
                        break;
                }
                break;
        }
    }
}
