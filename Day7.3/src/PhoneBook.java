import java.util.ArrayList;

public class PhoneBook {
    public ArrayList<PhoneEntry> phoneEntries = new ArrayList();
    public ArrayList<String> phoneNumber = new ArrayList();

    public boolean addEntries(PhoneEntry entry){
        if (!isDuplicateName(entry.getName()) && !isDuplicateNumber(entry.getPhoneNumberString())){
            phoneEntries.add(entry);
            return true;
        }
        return false;
    }
    public boolean addNumber(String entryName, String number){
        if (isDuplicateName(entryName)){
            for (int i = 0; i <phoneEntries.size() ; i++) {
                if (entryName.equals(phoneEntries.get(i).getName())){
                    phoneEntries.get(i).setPhoneNumber(number);
                }
            }
            return true;
        }
        return false;
    }

    public boolean modifyEntryName(String oldName, String newName){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (oldName.equals(phoneEntries.get(i).getName())){
                phoneEntries.get(i).setName(newName);
                return true;
            }
        }
        return false;
    }
    public boolean modifyNumber (String entryName, String oldNumber, String newNumber){
        if (isDuplicateName(entryName)) {
            PhoneEntry entry = findEntryByName(entryName);
            int index = entry.getPhoneNumber().indexOf(oldNumber);
                entry.getPhoneNumber().set(index,newNumber);
            return true;
        }
      return false;
    }
    public boolean deleteEntries (String entryName){
        if (isDuplicateName(entryName)){
            for (int i = 0; i <phoneEntries.size() ; i++) {
                if (entryName.equals(phoneEntries.get(i).getName())){
                    phoneEntries.remove(phoneEntries.get(i));
                    return true;
                }
            }
        }
        return false;
    }
    public PhoneEntry findEntryByName (String entryName){
        if (isDuplicateName(entryName)){
            for (int i = 0; i <phoneEntries.size() ; i++) {
                if (entryName.equals(phoneEntries.get(i).getName())){
                    return phoneEntries.get(i);
                }
            }
        }
        return null;
    }
    public PhoneEntry findEntryByNumber (String entryNumber){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (phoneEntries.get(i).getPhoneNumberString().contains(entryNumber))
                return phoneEntries.get(i);
        }
        return null;
    }
    public String toString(){
        String result = " ";
        for (int i = 0; i <phoneEntries.size() ; i++) {
            result = result + phoneEntries.get(i).toString()+"\r\n";
        }
        return result;
    }
    private boolean isDuplicateName (String entryName){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            if (entryName.equals(phoneEntries.get(i).getName())){
        //        System.out.println("hi");
                return true;
            }
        }
        return false;
    }

    private boolean isDuplicateNumber (String entryNumber){
        for (int i = 0; i <phoneEntries.size() ; i++) {
            for (int j = 0; j <phoneEntries.get(i).getPhoneNumber().size() ; j++) {
                if (entryNumber.equals(phoneEntries.get(i).getPhoneNumber().get(i))){
                    return true;
                }
            }
        }

        return false;
    }

}

