package com.testbridgelabz;

import com.mainbridgelabz.EmailSample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmailSample {

    @Test
    void testEmailSample() {
        EmailSample emailSampleRef = new EmailSample();
        boolean result = emailSampleRef.emailSample("abc@yahoo.com");
        assertTrue(result);
        result = emailSampleRef.emailSample("abc.100@bc.com.au");
        assertTrue(result);
        result = emailSampleRef.emailSample("abc@1.com,");
        assertTrue(result);
        result = emailSampleRef.emailSample("abc@gmail.com.com");
        assertTrue(result);
        result = emailSampleRef.emailSample("abc+100@gmail.com");
        assertTrue(result);
    }
}
