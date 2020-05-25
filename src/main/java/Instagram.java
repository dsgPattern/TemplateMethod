public class Instagram extends SocialNetwork {
    public Instagram(String userName, String password){
        _userName = userName;
        _password = password;
    }

    @Override
    boolean login(String userName, String password) {
        System.out.println("Logged in user "+userName);
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println(new String(data));
        return true;
    }


}
