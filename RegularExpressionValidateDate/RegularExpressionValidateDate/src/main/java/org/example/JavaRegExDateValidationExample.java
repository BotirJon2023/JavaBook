package org.example;

public class JavaRegExDateValidationExample {

    public static void main(String[] args) {

        String[] strDates = {
                "2018-10-31",
                "2012-12-12",
                "2005-3-11",
                "2015-55-34",
                "2015-99-99",
                "2015-13-23",
                "2015-12-32",
        };

        for(String strDate : strDates){
            validateDate(strDate);
        }
    }

    private static void validateDate(String strDate){

        String strDateRegEx =  "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|[3][01])";

        if(strDate.matches(strDateRegEx)){
            System.out.println(strDate + " is valid");
        }else{
            System.out.println(strDate + " is not valid");
        }

    }

}
