import java.util.Locale;

public class JAVA_STRING_METHOD {
    public static void main(String[] args)
    {
        String name="Prathamesh";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
       String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString ="   prathamesh     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,9));
        System.out.println(name.replace('r','p'));
        System.out.println(name.startsWith("Ppa"));
        System.out.println(name.endsWith("esh"));
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("t"));
        System.out.println(name.lastIndexOf('h'));
        System.out.println(name.equals("prathamesh"));
        System.out.println(name.equalsIgnoreCase("prathamesh"));

    }
}
