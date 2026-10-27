package com.plurslsight;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void  main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("yyy-MM-dd")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy")));

        ZonedDateTime gmt
        System.out.println(
    }


}
//  EXERCISE 2
//      Create a Java application named format-dates.
//      The application will get the current date and time and display that information in the following formats
//      Remember: When creating a new Java project, create a new git repository and commit your changes often!
//      Don’t forget to push to github.com. Always share your IntelliJ project to GitHub!
//
//          04/22/2026
//          2026-04-22
//          Wednesday, April 22, 2026
//          Wednesday, Apr 22, 2026  10:02      display in GMT time
//
//      CHALLENGE
//          5:02 on 22-Apr-2026            display in your local time zone
