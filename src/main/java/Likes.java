public class Likes {
    int like;
    public int getLike(){
        return this.like;
    }
    public void good(){
        this.like += 1;
    }
    public void bad(){
        this.like -= 1;
    }
    public void normal(){
        System.out.println("normal~");
    }
}
