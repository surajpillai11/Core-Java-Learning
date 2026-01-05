class Student
{
    int rollno;
    String name;
    int marks;
}

public class object
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Suraj Pillai";
        s1.rollno = 111;
        s1.marks = 99;

        Student s2 = new Student();
        s2.name = "Upar wall";
        s2.rollno = 115;
        s2.marks = 59;

        Student s3 = new Student();
        s3.name = "Anoynoumus";
        s3.rollno = 142;
        s3.marks = 39;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for(Student stud : students)//enhanced for loop
        {
            System.out.println(stud.name  + " : " +  stud.rollno);
        }


    //     for(int i=0;i<students.length;i++)
    //     {
    //         System.out.println(students[i].name  + " : " +  students[i].rollno);
    //     }
    }
    
}

