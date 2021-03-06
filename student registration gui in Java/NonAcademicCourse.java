/**
 * @Group N2
 * @author (Sushil Phuyal)
 * @College ID (NP01NT4S210044)
 * @Report File Name:  (20049252  Sushil Phuyal)
 */

public class NonAcademicCourse extends Course
{
    private String InstructorName;
    private int Duration;
    private String StartingDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    public NonAcademicCourse(String CourseID, String CourseName, int Duration, String Prerequisite)
    {
        super(CourseID,CourseName,Duration);

        this.Prerequisite = Prerequisite;
        InstructorName = "";
        StartingDate = "";
        CompletionDate = "";
        ExamDate = "";
        isRegistered = false;
        isRemoved = true;
    }

    //Accessors Method
    public String getInstructorName()   //Allow user to access private instructorName
    {
        return InstructorName;
    }

    public int getDuration()    //Allow user to access private duration
    {
        return Duration;
    }

    public String getStartingDate() //Allow user to access private startingDate
    {
        return StartingDate;
    }

    public String getCompletionDate()   //Allow user to access private completionDate
    {
        return CompletionDate;
    }

    public String getExamDate() //Allow user to access private examDate
    {
        return ExamDate;
    }

    public String getPrerequisite() //Allow user to access private prerequisite
    {
        return Prerequisite;
    }

    public boolean getisRegistered()    //Allow user to access private isRegistered
    {
        return isRegistered;
    }

    public boolean getisRemoved()   //Allow user to access private isRemoved
    {
        return isRemoved;
    }

    //Mutators Method
    public void setInstructorName(String InstructorName)
    {
        if(isRegistered == false) {
            this.InstructorName = InstructorName;
        }

        else 
        {
            System.out.println("This course is registered therefore Instructor Name can't be updated");
        }
    }

    public void registerCourse(String CourseLeader, String InstructorName, String StartingDate, String CompletionDate, String ExamDate)
    {
        if(isRegistered == false) 
        {
            super.setCourseLeader(CourseLeader);

            setInstructorName(InstructorName);
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            this.ExamDate = ExamDate;
            isRegistered = true;
            isRemoved = false;
        }

        else
        {
            System.out.println("This course has been Registered!");
        }
    }

    public void removeCourse()
    {
        if(isRemoved == true) {
            System.out.println("This course has been removed!");
        }

        else 
        {
            super.setCourseLeader("");
            
            this.InstructorName = "";
            this.StartingDate = "";
            this.CompletionDate = "";
            this.ExamDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }

    public void display()
    {
        if(isRegistered == true) {
            super.display();
            System.out.println("The Instructor Name is: " + InstructorName);
            System.out.println("The Starting Date is: " + StartingDate);
            System.out.println("The Completion Date is: " + CompletionDate);
            System.out.println("The Examination Date is: " + ExamDate);
        }
        
        else {
            super.display();
        }
    }
}

