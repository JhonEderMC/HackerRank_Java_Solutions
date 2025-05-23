package Advanced.Java_Varargs_Simple_Addition_01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Add {


    public void add (int...nums) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = Arrays.stream(nums).sum();
        String expression = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining("+"));
        stringBuilder.append(expression).append("=").append(sum);
        System.out.println(stringBuilder);
    }


   /* public void add(int...nums) { // declarative
        StringBuilder stringBuilder = new StringBuilder();
        int sum=0;

        for(int num: nums) {
            stringBuilder.append(num);
            if(num != nums[nums.length-1]) {
                stringBuilder.append("+");
            }
            sum+=num;
        }

        stringBuilder.append("=").append(sum);
        System.out.println(stringBuilder);
    }*/
}


public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}


