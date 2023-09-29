import java.util.ArrayList;
public class AddressBook {

    ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            buddies.add(buddy);
        }
    }
    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddyTom = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyTom);

        BuddyInfo buddyTodd = new BuddyInfo("Todd", "Toronto", 416);
        addressBook.addBuddy(buddyTodd);

        BuddyInfo buddyTed = new BuddyInfo("Ted", "Montreal", 514);
        addressBook.addBuddy(buddyTed);

        addressBook.removeBuddy(2);
        addressBook.removeBuddy(1);
        addressBook.removeBuddy(0);      
    }
}
