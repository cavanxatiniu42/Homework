
public class PhoneEntry {
    private String name;
    private String phoneNumber;

    public PhoneEntry(){}

    public PhoneEntry(String name, String phoneNumber){
       // PhoneEntry = new PhoneEntry(String ) // Ờ, vậy là thiếu r, thêm vào xem
        this.name = name;
        this.phoneNumber = phoneNumber;
        //như này à ừ ok

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber (){
        return phoneNumber;
    }
    public String toString(){
        return name +": "+ phoneNumber;
    }

}
