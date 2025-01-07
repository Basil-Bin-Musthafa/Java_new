import java.util.Scanner;
class Stu
{
    int regNo;
    String name;
    int phy,chem,maths;
    char findGrade()
    {
        char grade;
        double per = (phy + chem + maths) /150.0 *100;
        if(per >= 90 )
        {
            grade = 'S';
        }
        else if(per >= 80)
        {
            grade = 'A';
        }
        else if(per >= 70)
        {
            grade = 'B';
        }
        else if(per >= 60)
        {
            grade = 'C';
        }
        else if(per >= 50)
        {
            grade = 'D';
        }
        else if(per >= 40)
        {
            grade = 'E';
        }
        else 
        {
            grade = 'F';
        }

        if(phy <20 || chem <20 || maths <20 )
        {
            grade = 'F';
        }
         
        return grade;
    }
}
class StudentP1
{
    public static void main(String[] args)
    {
        Stu st = new Stu();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter register number :");
        st.regNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name :");
        st.name = sc.nextLine();
        System.out.println("Enter physics mark :");
        st.phy = sc.nextInt();
        System.out.println("Enter chemistry mark :");
        st.chem = sc.nextInt();
        System.out.println("Enter maths mark :");
        st.maths = sc.nextInt();
        
        System.out.println("Student grade is :" +st.findGrade());
    }
}