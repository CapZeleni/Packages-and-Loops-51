package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SCRServiceTest  {
    @Test
    public void testr() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

        @Test
        public void testn() {
            SQRService service = new SQRService();

            int actual = service.calculate(200, 200);
            int expected = 0;

            assertEquals(expected, actual);
    }
}
