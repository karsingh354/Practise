package Streams.StringPrograms;

public class CountNumberofDuplicateCharcater {
    public static void main(String[] args) {
        String string="I am developer";
        char[] cstring=string.toCharArray();
        int count=0;
        for(int i=0;i< cstring.length-1;i++)
        {
             count=1;

             for(int j=i+1;j< cstring.length-1;j++)
             {
                 if(cstring[i]==cstring[j])
                 {
                     count++;
                 }
             }
            if(count>1&& cstring[i]!='0')
            {
                System.out.println(count+" "+cstring[i]);
            }
        }

    }
}
