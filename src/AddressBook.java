import java.util.ArrayList;
import java.util.List;
public class AddressBook {
    private List<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyList.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo buddy2 = new BuddyInfo("Rola", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        addressBook.addBuddy(buddy2);
        addressBook.removeBuddy(buddy2);
        
    }
}
