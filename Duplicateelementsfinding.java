
package batch1;

public class Duplicateelementsfinding {
    void duplicate()
    {
    int a[]={10,20,20,30,40};
    
    for(int i=0;i<a.length;i++)
        {
    for(int j=i+1;j<a.length;j++)
        {
             if(a[i]==a[j])
            System.out.println(a[i]);
               break; 
}
}
}
    public static void main(String[] args) {
        Duplicateelementsfinding obj = new Duplicateelementsfinding();
        obj.duplicate();
    }
}