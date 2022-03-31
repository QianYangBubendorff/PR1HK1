package at.campus02.iwi.recursion;

public class WalkingDemoApp {
    int countSteps;
    int currentStep;

    public void walk(int countSteps, int currentStep) {

        if (countSteps >= currentStep) {
            System.out.println("Step forward: " + currentStep+1);
            walk(countSteps, currentStep + 1);
//            if (currentStep > 1) {
//                System.out.println("Step backward: " + (currentStep - 1));
//            }
            if(currentStep<countSteps){
                System.out.println("Step backward: " + currentStep);
            }
        }


    }
}
