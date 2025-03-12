class Company {
    String name;
  
    // public constructor
    private Company() {
      name = "Programiz";
    }
}
  
class halagogi {
    public static void main(String[] args) {
  
      // object is created in another class
      Company obj = new Company();
      System.out.println("Company name = " + obj.name);
    }
}