package Exercise13;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class EditFileTxt {
    private String filename = "default.txt";
    private File file;
    private FileInputStream streamFile;

    public FileInputStream getStreamFile() {
        return streamFile;
    }

    private void setStreamFile() {
        try {
            this.streamFile = new FileInputStream(this.file);
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public EditFileTxt(){}

    public  boolean openFile(String filename, String path,boolean createNewFile){
        String pathfile=path+"\\"+filename;
        boolean success = false;
        this.file = new File(pathfile);
        try{
            readonlyFile(file);
            success = true;
        }catch(FileNotFoundException e){
            if(createNewFile==true) {
                try {
                    file.createNewFile();
                    this.streamFile = new FileInputStream(file);
                    success = true;
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return success;
    }
    public void readonlyFile(File file) throws FileNotFoundException {
        this.streamFile=new FileInputStream(file);
    }
    public void writeonlyFile(String text){

        FileOutputStream outFile= null;
        try {
            outFile = new FileOutputStream(this.file);
            byte out[]=text.getBytes();
            outFile.write(out);
            outFile.close();
        } catch (IOException e) {
            System.out.println("ERROR WRITTING");
        }


    }
    public String getFilename() {
        return filename;
    }

    public File getFile() {
        return file;
    }

}
