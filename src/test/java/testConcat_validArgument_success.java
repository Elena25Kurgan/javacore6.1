import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testConcat_validArgument_success {
    static final String family = "Семья";
    static final String friends = "Друзья";

    @Test
    public void testConcat_validArgument_success() {
        // given:
        Contact doctor = new Contact("Васильев Иван", "+7(999)7684576");
        Contact teacher  = new Contact("Петрова Маша", "+7(961)5496218");

        PhoneBook phoneBook = new PhoneBook();
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
}
