public class Calculator {
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public int getLeft(){
        return this.left;
    }
    public int getRight(){
        return this.right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}
class SubtractCalculator extends Calculator{
    public void subtract(){
        System.out.println(this.left - this.right);
    }
}