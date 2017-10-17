import java.util.Random;

public class SimulationDriver
{
    public static void main(String[] args)
    {
        iVoteService test1 = new iVoteService();
        iVoteService test2 = new iVoteService();
        Question singleChoice = new SingleChoice();
        Question multipleChoice = new MultipleChoice();
        GenStudentID ID = new GenStudentID();
        Student s1 = null; //single choice students
        Student s2 = null; //multiple choice students
        int studentID = 0;
        Random rand = new Random();
        int numStudents = rand.nextInt(5) + 20;

        System.out.println("Number of students: " + numStudents);
        for(int i = 0; i < numStudents; i++)
        {
            studentID = ID.setID();
            s1 = new Student(studentID);
            s2 = new Student(studentID);
            s1.vote(singleChoice);
            s2.vote(multipleChoice);

        }
        test1.Tally(s1.getSelection());
        test2.Tally(s2.getSelection());

        System.out.println("Testing with one submission");
        test1.OutputResult(1);
        test2.OutputResult(0);

        s1.clear();
        s2.clear();
        System.out.println("Testing with resubmissions");
        ID.clear();
        for(int i = 0; i < numStudents; i++)
        {
            studentID = ID.setID();
            s1 = new Student(studentID);
            s2 = new Student(studentID);
            s1.vote(singleChoice);
            s2.vote(multipleChoice);
            s1.voteAgain(singleChoice);
            s2.voteAgain(multipleChoice);
        }
        test1.Tally(s1.getSelection());
        //System.out.println("getselect" + s1.getSelection());
        test2.Tally(s2.getSelection());
        test1.OutputResult(1);
        test2.OutputResult(0);
    }
}
