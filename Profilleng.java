import java.util.Scanner;

public class UpgradeProfile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profilesCount = 0;
        String[] names = new String[100];
        String[] address;
        address = new String[100];
        String[] gender = new String[100];
        String[] email = new String[100];
        String[] password = new String[100];
        String[] civilStatus = {"Single", "Married", "Divorced", "Widow"};
        int[] age = new int[100];
        int deductor = 100;
        int ctr = 100;


        boolean profiling = true;
        while (profiling) {
            System.out.println("\n");
            System.out.println("1. Create Profile");
            System.out.println("2. Search Profile");
            System.out.println("3. Show all Profiles");
            System.out.println("4. Exit");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("There are still " + ctr + " null profiles remaining.");
                    if (ctr == 0) {
                        System.out.println("Sorry");
                        continue;
                    }
                    if (deductor == 0) {
                        System.out.println("Ooops profiles limit reached ");
                        continue;
                    }
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    names[names.length - deductor] = sc.nextLine();
                    System.out.print("Enter Address: ");
                    address[names.length - deductor] = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    gender[names.length - deductor] = sc.nextLine();
                    System.out.print("Enter Email: ");
                    email[names.length - deductor] = sc.nextLine();
                    System.out.print("Enter Password: ");
                    password[names.length - deductor] = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age[names.length - deductor] = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Select Civil Status:");
                    System.out.print("Single ");
                    System.out.print("| Married ");
                    System.out.print("| Divorce ");
                    System.out.println("| Widow ");
                    civilStatus[names.length - deductor] = sc.nextLine();
                    if (civilStatus[names.length - deductor].equalsIgnoreCase("Single")) {
                        System.out.println("You are " + civilStatus[0]);
                    } else if (civilStatus[names.length - deductor].equalsIgnoreCase("Married")) {
                        System.out.println("You are " + civilStatus[1]);
                    } else if (civilStatus[names.length - deductor].equalsIgnoreCase("Divorced")) {
                        System.out.println("You are " + civilStatus[2]);
                    } else if (civilStatus[names.length - deductor].equalsIgnoreCase("Widow")) {
                        System.out.println("You are " + civilStatus[3]);
                    } else {
                        System.err.println("Invalid Input");
                        System.exit(0);
                    }
                    profilesCount++;
                    deductor--;
                    ctr--;
                    break;
                case 2:
                    /*System.out.println("-------------------");
                    //Print Profile
                    System.out.println("There are "+profilesCount+" select from 0 to "+(profilesCount-1)+".");
                    int search= sc.nextInt();
                    
                    System.out.println("Name: " + names[search]);
                    System.out.println("Address: " + address[search]);
                    System.out.println("Gender: " + gender[search]);
                    System.out.println("Email: " + email[search]);
                    System.out.println("Password: " + password[search]);
                    System.out.println("Age: " + age[search]);
                    System.out.println("Civil Status:  "+ civilStatus[search]);*/

                    System.out.println("Search profiles using name");
                    System.out.println("Enter a name");
                    String searchName = sc.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        if (searchName.equals(names[i])) {
                            System.out.println("Name: " + names[i]);
                            System.out.println("Address: " + address[i]);
                            System.out.println("Gender: " + gender[i]);
                            System.out.println("Email: " + email[i]);
                            System.out.println("Password: " + password[i]);
                            System.out.println("Age: " + age[i]);
                            System.out.println("Civil Status: " + civilStatus[i]);
                            System.out.println("\n");

                        } else {
                            System.out.println("Profile Not Found!");
                        }

                    }
                    break;
                case 3:
                    for (int j = 0; j < names.length - deductor; j++) {

                        System.out.println("Profile No. " + j + "\n");

                        System.out.println("Name: " + names[j]);
                        System.out.println("Address: " + address[j]);
                        System.out.println("Gender: " + gender[j]);
                        System.out.println("Email: " + email[j]);
                        System.out.println("Password: " + password[j]);
                        System.out.println("Age: " + age[j]);
                        System.out.println("Civil Status: " + civilStatus[j]);
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }
}