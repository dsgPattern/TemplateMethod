public abstract class SocialNetwork {
    String _userName;
    String _password;

    public SocialNetwork(){

    }

    public boolean post(String message){
        if(login(_userName, _password)){
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }

        return false;
    }

    abstract boolean login(String userName, String password);
    abstract boolean sendData(byte[] data);
    void logout(){
        System.out.println("Logged out from base");
    }

}
