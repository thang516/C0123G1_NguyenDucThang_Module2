package on_tap2.write;

import java.io.*;

public class DocGhiFile {

        public static void main(String[] args) {
        writeString("src\\on_tap2\\write\\file_doc.txt","Nguyễn Đức Thắng ",true);
        writeString("src\\on_tap2\\write\\file_doc.txt","Đinh nguyên thảo ",true);
        writeString("src\\on_tap2\\write\\file_doc.txt","Đinh nguyên thảo ",true);
        writeString("src\\on_tap2\\write\\file_doc.txt","Đinh nguyên thảo ",true);
        writeString("src\\on_tap2\\write\\file_doc.txt","Đinh nguyên thảo ",true);
        writeString("src\\on_tap2\\write\\file_doc.txt","Đinh nguyên thảo ",true);
        }

    public static void writeString(String filePath,String text, boolean appear){
        File file = new File(filePath);
       FileWriter fileWriter = null;
       BufferedWriter bufferedWriter=null;

        try {
          fileWriter=new FileWriter(file,appear);
          bufferedWriter=new BufferedWriter(fileWriter);
          bufferedWriter.write(text);
          bufferedWriter.newLine();
          bufferedWriter.close();
          fileWriter.close();

        } catch (FileNotFoundException e) {
         e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}
