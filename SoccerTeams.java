import javax.swing.JOptionPane;
public class SoccerTeams{
   public static void main(String[] args){
      final int MIN_PLAYERS = 9; 
      final int MAX_PLAYERS = 15;
      int players; 
      int teamSize;              // number of players per team
      int teams;                 // number of teams
      int leftOver;              // number of leftover players
      String input;              // to hold the user input
      
      input = JOptionPane.showInputDialog("Enter the number of players per team"); // getting the number of players per team
      teamSize = Integer.parseInt(input);
      while (teamSize > MAX_PLAYERS || teamSize < MIN_PLAYERS){ //validating the number entered 
         input = JOptionPane.showInputDialog("The number must be" + " at least " + MIN_PLAYERS + " and no more than " + MAX_PLAYERS + ".\n Enter" + "the number of players");
         teamSize = Integer.parseInt(input);
      }
      
      input = JOptionPane.showInputDialog("Enter the available number of players"); // get the number of available players 
      players = Integer.parseInt(input);
      while (players < 0){ // validate the number entered 
         input = JOptionPane.showInputDialog("Enter 0 or greater");
         players = Integer.parseInt(input);
      }
      
      teams = players / teamSize; // calculate the number of teams
      leftOver = players % teamSize; // calculate the number of leftover players
      
      // display the result
      JOptionPane.showMessageDialog(null, "there will be " + teams + " teams with " + leftOver + " players left over. ");
      
      System.exit(0);
   }
}