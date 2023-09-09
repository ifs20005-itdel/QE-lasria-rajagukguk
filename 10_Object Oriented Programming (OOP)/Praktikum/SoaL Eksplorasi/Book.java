import java.util.UUID;

class Book {
    private UUID id;
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "===\nID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category + "\n===";
    }
}
