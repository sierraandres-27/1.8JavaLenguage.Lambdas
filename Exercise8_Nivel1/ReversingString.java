package Exercise8_Nivel1;

public class ReversingString {

    public static void start(){

        ReverseString reverseObject = (s1)->(new StringBuilder(s1).reverse().toString());

        System.out.println("The reverse String is: "+reverseObject.reverse("Melocotón"));


    }

}
