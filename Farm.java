class Farm  {     
   private Animal[] bunch = new Animal[3];    
   public Farm()     {       
      bunch[0] = new NamedCow("cow", "tyrone", "moo");           
      bunch[1] = new Chick("chick","cluck", "cheep");       
      bunch[2] = new Pig("pig","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < bunch.length; nI++)       {          
       System.out.println( bunch[nI].getType() + " goes " + bunch[nI].getSound());       
      }    
      System.out.println("The cow is " + ((NamedCow)(bunch[0])).getName());
    } }