//Gurpreet Singh 10/08.2021
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class RandomCode
{
   public static void main(String[] args)
   {
     
      ArrayList<String> charac = new ArrayList<>(Arrays.asList( "A","B","C","D","E","F","G","I","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
      int x = charac.size();
      int z = (int)x;
      String ace = charac.get((int)(Math.random()* z - 1) + 0);
      String B = charac.get((int)(Math.random()* z - 1) + 0);
      String C = charac.get((int)(Math.random()* z - 1) + 0);
      String D = charac.get((int)(Math.random()* z - 1) + 0);
      String E = charac.get((int)(Math.random()* z - 1) + 0);
      String F = charac.get((int)(Math.random()* z - 1) + 0);
          
      JOptionPane.showMessageDialog(null, ace +" "+ B +" "+ C +" "+ D +" "+ E + " "+F+" ", "Iere's your Code!", JOptionPane.INFORMATION_MESSAGE);
      System.out.println(ace +" "+ B +" "+ C +" "+ D +" "+ E + " "+F+" ");
       
      ArrayList<String> word = new ArrayList<>(Arrays.asList("Apple" , "Banana", "Candle" , "Diary", "Eagle" , "Frog ", "Grass" , "Hero", "Ice" , "Joker", "Kitten" , "Lobster", "Mango" , "Night", "Opposite" , "Parasite", 
         "Queen" , "Rainbow", "String" , "Train", "Umbrella" , "Violet", "Water" , "Xander", "Yellow" , "Zebra"));
         
     String G = "";
     String I = "";
     String H = "";
     String J="";
     String K="";
     String L="";
     //NUMBER 1
      if(ace.equals("A"))
      { G = word.get(0);}
      else
         
          if(ace.equals("B"))
      { G = word.get(1);}
      else
         
 if(ace.equals("C"))
      { G = word.get(2);}
         else
 if(ace.equals("D"))
      { G = word.get(3);}
         else
 if(ace.equals("E"))
      { G = word.get(4);}
         else
 if(ace.equals("F"))
      { G = word.get(5);}
         else
 if(ace.equals("G"))
      { G = word.get(6);}
         else
 if(ace.equals("H"))
      { G = word.get(7);}
         else
 if(ace.equals("I"))
      { G = word.get(8);}
         else
 if(ace.equals("J"))
      { G = word.get(9);}
         else
 if(ace.equals("K"))
      { G = word.get(10);}
         else
 if(ace.equals("L"))
      { G = word.get(11);}
         else
 if(ace.equals("M"))
      { G = word.get(12);}
         else
 if(ace.equals("N"))
      { G = word.get(13);}
         else
 if(ace.equals("O"))
      { G = word.get(14);}
         else
 if(ace.equals("P"))
      { G = word.get(15);}
         else
 if(ace.equals("Q"))
      { G = word.get(16);}
         else
 if(ace.equals("R"))
      { G = word.get(17);}
         else
 if(ace.equals("S"))
      { G = word.get(18);}
         else
 if(ace.equals("T"))
      { G = word.get(19);}
         else
 if(ace.equals("U"))
      { G = word.get(20);}
         else
 if(ace.equals("V"))
      { G = word.get(21);}
         else
 if(ace.equals("W"))
      { G = word.get(22);}
         else
 if(ace.equals("X"))
      { G = word.get(23);}
         else
 if(ace.equals("Y"))
      { G = word.get(24);}
         else
 if(ace.equals("Z"))
      { G = word.get(25);}
      
     
      
      //NUMBER 2
      
      
      if(B.equals("A"))
      { H = word.get(0);}
      else
         
          if(B.equals("B"))
      { H = word.get(1);}
      else
         
 if(B.equals("C"))
      { H = word.get(2);}
         else
 if(B.equals("D"))
      { H = word.get(3);}
         else
 if(B.equals("E"))
      { H = word.get(4);}
         else
 if(B.equals("F"))
      { H = word.get(5);}
         else
 if(B.equals("G"))
      { H = word.get(6);}
         else
 if(B.equals("H"))
      { H = word.get(7);}
         else
 if(B.equals("I"))
      { H = word.get(8);}
         else
 if(B.equals("J"))
      { H = word.get(9);}
         else
 if(B.equals("K"))
      { H = word.get(10);}
         else
 if(B.equals("L"))
      { H = word.get(11);}
         else
 if(B.equals("M"))
      { H = word.get(12);}
         else
 if(B.equals("N"))
      { H = word.get(13);}
         else
 if(B.equals("O"))
      { H = word.get(14);}
         else
 if(B.equals("P"))
      { H = word.get(15);}
         else
 if(B.equals("Q"))
      { H = word.get(16);}
         else
 if(B.equals("R"))
      { H = word.get(17);}
         else
 if(B.equals("S"))
      { H = word.get(18);}
         else
 if(B.equals("T"))
      { H = word.get(19);}
         else
 if(B.equals("U"))
      { H = word.get(20);}
         else
 if(B.equals("V"))
      { H = word.get(21);}
         else
 if(B.equals("W"))
      { H = word.get(22);}
         else
 if(B.equals("X"))
      { H = word.get(23);}
         else
 if(B.equals("Y"))
      { H = word.get(24);}
         else
 if(B.equals("Z"))
      { H = word.get(25);}
      
       //NUMBER 3
      
      
      if(C.equals("A"))
      { I = word.get(0);}
      else
         
          if(C.equals("C"))
      { I = word.get(1);}
      else
         
 if(C.equals("C"))
      { I = word.get(2);}
         else
 if(C.equals("D"))
      { I = word.get(3);}
         else
 if(C.equals("E"))
      { I = word.get(4);}
         else
 if(C.equals("F"))
      { I = word.get(5);}
         else
 if(C.equals("G"))
      { I = word.get(6);}
         else
 if(C.equals("H"))
      { I = word.get(7);}
         else
 if(C.equals("I"))
      { I = word.get(8);}
         else
 if(C.equals("J"))
      { I = word.get(9);}
         else
 if(C.equals("K"))
      { I = word.get(10);}
         else
 if(C.equals("L"))
      { I = word.get(11);}
         else
 if(C.equals("M"))
      { I = word.get(12);}
         else
 if(C.equals("N"))
      { I = word.get(13);}
         else
 if(C.equals("O"))
      { I = word.get(14);}
         else
 if(C.equals("P"))
      { I = word.get(15);}
         else
 if(C.equals("Q"))
      { I = word.get(16);}
         else
 if(C.equals("R"))
      { I = word.get(17);}
         else
 if(C.equals("S"))
      { I = word.get(18);}
         else
 if(C.equals("T"))
      { I = word.get(19);}
         else
 if(C.equals("U"))
      { I = word.get(20);}
         else
 if(C.equals("V"))
      { I = word.get(21);}
         else
 if(C.equals("W"))
      { I = word.get(22);}
         else
 if(C.equals("X"))
      { I = word.get(23);}
         else
 if(C.equals("Y"))
      { I = word.get(24);}
         else
 if(C.equals("Z"))
      { I = word.get(25);}


          //NUMBER 4
      
      
      if(D.equals("A"))
      { J = word.get(0);}
      else
         
          if(D.equals("B"))
      { J = word.get(1);}
      else
         
 if(D.equals("C"))
      { J = word.get(2);}
         else
 if(D.equals("D"))
      { J = word.get(3);}
         else
 if(D.equals("E"))
      { J = word.get(4);}
         else
 if(D.equals("F"))
      { J = word.get(5);}
         else
 if(D.equals("G"))
      { J = word.get(6);}
         else
 if(D.equals("H"))
      { J = word.get(7);}
         else
 if(D.equals("I"))
      { J = word.get(8);}
         else
 if(D.equals("J"))
      { J = word.get(9);}
         else
 if(D.equals("K"))
      { J = word.get(10);}
         else
 if(D.equals("L"))
      { J = word.get(11);}
         else
 if(D.equals("M"))
      { J = word.get(12);}
         else
 if(D.equals("N"))
      { J = word.get(13);}
         else
 if(D.equals("O"))
      { J = word.get(14);}
         else
 if(D.equals("P"))
      { J = word.get(15);}
         else
 if(D.equals("Q"))
      { J = word.get(16);}
         else
 if(D.equals("R"))
      { J = word.get(17);}
         else
 if(D.equals("S"))
      { J = word.get(18);}
         else
 if(D.equals("T"))
      { J = word.get(19);}
         else
 if(D.equals("U"))
      { J = word.get(20);}
         else
 if(D.equals("V"))
      { J = word.get(21);}
         else
 if(D.equals("W"))
      { J = word.get(22);}
         else
 if(D.equals("X"))
      { J = word.get(23);}
         else
 if(D.equals("Y"))
      { J = word.get(24);}
         else
 if(D.equals("Z"))
      { J = word.get(25);}


            //NUMBER 5
      
      
      if(E.equals("A"))
      { K = word.get(0);}
      else
         
          if(E.equals("B"))
      { K = word.get(1);}
      else
         
 if(E.equals("C"))
      { K = word.get(2);}
         else
 if(E.equals("D"))
      { K = word.get(3);}
         else
 if(E.equals("E"))
      { K = word.get(4);}
         else
 if(E.equals("F"))
      { K = word.get(5);}
         else
 if(E.equals("G"))
      { K = word.get(6);}
         else
 if(E.equals("H"))
      { K = word.get(7);}
         else
 if(E.equals("I"))
      { K = word.get(8);}
         else
 if(E.equals("J"))
      { K = word.get(9);}
         else
 if(E.equals("K"))
      { K = word.get(10);}
         else
 if(E.equals("L"))
      { K = word.get(11);}
         else
 if(E.equals("M"))
      { K = word.get(12);}
         else
 if(E.equals("N"))
      { K = word.get(13);}
         else
 if(E.equals("O"))
      { K = word.get(14);}
         else
 if(E.equals("P"))
      { K = word.get(15);}
         else
 if(E.equals("Q"))
      { K = word.get(16);}
         else
 if(E.equals("R"))
      { K = word.get(17);}
         else
 if(E.equals("S"))
      { K = word.get(18);}
         else
 if(E.equals("T"))
      { K = word.get(19);}
         else
 if(E.equals("U"))
      { K = word.get(20);}
         else
 if(E.equals("V"))
      { K = word.get(21);}
         else
 if(E.equals("W"))
      { K = word.get(22);}
         else
 if(E.equals("X"))
      { K = word.get(23);}
         else
 if(E.equals("Y"))
      { K = word.get(24);}
         else
 if(E.equals("Z"))
      { K = word.get(25);}

       


  //NUMBER 5
      
      
      if(F.equals("A"))
      { L = word.get(0);}
      else
         
          if(F.equals("B"))
      { L = word.get(1);}
      else
         
 if(F.equals("C"))
      { L = word.get(2);}
         else
 if(F.equals("D"))
      { L = word.get(3);}
         else
 if(F.equals("E"))
      { L = word.get(4);}
         else
 if(F.equals("F"))
      { L = word.get(5);}
         else
 if(F.equals("G"))
      { L = word.get(6);}
         else
 if(F.equals("H"))
      { L = word.get(7);}
         else
 if(F.equals("I"))
      { L = word.get(8);}
         else
 if(F.equals("J"))
      { L = word.get(9);}
         else
 if(F.equals("K"))
      { L = word.get(10);}
         else
 if(F.equals("L"))
      { L = word.get(11);}
         else
 if(F.equals("M"))
      { L = word.get(12);}
         else
 if(F.equals("N"))
      { L = word.get(13);}
         else
 if(F.equals("O"))
      { L = word.get(14);}
         else
 if(F.equals("P"))
      { L = word.get(15);}
         else
 if(F.equals("Q"))
      { L = word.get(16);}
         else
 if(F.equals("R"))
      { L = word.get(17);}
         else
 if(F.equals("S"))
      { L = word.get(18);}
         else
 if(F.equals("T"))
      { L = word.get(19);}
         else
 if(F.equals("U"))
      { L = word.get(20);}
         else
 if(F.equals("V"))
      { L = word.get(21);}
         else
 if(F.equals("W"))
      { L = word.get(22);}
         else
 if(F.equals("X"))
      { L = word.get(23);}
         else
 if(F.equals("Y"))
      { L = word.get(24);}
         else
 if(F.equals("Z"))
      { L = word.get(25);}
      

 JOptionPane.showMessageDialog(null, G +" "+ H +" "+ I +" "+ J +" "+ K + " "+L+" ", "Here's your Code!", JOptionPane.INFORMATION_MESSAGE);
 System.out.println( G +" "+ H +" "+ I +" "+ J +" "+ K + " "+L+" ");

     
   }
 
}