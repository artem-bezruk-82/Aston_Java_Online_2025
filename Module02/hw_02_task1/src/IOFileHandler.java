public abstract class IOFileHandler<T> extends IOHandler<T>
{
    protected String filePath;
    public IOFileHandler(String filePath){this.filePath = filePath;}
    public String getFilePath() {return filePath;}
    public void setFilePath(String filePath) {this.filePath = filePath;}

}
