public class Main {
  public static void main(String[] args) {
    PenPals p = new PenPals();
    Person first = new Person("peet", 1,3,5);
    Person no2 = new Person("parmeet", 2,4,1);
    p.addMember(first);
    p.addMember(no2);
    System.out.printlm(p.getNumMembers());
  }
}
