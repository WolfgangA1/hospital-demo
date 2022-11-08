package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoctorTest {

    Doctor underTest = new Doctor ("1", "name", "speciality");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBlood((sickPatient));
        int drawBlood = sickPatient.getBloodLevel();
        assertEquals(15, drawBlood);
    }

    @Test
    public void shouldExpectASalaryof90k(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }

}
