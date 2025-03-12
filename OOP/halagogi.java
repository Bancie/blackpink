class halagogi {

  int sum;


  halagogi(int arg1, int arg2) {
    this.sum = arg1 + arg2;
  }
  
  // halagogi() {
  //   this(5, 2);
  // }
  void display() {
    System.out.println("Sum is: " + sum);
  }

  public static void main(String[] args) {
    halagogi obj = new halagogi(5,2);
    obj.display();
  }
}