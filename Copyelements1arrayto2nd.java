
package batch1;

public class Copyelements1arrayto2nd {
    void copy()
    {
    int a[]={10,20,30,40};
    int b[]=new int[a.length];
        for(int i = 0; i <a.length; i++)
        {
        b[i]=a[i];
        }
        for (int i = 0; i <b.length; i++)
        {
            System.out.print(b[i]+ " , ");
            
        }
        }
    public static void main(String[] args)
    {
        Copyelements1arrayto2nd obj = new Copyelements1arrayto2nd();
        obj.copy();
    }
}
