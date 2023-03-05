package com.neewrobert.mutationtest;

import org.junit.Assert;
import org.junit.Test;

public class TimeConversionTest {

    @Test
    public void testTimeConversion() {
        TimeConversion timeConversion = new TimeConversion();
        Assert.assertEquals("23:00:00", timeConversion.convert("11:00:00PM"));
        Assert.assertEquals("00:00:00", timeConversion.convert("12:00:00AM"));
        Assert.assertEquals("11:00:00", timeConversion.convert("11:00:00AM"));
    }

    @Test
    public void testTimeConversionFail(){
        TimeConversion timeConversion = new TimeConversion();
        Assert.assertNotEquals("24:00:00", timeConversion.convert("12:00:00PM"));
    }
}




