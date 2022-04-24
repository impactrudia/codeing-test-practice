package day05.godofjava.chapter12;

public class ManageStudent {

    public String checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        if (a.equals(b)) {
            return "Equal";
        } else {
            return "Not Equal";
        }
    }

    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        System.out.println(manageStudent.checkEquals());
    }
}
