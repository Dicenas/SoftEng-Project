package SYSC4806;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class JPATest {

    public void performJPA() {
        BuddyInfo buddy1 = new BuddyInfo("Tom", "123 Navan", "613-555-5555");
        buddy1.setId(1);

        BuddyInfo buddy2 = new BuddyInfo("Cristy", "321 Bronson", "416-555-5555");
        buddy2.setId(2);


        AddressBook addressBook = new AddressBook();
        addressBook.setId(1);
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(addressBook);

        tx.commit();

        Query q = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unchecked")
        List<AddressBook> results = q.getResultList();

        System.out.println("List of AddressBooks\n----------------");

        for (AddressBook a : results) {
            System.out.println("AddressBook ID: " + a.getId());
            System.out.println("Buddies:");
            for (BuddyInfo b : a.getBuddies()) {
                System.out.println("- " + b.getBuddyInfo() + " (ID=" + b.getId() + ")");
            }
        }


        em.close();
        emf.close();
    }

    public static void main(String[] args) {
        JPATest test = new JPATest();
        test.performJPA();
    }
}
