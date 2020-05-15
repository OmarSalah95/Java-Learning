package src;

public class Person {
   private String name;
   private int creditLimit;
   private String email;

   // Constructor for if all values given on initialization
   public Person (String name, int creditLimit, String email) {
       this.name = name;
       this.creditLimit = creditLimit;
       this.email = email;
       System.out.println("Class created");
   }

   // Constructor if no values are given on initialization
   public Person() {
       this("Joe Shmoe ", 500, " asdf@asdf.com");
       System.out.println("Default applied" + name + creditLimit + email);
   }

   // Constructor for if only name is given on initialization
   public Person (String name) {
       this(name, 600, "wubba");
       System.out.println("Default 2 applied " + name + creditLimit + email);
   }

   
    
}