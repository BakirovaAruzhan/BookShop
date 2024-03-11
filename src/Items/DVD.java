package Items;

public class DVD extends LibraryItem implements PaperItem, BorrowableItem{

    private String title;
    private int runTime;

    private String description;

    public DVD(int id, String name, boolean isAvailable, String title, int runTime, String description) {
        super(id, name, isAvailable);
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

    @Override
    public String toString() {
        return "DVD{" +"№"+ getId()+
                "title='" + title + '\'' +
                ", runTime=" + runTime +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }
}

