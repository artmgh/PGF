package com.pgf.amiksa.task2.utils;

import java.util.regex.Pattern;

public class MailValidator {


    public static final String REGEX_MAIL_PATTER = "^(.+)@(\\S+)$";

    private MailValidator() {
    }

    public static boolean patternMatches(String emailAddress) {
        return Pattern.compile(REGEX_MAIL_PATTER)
                .matcher(emailAddress)
                .matches();
    }

}
