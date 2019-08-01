package com.barton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//import pk1.pk2.pk3;
public class CalanderPractice {

    public static void main(String[] args) {
        //instance of calendar with a date added
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("dd-mm-yyyy");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }

}
