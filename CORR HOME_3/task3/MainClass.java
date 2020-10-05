package task3;



public class MainClass {
    public static void main(String[] args) {
        double salary;
        Student student1 = new Student("Пётр","Петров", "S55",5.0);
        Student student2 = new Student("Олег","Сидоров","S37", 4.2);
        Student aspirant1 = new Aspirant("Боря","Романов","A65",5.0,"Работа2");
        Student aspirant2 = new Aspirant("Иван","Иванов","A45",4.5,"Работа3");



        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (
                Student st : students) {
            salary = st.getScholarship();
            System.out.println(st.lastName + " Стипендия = " + salary);
        }
    }
}
