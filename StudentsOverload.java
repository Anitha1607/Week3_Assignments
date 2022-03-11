package week3testleaf;

public class StudentsOverload {
	
	public void getStudentInfo(int id) {
		
		System.out.println("The student id ");
				
	}
	
public void getStudentInfo(int id,String name) {
		
		System.out.println("The student id and name ");
				
	}
	
public void getStudentInfo(String email,long phone) {
	
	System.out.println("The student email and phone ");
			
}

public static void main(String[] args) {
	StudentsOverload ol=new StudentsOverload();
	ol.getStudentInfo(10002);
	ol.getStudentInfo(1001, "anitha");
	ol.getStudentInfo("xyz@gmail.com", 9094222489L);
}

}
