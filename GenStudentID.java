import java.util.*;

public class GenStudentID
{
    private List<Integer> set = new ArrayList<Integer>();


    int setID()
    {
        Random rand = new Random();
        int temp = rand.nextInt(999999) + 1;
        while(set.contains(temp))
        {
            temp = rand.nextInt(999999) + 1;
        }
        set.add(temp);
        return temp;
    }

    void clear()
    {
        set.clear();
    }

}
