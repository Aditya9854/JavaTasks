class UserAccount
{
    private final String username;
    private final String email;

    //optional fields
    private final String phoneNumber;
    private final String address;

    // private constructor
    private UserAccount(UserAccountBuilder builder)
    {
        this.username = builder.username;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public String toString()
    {
        return "UserAccount{ "+
                  "username='"+ username +'\''+
                  "email='"+email +'\''+
                  "Phone='"+phoneNumber +'\''+
                  "address='"+address +'\''+
                  '}';
    }

    //Builder class
    public static class UserAccountBuilder
    {
        private final String username;
        private final String email;
        private String phoneNumber = "N/A";
        private String address = "N/A";

        public UserAccountBuilder(String username,String email)
        {
            this.username = username;
            this.email = email;
        }

        public UserAccountBuilder setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserAccountBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        public UserAccount build()
        {
            return new UserAccount(this);
        }
    }
}

public class BuilderExample 
{
    public static void main(String[] a) 
    {
        //only providing req info
        UserAccount user1 = new UserAccount.UserAccountBuilder("customer1", "mail@example.com").build();

        //providing everything
        UserAccount user2 = new UserAccount.UserAccountBuilder("customer2", "mail2@example.com")
                                           .setPhoneNumber("994883")
                                           .setAddress("122,abc")
                                           .build();
        
        System.out.println("1st user : "+user1);
        System.out.println("2nd user : "+user2);
    }
}
