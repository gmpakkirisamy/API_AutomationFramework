package com.pakkirisamy.modules;

import com.google.gson.Gson;
import com.pakkirisamy.pojos.Booking;
import com.pakkirisamy.pojos.Bookingdates;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public class PayloadManager {

    //Convert Java Objects to JSON
    //Gson -> Serialization and DeSerialization

    Gson gson;

public String createPayloadBookingAsString() {

        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
        Booking booking = new Booking();
        booking.setFirstname("Jim");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        //Java Object -> JSON // This cannot directly converted to server. so here we are using GSON to do that which means covnering to JSON file.
        //GSON- is the google library which will convert your class to JSON and JSON to class. This is provided by the google.

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);

    }

}
