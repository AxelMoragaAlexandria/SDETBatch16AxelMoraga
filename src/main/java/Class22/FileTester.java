package Class22;

public class FileTester {
    public static void main(String[] args) {

        File[]file={new JavaFile("Loops",55),new WordFile("JavaEssay",45),new PdfFile("JavaSlides",100)};

        for(File f:file){
            f.close();
            f.edit();
            f.open();
        }
    }
}
