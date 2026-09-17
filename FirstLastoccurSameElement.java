
    package batch1;
public class FirstLastoccurSameElement
{
    void occurance()
    {
        int a[]={10,20,30,40,50,50,20};
        int search = 20;
        int first = -1;
        int last = -1;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == search)
            {
                if(first == -1)
                {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("First : " + first);
        System.out.println("Last  : " + last);  
    }
    public static void main(String args[])
    {
        FirstLastoccurSameElement obj = new FirstLastoccurSameElement();
        obj.occurance();
    }
}
