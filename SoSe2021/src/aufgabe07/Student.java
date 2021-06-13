package aufgabe07;

public class Student implements Listener {
	
	private String name;
	private Publisher publisher;
	
	public Student(String name)
	{
		this.name = name;
	}

	@Override
	public void update() 
	{
		String msg = this.publisher.getUpdate(this);
		System.out.println(this.name + " received " + msg);
	}

	@Override
	public void setPublisher(Publisher publisher) 
	{
		this.publisher = publisher;
		if(this.publisher.register(this)) 
		{
			System.out.println(this.name + " registered!");
		}	
	}

	@Override
	public void removePublisher(Publisher publisher) 
	{
		if(this.publisher.unregister(this)) 
		{
			System.out.println(this.name + " deregistered!");
		}
		this.publisher = null;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		return this.name.equals(other.name);
	}
	
	@Override
	public int hashCode() 
	{
		return this.name.hashCode();
	}

}