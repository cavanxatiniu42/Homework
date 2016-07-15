import java.util.Scanner;

public class Main {
   // private static PhoneEntry phoneEntry = new PhoneEntry();
    private static PhoneBook phoneBook = new PhoneBook();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Add an contact");
            System.out.println("2. Edit name");
            System.out.println("3. Edit number");
            System.out.println("4. Find by name");
            System.out.println("5. Find by number");
            System.out.println("6. Delete contact");
            System.out.println("7. Show phone book");
            System.out.println("8. Exit");
            switch (option = sc.nextInt()){
                case 1:

                    sc.nextLine();
                    System.out.println("Input name of contact");
                    String name = sc.nextLine();
                   // phoneEntry.setName(name);
                    System.out.println("Input number of contact");
                    String phoneNumber = sc.nextLine();
                   // phoneEntry.setPhoneNumber(phoneNumber);
                    PhoneEntry newPhoneEntry = new PhoneEntry(name, phoneNumber);
                    if (phoneBook.addEntry(newPhoneEntry)){
                        System.out.println("Successful");
                    } else {
                        System.out.println("Failed");
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Input name want to edit: ");
                    String oldName = sc.nextLine();
                    System.out.println("Input new name: ");
                    String newName = sc.nextLine();
                    if (phoneBook.modifyEntryName(oldName, newName)){
                        System.out.println("Successful");
                        System.out.println(phoneBook.toString());
                    }
                    else {
                        System.out.println("failed");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Input name want to edit number: ");
                    String entryName = sc.nextLine();
                    System.out.println("Input new number: ");
                    String newNumber = sc.nextLine();
                    if (phoneBook.modifyEntryNumber(entryName, newNumber)){
                        System.out.println("Successful");
                        System.out.println(phoneBook.toString());
                    }
                    else {
                        System.out.println("failed");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Find number by name: ");
                    String foundName = sc.nextLine();
                    System.out.println(phoneBook.findEntryByName(foundName));
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Find contact by number: ");
                    String foundNumber = sc.nextLine();
                    System.out.println(phoneBook.findEntryByNumber(foundNumber));
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Delete contact: ");
                    String deleteName = sc.nextLine();
                    if (phoneBook.deleteEntry(deleteName)){
                        System.out.println("successful");
                    }else {
                        System.out.println("failed");
                    }
                    break;
                case 7:
                    System.out.println(phoneBook.toString());
                    break;
            }
        } while (option != 8);
    }
}
