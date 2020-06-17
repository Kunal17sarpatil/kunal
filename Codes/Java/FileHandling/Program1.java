/*
 * 1) public String getName()
 * 2) public String getParent()
 * 3) getParentFile()
 * 4) public String getPath()
 * 5) boolean isAbsolute();
 * 6) String getAbsolutePath()
 * 7) File getAbsoluteFile()
 * 8) boolean canRead() 
 * 9) boolean canWrite()
 * 10) boolean exists()	
 * 11) boolean isDirectory()
 * 12) boolean isFile()
 * 13) boolean isHidden()
 * 14) long lastModified()
 * 15) boolean delete()
 * 16) deleteOnExit()
 * 17) mdkir()
 * 18) list()
 * 19) listFiles()
 * 18) mkdirs()
 * 19) renameTo()
 * 20) setReadOnly()
 * 21) setWritable()
 * 22) setExecute()
 * 23) canExecute()
 * 24) createTempFile()
 * 
 */

import java.io.*;

class FileClassDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("/home/kunal/File1.txt");
		
		//CreateNewFile()
		f1.createNewFile();
		System.out.println("Is file Created = "+f1.exists());

		//getName()
		System.out.println("Name of File = "+f1.getName());

		//getParent
		System.out.println("Get Parent = "+f1.getParent());

		//getPath
		System.out.println("Get Path = "+f1.getPath());

		//getParent
		System.out.println("Is Absolute = "+f1.isAbsolute()); 

		//getAbsolutePath		
		System.out.println("Is Absolute = "+f1.getAbsolutePath()); 


	}
}