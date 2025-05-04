public class User
{
    String username;
    String email;
    String age;

    User(){};
    User(String username)
    {
        this.username = username;
        this.email = "";
        this.age = "0";
    }
    User(String username, String email)
    {
        this.username = username;
        this.email = email;
        this.age = "0";
    }
    User(String username, String email, String age)
    {
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
