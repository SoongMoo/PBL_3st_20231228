package java_20240119_1;

public class TakeTrans {
	public static void main(String [] args) {
		Student student1 = new Student( 5000 ,"이숭무");
		Bus bus = new Bus(0, 100);
		SubWay subWay = new SubWay(1);
		student1.takeBus(bus); // 객체 전달
		bus.showInfo();
		
		Student student2 = new Student( 6000 ,"이장범");
		student2.takeBus(bus);
		bus.showInfo();
	}
}
