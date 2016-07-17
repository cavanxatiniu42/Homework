import java.util.ArrayList;

public class PhoneEntry {
    private String name;
    private ArrayList<String> phoneNumber = new ArrayList();
    public PhoneEntry(){

    }
    public PhoneEntry(String name, String number){
        this.name = name;
        this.phoneNumber.add(number);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber.add(phoneNumber);
    }
    public void setNumber(String number){

    }
    public String getPhoneNumber(){
        String number = " ";
        for (int i = 0; i <phoneNumber.size() ; i++) {
            number = number + phoneNumber.get(i).toString()+ ",";
        }
        return number;
    }
    public String toString (){
        return name+ ": "+phoneNumber.toString();
    }

}
