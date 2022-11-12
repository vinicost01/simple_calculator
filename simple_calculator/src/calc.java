/*
* author @ vini.cost
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class calc {
        public static void main(String[] args) {
            JFrame frame=new JFrame("tela");
            frame.setContentPane(new calc().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        int nt,ntt,x2=1,op=0;
        double s1,s2,x,xs;
    ArrayList<Integer> n1=new ArrayList<>();
    ArrayList<Integer> n2=new ArrayList<>();
    private JPanel panel1;private JButton a7Button;private JButton a8Button;
    private JButton a9Button;private JButton a4Button;private JButton a5Button;
    private JButton a6Button;private JButton a3Button;private JButton a2Button;
    private JButton a1Button;private JButton button10;private JButton button11;
    private JButton a0Button;
    private JButton ccButton;
    private JButton button2;private JButton Button15;private JButton button3;
    private JTextArea a0TextArea;
    public calc() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(1);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(1);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(3);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(3);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(4);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(4);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);};
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(5);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(5);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(6);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(6);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);};
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(7);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(7);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(8);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(8);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                    n1.add(9);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
                if(x2==2){
                    n2.add(9);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(x2==1){
                n1.add(0);
                try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                imp(x2);}
                if(x2==2){
                    n2.add(0);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    imp(x2);}
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1=imp(x2);
                a0TextArea.setText("0");
                x2=2;
                op=1;
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1=imp(x2);
                a0TextArea.setText("0");
                x2=2;
                op=2;
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1=imp(x2);
                a0TextArea.setText("0");
                x2=2;
                op=3;
            }
        });
        Button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1=imp(x2);
                a0TextArea.setText("0");
                x2=2;
                op=4;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==1){
                    s2=imp(x2);
                    x=(s1+s2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    xs=xs+x;
                    a0TextArea.setText(Double.toString(xs));
                    x=0;
                    s1=xs;
                    s2=0;
                    n2.clear();
                    n1.clear();
                }
                if(op==2){
                    s2=imp(x2);
                    x=(s1-s2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    xs=xs+x;
                    a0TextArea.setText(Double.toString(xs));
                    x=0;
                    s1=x;
                    s2=0;
                    n2.clear();
                    n1.clear();
                }
                if(op==3){
                    s2=imp(x2);
                    x=(s1/s2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    xs=xs+x;
                    a0TextArea.setText(Double.toString(xs));
                    x=0;
                    s1=x;
                    s2=0;
                    n2.clear();
                    n1.clear();
                }
                if(op==4){
                    s2=imp(x2);
                    x=(s1*s2);
                    try {Thread.sleep(100);} catch (InterruptedException ex) {throw new RuntimeException(ex);}
                    xs=xs+x;
                    a0TextArea.setText(Double.toString(xs));
                    x=0;
                    s1=x;
                    s2=0;
                    n2.clear();
                    n1.clear();
                }
            }
        });
        ccButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1.clear();
                n2.clear();
                a0TextArea.setText("0");
                x2=1;
                xs=0;
                s1=0;
                s2=0;
                x=0;
            }
        });
    }
    int s;
     double imp(int x){
         if(x==1){
             int m=1;
             for (int j=1;j< n1.size();j++){
                 m=m*10;
             }
             for(int i=0;i< n1.size();i++){
                 if(n1.get(i).equals(0)){
                     if(m<1){
                         ntt=(ntt*10);
                     }
                 }
                 else {
                     nt=n1.get(i);
                     s=nt*m;
                     ntt=(ntt+s);
                 }
                 m=m/10;
             }
         }
         if(x==2){
             int m=1;
             for (int j=1;j< n2.size();j++){
                 m=m*10;
             }
             for(int i=0;i< n2.size();i++){
                 if(n2.get(i).equals(0)){
                     if(m<1){
                         ntt=(ntt*10);
                     }
                 }
                 else {
                     nt=n2.get(i);
                     s=nt*m;
                     ntt=(ntt+s);
                 }
                 m=m/10;
             }
         }
         a0TextArea.setText(Integer.toString(ntt));
         int nttt=ntt;
         ntt=0;
         return nttt;
     }
}
