import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) 
  {
    int width=0;
    int height=0;
    int radius=0;
    int sidelength=0;
    int shape=0;
    char answer = 'Y';
    Scanner jarvis = new Scanner(System.in);

    do
    {
      

    
    
    System.out.println("Which shape would you like to calculat the area of? 1 for Triangle, 2 for Circle, 3 for rectangle or 4 for square? ");
    shape = jarvis.nextInt();
    
    if ((shape == 1) || (shape == 3))
      {
      System.out.println("Enter the dimensions of the shape. What is the width/base? ");
      width = jarvis.nextInt();
      System.out.println("What is the height? ");
      height = jarvis.nextInt();
      }
    if (shape == 2)
    {
      System.out.println("Enter the radius of the circle? ");
        radius = jarvis.nextInt();
    }
    if (shape ==4)
    {
      System.out.print("Enter a sidelength of your square");
        sidelength = jarvis.nextInt();
    }



    if (shape == 1)
    
    {
      System.out.print("The area of your triangle is... ");
      System.out.println(width * height/2);
    }

    if (shape == 2)

    {
      System.out.print("The area of your circle is... ");
      System.out.println(Math.PI * radius * radius);
    }

    if (shape == 3)
    {
      System.out.print("The area of your rectangle is... ");
      System.out.println(width*height);
    }

    if (shape ==4)
    {
      System.out.print("The area of your square is... ");
      System.out.println(sidelength * sidelength);
    }

      System.out.println("Do you want to calculate more areas, enter Y/N");
        answer = jarvis.next().charAt(0);
      
    }  while ((answer == 'Y') || (answer == 'y'));
  }
}
