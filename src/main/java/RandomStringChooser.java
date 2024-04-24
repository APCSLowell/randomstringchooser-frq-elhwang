import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> wordList;
  public RandomStringChooser(String[]list){
    wordList = new ArrayList <String> ();
    for(int i = 0; i < list.length; i++){
      wordList.add(list[i]);
    }
  }
  public String getNext(){
    if(wordList.size() == 0)
      return "NONE";
    int i = (int)(Math.random()*wordList.size())
      return wordList.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
