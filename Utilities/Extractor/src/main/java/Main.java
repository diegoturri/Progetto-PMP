import java.io.File;

class Main {

    public static void main(String[] args) {

        // link to file Test.class
        File file = new File("path of your database's directory wich contains the pain expressions");

        // get file name using getName()
        String fileName = file.getName();
        System.out.println(fileName);

    }
}