package bt_copyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = "";
            while ((str = br.readLine()) != null) {
                strings.add(str);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return strings;
    }
    public void writeFile(String filePath, List<String> strings) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i=0;i<strings.size();i++) {
                bufferedWriter.write(strings.get(i)+"\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String> strings=copyFile.readFile("D:\\source.txt");
        copyFile.writeFile("D:\\copysource.txt",strings);

    }

}
