package Day_3;

public class ClassDemonstration {
    public static void main(String[] args) {
        
        Person naleash = new Person(202206024,"Naleaswara Kumaran K",20,"Karaikal");
        long personId = naleash.getId();
        int age = naleash.getAge();
        String name = naleash.getName();
        String city = naleash.getCity();

        System.out.println(personId+" "+ name+" "+age+" "+city);
        
    }

    
    
}

class Person{
    private long  id;
	private String name;
	private int age;
	private String city;
	private String gender;
	private int income;
	private long tax;
	
	public Person() {
		System.out.println("Object Created");
	}
	public Person(long id, String name, int age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public int getIncome(){
		return income;
	}
	public void setIncome(int income){
		this.income = income;
	}
	public long getTax(){
		return tax;
	}
	public void setTax(long tax){
		this.tax=tax;
	}
	@Override
	public String toString() {
		return "Person [Id: " + id + ", Name: " + name + ", Age: " + age + ", City: " + city + "]";
	}
	
}
