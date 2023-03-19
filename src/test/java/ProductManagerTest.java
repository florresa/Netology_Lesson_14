import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void testAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book1, book2, book3, book4, book5};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchFewBooks() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book4, book5};
        Product[] actual = manager.searchBy("Поттер");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchOneBook() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book3};
        Product[] actual = manager.searchBy("Отцы и дети");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchZeroBooks() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Властелин колец");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSmaptphones() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);
        manager.add(phone4);
        manager.add(phone5);

        Product[] expected = {phone1, phone2, phone3, phone4, phone5};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchFewSmartphones() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);
        manager.add(phone4);
        manager.add(phone5);

        Product[] expected = {phone1, phone2};
        Product[] actual = manager.searchBy("Сяоми");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchOneSmartphone() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);
        manager.add(phone4);
        manager.add(phone5);

        Product[] expected = {phone3};
        Product[] actual = manager.searchBy("Самсунг");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchZeroSmartphones() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);
        manager.add(phone4);
        manager.add(phone5);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Моторола");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchFewProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = {product1, product2};
        Product[] actual = manager.searchBy("Хлеб");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchOneProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = {product3};
        Product[] actual = manager.searchBy("Пирожок");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchZeroProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Булка");

        Assertions.assertArrayEquals(expected, actual);
    }
}
