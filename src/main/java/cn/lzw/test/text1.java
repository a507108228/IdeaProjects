package cn.lzw.test;

/**
 * @author lzw
 * @date 2020/9/16 17:49
 * @description
 */
public class text1 {
    public static void main ( String[] args ) {
        int i = 1;
        int count = 0;
        for ( i = 1; i <= 1000 ; i++ ) {
            if ( i % 5 != 0 && i % 6 != 0 && i % 8 != 0 ) {
                count++;
                System.out.print ( i + "\t" );
                if ( count % 28 == 0 ) {
                    System.out.println ( );

                }

            }


        }
        System.out.println ( "总数为: " + count );
    }

}
