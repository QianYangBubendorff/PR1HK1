package at.campus02.iwi.vaccines;

public class VaccinationApp {
    public static void main(String[] args) {
        VaccinationAppointment newAppointment= new VaccinationAppointment();
//        newAppointment.age= 68;
//        newAppointment.baseRiskFactor=true;
//        newAppointment.workingInEducationSector=false;
//        newAppointment.ContactOfPregnantPerson=false;
//        newAppointment.workingInHealthSector=false;

        System.out.println(newAppointment.calculateRiskClass(68,true,false,true,true,true));
    }
}
