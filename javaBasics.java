/*
JAVA BASICS:
a = b   assignes new value for 'a' from 'b'
a == b  compares the value or equality

True = 1
False = 0

% - remainder of:
    101 % 4 = 1
// - floor division:
    101 // 4 = 25

TYPES OF DATA:
    Primitive ones:
        boolean - true, false
        char - one-character Unicode value, 16 bits
        bit = 1 bit (smallest piece) - can be either 0 or 1
        byte = 8 bits. from -128 to 127
        short = 16 bits: [2-15; 215], from -32,768 to +32,767
        int = 32 bits: [2-31; 231], from -2,147,483,648 to 2,147,483,647
        long = 64 bits: [2-63; 263], from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float = 32 bits (1 + 8 + 23 bit) storing 6 to 7 decimal digits
        double = 64 bits (- 1 + 11 + 52) storing 15 decimal digits
    These are numeric convertible types.
    Represented by a sequence of bits (0 and 1).
    Default value is zero.

    More complex ones:
        java.lang.String - string
        java.util.Date - date

LOGICAL OPERATORS:
    NOT !
    AND &&
    OR ||
    XOR (Exclusive OR) ^

QUOTES:
    Single quotes for single characters: 'G'
    Double quotes for more that 1 character: "GG"

NAMES:
    CamelCase
    class StartWithCapitalLetter - for classes
    String startWithLowercaseLetter - for everything elese like var
    static UPPERCASE - for constants
    containsNumber123
Prohibited names:
    withDashes-123
    123startsWithNumber
    containsSpaces 123
    should not start with underscore _ or dollar sign $ characters

VARIABLES
    1. Instance variables :
        Are variables declared at a class level.
        Should always be private.
        Are given default values:
            boolean: false
            numeric: 0
            objects: null
    2. Local Variables:
        Local variables have local scope.
        They can only be seen inside the the curly brackets within which
            they were declared. Local variables are not given default values.

COMMAND LINE COMMANDS:
javac ie/atu/dip/Entity.java - compile (press "Tab" to get the directory easier in a package structure)
java ie.atu.dip.Entity - run 


 */