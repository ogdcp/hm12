public class Main {
    public static void main(String[] args) {
        Author first = new Author("Алекандр", "Пушкин");
        Book one = new Book("Капитнская дочка", 1836, first);
        System.out.println( one.getTitleBook() +" " + one.getPublicationYear()+ " " + one.Author);
        one.setPublicationYear(1222);
        System.out.println(one.getPublicationYear());
        Author second = new Author("Лев", "Толстой");
        Book two = new Book("Кавказский пленник", 1872, second);
        System.out.println(two.getTitleBook() + " " + two.getPublicationYear() + " " + two.Author);
    }
}
