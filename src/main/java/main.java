

public class main {
    public static void main(String[] args) {
        //bugfix1
        //release 생성
        //frature_두번째수정
        //feature_로그인기능1
        //로그인페이지
        //java
        //dev
        // featureTestPage
        //feature1_a_b
        SubtractCalculator c1 = new SubtractCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.subtract();
        int left = c1.getLeft();
        System.out.println(left);

        int right = c1.getRight();
        System.out.println(right);

        MultipleCalculator c2 = new MultipleCalculator();
        c2.setOprands(20,20);
        c2.multiple();

        DivideCalculator c3 = new DivideCalculator();
        c3.setOprands(10,5);
        c3.divide();

        Likes likes = new Likes();
        likes.good();
        System.out.println(likes.getLike());
        likes.bad();
        System.out.println(likes.getLike());
        likes.normal();
        int str = likes.getLike();
        System.out.println(str);


    }


}
