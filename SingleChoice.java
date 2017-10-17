import java.util.*;

public class SingleChoice implements Question
{
    private List<String> candidateAnswers = new ArrayList<String>(Arrays.asList("Right", "Wrong"));
    public List<String> submission = new ArrayList<String>();

    public List<String> setAnswer()
    {
        Random rand = new Random();
        int n = rand.nextInt(2);//generates a random choice
        submission.add(candidateAnswers.get(n));
        return submission;
    }

    public List<String> resubmitAnswer()
    {
        Random rand = new Random();
        int n = rand.nextInt(2);//generates a random choice
        submission.remove(submission.size()-1);
        submission.add(candidateAnswers.get(n));
        return submission;

    }

}
