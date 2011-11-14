package jsettlers.main.swing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import jsettlers.common.resources.IResourceProvider;

public class ResourceProvider implements IResourceProvider {
	private String path;

	public ResourceProvider() {
		String currentParentFolder =
		        new File(new File("").getAbsolutePath()).getParent().replace(
		                '\\', '/');
		path = currentParentFolder + "/jsettlers.common/resources/";
	}
	
	@Override
    public InputStream getFile(String name) throws IOException {
		File file = new File(path + name);
	    return new FileInputStream(file);
    }

	@Override
    public OutputStream writeFile(String name) throws IOException {
		File file = new File(path + name);
	    return new FileOutputStream(file);
    }
	
}
