public class Main {
    public static void main(String[] args){
        String message = "This message was sent on Social Network";
        String userName = "Ion.Creanga";
        String password = "PupazaDinTei";

        Facebook facebook=new Facebook(userName, password);
        Instagram instagram = new Instagram(userName, password);

        facebook.post(message);
        instagram.post(message);

    }
}
