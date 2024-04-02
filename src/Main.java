//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] numer = {4, 8, 16, 32};
        int[] denom = {2, 0, 4, 4};

        for(int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[1] / denom[i]);
            }
            catch (Exception e) {
                System.out.println("You cant divide by zero!");

            }

        }




    }

}