public class SqlVideoDatabase implements VideoDatabase {

    @Override
    public void store(Video video) {
        IO.println("Storing video metadata in a SQL database...");
        IO.println("Title: " + video.getTitle());
        IO.println("File Name: " + video.getFileName());
        IO.println("Done!\n");
    }
}
