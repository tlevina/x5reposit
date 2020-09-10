package ru;

public class Aspirant  extends Student{
    public Aspirant() {
    }

    public String getSienceWork() {
        return sienceWork;
    }

    public void setSienceWork(String sienceWork) {
        this.sienceWork = sienceWork;
    }

    String sienceWork;

    public double  getScholarship() {
        if (this.averageMark == 5) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
}
