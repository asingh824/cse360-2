package cse360assignment02;

public class AddingMachine {
  private int total;
  private string newstring;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    newstring="0";
  }
  
  public int getTotal () {
    return total;
    //return total;
  }
  
  public void add (int value) {
	  total = total+value;
	  newstring=newstring + "+" + value;
  }

  public void subtract (int value) {
	  total=total-value;
	  newstring=newstring + "-" + value;
	  
  }

  public String toString () {
    return newstring;
  }

  public void clear() {
	  total=0;
	  newstring="0";
  }
}