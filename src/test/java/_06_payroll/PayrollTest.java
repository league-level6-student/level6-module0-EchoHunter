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
            double should = Payroll.calculatePaycheck(wage,hours);
        //then
        assertEquals();
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given

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