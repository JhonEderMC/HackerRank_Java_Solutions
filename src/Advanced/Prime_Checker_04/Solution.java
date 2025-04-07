package Advanced.Prime_Checker_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

class Prime {

    public  void checkPrime(int... args) {
        for (int arg : args) {
            if (isPrime(arg)) {
                System.out.print(arg + " ");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) {
        List<Integer> integerList;
        Prime prime = new Prime();
        try(BufferedReader br=new BufferedReader(new InputStreamReader(in))){
             integerList = br.lines().filter(string -> string.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
             int n1 = integerList.get(0);
             int n2 = integerList.get(1);
             int n3 = integerList.get(2);
             int n4 = integerList.get(3);
             int n5 = integerList.get(4);
             prime.checkPrime(n1);
             prime.checkPrime(n1,n2);
             prime.checkPrime(n1,n2,n3);
             prime.checkPrime(n1,n2,n3,n4,n5);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
