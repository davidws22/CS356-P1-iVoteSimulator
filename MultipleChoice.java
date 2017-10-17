import java.util.*;

public class MultipleChoice implements Question
{
    private List<String> candidateAnswers = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
    public List<String> submission = new ArrayList<String>();
    static int temp;
    public List<String> setAnswer()
    {

        Random rand = new Random();
        int numSelections = rand.nextInt(4)+1;
        temp = numSelections;
        int[] indexes = new Random().ints(0, 4).distinct().limit(numSelections).toArray();

        for(int i = 0; i < indexes.length; i++) {
           // System.out.println("indexs" + indexes[i]);
            submission.add(candidateAnswers.get(indexes[i]));
          //  System.out.println("submissions: " + submission);
        }
        return submission;
    }

    //this method allows students to changes their original responses and submit again
    public List<String> resubmitAnswer()
    {
        Random rand = new Random();
        int numSelections = rand.nextInt(4)+1;

        int[] indexes = new Random().ints(0, 4).distinct().limit(numSelections).toArray();

        for(int i = 0; i < temp; i++)
        {
            submission.remove(submission.size()-1);
        }
        for(int i = 0; i < indexes.length; i++) {
            // System.out.println("indexs" + indexes[i]);
            submission.add(candidateAnswers.get(indexes[i]));
            //  System.out.println("submissions: " + submission);
        }
        return submission;
    }
}
