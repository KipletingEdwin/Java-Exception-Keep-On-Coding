//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums = new int[5];
        try {
            //block of code to monitor for errors
            System.out.println("In try 1");
            errorMethod(nums);
            System.out.println("In try 2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In catch 1");
        }
        catch (Exception e) {
            //handler for Exception
            System.out.println("In catch 2");

        }
        System.out.println("Rest of program");
    }

    public  static  void errorMethod(int [] nums){
        nums[10] = 25;

    }
}