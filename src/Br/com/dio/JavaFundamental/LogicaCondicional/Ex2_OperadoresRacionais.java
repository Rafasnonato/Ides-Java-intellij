package Br.com.dio.JavaFundamental.LogicaCondicional;

public class Ex2_OperadoresRacionais {

    public static void main(String[] args) {
        int i1=10, i2 = 20;
        float f1= 4.5f, f2= 3.5f;
        double d1= 59.6d, d2= 60.15;
        char c1= 'x', c2 = 'y';
        String s1 = "fulano", s2 = "fulano", s3= "fulano";
        boolean b1= true, b2=false;
        long l1 = 1597l, l2 = 8997l;
        byte y1 = 1;
        short h1=25;

        System.out.println("i1 == i2 : " + (i1==i2));
        System.out.println("i1 != i2 : " + (i1!=i2));
        System.out.println("i1 > i2 : " + (i1>i2));
        System.out.println("i1 <= i2 : " + (i1<=i2));

        System.out.println("f1 == f2 : " + (f1==f2));
        System.out.println("f1 != f2 : " + (f1!=f2));
        System.out.println("f1 >= f2 : " + (f1>=f2));
        System.out.println("f1 < f2 : " + (f1<=f2));

        System.out.println("c1 == c2 : " + (c1==c2));
        System.out.println("c1 != c2 : " + (c1!=c2));
        System.out.println("c1 > c2 : " + (c1>c2));
        System.out.println("c1 <= c2 : " + (c1<=c2));
        //so eh possivel comparar tamanho do char pq no fundo ele eh um codigo que representa uma letra

        System.out.println("s1 == s2 : " + (s1==s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1 != s2 : " + (s1 != s2));
        // System.out.println("s1 <= s2 : " + (s1<=s2)); impossivel comparar se é maior ou menor com String

        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1 != b2 : " + (b1 != b2));
        // System.out.println("b1 <= b2 : " + (b1<=b2)); impossivel comparar se é maior ou menor com boolean

        System.out.println("i2 > f1 : " + (i2>f1));
        System.out.println("d1 == h1 : " + (d1 == h1));
        // System.out.println("s1 != c2 : " + (s1 != c2)); impossivel comparar String com Char

        System.out.println("l1 == i2 : " + (l1==i2));
        System.out.println("l2 >= i1 : "+ (l2 >= i1));
        System.out.println("y1 != h1 : " + (y1!=h1));
    }
}
