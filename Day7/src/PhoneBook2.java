import java.util.ArrayList;

/**
 * Created by Thu Thuy Nguyen on 7/16/2016.
 */
public class PhoneBook2 {
    private int numberOfEntries;
    public ArrayList<PhoneEntry> phoneEntries = new ArrayList<PhoneEntry>();
    public int getNumberOfEntries() {
        return numberOfEntries;
    }
    public boolean addEntries(PhoneEntry entry){
        if (!isDuplicateName(entry.getName()) && !isDuplicateNumber(entry.getPhoneNumber())){
            phoneEntries.add(entry);
            numberOfEntries++;
            return true;
        }
        return false;
    }
    public boolean modifyEntryName (String oldName, String newName){
            for (int i = 0; i <phoneEntries.size() ; i++) {
                if (oldName.equals(phoneEntries.get(i).getName())) {
                    phoneEntries.get(i).setName(newName);
                    return true;
                }
            }
        return false;
    }
    public boolean modifyNumber (String entryName, String phoneNumber){
            for (int i= 0; i< phoneEntries.size(); i++){
                if (entryName.equals(phoneEntries.get(i).getPhoneNumber())){
                    phoneEntries.get(i).setPhoneNumber(phoneNumber);
                    return true;
                }
            }
        return false;
    }
    public boolean deleteEntry (String entryName){
        if (isDuplicateName(entryName)){
            for (int i = 0; i <phoneEntries.size() ; i++) {
                if (entryName.equals(phoneEntries.get(i).getName())){
                    phoneEntries.remove(phoneEntries.get(i));
                }
            }
            return true;
            }
        return false;
        }

    public PhoneEntry findEntryByName (String entryName){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (phoneEntries.get(i).getName().equals(entryName)) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }
    public PhoneEntry findEntryByNumber (String entryNumber){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (phoneEntries.get(i).getPhoneNumber().equals(entryNumber)){
                return phoneEntries.get(i);
            }
        }
        return null;
    }
    public String toString(){
        String result = "";
        for (int i = 0; i<phoneEntries.size();i++){
            if (!phoneEntries.get(i).equals(null))
            result = result +phoneEntries.get(i)+ "\r\n";
        }
        return result;
    }
    private boolean isDuplicateName(String entryName){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (entryName.equals(phoneEntries.get(i).getName())){
                return true;
            }
        }
        return false;
    }
    private boolean isDuplicateNumber(String entryNumber){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (entryNumber.equals(phoneEntries.get(i).getPhoneNumber())){
                return true;
            }
        }
        return false;
    }
}
