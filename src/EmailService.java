public class EmailService implements NotificationService {

    @Override
    public void notify(User user) {
        IO.println("Notifying " + user.getEmail() + "...");
        IO.println("Done!\n");
    }
}
