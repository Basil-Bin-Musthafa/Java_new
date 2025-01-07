class Stu
{
    int regNo;
    String name;
    int phy,chem,maths;
    char findGrade()
    {
        char grade;
        double per = (phy + chem + maths) /150 *100;
        if(per >= 90 ) grade = 'S';
        else if(per >= 80)  grade = 'A';
        else if(per >= 70)  grade = 'B';
        else if(per >= 60)  grade = 'C';
        else if(per >= 50)  grade = 'D';
        else if(per >= 40)  grade = 'E';
        else if(per < 40)  grade = 'F';
        return grade;
    }
}
class Student
{
    public static void main(String[] args)
    {
        Stu s1 = new Stu();
        println("Student register number :",s1.regNo);
        println("Student name :",s1.name);
        println("Student grade :",s1.findGrade());
    }
}