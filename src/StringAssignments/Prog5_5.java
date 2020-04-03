package StringAssignments;

public class Prog5_5 {

    public static void main(String[] args) {

        int a[]={23,25,75,87,47,1,91,51,2};
        int odd=0,even=0,num=0;

        for (int i = 0; i < a.length; i++) {

            if(a[i]%2==0)
                even++;
            else
                odd++;
       }
        if(odd<even)
        {
            for (int i = 0; i < a.length; i++) {

                if(a[i]%2!=0)
                  num=a[i];
                else
                   continue;
            }
        }
        else
        {
            for (int i = 0; i < a.length; i++) {

                if(a[i]%2==0)
                    num=a[i];
                else
                    continue;
            }
        }

        System.out.println("Number:"+num);


    }
}
