import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    @Test
    public void testRemoveOneBook() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.save(book5);

        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3, book4, book5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveFewBooks() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.save(book5);

        repo.removeById(2);
        repo.removeById(5);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book3, book4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAllBooks() {
        ProductRepository repo = new ProductRepository();
        Book book1 = new Book(1, "Великий Гэтсби", 650, "Фрэнсис Скотт Фицджеральд");
        Book book2 = new Book(2, "Непобедимое солнце", 900, "Виктор Пелевин");
        Book book3 = new Book(3, "Отцы и дети", 450, "Иван Тургенев");
        Book book4 = new Book(4, "Гарри Поттер 1", 1000, "Джоан Роулинг");
        Book book5 = new Book(5, "Гарри Поттер 2", 1050, "Джоан Роулинг");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.save(book5);

        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);
        repo.removeById(4);
        repo.removeById(5);

        Product[] actual = repo.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveOneSmartphone() {
        ProductRepository repo = new ProductRepository();
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        repo.save(phone1);
        repo.save(phone2);
        repo.save(phone3);
        repo.save(phone4);
        repo.save(phone5);

        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {phone2, phone3, phone4, phone5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveFewSmartphones() {
        ProductRepository repo = new ProductRepository();
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        repo.save(phone1);
        repo.save(phone2);
        repo.save(phone3);
        repo.save(phone4);
        repo.save(phone5);

        repo.removeById(2);
        repo.removeById(5);

        Product[] actual = repo.findAll();
        Product[] expected = {phone1, phone3, phone4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAllSmartphones() {
        ProductRepository repo = new ProductRepository();
        Smartphone phone1 = new Smartphone(1, "Сяоми", 8650, "Китай");
        Smartphone phone2 = new Smartphone(2, "Сяоми про", 10900, "Китай");
        Smartphone phone3 = new Smartphone(3, "Самсунг", 13450, "Япония");
        Smartphone phone4 = new Smartphone(4, "Нокиа", 10000, "Япония");
        Smartphone phone5 = new Smartphone(5, "МТС", 6050, "Россия");

        repo.save(phone1);
        repo.save(phone2);
        repo.save(phone3);
        repo.save(phone4);
        repo.save(phone5);

        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);
        repo.removeById(4);
        repo.removeById(5);

        Product[] actual = repo.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveOneProduct() {
        ProductRepository repo = new ProductRepository();
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {product2, product3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveFewProducts() {
        ProductRepository repo = new ProductRepository();
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        repo.removeById(2);
        repo.removeById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {product1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAllProducts() {
        ProductRepository repo = new ProductRepository();
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenProductNotExists() {
        ProductRepository repo = new ProductRepository();
        Product product1 = new Product(1, "Хлеб белый", 36);
        Product product2 = new Product(2, "Хлеб с отрубями", 57);
        Product product3 = new Product(3, "Пирожок", 20);

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(4);
        });
    }
}

