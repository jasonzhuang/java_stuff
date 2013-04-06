package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		Employee harry = new Employee("Lucy", 5000, 1989, 10, 1);
		Manager jason = new Manager("Jason", 8000, 1987, 12, 15);
		jason.setSecretary(harry);
		Manager tony = new Manager("Tony", 4000, 1990, 3, 15);
		tony.setSecretary(harry);

		Employee[] staff = new Employee[3];
		staff[0] = jason;
		staff[1] = harry;
		staff[2] = tony;

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
			out.writeObject(staff);
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
			Employee[] newStaff = (Employee[])in.readObject();
			in.close();

			//raise secretary salary.
			newStaff[1].raiseSalary(10);

			//print the newly read employee records.
			for (Employee e : newStaff) {
				String s = String.valueOf(e);
                synchronized (System.out) {
                    System.out.print(s);
                }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
