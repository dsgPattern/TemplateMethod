public class Facebook extends SocialNetwork {

    public Facebook(String userName, String password){
        _userName = userName;
        _password = password;
    }

    @Override
    boolean login(String userName, String password) {
        if(userName=="" || password=="" || userName.length()<10){
            System.out.println("Invalid data for login");
            return false;
        }

        System.out.println("user "+userName+" logged in susccesfully");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean sentMessage = false;
        if(data.length<1) return sentMessage;
        System.out.println("message : "+new String(data));
        sentMessage = true;

        return sentMessage;
    }

    @Override
    void logout() {
        System.out.println("User has logged out");
    }
}
