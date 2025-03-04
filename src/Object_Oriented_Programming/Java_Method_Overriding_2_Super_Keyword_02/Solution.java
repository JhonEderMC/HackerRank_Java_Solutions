package Object_Oriented_Programming.Java_Method_Overriding_2_Super_Keyword_02;

class BiCycle{
    public String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    public String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class Solution{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}