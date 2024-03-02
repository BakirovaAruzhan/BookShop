package Items;

public class DVD implements BorrowableItem, PaperItem {

    private String title;
    private int runTime;

    private String description;

    public DVD(String title, int runTime, String description) {
        this.title = title;
        this.runTime = runTime;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
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
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(getName() + " возвращено.");
        } else {
            System.out.println(getName() + " не было взято в пользование.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return isBorrowed;
    }
}

