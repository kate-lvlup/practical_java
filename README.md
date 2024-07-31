# JOM. Classes. Encapsulation. Exceptions
## Task 4

Create a method for calculating an area of a rectangle: **int squareRectangle(int a, int b)**

This method should throw an **IllegalArgumentException** with the message "**both arguments should be more than zero**" if at least one of its arguments is non-positive. 

Create a method **trySquareRectangle** that takes two parameters and calls **squareRectangle** to evaluate an area of a rectangle. Catch any exceptions that might be generated.

**trySquareRectangle** method shouldn't generate any exceptions. If one or both parameters are non-positive, the method should return **-1**.
