package at.campus02.iwi.vaccines;

public class VaccinationApp {
    public static void main(String[] args) {
        VaccinationAppointment newAppointment= new VaccinationAppointment();

        System.out.println(newAppointment.calculateRiskClass(68,true,false,true,false,true));
    }
}
