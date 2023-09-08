import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.net.URI;
class MainFrame extends JFrame
{
    MainFrame()
    {
        this.setTitle("MY FRAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
       // this.setResizable(false);
       ImageIcon image = new ImageIcon("C:\\Users\\tejes\\Downloads\\R.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 215, 0));
        // Layout : 
        this.setLayout(null);

        Label1 l1 = new Label1();
        Label2 l2 = new Label2();
        Label3 l3 = new Label3();
        Label4 l4 = new Label4();
        Label5 l5 = new Label5();

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);

        this.setVisible(true);
        JButton button = new JButton();
        button.setBounds(0,0,1600,50);
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("yes i Have created the button..."));
        button.setEnabled(true);
        button.setText("click here");
        button.setForeground(Color.yellow);
        button.setBackground(Color.black);
        this.add(button, BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame();
                frame.setSize(400,400);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout(10,10));


                JPanel p1 = new JPanel();
                JPanel p2 = new JPanel();
                JPanel p3 = new JPanel();
                JPanel p4 = new JPanel();
                JPanel p5 = new JPanel();

                p1.setBackground(Color.black);
                p2.setBackground(Color.black);
                p3.setBackground(Color.black);
                p4.setBackground(Color.black);
                p5.setBackground(Color.black);

                p1.setPreferredSize(new Dimension(100,100));
                p2.setPreferredSize(new Dimension(100,100));
                p3.setPreferredSize(new Dimension(100,100));
                p4.setPreferredSize(new Dimension(100,100));
                p5.setPreferredSize(new Dimension(100,100));

        

                frame.add(p1,BorderLayout.NORTH);
                frame.add(p2,BorderLayout.SOUTH);
                frame.add(p3,BorderLayout.EAST);
                frame.add(p4,BorderLayout.WEST);
                frame.add(p5,BorderLayout.CENTER);
            }
        });
    }
}
class Label1 extends JLabel
{
    Label1()
    {
        Border border = BorderFactory.createLineBorder(Color.blue,6);
        this.setText("<html><a href=\"https://www.python.org/\" style=\"color:white;\">Python</a></html>");
        ImageIcon image1 = new ImageIcon("C:\\Users\\tejes\\Downloads\\python-logo.jpg");
        this.setIcon(image1);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBorder(border);
        this.setBounds(100, 100, 300, 200);
        class MouseListner extends MouseAdapter
        {
            public void mouseClicked(MouseEvent e){
                if(Desktop.isDesktopSupported()){
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://www.python.org/"));
                    }
                    catch(Exception ex){
                        System.out.print("error occurs");
                    }
                }
            }
        }
        MouseListner m = new MouseListner();
        this.addMouseListener(m);
    }
}
class Label2 extends JLabel
{
    Label2()
    {
        Border border = BorderFactory.createLineBorder(Color.red,6);
        this.setText("<html><a href=\"https://www.python.org/\" style=\"color:white;\">Instagram</a></html>");
        ImageIcon image1 = new ImageIcon("C:\\Users\\tejes\\Downloads\\Instagram-logo-200x200.png");
        this.setIcon(image1);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBorder(border);
        this.setBounds(600, 100, 300, 200);

        class MouseListner1 extends MouseAdapter{
            public void mouseClicked(MouseEvent e){
                if(Desktop.isDesktopSupported()){
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://www.instagram.com"));
                    }
                    catch(Exception ex){
                        System.out.print("Error occur");
                    }
                }
            }
        } 
        MouseListner1 m1 = new MouseListner1();
        this.addMouseListener(m1);
    }
}

class Label3 extends JLabel
{
    Label3()
    {
        Border border = BorderFactory.createLineBorder(new Color(204, 102, 0),6);
        this.setText("<html><a href=\"https:/www.java.com/\" style=\"color:white;\">Java</a></html>");
        ImageIcon image1 = new ImageIcon("C:\\Users\\tejes\\Downloads\\java-icon-png-15.jpg");
        this.setIcon(image1);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBorder(border);
        this.setBounds(1100, 100, 300, 200);

        class MouseListner extends MouseAdapter
        {
            public void mouseClicked(MouseEvent e){
                if(Desktop.isDesktopSupported()){
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://www.java.com/"));
                    }
                    catch(Exception ex){
                        System.out.print("error occurs");
                    }
                }
            }
        }
        MouseListner m = new MouseListner();
        this.addMouseListener(m);
    }
}
class Label4 extends JLabel
{
    Label4()
    {
        Border border = BorderFactory.createLineBorder(new Color(128,0,128),6);
        this.setText("<html><a href=\"https://en.wikipedia.org/wiki/C++/\" style=\"color:white;\">C++</a></html>");
        ImageIcon image1 = new ImageIcon("C:\\Users\\tejes\\Downloads\\c--logo-icon-3.png");
        this.setIcon(image1);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBorder(border);
        this.setBounds(350, 400, 300, 200);
        class MouseListner1 extends MouseAdapter{
            public void mouseClicked(MouseEvent e){
                if(Desktop.isDesktopSupported()){
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://en.wikipedia.org/wiki/C++/"));
                    }
                    catch(Exception ex){
                        System.out.print("Error occur");
                    }
                }
            }
        } 
        MouseListner1 m1 = new MouseListner1();
        this.addMouseListener(m1);
    }
}
class Label5 extends JLabel
{
    Label5()
    {
        Border border = BorderFactory.createLineBorder(new Color(0,100,0),6);
        this.setText("<html><a href=\"https://web.whatsapp.com/\" style=\"color:white;\">Whatsapp</a></html>");
        ImageIcon image1 = new ImageIcon("C:\\Users\\tejes\\Downloads\\R (1).png");
        this.setIcon(image1);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBorder(border);
        this.setBounds(850, 400, 300, 200);
        class MouseListner1 extends MouseAdapter{
            public void mouseClicked(MouseEvent e){
                if(Desktop.isDesktopSupported()){
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://web.whatsapp.com/"));
                    }
                    catch(Exception ex){
                        System.out.print("Error occur");
                    }
                }
            }
        } 
        MouseListner1 m1 = new MouseListner1();
        this.addMouseListener(m1);
    }
}
class swing{
    public static void main(String args[])
    {
        new MainFrame();
    }
}