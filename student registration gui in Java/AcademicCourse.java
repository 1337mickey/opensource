/**
 * @Group N2
 * @author (Sushil Phuyal)
 * @College ID (NP01NT4S210044)
 * @Report File Name:  (20049252  Sushil Phuyal)
 */

public class AcademicCourse extends Course
{
    private String LecturerName;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int Assessments;
    private boolean isRegistered;
    
    public AcademicCourse(String CourseID, String CourseName, int Duration, String Level, String Credit, int Assessments)
    {
        super(CourseID, CourseName, Duration);

        this.Level = Level;
        this.Credit = Credit;
        this.Assessments = Assessments;
        LecturerName = "";
        StartingDate = "";
        CompletionDate = "";
        isRegistered = false;
    }
    
    //Accessors Method
    public String getLecturerName() //Allow user to access private LecturerName
    {
        return LecturerName;
    }

    public String getLevel()    //Allow user to access private Level
    {
        return Level;
    }

    public String getCredit()   //Allow user to access private Credit
    {
        return Credit;
    }

    public String getStartingDate() //Allow user to access private startingDate
    {
        return StartingDate;
    }

    public String getCompletionDate()   //Allow user to access private CompLetionDate
    {
        return CompletionDate;
    }

    public int getAssessments() //Allow user to access private numberOfAssessments
    {
        return Assessments;
    }
        
    public boolean getisRegistered()    //Allow user to access private isRegistered
    {
        return isRegistered;
    }

    //Mutators Method
    public void setLecturerName(String LecturerName)
    {
        this.LecturerName = LecturerName;
    }

    public void setAssessments(int Assessments)
    {
        this.Assessments = Assessments;
    }
    
    public void registerCourse(String CourseLeader, String LecturerName, String StartingDate, String CompletionDate)
    {
        if(isRegistered == false) {
            super.setCourseLeader(CourseLeader);
            this.LecturerName = LecturerName;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            isRegistered = true;
        }

        else 
        {
            System.out.println("This Course is being registerd to " +LecturerName + " to Complete within " + StartingDate + " to " + CompletionDate);
        }
    }

    public void display()
    {
        if(isRegistered == true) 
        {
            super.display();
            System.out.println("Lecturer Name: " + LecturerName);
            System.out.println("Level: " + Level);
            System.out.println("Credit: " + Credit);
            System.out.println("Starting Date: " + StartingDate);
            System.out.println("Completion Date: " + CompletionDate);
        }

        else
        {
            super.display();
        }
    } 
}
