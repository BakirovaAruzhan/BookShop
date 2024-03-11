package Items;

public class Magazine extends LibraryItem implements BorrowableItem {
    private long yaerOfIssue;
    private String description;

    public Magazine(int id, String name, boolean isAvailable, long yaerOfIssue, String description) {
        super(id, name, isAvailable);
        this.yaerOfIssue = yaerOfIssue;
        this.description = description;
    }

    public long getYaerOfIssue() {
        return yaerOfIssue;
    }

    public void setYaerOfIssue(long yaerOfIssue) {
        this.yaerOfIssue = yaerOfIssue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }
}


