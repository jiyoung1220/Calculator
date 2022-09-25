public class test1 {
 int like;
    public int getLike(){
        return this.like;
    }
    public void good(){
        this.like += 1;
     }
     public void bad(){
         this.like -=1;
     };
     public void normal(){
         System.out.println("normal");
     }

    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.good();
        System.out.println(t1.getLike());
        t1.bad();
        System.out.println(t1.getLike());
        t1.normal();
    }
}

