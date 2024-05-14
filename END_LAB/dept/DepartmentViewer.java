package dept;


public class DepartmentViewer {
    public static void main(String[] args) {
        dept.CSE cse = new dept.CSE();
        cse.displaySubjects();
        
        dept.ECE ece = new dept.ECE();
        ece.displaySubjects();
        
        dept.ME me = new dept.ME();
        me.displaySubjects();
        
        dept.CE ce = new dept.CE();
        ce.displaySubjects();
    }
}
