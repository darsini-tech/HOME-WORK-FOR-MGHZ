
package batch1;

public class SecondLargest
{
   void secondLargest()
   {
       int a[]={1,2,45,78,96,45};
       int largest=a[0];
       int second=a[0];
       for(int i =1;i<a.length;i++)
       {
           if(a[i]>largest)
           {
               second=largest;
           largest=a[i];
       }
       else if (a[i]>second && a[i]!=largest)
               {
               second =a[i];
               }
   }
        System.out.println("Second Largest : "+second);
       } 
    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        obj.secondLargest();
    }
   }


