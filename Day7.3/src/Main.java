import java.util.Scanner;

public class Main {
    private static PhoneBook phoneBook = new PhoneBook();
    private static PhoneEntry phoneEntry = new PhoneEntry();
    //private static PhoneEntry newPhoneEntry = new PhoneEntry(String name, String number);
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Add contact");
            System.out.println("2. Add phone number into a contact");
            System.out.println("3. Edit name");
            System.out.println("4. Edit number");
            System.out.println("5. Find by Name");
            System.out.println("6. Find by number");
            System.out.println("7. Delete contact");
            System.out.println("8. Show all contact");
            System.out.println("9. Exit");
            switch (option = input.nextInt()){
                case 1:
                    input.nextLine();
                    System.out.println("Input name of contact: ");
                    String name = input.nextLine();
                    System.out.println("Input number: ");
                    String number = input.nextLine();
                    PhoneEntry newPhoneEntry = new PhoneEntry( name, number);
                    if (phoneBook.addEntries(newPhoneEntry)){
                        System.out.println("successful");
                    } else {
                        System.out.println("failed");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Input name of contact: ");
                    String addedName = input.nextLine();
                    System.out.println("Input number: ");
                    String addNumber = input.nextLine();
                    if (phoneBook.addNumber(addedName,addNumber)){
                        System.out.println("successful");
                    }else {
                        System.out.println("fail");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Input old name:");
                    String oldName = input.nextLine();
                    System.out.println("Input new name:");
                    String newName = input.nextLine();
                    if (phoneBook.modifyEntryName(oldName,newName)){
                        System.out.println("successful");
                    }else {
                        System.out.println("fail");
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Input contact name:");
                    String entryName = input.nextLine();
                    System.out.println("Input old number: ");
                    String oldNumber = input.nextLine();
                    System.out.println("Input new number");
                    String newNumber = input.nextLine();
                    if (phoneBook.modifyNumber(entryName, oldNumber, newNumber)){
                        System.out.println("successful");
                    }else {
                        System.out.println("fail");
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Input contact name:");
                    String foundName = input.nextLine();
                    System.out.println(phoneBook.findEntryByName(foundName));
                    break;
                case 6:
                    input.nextLine();
                    System.out.println("Input number:");
                    String foundNumber = input.nextLine();
                    System.out.println(phoneBook.findEntryByNumber(foundNumber));
                    break;
                case 7:
                    input.nextLine();
                    System.out.println("Input contact name:");
                    String deleteName = input.nextLine();
                    if (phoneBook.deleteEntries(deleteName)){
                        System.out.println("successful");
                    } else {
                        System.out.println("fail");
                    }

                case 8:
                    System.out.println(phoneBook.toString());
                    break;

            }
        } while (option != 9);
    }
}
