
public interface IPublisher {
	
	public boolean Subscribe(Object o);
	
	public boolean Unsubscribe(Object o);
	
	public boolean Notify();

}
