package User;

import Items.BorrowableItem;

public class Librarian extends User{
    private int workExperience;




    public Librarian(int id, String login, String password, String role, int workExperience) {
        super(id, login, password, role);
        this.workExperience=workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
