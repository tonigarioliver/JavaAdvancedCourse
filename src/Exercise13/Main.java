package Exercise13;

import static Exercise13.ArrayBuilder.addtoArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result is: "+DivideFunction.divide(2,0));
        int[] values = {2,4};
        values=addtoArray(values,5,4);
        for(int value : values) {
            System.out.print(value);
        }
        System.out.println();
        EditFileTxt txt = new EditFileTxt();
        String path="C:\\Users\\tonie\\IdeaProjects\\JavaAdvancedCourse\\src\\Exercise13";
        txt.openFile("file.txt",path,true);
        txt.writeonlyFile("Hello World");
    }
}
