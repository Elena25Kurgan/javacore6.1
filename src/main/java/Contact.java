import java.util.*;

public class Contact {
    private final String name;
    private final String numberTel;
    public Contact(String name, String numberTel) {
        this.name = name;
        this.numberTel = numberTel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return Objects.equals(name, contact.name) && Objects.equals(numberTel, contact.numberTel);
    }

    public String getNumberTel() {
        return numberTel;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Контакт: " +
                "имя ='" + name + '\'' +
                ", номер телефона ='" + numberTel + "'";
    }
}

