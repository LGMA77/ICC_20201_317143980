public class HeyJude{
   public static String HEY = "Hey Jude ";
   public static String DON = "don't ";
   public static String MAK = "make it bad.";
   public static String BEA = "be afraid.";
   public static String LET = "let me down.";
   public static String TAK = "Take a sad song and make it better.";
   public static String YOW = "You were made to go out and get her.";
   public static String YOH = "You have found her, now go and get her.";
   public static String REM = "Remember to ";
   public static String LEH = "let her into you heart.";
   public static String LES = "let her into your skin.";
   public static String THE = "Then you ";
   public static String CAN = "can start ";
   public static String BEG = "begin ";
   public static String TOM = "to make it better ";
   public static String BET = "better ";
   public static String NA  = "na ";

   public static String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

   public static String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

 public static void main(String[] args){
 System.out.println (HEY);
 System.out.println (" ");
 int i = 0;
      while (i == 0) {
      System.out.println (HEY + DON + MAK);
      System.out.println (TAK);
      System.out.println (REM + LEH);
      System.out.println (THE + CAN + TOM);
      System.out.println (" ");
      i++;
      }
      switch (i){
        case 1 : System.out.println(HEY + DON + BEA);
        case 2 : System.out.println(YOH);
        case 3 : System.out.println(REM + LES);
        case 4 : System.out.println(THE + BEG + TOM);
        case 5 : System.out.println(" ");
        break;
        }
     if (i<5){ 
       System.out.println(AND);
       System.out.println(" ");
       System.out.println(HEY + DON + LET);
       System.out.println(YOH);
       System.out.println(REM + LEH);
       System.out.println(THE + CAN + TOM);
       System.out.println(" ");
     }
    else { 
      System.out.println("todavia no tengo instrucciones");
    }
    i = 1;
    while (i==1) {
    System.out.println(SOL);
    i++;
    }
    switch (i){
        case 2 : System.out.println(HEY + DON + MAK);
        case 3 : System.out.println(TAK);
        case 4 : System.out.println(REM + LES);
        case 5 : System.out.println(THE + BEG + TOM);
        case 6 : System.out.println(" ");
        break;
        }
  } 
}
