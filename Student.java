import java.util.ArrayList;
import java.util.List;

public class Student {

    private String ID;
    private List<String> selection = new ArrayList<String>();
    Student(int id)
    {
        ID = Integer.toString(id);
    }
    String getID()
    {
        return ID;
    }
    void vote(Question type)
    {
        //this will enable a student to submit an answer
        selection = type.setAnswer();
    }
    void voteAgain(Question type)
    {
        selection = type.resubmitAnswer();
    }
    List<String> getSelection()
    {
        return selection;
    }
    void clear()
    {
        selection.clear();
    }
}
