import java.util.Scanner;

public class PhoneBook {

    private int numberOfEntries;
    public PhoneEntry[] phoneEntries;
    public Scanner sc = new Scanner(System.in);

    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;//ơ sao chỗ này chỗ này   à n k có trong bài hsao ấy, Thì bài nó có bắt cậu in ra số phần tử đâu, đây là cậu muốn tées thì thêm vào thôi
        // hey xong n trả về 1 phần tử r nhá, mà cái show phone book n vẫn k có gì n
    }

    public PhoneBook() {
        phoneEntries = new PhoneEntry[numberOfEntries];
    }

    public int getNumberOfEntry() {
        return numberOfEntries;
    }

    public boolean addEntry(PhoneEntry entry) {

        if (!isDuplicateName(entry.getName()) && !isDuplicatePhoneNumber(entry.getPhoneNumber())) {
            PhoneEntry[] newPhoneEntries = new PhoneEntry[phoneEntries.length + 1];
            for (int i=0; i<phoneEntries.length;i++){
                newPhoneEntries[i]=phoneEntries[i];
            }
            newPhoneEntries[phoneEntries.length] = entry;
            numberOfEntries++;
            phoneEntries =newPhoneEntries; //
            return true;
        } else {
            return false;
        }
    }
    public boolean modifyEntryName (String oldName, String newName){
        for (int i = 0; i<phoneEntries.length;i++){
            if (oldName.equals(phoneEntries[i].getName())){
                phoneEntries[i].setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean modifyEntryNumber (String entryName, String newNumber){
        for (int i = 0; i< phoneEntries.length;i++){
            if (entryName.equals(findEntryByName(entryName).getName())){
                phoneEntries[i].setPhoneNumber(newNumber);
                return true;
            }
        }
        return false;
    }
    public boolean deleteEntry(String entryName){
        int index =0;
        PhoneEntry[] newPhoneEntry = new PhoneEntry[phoneEntries.length-1];
        if (isDuplicateName(entryName)) {
            for (int i = 0; i <phoneEntries.length ; i++) {
                if (entryName.equals(phoneEntries[i].getName())){
                    index =i;
                }
            }
            for (int i= 0; i<index;i++){
                newPhoneEntry[i]=phoneEntries[i];
            }
            for (int i = index; i <phoneEntries.length-1 ; i++) {
                newPhoneEntry[i]=phoneEntries[i+1];
            }
            numberOfEntries--;
            phoneEntries=newPhoneEntry;
            return true;
//            for (int i = 0; i < phoneEntries.length; i++) {
//                if (entryName.equals(phoneEntries[i].getName())) {
//                    index = i;
//                }
//            }
//            for (int i = index+1; i <phoneEntries.length ; i++) {
//                phoneEntries[i-1]= phoneEntries[i];
//            }
//            numberOfEntries--;
//            return true;

        }
        return false;
    }
    public PhoneEntry findEntryByNumber(String entryNumber){
        for (int i=0;i<phoneEntries.length;i++){
            if (entryNumber.equals(phoneEntries[i].getPhoneNumber())){
                return phoneEntries[i];
            }
        }
        return null;
    }
    public PhoneEntry findEntryByName(String entryName){
        for (int i = 0; i<phoneEntries.length; i++){
            if (entryName.equals(phoneEntries[i].getName())){
                return phoneEntries[i];
            }
        }
        return null;
    }

    public String toString() {

        String result = "";
        for (int i = 0; i <getNumberOfEntry() ; i++) {
            if (!phoneEntries[i].equals(null)) {
                result = result + phoneEntries[i].toString() + "\r\n";
            }
        }
        return result;
    }

    public boolean isDuplicateName(String entryName) {
        for (int i = 0; i < phoneEntries.length; i++) {
            if (entryName.equals(phoneEntries[i].getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isDuplicatePhoneNumber(String entryNumber) {
        for (int i = 0; i < phoneEntries.length; i++) {
            if (entryNumber.equals(phoneEntries[i].getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }
}
