package OOP_1;

public class User {
    String name;
    String password;


    String login(){
      return "logged In";
    }

    String Register(){
        if(name.equals("Ayomide") || password.equals("12345")){
            return "can't be Empty";
        }
        else {
            return "Successfully Registered";
        }
    }
}
