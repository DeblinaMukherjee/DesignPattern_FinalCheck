package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		

		INotificationService service = new NotificationService();
		INotificationObserver admin1 = new AdminObserver(service, "Mr. X", 100);
		INotificationObserver admin2 = new AdminObserver(service, "Ms. Y", 105);
		INotificationObserver admin3 = new AdminObserver(service, "Mr. Z", 99);

		service.AddObserver(admin1);
		service.AddObserver(admin2);
		service.AddObserver(admin3);
		service.NotifyObserver();
		service.RemoveObserver(admin2);
		service.NotifyObserver();
	}

}
