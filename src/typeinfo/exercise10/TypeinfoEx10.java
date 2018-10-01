package typeinfo.exercise10;

public class TypeinfoEx10 {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        System.out.println("Is array of char a primitive type: " + vowels.getClass().isPrimitive());
        System.out.println("Generic super class of an array of chars: " + vowels.getClass().getGenericSuperclass().getTypeName());
    }
}
