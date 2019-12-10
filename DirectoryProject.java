import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryProject {

//	public String creatFolder(String path,String fName){
//		String newPath = "";
//		File file=new File(path + File.separator + fName);
//		if (!file.exists()) {
//            if (file.mkdir()) {
//                System.out.println("Directory is created!");
//            } else {
//                System.out.println("Failed to create directory!");
//            }
//        }
//		newPath = file.getPath();
//		System.out.println("hh "+file.getParent());
//		return newPath ;
//	}
	public static void main(String[] args) {
		File root = new File("C:\\root");
		root.mkdirs();
		System.out.println("ok");
		List<String> alphabet = new ArrayList<String>();
		for (int i = 0; i < 4; i++) { 
			alphabet.add("root"+i); 
			} 
		final int depth = 3; 
			mkDirs(root, alphabet, depth); 
			}
	public static void mkDirs(File root, List<String> dirs, int depth) {
		if (depth == 0) 
			return;
		for (String s : dirs) {
			File subdir = new File(root, s); 
			subdir.mkdir();
	mkDirs(subdir, dirs, depth - 1); 
	} 
		}
}
