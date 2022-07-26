# Base-Conversion-using-Recursion
Using a recursive method to reduce time complexity of a method that converts number to various bases
It will involve the method:
public String changeBase(int iNum, int iBase)

This method will take a base-10 integer value (iNum), convert it to any base we like (iBase), and return the result as a string. It should use recursion to accomplish this.

In the main() that you use to run your program, you may assume that the first argument will be an integer, and you can generate an error for a negative number. You should write code to ensure that the second base will be less than 10*, but greater than 1.

As an example: The binary equivalent of 13 may be found by repeatedly dividing 13 by 2. If there is a remainder, a 1 gets concatenated to the resulting String. If there is no remainder, a 0 should be concatenated instead.

13 / 2 = 6 r 1
6 / 2 = 3 r 0
3 / 2 = 1 r 1
1 / 2 = 0 r 1

13 in base 2 is 1101. The method should return "1101".

As another example: 529, converted into base 5, can be found by repeatedly dividing by 5.
529 / 5 = 105 r 4
105 / 5 = 21 r 0
21 / 5 = 4 r 1
4 / 5 = 0 r 4
And the equivalent would be "4104".
