# LAB_D_Recursion
LAB_D for JAVA 111C City College San Francisco

Write a program that uses recursion to draw squares- one square on the corner of each square. You can write an applet or a standalone GUI program. Either is fine.

Requirements

Your program should have instance data that defines:

the initial size of the largest square
the minimum length of a size of a square
by what factor you shrink the size for each round of squares
Your program will include a recursive method to draw a square.

The method should draw one square (the small part of the problem it solves now).
The method should then recursively call itself to draw the four squares at the corner of the current square. (The sides of these smaller squares are reduced by some factor.)
The recursive method should be initially invoked once from the paint or paintComponent method.
Consider:
What parameters should that method have?
What initial values are sent into the first call to this method?
When does the method stop (what is the base case)?
Notes

In my sample below, I use an initial side length of 200, a minimum side length of 10, and I cut the size of a side in half each time.
You do not have to use these values- experiment with your own.
In the sample, I fill the square in gray and then draw the outline in black. You are not required to do this.
I include a couple versions of the sample output below. You only need to submit one version of your program.
I recommend first getting the program working with using a method to draw a single square.
I strongly recommend sketching out the coordinates on paper before attempting to put them into code.
I have provided template code that you can use to start from for an applet or a standalone program. You are not required to use this.
Extra Credit

(15 points) Instead of drawing a square, draw a different polygon (e.g., any closed-sided figure but not a circle, square, or rectangle). It could be a triangle, parallelogram, trapezoid, be creative!

Note: If completing the extra credit, you do not need to do both the square version and the extra credit- you can complete only the extra credit.

Sample Output





If you want to see what this looks like with fewer squares, to get a better sense of what is going on, here are two images that use a minimum side length of 50 and 100. 

 
