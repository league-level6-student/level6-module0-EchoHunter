package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
            double wage = 7.25;
            int hours = 6;
            double pay = hours * wage;
        //when
            double should = payroll.calculatePaycheck(wage,hours);
        //then
        assertEquals(pay, should);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
            int travelDist = 10;
            double expected = 5.75;
        //when
            
        //then
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given

        //when

        //then
    }

}