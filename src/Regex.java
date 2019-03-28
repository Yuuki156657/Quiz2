import java.util.Scanner;

    public class Regex {

        public static void main(String[] args) {


            // 1. username
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your Username: ");
            String Username = in.nextLine();

            if (Username.matches("^[A-Za-z0-9_].{4}|" +
                    "^[A-Za-z0-9_].{5}|^[A-Za-z0-9_].{6}|^[A-Za-z0-9_].{7}|" +
                    "^[A-Za-z0-9_].{8}|^[A-Za-z0-9_].{9}|^[A-Za-z0-9_].{10}|" +
                    "^[A-Za-z0-9_].{11}|^[A-Za-z0-9_].{12}|^[A-Za-z0-9_].{13}|" +
                    "^[A-Za-z0-9_].{14}|^[A-Za-z0-9_].{15}|^[A-Za-z0-9_].{16}|" +
                    "^[A-Za-z0-9_].{17}|^[A-Za-z0-9_].{18}|^[A-Za-z0-9_].{19}")) {

                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

            // 2. Email
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter your Email: ");
            String Email = in2.nextLine();

            if (Email.matches("^[A-Za-z0-9.-]+@[A-Za-z0-9]+.[a-z]{2}$|" +
                    "[A-Za-z0-9.-]+@[A-Za-z0-9]+.[a-z]{3}$|" +
                    "[A-Za-z0-9.-]+@[A-Za-z0-9]+.[a-z]{4}$")) {
                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

            // 3. Names (first, last)
            Scanner in3 = new Scanner(System.in);
            System.out.println("Enter your first name: ");
            String fnames = in3.nextLine();

            if (fnames.matches("^[A-Z][a-z]+")) {
                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

            Scanner in4 = new Scanner(System.in);
            System.out.println("Enter your last name: ");
            String lnames = in4.nextLine();

            if (lnames.matches("^[A-Z][a-z]+")) {
                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

            // 4. postal code
            Scanner in5 = new Scanner(System.in);
            System.out.println("Enter your Postal Code: ");
            String post = in5.nextLine();

            if (post.matches("^[A-Z0-9]{3}\\s[A-Z0-9]{3}")) {
                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

            // 5. Phone
            Scanner in6 = new Scanner(System.in);
            System.out.println("Enter your phone number: ");
            String phone = in6.nextLine();

            if (phone.matches("\\d?\\d?( |-)?\\(?\\d{3}\\)?( |-)" +
                    "[A-Z]{7}|\\d?\\d?( |-)?\\(?\\d{3}\\)?( |-)\\d{3}( |-)" +
                    "\\d{4}")) {
                System.out.println("Success!");
            }else{
                System.out.println("Failed to register!");
            }

        }
    }