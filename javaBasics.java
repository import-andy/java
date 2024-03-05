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
        1. byte - 8 bits (binary digits 0 and 1) [2^-7; 2^7] (max 127)
        2. short - 16 bits: [2^-15; 2^15] (max 65,535)
        3. int - 32 bits: [2^-31; 2^31] (max 2,147,483,647)
        4. long - 64 bits: [2^-63; 2^63] 
        5. float - 1 + 8 + 23 = 32 bits floating-point number: [2^-149; (2-2^-23)2^127] (7-9 p.o.d.)
        6. double - 1 + 11 + 52 = 64 bits floating-point number:  [2^1074; (2-2^-52)2^1023] (16-19 p.o.d.)
        7. char - Unicode character, 16 bits
        8. boolean - true, false
    These are numeric convertible types.
    Represented by a sequence of bits (0 and 1).
    Default value is zero.

    More complex ones:
        java.lang.String - string
        java.util.Date - date

QUOTES:
    Single quotes for single characters: 'G'
    Double quotes for more that 1 character: "GG"

NAMES:
    CamelCase
    StartWithCapitalLetter - for classes
    startWithLowercaseLetter - for everything elese like var
    UPPERCASE - for constants

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
javac Runner.java - compile Runner.java  (press "Tab" to get the directory easier in a package structure)
java Runner.java - run Runner.java


 */