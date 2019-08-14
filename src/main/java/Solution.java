public class Solution {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB(a);
        a.setClassB(b);
        System.out.println(a);
        System.out.println(b);
    }
}
