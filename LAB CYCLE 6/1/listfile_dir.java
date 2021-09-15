package CO6;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
public class listfile_dir {
	
	public static void main(String[] args) { 
		File file = new File("D:\\new");
		System.out.println("Sub directories	and Files: ");
		String[] list=file.list();
		
		for(String str:list)
		{
			System.out.println(str);
		}
	
		FilenameFilter fil=new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				return name.startsWith("h");
			}
		};
		System.out.println("\nFiles in starting with 'h': ");
		String[] sub=file.list(fil);
		if(sub==null)
		{
			System.out.println("No such files in the given directory");
		}
		else
		{
			for(int i=0;i<sub.length;i++)
			{
				String fname=sub[i];
				System.out.println(fname);
			}
		}
	}
}
