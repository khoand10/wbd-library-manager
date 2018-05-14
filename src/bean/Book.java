package bean;

public class Book {
    private int id;
    private String code;
    private String title;
    private long year;
    private float price;
    private String images;
    private Category category;
    private Author author;
    private Publisher publisher;
    public Book(){

    }

    public Book(int id, String code, String title, long year, float price, String images, Category category, Author author, Publisher publisher) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.year = year;
        this.price = price;
        this.images = images;
        this.category = category;
        this.author = author;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", images='" + images + '\'' +
                ", category=" + category +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
