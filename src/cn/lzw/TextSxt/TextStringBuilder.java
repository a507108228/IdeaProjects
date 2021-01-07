package cn.lzw.TextSxt;

public class TextStringBuilder {
    /*  public static void main (String[] args){
          String str;

          StringBuilder sb = new StringBuilder ("abcdefg");

          System.out.println(Integer.toHexString (sb.hashCode ()));
          System.out.println(sb);

          sb.setCharAt (2,'m');
          System.out.println(Integer.toHexString (sb.hashCode ()));
          System.out.println(sb);
      }
  */
    public static void main ( String[] args ) {
        StringBuilder sb = new StringBuilder ( );
        for ( int i = 0 ; i < 26 ; i++ ) {
            char temp = ( char ) ( 'a' + i );
            sb.append ( temp );
        }
        System.out.println ( sb );
        sb.reverse ( ); //倒叙排列
        System.out.println ( sb );
        sb.setCharAt ( 3 , '不' );
        System.out.println ( sb );
        sb.insert ( 0 , '我' ).insert ( 9 , '爱' ).insert ( 12 , '你' );
        System.out.println ( sb );
    }
}