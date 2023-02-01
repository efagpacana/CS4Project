public class Mulcho extends Question{
  public String choice1, choice2, choice3;
  public Mulcho(String e, int p, String q, String a, String c1, String c2, String c3){
    super (e, p, q, a);
    choice1 = c1;
    choice2 = c2;
    choice3 = c3;
  }
public String getChoice1() {
	return choice1;
}

public String getChoice2() {
	return choice2;
}

public String getChoice3() {
	return choice3;
}

  
}