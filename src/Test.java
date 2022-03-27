import inter.Librarian;

public class Test {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Арнат", new Book("Властелин морей"));
        Person2 person2 = new Person2("Саржан", new Book("Игра престолов"));
        User person3 = new Person2("Лидия", new Book("Абай жолы"));

        person1.getBooks(person2);
        person2.overdueNotification(person1);
        person1.bringBooks(person2);
        person2.findBook(person1);
    }
}
