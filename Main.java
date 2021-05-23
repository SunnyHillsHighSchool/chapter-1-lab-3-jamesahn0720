class Main {
  public static void main(String[] args) {
Animal c = new Cow();
    System.out.println( c.getType() + " goes " + c.getSound() );

    Animal chick = new Chick();
    System.out.println( chick.getType() + " goes " + chick.getSound() );

    Animal pig = new Pig();
    System.out.println( pig.getType() + " goes " + pig.getSound() );
  }
}
