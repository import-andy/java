public class basicAlgorithms {
    public static void main(String[] args) {
            }
}
/*
Tasks & pseudocode:
1. Write an algorithm that returns the largest element in an array. Assume the array is unsorted.
    Input: unsorted array
    Output: largest element in the array

    array = [1, 6, 4, 23, 9, 122]
    int biggestValue
    biggestValue = array[0]
    
    for element in array:
        if element > biggestValue:
            element == biggestValue
    return biggestValue


2. Write an algorithm that returns a new array which is the reverse of the input.
    Input: array
    Output: reversed array

    array = [1, 2, 3, 4, 5]
    reversedArray = []

    for i in array[-1, 0]:    # from -1 to 0
        reversedArray.append(i)
    return reversedArray


3. Write an algorithm that checks whether an element occurs in an array.
    Input: array (assuming unsorted), searched elememt
    Output: True/False

    array = [1, 6, 4, 23, 9, 122]
    int searchedElement

    for i in array:
        if i == searchedElement:
            return True
            break
        else:
            continue
    return False


4. Write an algorithm that returns the elements on odd positions in an array.
    Input: array
    Output: odd position elements

    array = [1, 2, 3, 4, 5]
    oddPositionsElementsArray = []

    for i in array[0, -1, 2]:   # from 0 to -1 step 2
        oddPositionsElementsArray.append(i)
    return oddPositionsElementsArray


5. Write an algorithm that computes the running total of an array of numbers.
    Input: array
    Output: array's elements' total

    array = [1, 2, 3, 4, 5]
    int total

    for i in array:
        total += i
    return total


6. Write an algorithm that prints a multiplication table for numbers up to 12.

    for a in range [1, 12]:
        for b in range [1, 12]:
            print(a "x " b "= " a*b)
        print()


7. Write an algorithm that prints the first 100 prime numbers.

    i = 1
    print(i)
    i = 2
    print(i)
    i = 3
    print(i)
    i = 4

    counter = 3
    previousNumbers = [2, 3]

    while counter < 97:                   # for the first 97 prime numbers not including 1-3
        for a in previousNumbers:         
            if i % a != 0:                # remainder of division should not be 0
                print i
                counter += 1
            previousNumbers.append(i)


8. Write an algorithm that prints the numbers from 1 to 100 and for multiples of ’3’ print “Fizz” 
instead of the number and for the multiples of ’5’ print “Buzz”.

    for i in range [1, 100]:
        if i % 3 == 0:
            System.out.println("Fizz")
        if i % 5 == 0:
            System.out.println("Buzz")
        print i
 */