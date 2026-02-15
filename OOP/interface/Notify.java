interface Notification{
    void sendMessage();
}
class Email implements Notification{
    String message;

    public Email(String message) {
        this.message = message;
    }
    
    public void sendMessage(){
        System.out.println("Message send through email: "+message);
    }
}
class SMS implements Notification{
    String message;

    public SMS(String message) {
        this.message = message;
    }

    public void sendMessage(){
        System.out.println("Message send through sms: "+message);
    }
}
class Notify{
    public static void main(String[] args) {
        Notification n;

        n=new Email("yo! happy to connect");
        n.sendMessage();

        n=new SMS("you are doing great in life");
        n.sendMessage();
    }
}