public class PhoneBook {

    private int numberOfEntries;
    public PhoneEntry[] phoneEntries;

    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;
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
        }
        return false;
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
       if(isDuplicateName(entryName)){
           for(int i=0; i<phoneEntries.length;i++){
               if(entryName.equals(phoneEntries[i].getName())){
                   for(int j =i; j<phoneEntries.length-1;j++){
                       phoneEntries[i]=phoneEntries[i+1];
                   }

               }
               numberOfEntries--;
               return true;
           }
       } return false;
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
