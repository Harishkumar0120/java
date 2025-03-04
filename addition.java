public class addition  {
    public static void main(String[]args){
        String num1 = "999999999999";
        String num2 = "444444444444";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int d1,d2,c= 0,s,in;
        StringBuilder sum = new StringBuilder();
        StringBuilder a = new StringBuilder();
        while (i>=0 && j>=0)
        {
            d1 = num1.charAt(i) - '0';
            d2 = num2.charAt(j) - '0';
            in = d1 + d2 + c;
            s = in % 10;
            c = in / 10;
            if(i!=0){
                sum.append(s);
            }
            else{
                a.append(in);
                a.reverse();
                sum.append(a);
            }
            i--;
            j--;
        }
        System.out.println(sum.reverse());
    }
} 
        