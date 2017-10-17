import java.util.Collections;
import java.util.List;

public class iVoteService
{
    // index 0-3 will hold grades A,B,C,D and index 4,5 will hold right and wrong, respectively
    private int[] array = new int[6];
    void Tally(List<String> s) {
        int a = Collections.frequency(s,"A");
        int b = Collections.frequency(s,"B");
        int c = Collections.frequency(s,"C");
        int d = Collections.frequency(s,"D");

        int right = Collections.frequency(s, "Right");
        int wrong = Collections.frequency(s, "Wrong");
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = right;
        array[5] = wrong;
    }
    void OutputResult(int temp)
    {
        if(temp == 1)
        {
            System.out.println("Submission results: ");
            System.out.println("Right : " + array[4]);
            System.out.println("Wrong : " + array[5]);
        }
        else
        {
            System.out.println("Submission results: ");
            System.out.println("A : " + array[0]);
            System.out.println("B : " + array[1]);
            System.out.println("C : " + array[2]);
            System.out.println("D : " + array[3]);
        }
        clear();

    }
    void clear()
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }
    }


}
