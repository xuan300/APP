public class Item {
    private String category;
    private String link;
    private String description;

    public Item(String category, String link, String description) {
        this.category = category;
        this.link = link;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }
}
