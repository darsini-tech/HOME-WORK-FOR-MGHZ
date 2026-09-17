
package batch1;


public class LargestSmallest
{
    void largestsmallest()
    {
        int a[]={30,5,89,100,4,45};
        int largest=a[0];
        int smallest=a[0];
        for(int i=0;i<a.length;i++)
        {
        if(a[i]>largest)
          largest = a[i];
        
        if(a[i]<smallest)
            smallest= a[i];
        }
        System.out.println(" Largest : "+largest);
        System.out.println(" Smallest : "+smallest);
        
        
    }
    public static void main(String[] args) {
        LargestSmallest obj = new LargestSmallest();
        obj.largestsmallest();
        
    }
}


