import java.util.Scanner;
class Stud
{
int regNo;
String name;
int phy,chem,maths;
char findGrade()
{
char grade;
float per = (phy+chem+maths)*150.0f/100;
if(per>=90)
{
grade = 'S';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else if(per >= 80)
{
grade = 'A';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else if(per >= 70)
{
grade = 'B';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else if(per >= 60)
{
grade = 'C';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else if(per >= 50)
{
grade = 'D';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else if(per >= 40)
{
grade = 'E';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
else
{
grade = 'F';
System.out.print("The percentage of "+name+" is ");
System.out.format("%.2f\n",per);
}
return grade;
}
}
class StudentP4
{
public static void main(String[] args)
{
Stud st = new Stud();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the register number :");
st.regNo = sc.nextInt();
sc.nextLine();
System.out.println("Enter student name :");
st.name = sc.nextLine();
System.out.println("Enter the mark of physics :");
st.phy = sc.nextInt();
while(st.phy > 50)
{
System.out.println("Maximum mark is 50 Please enter valid mark :");
st.phy = sc.nextInt();
}
System.out.println("Enter the mark of chemistry :");
st.chem = sc.nextInt();
while(st.chem > 50)
{
System.out.println("Maximum mark is 50 Please enter valid mark :");
st.chem = sc.nextInt();
}
System.out.println("Enter the mark of maths :");
st.maths = sc.nextInt();
while(st.maths > 50)
{
System.out.println("Maximum mark is 50 Please enter valid mark :");
st.maths = sc.nextInt();
}
System.out.println("The grade of "+st.name+" is "+st.findGrade());
}
}

