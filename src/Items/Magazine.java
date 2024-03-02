package Items;

public class Magazine implements BorrowableItem, PaperItem {
    private String name;
    private long yaerOfIssue;
    private String description;

    public Magazine(String name, long yaerOfIssue, String description) {
        this.name = name;
        this.yaerOfIssue = yaerOfIssue;
        this.description = description;
    }

    public String getName() {
        return name;
    }

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


    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(getName() + " взято в пользование.");
        } else {
            System.out.println(getName() + " уже взято в пользование.");
        }
    }

    @Override
    public void returnItem() {
        if !isBorrowed) {
            isBorrowed = false;
            System.out.println(getName() + " возвращено.");
        } else {
            System.out.println(getName() + " не было взято в пользование.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return true;
    }
}

