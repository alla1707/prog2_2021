package aufgabe07;

public interface Publisher {
	
	public boolean register(Listener listener);
	public boolean unregister(Listener listener);
	public void notifyListeners();
	public String getUpdate(Listener listener);
}

