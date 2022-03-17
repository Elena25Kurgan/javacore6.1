import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testPhoneBook {
    static final String family = "Семья";
    static final String friends = "Друзья";
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testGetNumber() {
        // given:
        Contact doctor = new Contact("Васильев Иван", "+7(999)7684576");
        Contact teacher  = new Contact("Петрова Маша", "+7(961)5496218");

        phoneBook.add(family, doctor);
        phoneBook.add(friends, doctor);
        phoneBook.add(family, teacher);

        System.out.println(phoneBook);

        // when:
        String getNum = "+7(999)7684576";
        Contact cont1 = phoneBook.getNumber(getNum);

        // then:
        Assertions.assertEquals(doctor, cont1);
        Assertions.assertNotEquals(teacher, cont1);

        Assertions.assertNull(phoneBook.getNumber("+7(999)7896534"));
    }

    @Test
    public void testAdd() {
        int beforeNumContacts = phoneBook.numContacts();
        Contact friend   = new Contact("Сидорова Маша", "+7(934)8426159");
        phoneBook.add(friends,friend);
        int numContacts = phoneBook.numContacts();
        Assertions.assertEquals(numContacts, beforeNumContacts+1);
    }
}
