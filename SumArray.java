
package batch1;

public class SumArray {
    void sum()
    {
    int sum=0;
      int a[]={10,20,30,40,50};
   int mid=a.length/2;
        for (int i =mid; i<a.length; i++)
        {
            sum+=a[i];
            
        }
        System.out.println(" Sum of the array : "+sum);
    
}
    public static void main(String[] args) 
    {
      SumArray obj=new SumArray ();
      obj.sum();
    }
}
