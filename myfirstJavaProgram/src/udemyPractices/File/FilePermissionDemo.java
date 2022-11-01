package udemyPractices.File;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionDemo {

	public static void main(String[] args) {
		String srg = "C:\\Users\\Ajmi\\Desktop\\a.txt";
		FilePermission f1 = new FilePermission("C:\\Users\\Ajmi\\Desktop\\-", "read");
		PermissionCollection permission = f1.newPermissionCollection();  
		permission.add(f1);
		
		FilePermission f2 = new FilePermission(srg, "write");
		permission.add(f2);
		
		if(permission.implies(new FilePermission(srg, "read,write"))) { 
			System.out.println("Read, Write permission is granted for the path "+srg );  
		}
		else {
			System.out.println("No Read, Write permission is granted for the path "+srg);            }  
    
		}
		

	}

