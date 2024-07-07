public class JAVA_PRACTICE_SET_3 {
    public static void main(String[] args)
    {
    // problem-1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //problem-2
        String text = "TO Lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem-3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Prathamesh");
        System.out.println(letter);

        //problem-4
        String myString = "This String contains   double and triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem-5
        String myLetter = "Dear Prathamesh,\n\t This Java Course Is Nice.\nTHanks!";
        System.out.println(myLetter);

    }
}
