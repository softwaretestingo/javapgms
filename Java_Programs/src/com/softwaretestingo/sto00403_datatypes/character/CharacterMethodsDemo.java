package com.softwaretestingo.sto00403_datatypes.character;
public class CharacterMethodsDemo 
{
    public static void main(String[] args) 
    {
        basicObjectMethods();
        propertyChecks();
        caseConversions();
        numericAndUnicodeInfo();
        codePointOps();
        digitRadixOps();
        javaIdentifierChecks();
    }

    // ------------------------------------------------------------
    // 1) Character value & object-related methods
    // ------------------------------------------------------------
    static void basicObjectMethods() 
    {
        System.out.println("\n=== 1) Object/Value Methods ===");

        Character obj = Character.valueOf('A');
        char primitive = obj.charValue();
        System.out.println("charValue(): " + primitive);

        Character cached = Character.valueOf('A');
        System.out.println("valueOf('A'): " + cached);

        System.out.println("Character.toString('Z'): " + Character.toString('Z'));
        System.out.println("obj.toString(): " + obj.toString());

        System.out.println("equals(): " + obj.equals(Character.valueOf('A')));
        System.out.println("compareTo(): " + obj.compareTo(Character.valueOf('B')));
        System.out.println("compare('a','b'): " + Character.compare('a', 'b'));
    }

    // ------------------------------------------------------------
    // 2) Common character property checks
    // ------------------------------------------------------------
    static void propertyChecks() 
    {
        System.out.println("\n=== 2) Property Checks ===");

        char a = 'a';
        char A = 'A';
        char nine = '9';
        char space = ' ';
        char tab = '\t';

        System.out.println("isLetter('A'): " + Character.isLetter(A));
        System.out.println("isDigit('9'): " + Character.isDigit(nine));
        System.out.println("isLetterOrDigit('9'): " + Character.isLetterOrDigit(nine));

        System.out.println("isLowerCase('a'): " + Character.isLowerCase(a));
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(A));

        System.out.println("isWhitespace(' '): " + Character.isWhitespace(space));
        System.out.println("isWhitespace('\\t'): " + Character.isWhitespace(tab));

        System.out.println("isSpaceChar(' '): " + Character.isSpaceChar(space));
        System.out.println("isISOControl('\\u0007'): " + Character.isISOControl('\u0007'));

        // Title case examples exist in Unicode; simple demo:
        System.out.println("isTitleCase('ǅ'): " + Character.isTitleCase('ǅ'));
    }

    // ------------------------------------------------------------
    // 3) Case conversions
    // ------------------------------------------------------------
    static void caseConversions()
    {
        System.out.println("\n=== 3) Case Conversions ===");

        System.out.println("toUpperCase('b'): " + Character.toUpperCase('b'));
        System.out.println("toLowerCase('C'): " + Character.toLowerCase('C'));
        System.out.println("toTitleCase('ǆ'): " + Character.toTitleCase('ǆ'));
    }

    // ------------------------------------------------------------
    // 4) Numeric + Unicode type/name
    // ------------------------------------------------------------
    static void numericAndUnicodeInfo() 
    {
        System.out.println("\n=== 4) Numeric + Unicode Info ===");

        System.out.println("getNumericValue('9'): " + Character.getNumericValue('9'));
        System.out.println("getNumericValue('A'): " + Character.getNumericValue('A'));

        System.out.println("getType('A'): " + Character.getType('A'));            

        // getName takes a codePoint int:
        int cp = 'A';
        System.out.println("getName('A' codePoint): " + Character.getName(cp));
    }

    // ------------------------------------------------------------
    // 5) Code point operations (important for Unicode/surrogates)
    // ------------------------------------------------------------
    static void codePointOps() 
    {
        System.out.println("\n=== 5) Code Point Operations ===");

        // String containing a supplementary character (emoji) uses surrogate pair in UTF-16:
        String s = "Hi \uD83D\uDE04"; // 😄 as surrogate pair
        int idx = 3; // position of surrogate start
        int codePointAt = s.codePointAt(idx);
        System.out.println("codePointAt(\"Hi 😄\", 3): " + codePointAt);

        System.out.println("charCount(codePointAt): " + Character.charCount(codePointAt));

        // Arrays:
        char[] arr = s.toCharArray();
        System.out.println("codePointAt(char[], index): " + Character.codePointAt(arr, idx));
        System.out.println("codePointBefore(char[], index): " + Character.codePointBefore(arr, idx + 2));

        // Count code points in a range:
        System.out.println("codePointCount(char[], 0, len): " + Character.codePointCount(arr, 0, arr.length));
    }

    // ------------------------------------------------------------
    // 6) Digit/radix conversion
    // ------------------------------------------------------------
    static void digitRadixOps() 
    {
        System.out.println("\n=== 6) Digit/Radix Operations ===");

        System.out.println("forDigit(10,16): " + Character.forDigit(10, 16));
        System.out.println("digit('F',16): " + Character.digit('F', 16));
        System.out.println("digit('8',10): " + Character.digit('8', 10));
    }

    // ------------------------------------------------------------
    // 7) Java identifier checks (variable name validation)
    // ------------------------------------------------------------
    static void javaIdentifierChecks() 
    {
        System.out.println("\n=== 7) Java Identifier Checks ===");

        char start = '_';
        char part = '9';
        System.out.println("isJavaIdentifierStart('_'): " + Character.isJavaIdentifierStart(start));
        System.out.println("isJavaIdentifierPart('9'): " + Character.isJavaIdentifierPart(part));
        // Oracle notes these methods have strict Unicode version rules for Java identifiers.
    }
}