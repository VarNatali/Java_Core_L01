package logos.example;

public class lesson01 {
    public static void main(String[] args) {
        //завдання 1
        System.out.println("завдання 1 ");
        int in=1;
        double d=1;
        boolean b=true;
        float f=1;
        long l=5;
        short s=5;
        System.out.println("int= "+in);
        System.out.println("double= "+d);
        System.out.println("bool= "+b);
        System.out.println("float= "+f);
        System.out.println("long= "+l);
        System.out.println("short= "+s);

        //завдання 2
        System.out.println("завдання 2 ");
        System.out.println("max Int= "+ Integer.MAX_VALUE );
        System.out.println("min Int= "+ Integer.MIN_VALUE );

        System.out.println("max Byte= "+ Byte.MAX_VALUE );
        System.out.println("min Byte= "+ Byte.MIN_VALUE );

        System.out.println("max Double= "+ Double.MAX_VALUE );
        System.out.println("min Double= "+ Double.MIN_VALUE );
        System.out.println("max Float= "+ Float.MAX_VALUE );
        System.out.println("min Float= "+ Float.MIN_VALUE );
        System.out.println("max Long= "+ Long.MAX_VALUE );
        System.out.println("min Long= "+ Long.MIN_VALUE );

        System.out.println("max Short= "+ Short.MAX_VALUE );
        System.out.println("min Short= "+ Short.MIN_VALUE );
        System.out.println("max Character= "+ Character.MAX_VALUE );
        System.out.println("min Character= "+ Character.MIN_VALUE );

        //завдання 3

        System.out.println("завдання 3 ");
        int [] array1={5, 8, 12, 45, 14, 25, 18, 19, 52, 23};
        int max=0;

        for(int i=0; i<10; i++){
            if (array1[i]>max) {
                max=array1[i];

            }
        }
        System.out.println("max int= "+ max);
    }
}
