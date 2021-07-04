package utils;

import java.io.File;

import java.io.File;

public class EmployeeTest {
	/**
	 * Delete files recursively
	 * 
	 * @param contentsToDelete
	 * @return boolean
	 */
	public static boolean deleteFiles(File contentsToDelete) {
		File[] allContents = contentsToDelete.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				deleteFiles(file);
			}
		}
		return contentsToDelete.delete();
	}

}


