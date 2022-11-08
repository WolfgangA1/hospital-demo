package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse ("1", "name", 5);
    Patient sickPatient = new Patient();


    @Test
    public void shouldExpectASalaryOf50k(){
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }


    @Test
    public void shouldIncreaseHealthLevelFrom10To15WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBlood((sickPatient));
        int drawBlood = sickPatient.getBloodLevel();
        assertEquals(15, drawBlood);
    }


}
