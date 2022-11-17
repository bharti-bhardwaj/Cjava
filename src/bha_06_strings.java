//import java.lang.String;
public class bha_06_strings {
    public static void main(String[] args) {
        //String is a class in java but we can use as like object
        //String are immutable nd it can not be changed
        String name ="Bharti";

        int value = name.length();
        System.out.println(value);

        String lstring =name.toLowerCase();   //type tlc  and then enter
        System.out.println(lstring);

        String ustring =name.toUpperCase();  //type tuc
        System.out.println(ustring);

        // return a new string after removing all the  leading and trailing spaces from the original string
        String nottrimmedstring = "    bharti     ";
        System.out.println(nottrimmedstring);
        System.out.println(nottrimmedstring.trim());
             //or
        String trimmedstring = nottrimmedstring.trim();
        System.out.println(trimmedstring);

       //return  a substring from start to end
       // System.out.println(name.substring(3));
        //System.out.println(name.substring(0));   //substring is redundant
        System.out.println(name.substring(1,4));

        //return a new string after replacing 'r' with 'p' if we intilazise string harry and we want to replace 'r' with 'p' so we use replace method and output retuned "Happy"
        System.out.println(name.replace('r','a'));
        System.out.println(name.replace("rti", "abc"));

        //startsWith method return true if string start with bh. true return in this case
        System.out.println(name.startsWith("Bha"));

        //endsWith method return true if string ends with rti .true return in this case
        System.out.println(name.endsWith("rti"));

        //charAt return char at a given index position r in this case
        System.out.println(name.charAt(3));

        //indexOf return the index of given string
        System.out.println(name.indexOf("ar"));

        //indexOf return the index of given string starting from the given string
        System.out.println(name.indexOf("ar",4));

        String modified ="harryrry";
        System.out.println(modified.indexOf("rr",4));

        //lastindexOf
        System.out.println(modified.lastIndexOf("rry",4));

        //equals return true if the given string is equals to "bharti"
        System.out.println(name.equals("Bharti"));

        //equalsIgnoreCase return true if two strings are equal ignoring the case of characters
        System.out.println(name.equalsIgnoreCase("bhArti"));


       //  (\n -new line), (\t- tab) , (\\) ,  (escape sequence -  \') etc.
        System.out.println(" I am escape squence \" double qoute");
        System.out.println(" I am escape squence \\ double qoute");





    }
}
