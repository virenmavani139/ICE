 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;



import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(c1.getValue());//use a method to generate random *13
            c1.setSuits(c1.Getting_Random_Suit());//random method suit 
            
        }
      Card luckyCard = new Card(1,"diamond");
        //step 2:take input 
        System.out.println("Enter card: ");
        int card=sc.nextInt();
        System.out.println("Enter suit(heart, spade, diamond, club) : ");
        String suit=sc.next();
        
        
        
        //step 3: match with array 
         for( int i=0;i<magicHand.length;i++)
        {
            if(magicHand[i].getValue()==card && magicHand[i].getSuits()==suit)
            {
                System.out.println("Win");
            }
            else
            {
                System.out.print("lose ");
            }
        }
    }
    
}
