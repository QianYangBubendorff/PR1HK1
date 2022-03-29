package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int calculateRiskClass(int age, boolean majorIllness, boolean ContactOfPregnantPerson, boolean workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor){
        int rclass=0;

        rclass=rclass+age/10;
        if(majorIllness){
            rclass=rclass+3;
            }if(ContactOfPregnantPerson){
            rclass=rclass+2;
            }if(workingInHealthSector){
            rclass=rclass+2;
            }if(workingInEducationSector){
            rclass=rclass+1;
            }if(baseRiskFactor){
            rclass=rclass+1;
            }
        return rclass;
    }

    public String[] calculateMonthAndVaccine (int age, int riskClass){
        String[] vaccPlan= new String [2];
        String month=" ";
        String vaccine=" ";
//        switch(riskClass){
//
//            case 0:
//            case 1:
//                vaccPlan[0]="July";
//                break;
//            case 2:
//            case 3:
//                vaccPlan[0]="June";
//                break;
//            case 4:
//            case 5:
//                vaccPlan[0]="Mai";
//                break;
//            case 6:
//                vaccPlan[0]="April";
//                break;
//            case 7:
//            case 8:
//                vaccPlan[0]="March";
//                break;
//            case 9:
//                vaccPlan[0]="February";
//                break;
//            default:
//                vaccPlan[0]= "January";
//                break;
//        }
       if(riskClass>=10){
           month= "January";
       }else if(riskClass==9){
           month= "February";
       }else if(riskClass==7||riskClass==8){
           month= "March";
       }else if(riskClass==6){
           month= "April";
       }else if(riskClass==4||riskClass==5){
           month= "May";
       }else if(riskClass==3||riskClass==2){
           month= "June";
       }else {
           month= "July";
       }

       if(age>=65||age<18){
            vaccine= "Pfizer";
        }else {
           if(age>=50&&age<65){
               vaccine="Moderna";
           }else {
               vaccine="AstraZeneca";
           }
       }
       vaccPlan[0]=month;
       vaccPlan[1]=vaccine;
        return vaccPlan;
    }
}
