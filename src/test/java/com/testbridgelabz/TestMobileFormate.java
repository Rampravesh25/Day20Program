package com.testbridgelabz;

import com.mainbridgelabz.MobileFormate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMobileFormate {
    @Test
    void testMobileFormate() {
        MobileFormate mobileFormateRef = new MobileFormate();
        boolean result = mobileFormateRef.mobileFormate("91 8693801071");
        Assertions.assertTrue(result);
    }
}
