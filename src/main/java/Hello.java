public class Hello {
    String msg;
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return this.msg;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setMsg("Hello world~");
        String st = hello.getMsg();
        System.out.println(st);

    }
}
