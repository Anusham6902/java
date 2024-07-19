public class Person{
	
	public String name;
	public byte age;
	public String education;
	public String loc;
	public double weight;
	public long phNo;
	public int salary;
	
	public Person(){
		System.out.println("No arguments");
	}
	
	public Person(String name){
				System.out.println("Contain one argument");
				 this.name=name;
                 System.out.println("Name is:"+name);
				 System.out.println("---------------------------");
	}
	public Person(String name,byte age){
				System.out.println("Contain two argument");
				 this.name=name;
				 this.age=age;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);

				 System.out.println("---------------------------");
	}
	public Person(String name,byte age,String education){
				System.out.println("Contain three argument");
				 this.name=name;
				 this.age=age;
				 this.education=education;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);
				  System.out.println("Education is:"+education);
               System.out.println("---------------------------");
	}
	public Person(String name,byte age,String education,String loc){
				System.out.println("Contain four argument");
				 this.name=name;
				 this.age=age;
				 this.education=education;
				 this.loc=loc;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);
				  System.out.println("Education is:"+education);
				  System.out.println("Locatin is:"+loc);
                  System.out.println("---------------------------");
	}
	public Person(String name,byte age,String education,String loc, double weight){
				System.out.println("Contain five argument");
				 this.name=name;
				 this.age=age;
				 this.education=education;
				 this.loc=loc;
				 this.weight=weight;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);
				  System.out.println("Education is:"+education);
				  System.out.println("Locatin is:"+loc);
				  System.out.println("Weight is:"+weight);
                  System.out.println("---------------------------");
	}
	public Person(String name,byte age,String education,String loc, double weight, long phNo){
				System.out.println("Contain six argument");
				 this.name=name;
				 this.age=age;
				 this.education=education;
				 this.loc=loc;
				 this.weight=weight;
				 this.phNo=phNo;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);
				  System.out.println("Education is:"+education);
				  System.out.println("Locatin is:"+loc);
				  System.out.println("Weight is:"+weight);
				  System.out.println("PhNo:"+phNo);
             System.out.println("---------------------------");
	}
	public Person(String name,byte age,String education,String loc, double weight, long phNo,int salary){
				System.out.println("Contain seven argument");
				 this.name=name;
				 this.age=age;
				 this.education=education;
				 this.loc=loc;
				 this.weight=weight;
				 this.phNo=phNo;
				 this.salary=salary;
                 System.out.println("Name is:"+name);
				  System.out.println("Age is:"+age);
				  System.out.println("Education is:"+education);
				  System.out.println("Locatin is:"+loc);
				  System.out.println("Weight is:"+weight);
				  System.out.println("PhNo:"+phNo);
				   System.out.println("Salary:"+salary);

             System.out.println("---------------------------");
	}
}
	
	