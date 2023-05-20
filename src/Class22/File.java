package Class22;
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text,
   to open .doc file we need Microsoft word to be installed etc.
 */
public abstract class File {

   private String name;
   private
   int size;

    File(String name,int size){
        this.name=name;
        this.size=size;
        }
    abstract void open();

    public void edit(){
        System.out.println("Editing by clicking, add and removing words");
    }
   public void close(){
        System.out.println("Click the exit button to close the application");
    }
}

class JavaFile extends File{

    JavaFile(String name,int size){
        super(name, size);
    }
    @Override
    void open(){
        System.out.println("We need Intellij++ and sublime text to open");
    }


}

class WordFile extends File{
    WordFile(String name,int size){
        super(name, size);
    }
    @Override
    void open(){
        System.out.println("We need an app and verification code to open");
    }


}

class PdfFile extends File {
    PdfFile(String name,int size){
        super(name, size);
    }
    @Override
        void open(){
            System.out.println("We need a link that it is a pdf to open");
        }

}



