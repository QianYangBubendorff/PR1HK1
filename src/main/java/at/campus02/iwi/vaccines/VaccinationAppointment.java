package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int calculateRiskClass(int age, boolean majorIllness, boolean ContactOfPregnantPerson, boolean workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor){
        int sum=0;

        if(age>=67){
            sum=sum+6;
            if(majorIllness==true){
                sum=sum+3;
            }if(ContactOfPregnantPerson==true){
                sum=sum+2;
            }if(workingInHealthSector){
                sum=sum+2;
            }if(workingInEducationSector==true){
                sum=sum+1;
            }if(baseRiskFactor==true){
                sum=sum+1;
            }
        }return sum;
    }

    public String[] calculateMonthAndVaccine (int age, int riskClass){
        String[] vaccPlan= new String [2];
        String month=" ";
        String vaccine=" ";
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
       if(age>=65){
            vaccine= "Pfizer";
        }else if(age>=50&&age<65){
            vaccine="Moderna";
        }else if(age>=18&&age<50){
            vaccine="AstraZeneca";
        }else {
            vaccine="Pfizer";
        }
       vaccPlan[0]=month;
       vaccPlan[1]=vaccine;
        return vaccPlan;
    }
}
