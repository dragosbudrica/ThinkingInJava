package strings.exercise16;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
	private static List<File> allFiles = new ArrayList<File>();
	
	public static List<File> getAllFilesFromThisDirectory(File file) {
		for (File currentFile : file.listFiles()) {
			if(currentFile.isDirectory()) 
				getAllFilesFromThisDirectory(currentFile);
			else 
				allFiles.add(currentFile);
		}
		return allFiles;
	}
	
	public static void grep(String filename, String regex) {
		System.out.println("File path: " + filename);
		Pattern p = Pattern.compile(regex);
		int index = 0;
		Matcher m = p.matcher("");
		for(String line : new TextFile(filename)) {
			m.reset(line);
			while(m.find()) {
				System.out.println(index++ + ": " +
						m.group() + ": " + m.start());
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		if(args.length < 2) {
			System.out.println("Usage: java NameOfFolderOrFile file regex");
			System.exit(0);
		}
		File file = new File(args[0]);
		if(!file.isDirectory()) {
			grep(args[0], args[1]); 
		} else {
			List<File> files = getAllFilesFromThisDirectory(file);
			for (File currentFile : files) {
				grep(currentFile.getPath(), args[1]);
			}
		}
	}
}