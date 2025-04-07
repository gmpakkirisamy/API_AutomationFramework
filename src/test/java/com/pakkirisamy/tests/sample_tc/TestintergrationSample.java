package com.pakkirisamy.tests.sample_tc;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestintergrationSample {

    // Its is the kind of dummy test case, Kind of Health Check
    // THis is the health check for the dependencies

    //Create A Booking, Create a Token
    //Verify that Get Booking
    //Update the Booking
    //Delete the Booking

    @Test(groups = "qa", priority = 1)
    @Owner("Samy")
    @Description("TC#INT1 - Step1. Verify that booking is created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Samy")
    @Description("TC#INT1 - Step2. Verify that booking by ID")
    public void testverifyBookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Samy")
    @Description("TC#INT1 - Step3. Verify Updated Booking by ID")
    public void testUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Samy")
    @Description("TC#INT1 - Step1. Delete the Booking by ID")
    public void testDeleteBookingById(){
        Assert.assertTrue(true);
    }



}
