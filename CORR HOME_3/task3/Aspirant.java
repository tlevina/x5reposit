package task3;

public class Aspirant extends Student {
    String sienceWork;

    public String getSienceWork() {
        return sienceWork;
    }

    public void setSienceWork(String sienceWork) {
        this.sienceWork = sienceWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String sienceWork) {
        super(firstName, lastName, group, averageMark);
        this.sienceWork = sienceWork;
    }


    @Override
    public double getScholarship() {

        if (this.averageMark == 5) {
            return 200.0;
        } else {
            return 180.0;
        }

    }
}
