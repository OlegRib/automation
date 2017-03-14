package main.java.com.OlegRib.app.utils.runners;

import main.java.com.OlegRib.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Zazonga on 14.03.2017.
 */
public class Lesson3Runner {

    public static void main (String args[]){

        PrimitiveConvertor convector = new PrimitiveConvertor();
        convector.charToInt('1');
        convector.floatToChar(2);
        convector.intToChar(555);
    }
}
