package at.campus02.iwi.recursion;

public class WalkingDemoApp {
    int countSteps;
    int currentStep;
    public void walk(int countSteps, int currentStep){

        while(countSteps>=currentStep) {
            System.out.println("Step forward: " + currentStep);
            currentStep++;
            walk(countSteps, currentStep);}
            System.out.println("Step backward: " + currentStep);
            currentStep--;

            }
//        while(countSteps<=currentStep){
//            System.out.println("Step backward: " + currentStep);
//            walk(countSteps, currentStep+1);
//              countSteps--;
//        }

    }
