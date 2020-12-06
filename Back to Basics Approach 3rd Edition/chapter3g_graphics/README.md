<h1 align="center"><u>Self-Check Answers</u></h1>
<h2 align="center"><mark><u>Section 3G.1: Introduction to Graphics</u></mark></h2>

> 1. Which of the following is the correct syntax to draw a rectangle?
>
> > ```java
> > Graphics g.drawRect(10, 20, 50, 30);                 // wrong, `drawRect` return `void`
> > g.drawRect(10, 20, 50, 30);                          // correct, assuming `g` is of type `Graphics`
> > g.draw.rectangle(10, 20, 50, 30);                    // wrong, `g.draw()` return `void` thus void.rectangle is CE
> > Graphics.drawRect(10, 20, 50, 30);                   // wrong, `drawRect` is not class method (i.e. static method)
> > g.drawRect(x = 10, y = 20, width = 50, height = 30); // wrong, `drawRect` should accept already valuated `int` values
> > ```

> 2. There are two mistakes in the following code, which attempts to draw a line from  
>    coordinates (50, 86) to (20, 35). What are they?
>
> > ```java
> > DrawingPanel panel = new DrawingPanel(200, 200);
> > panel.drawLine(50, 20, 86, 35); // panel can't draw line it is merely a canvas
> >                                // before drawing we must retrieve the "brush" from the panel
> >                                // Graphics brush = panel.getGraphics();
> >                                // brush. drawLine(50, 86, 20, 35);
> > panel.getGraphics().drawLine(50, 86, 20, 35); // solution
> > ```

> 3. The following code attempts to draw a black-filled outer rectangle with a  
>     white-filled inner circle inside it:
>    However, the graphical output looks like Figure 3G.17 instead.  
>     What must be changed for it to look as intended?
>    > ```java
>    > DrawingPanel panel = new DrawingPanel(200, 100);
>    > Graphics g = panel.getGraphics();
>    > // g.setColor(Color.BLACK); // change order and comment this line
>    > g.fillRect(10, 10, 50, 50);
>    > g.setColor(Color.WHITE);
>    > g.fillOval(10, 10, 50, 50);
>    > ```

> 4. The following code attempts to draw a black rectangle from (10, 20) to (50, 40)  
>     with a line across its diagonal
>    However, the graphical output looks like Figure 3G.18 instead.  
>     What must be changed for it to look as intended?
>    > ```java
>    > DrawingPanel panel = new DrawingPanel(200, 100);
>    > Graphics g = panel.getGraphics();
>    > // g.drawRect(10, 20, 50, 40);
>    > // g.drawLine(10, 20, 50, 40);
>    > g.drawRect(10, 20, 40, 20); // lower-right point is: (x, y) = (10 + 40, 20 + 20) = (50, 40)
>    > g.drawLine(10, 20, 50, 40); // diagonal from upper-left corner to lower-right corner
>    > ```

> 5. What sort of figure will be drawn by the following program?  
>     Can you draw a picture that will approximately match
>    its appearance without running it first?
>    > Ovals that start with radius 200 and 20 consecutive ovals with radius reduced
>    > by multiples of 10 shifted by 10 pixels to right and down.
>    >
>    > ```java
>    > import java.awt.*;
>    > public class Draw7 {
>    >   public static void main(String[] args) {
>    >     DrawingPanel panel = new DrawingPanel(200, 200);
>    >     Graphics g = panel.getGraphics();
>    >     for (int i = 0; i < 20; i++) {
>    >       g.drawOval(i * 10, i * 10, 200 – (i * 10), 200 – (i * 10));
>    >     }
>    >   }
>    > }
>    > ```
