package main.java.com.OlegRib.app.utils.convertors;

/**
 * Created by Zazonga on 14.03.2017.
 */
public class PrimitiveConvertor {

    public void floatToChar(float float_variable_name){

        char char_variable_name;
        char_variable_name = (char) float_variable_name;
        System.out.println("Input float value is " + float_variable_name + ". Output char value is " + char_variable_name);

    }
    public void intToChar(int int_variable_name){

        char char_variable_name;
        char_variable_name= (char) int_variable_name;
        System.out.println("Input int value is " + int_variable_name + ". Output char value is " + char_variable_name);

    }

    public void charToInt(char char_variable_name){

        int int_variable_name;
        int_variable_name = (int) char_variable_name;
        System.out.println("Input char value is " + int_variable_name + ". Output int value is " + char_variable_name);

    }

}
