class Main {
  public static void main(String[] args) {
    String fullname = "";
    String name = Keyboard.getText("enter you first name");
    String surname =  Keyboard.getText("enter you surname");
    String mothersMaiden = Keyboard.getText("enter you mothers maiden name");
    String PlaceOfBirth = Keyboard.getText("enter you place of birth");
    
//to split up the words Jay you need to use the substring() command this //lets you choose some of the characters from a String

//example getting the start of the surname would be

// as this is the second bit of the name it needs to be little letters
String nameStart = name.substring(0,2).toLowerCase();

String surnameStart = surname.substring(0,3);
 
String mothersMaidenStart = mothersMaiden.substring(0,3);

// you want to turn this all in to lowercase so it will look like:
//String PlaceOfBirthStart = PlaceOfBirth.substring(0,2).toLowerCase();

String PlaceOfBirthStart = PlaceOfBirth.substring(0,2);


//char character nameStart = toLowerCase;

fullname = "" + surnameStart + nameStart + " " + mothersMaidenStart + PlaceOfBirthStart; 

//this would give you the 0, 1, and 2 characters from the string so //letters 1,2 and 3 for humans?


    System.out.println("your star wars name is " + fullname);
  }
}