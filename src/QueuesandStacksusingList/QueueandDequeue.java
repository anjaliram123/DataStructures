package QueuesandStacksusingList;

import java.util.ArrayList;
import java.util.List;

public class QueueandDequeue {


    public List<Integer> data;

    public int p_start;


    public QueueandDequeue()
    {
        data=new ArrayList<>();
        p_start=0;
    }

    public boolean Enqueue(int x)
    {
        data.add(x);
        return true;
    }

    public boolean Dequeue()
    {
         if(data.isEmpty()==true)
         {
             return false;
         }
        p_start++;
         return true;
    }

    public int Front()
    {
        return data.get(p_start);
    }



}
