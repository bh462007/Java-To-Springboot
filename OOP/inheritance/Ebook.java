class Book{
    String title;
    String author;
    void showBook(){
        System.out.println("Title: "+title);
        System.out.println("Book by "+author);
    }
}
class Ebook extends Book{
    double filesize;
    void download(){
        if(filesize >= 100){
            System.out.println("File size is large \nIt might take time to download..");
        }
        else{
            System.out.println("Start Downloading");
        }
    }
    public static void main(String[] args) {
        Ebook eb1=new Ebook();
        eb1.title="Surrounded by idiots";
        eb1.author="Thomas Erikson";
        eb1.filesize=45;

        eb1.showBook();
        eb1.download();
    }
}