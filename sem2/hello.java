import java.util.Arrays;
public class hello {
    public static void main(String[] args) {
        int age = 30;
        int phy = 34;
        int chem = 32;
        System.out.println(age + " " + phy + " " + chem);
        int marks[]=new int[3];
        marks[0]=age;
        marks[1]=phy;
        marks[2]=chem;
        System.out.println(marks[0] + " " + marks[1]+" "+marks[2]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0] + " " + marks[1]+" "+marks[2]);
        int amrk[]={22,33,21};
        System.out.println(amrk[0] + " " + amrk[1]+" "+amrk[2]);

    }
}

