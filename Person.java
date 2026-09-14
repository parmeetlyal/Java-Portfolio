public class Person{

  private String name;
  private int sport;
  private int reading;
  private int cinema;

  public Person(String name, int sport, int reading, int cinema){
    this.name = name;
    this.sport = sport;
    this.reading = reading;
    this.cinema = cinema;
  }

  public String getName(){
    return this.name;
  }
  public int getSport(){
    return this.sport;
  }
  public int getReading(){
    return this.reading;
  }
  public int getCinema(){
    return this.cinema;
  }
}
