package Items;

public class Magazine extends LibraryItem {
    private String name;
    private long yaerOfIssue;
    private String description;

    public Magazine(int id, String name, boolean isAvailable, String name1, long yaerOfIssue, String description) {
        super(id, name, isAvailable);
        this.name = name1;
        this.yaerOfIssue = yaerOfIssue;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
}

