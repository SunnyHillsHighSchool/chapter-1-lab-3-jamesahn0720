public class Chick implements Animal {
    private String myType;
    private String mySound;

    Chick()
    {
        myType="chick";
        mySound="cluck";
    }

    Chick(String type)
    {
            if(type=="old")
            {
                myType="chick";
                mySound="cluck";
            }
           
            else if(type=="childish")
            {
                myType="chick";
                mySound="cheep";
            }
           
            else
            {
                myType="chick";
                mySound="cheep"+", cluck";
            }
    }
  
   public String getSound()
    {
        return mySound;
    }

    public String getType()
    {
        return myType;
    }
}
  
