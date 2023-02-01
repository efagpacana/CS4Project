import java.util.ArrayList;

public abstract class Question{
  public String era, question;
  protected static String correctAnswer;
  protected static int points, wrongAnswers;
  public static ArrayList<Question> questionList = new ArrayList<>(); 

  public Question(String e, int p, String q, String a){
    era = e;
    points = p;
    question = q;
    correctAnswer = a;
    questionList.add(this);
  }

  public String getEra() {
	 return era;
  }

  public String getQuestion() {
	 return question;
  }

  public int getPoints() {
	 return points;
  }

  public static boolean checker(String s){
    if (s.equals(correctAnswer)){
      return true;
    } else {
      wrongAnswers++;
      return false;
    }
  }

  public static void doublePoints(Question q){
    int min = 1;
    int max = 10;
    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    if (random_int == 2){
      System.out.println("This question has double points");
      points = q.getPoints() * 2;
    }
  }

  
}