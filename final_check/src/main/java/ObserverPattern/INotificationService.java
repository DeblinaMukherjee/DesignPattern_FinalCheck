package ObserverPattern;

public interface INotificationService {


	public void AddObserver(INotificationObserver nObserver);

	public void RemoveObserver(INotificationObserver nObserver);

	public void NotifyObserver();
}
