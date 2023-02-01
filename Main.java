import java.util.Scanner;
class Main {
  public static String gameMode;
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    Question q1 = new OpenAnswer("10s", 200 , "This Nba player is hdhdhdhd", "Lebron");
    Question q2 = new OpenAnswer("10s", 200 , "This Nba player is hdhdhdhd", "Curry");
    System.out.println("What mode would you like to play");
    gameMode = input.nextLine();
    if (gameMode.equals("singleplayer")){
      while(Question.wrongAnswers < 3){
        singlePlayer();
      } 
    } else if (gameMode.equals("multiplayer")){
        multiPlayer();
    }
  }
  


  public static void singlePlayer(){
    Scanner input = new Scanner(System.in);
    System.out.println("What question would you like to answer");
    int chosenIndex = input.nextInt();
    Question chosenQuestion = Question.questionList.get(chosenIndex + 1);
    Question.doublePoints(chosenQuestion);
    System.out.println(chosenQuestion.getQuestion());
    String answer = input.nextLine();
    if(Question.checker(answer) == true){
      System.out.println("You got it right");
    } else {
      System.out.println("You got it wrong");
    }
  }
  public static void multiPlayer(){
    
  }
  
}