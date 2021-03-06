/**
 * @Group N2
 * @author (Sushil Phuyal)
 * @College ID (NP01NT4S210044)
 * @Report File Name:  (20049252  Sushil Phuyal)
 */

public class Course
{
    private String CourseID;
    private String CourseName;
    private String CourseLeader;
    private int Duration;

    public Course(String CourseID, String CourseName, int Duration)
    {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.Duration = Duration;
        CourseLeader = "";
    }

    //Accessors Method
    public String getCourseID() //Allow user to access private courseID
    {
        return CourseID;
    }

    public String getCourseName()   //Allow user to access private courseName
    {
        return CourseName;
    }

    public int getDuration()    //Allow user to access private duration
    {
        return Duration;
    }

    public String getCourseLeader()   //Allow user to access private courseLeader
    {
        return CourseLeader;
    }

    //Mutators Method
    public void setCourseLeader(String CourseLeader)
    {
        this.CourseLeader = CourseLeader;
    }
    
    public void display()
    {
        System.out.println("\t##Course Details##:-");
        System.out.println("The CourseID is: " + CourseID);
        System.out.println("The CourseName is: " + CourseName);

        if(!CourseLeader.isEmpty()) 
        {
            System.out.println("CourseLeader is: " + CourseLeader);
        }

        System.out.println("The Duration is: " + Duration);
    }
}
