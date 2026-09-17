
package batch1;


public class FrequencyoccuringElement {
    void frequency()
    {
    int a[]={10,20,30,30,20,10,10};
        for (int i = 0; i <a.length; i++)
        {
            boolean d =false;
            for (int z = 0; z <i; z++) 
            {
                if(a[z]==a[i])
                {
                d=true;
                break;
                }
            }
            if(d)
                continue;
            int count =0;
            for (int j = 0; j <a.length; j++)
            {
            if(a[i]==a[j])
                count++;
            }
            System.out.println(a[i]+" = "+count);
        }
    }
    public static void main(String[] args)
    {
       FrequencyoccuringElement obj = new FrequencyoccuringElement();
       obj.frequency();
    }    
        }