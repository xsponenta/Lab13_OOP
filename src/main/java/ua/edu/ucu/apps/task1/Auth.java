package ua.edu.ucu.apps.task1;

public class Auth {
    public MyUser login() {
//        return new MyFacebookUser(new FacebookUser());
        return new MyTwitterUser(new TwitterUser());
    }
}
