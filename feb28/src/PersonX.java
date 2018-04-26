import com.sun.org.apache.xpath.internal.operations.String;

public class PersonX {
    String name;
    String email;
    String phone;

    //constructor
    public PersonX(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getName() {
            return name;
        }
     public String getemail() {
         return email;
     }

     public String getephone() {
         return phone;
     }




    public void printGreeting(PersonX person) {
        System.out.println("Hello" + person.getName() + ",im" + name);
    }

    public static void main(String[] args){
        PersonX sonny= new PersonX("sunny","sonny@gmail.com","571-220-5550");
        PersonX Azadeh= new PersonX("azadeh","azi.azi4@gmail.com","571-333-4343");
            System.out.println(sonny.getemail());
            System.out.println(Azadeh.getemail());
                    }

    }
}
