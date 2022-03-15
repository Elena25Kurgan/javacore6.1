public class Main {
    static final String family = "Семья";
    static final String friends = "Друзья";
    static final String colleagues = "Коллеги";

    public static void main(String[] args) {
        Contact doctor = new Contact("Васильев Иван", "+7(999)7684576");
        Contact teacher  = new Contact("Петрова Маша", "+7(961)5496218");
        Contact specialist  = new Contact("Иванов Николай", "+7(992)5912367");
        Contact brother  = new Contact("Андреев Петр", "+7(967)8523462");
        Contact friend   = new Contact("Сидорова Маша", "+7(934)8426159");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(family, doctor);
        phoneBook.add(friends, doctor);
        phoneBook.add(family, teacher);
        phoneBook.add(colleagues,specialist);
        phoneBook.add(friends,specialist);
        phoneBook.add(friends,brother);
        phoneBook.add(colleagues, friend);

        System.out.println(phoneBook);

        System.out.print("Контакт с номером +7(992)5912367:");
        System.out.println(phoneBook.getNumber("+7(992)5912367"));
    }
}