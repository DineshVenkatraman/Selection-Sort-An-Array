import java.util.Scanner;
class selectArr
{
    Scanner sc=new Scanner(System.in);
    public void selecta1()
    {
        int i,j,n,temp,minIndex;
        System.out.println("Enter the  no of Elements ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for (i=0;i<n-1;i++)
        {
            minIndex=i;
            for (j=i+1;j<n;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex=j;

                }
                if(minIndex!=i)
                {
                    temp=a[i];
                    a[i]=a[minIndex];
                    a[minIndex]=temp;
                }
            }
        }
        System.out.println("Sorted array list");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
}

public class selectionSort {
    public static void main(String args[])
    {
        selectArr objArr=new selectArr();
        objArr.selecta1();
    }
}
