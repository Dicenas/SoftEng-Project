package SYSC4806;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;

/**
 * This class represents an AddressBook which stores a list of BuddyInfo objects.
 *
 * @author Daniel Godfrey 101156147
 */
@Entity
public class AddressBook {
    @Id
    private Integer id = null;

    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index) {

        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public void printBuddies() {
        for (BuddyInfo buddy : myBuddies) {
            System.out.println(buddy.getBuddyInfo());
        }
    }

    public ArrayList<BuddyInfo> getBuddies() {
        return myBuddies;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Tom", "123 Navan", "613-555-5555");
        BuddyInfo buddy2 = new BuddyInfo("Cristy", "321 Bronson", "416-555-5555");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        addressBook.printBuddies();
    }
}