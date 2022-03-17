import java.util.*;

public class PhoneBook {
    private List<Contact> contacts;
    private Map<String, List<Contact>> group;

    public PhoneBook() {
        this.contacts = new ArrayList();
        group = new HashMap<>();
    }

    public int numContacts () {
        return contacts.size();
    }

    public void add(String nameGroup, Contact contact) {
        contacts.add(contact);
        List<Contact> groupContacts = group.get(nameGroup);
        if (groupContacts == null) {
            groupContacts = new ArrayList<>();
        }
        groupContacts.add(contact);
        group.put(nameGroup,groupContacts);
    }

    public Contact getNumber(String number) {
        for (String nameGroup: group.keySet()) {
            List<Contact> listContacts = group.get(nameGroup);
            for (Contact contact : listContacts) {
                if (contact.getNumberTel().equals(number)) {
                    return contact;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String rez = "Телефонная книга: ";
        for (String nameGroup: group.keySet()) {
            List<Contact> listContacts = group.get(nameGroup);
            rez += System.lineSeparator() + nameGroup + ":";
            for (Contact contact : listContacts) {
                rez += contact;
            }
        }
        return rez;
    }
}
