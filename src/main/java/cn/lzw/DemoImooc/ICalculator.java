package cn.lzw.DemoImooc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lzw
 * @date 2020/9/17 18:31
 * @description
 */
public class ICalculator {
    public static void main ( String[] args ) {
        WinGrid ICalc = new WinGrid ( );
        ICalc.setTitle ( "计算器1.0" );
    }
}

class WinGrid extends JFrame {
    JPanel calc, screen;
    JButton[] buttons = new JButton[ 16 ];
    JButton clear = new JButton ( "CE" );
    JTextField screen_txt = new JTextField ( "0" );
    String[] str = { "7" , "8" , "9" , "+" , "4" , "5" , "6" , "-" , "1" , "2" , "3" , "*" , "0" , "." , "=" , "/" };
    double result = 0;
    boolean IsClick = false;
    char operator = '=';
    boolean IsPoint = false;
    NumberListener numberListener = new NumberListener ( );
    OperatorListener operatorListener = new OperatorListener ( );
    ClearListener clearListener = new ClearListener ( );

    WinGrid ( ) {
        calc = new JPanel ( new GridLayout ( 4 , 4 ) );
        screen = new JPanel ( new BorderLayout ( ) );
        for ( int i = 0 ; i < 16 ; i++ ) {
            buttons[ i ] = new JButton ( str[ i ] );
            if ( i == 3 || i == 7 || i == 11 || i == 14 || i == 15 ) {
                buttons[ i ].addActionListener ( operatorListener );
            } else buttons[ i ].addActionListener ( numberListener );
            calc.add ( buttons[ i ] );
        }
        clear.addActionListener ( clearListener );
        screen.add ( screen_txt , BorderLayout.CENTER );
        screen.add ( screen_txt , BorderLayout.EAST );
        add ( screen , BorderLayout.NORTH );
        add ( calc , BorderLayout.CENTER );
        setBounds ( 450 , 150 , 240 , 240 );
        setVisible ( true );
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        validate ( );

    }

    class ClearListener implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
            screen_txt.setText ( "" );

        }

    }

    class NumberListener implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
            if ( ! IsClick ) {
                screen_txt.setText ( "" );
                IsClick = true;

            }
            String s = screen_txt.getText ( );
            s += e.getActionCommand ( );
        }
    }

    class OperatorListener implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
            if ( ! IsClick ) return;
            String s = screen_txt.getText ( );
            double num = Double.parseDouble ( s );
            IsClick = false;
            switch ( operator ) {
                case '+': {
                    result += num;
                    break;
                }
                case '-': {
                    result -= num;
                    break;
                }
                case '*': {
                    result *= num;
                    break;
                }
                case '/': {
                    result /= num;
                    break;
                }
            }
            screen_txt.setText ( String.valueOf ( result ) );
            String op = e.getActionCommand ( );
            operator = op.charAt ( 0 );
        }
    }

}
