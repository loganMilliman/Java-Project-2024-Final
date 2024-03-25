public class Austronaut{

  //variables
  private String name;
  private String dateOfBirth;
  private String IDnumb;
  private String address;
  private String email;
  private String phoneNumb;
  private String nextOfKin;
  private String status;
  private double salary;
  private double weight;
   

      // No args-constructer for the variables above
      public Austronaut(){
        name ="";
        dateOfBirth ="";
        IDnumb ="";
        address ="";
        email ="";
        phoneNumb ="";
        nextOfKin ="";
        status ="";
        salary = 0;
        weight = 0;
      }

        /* This constructor initializes the object with a name, ID, and salary.
           @param n The name.
           @param d The dateOfBirth.
           @param i The IDnumb
           @param a The address.
           @param e the email.
           @param p the phoneNumb.
           @param k the nextOfKin.
           @param t the status.
           @param s The salary.
           @param w the weight*/
        public Austronaut(String name, String dateOfBirth, String IDnumb, String address, String email, String phoneNumb, String nextOfKin, String status, double salary, double weight){
          this.name = name;
          this.dateOfBirth = dateOfBirth;
          this.IDnumb = IDnumb;
          this.address = address;
          this.email = email;
          this.phoneNumb = phoneNumb;
          this.nextOfKin = nextOfKin;
          this.status = status;
          this.salary = salary;
          this.weight = weight;
        }
  
    /* The setName method sets the name field.
         @param n The name to use. */
     public void setName(String n){
        name = n;
     }
    /* The setDateOfBirth method sets the name field.
         @param d The dateOfBirth. */
     public void setDateOfBirth(String d){
        dateOfBirth = d;
     }
    /* The setIDnumb method sets the name field.
         @param i The IDnumb */
     public void setIDnumb(String i){
        IDnumb = i;
     }
    /* The setAddress method sets the name field.
         @param a The address */ 
    public void setAddress(String a){
        address = a;
     }
    /* The setEmail method sets the name field.
         @param e the email. */
     public void setEmail(String e){
        email = e;
     }
    /* The setPhoneNumb method sets the name field.
         @param p the phoneNumb. */
     public void setPhoneNumb(String p){
        phoneNumb = p;
     }
    /* The setNextOfKin method sets the name field.
         @param k the nextOfKin. */
     public void setNextOfKin(String k){
        nextOfKin = k;
     }
    /* The setStatus method sets the name field.
         @param t the status. */
     public void setStatus(String t){
        status = t;
     }
    /* The setSalary method sets the name field.
         @param s The salary. */
     public void setSalary(double s){
        salary = s;
     }
    /* The setWeight method sets the name field.
         @param w the weight. */
    public void setWeight(double w){
        weight = w;
     }

    /* The getName method returns the name field.
         @return The name. */
    public String getName(){
        return name;
     }
   /* The getDateOfBirth method returns the name field.
         @return The dateOfBirth. */
     public String getDateOfBirth(){
        return dateOfBirth;
     }
    /* The getIDnumb method returns the name field.
         @return The IDnumb. */
     public String getIDnumb(){
        return IDnumb;
     }
    /* The getAddress method returns the name field.
         @return The address. */
    public String getAddress(){
        return address;
     }
    /* The getEmail method returns the name field.
         @return The email. */
     public String getEmail(){
        return email;
     }
    /* The getPhoneNumb method returns the name field.
         @return The phoneNumb. */
     public String getPhoneNumb(){
        return phoneNumb;
     }
    /* The getNextOfKin method returns the name field.
         @return The nextOfKin. */
     public String getNextOfKin(){
        return nextOfKin;
     }
    /* The getStatus method returns the name field.
         @return The status. */
     public String getStatus(){
        return status;
     }
    /* The getSalary method returns the name field.
         @return The salary. */
     public double getSalary(){
        return salary;
     }
    /* The getWeight method returns the name field.
         @return The weight. */
    public double getWeight(){
        return weight;
     }
}
