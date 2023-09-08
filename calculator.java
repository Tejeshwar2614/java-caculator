import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener
{
    JFrame frame;
    JButton numbersbutton[] = new JButton[10];
    JButton functionButton[] = new JButton[9];
    JButton addButton,subButton,divButton,mulButton;
    JButton decButton,equButton,clrButton,delButton,negButton;
    JTextField text;
    JPanel panel;
    double num1=0,num2=0;
    Character operator;
    double r=0;

    calculator()
    {
        // Here i have created the Frame ...
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420, 550);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // End of the frame ...

        // Here i have created the text field ....
        text = new JTextField();
        text.setBounds(50, 24, 300, 50);
        Font f = new Font("ink font ", Font.BOLD, 30);
        text.setFont(f);
        frame.add(text);

        // End if the text Field....

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        mulButton = new JButton("*");
        decButton = new JButton(".");
        equButton = new JButton("=");
        clrButton = new JButton("clear");
        delButton = new JButton("delete");
        negButton = new JButton("(-)");


        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = clrButton;
        functionButton[5] = decButton;
        functionButton[6] = delButton;
        functionButton[7] = equButton;
        functionButton[8] = negButton;


        for(int i=0;i<9;i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(f);
            functionButton[i].setFocusable(false);
        }

        for(int i=0;i<10;i++){
            numbersbutton[i] = new JButton(String.valueOf(i)); 
            numbersbutton[i].addActionListener(this);
            numbersbutton[i].setFont(f);
            numbersbutton[i].setFocusable(false);

        }
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        /*
        new GridLayout(4, 4, 10, 10): This part creates a new GridLayout object with four arguments:

        4 as the first argument: This specifies the number of rows in the grid.
        4 as the second argument: This specifies the number of columns in the grid.
        10 as the third argument: This is the horizontal gap (in pixels) between components within the grid.
        10 as the fourth argument: This is the vertical gap (in pixels) between components within the grid. 
        
        So, when you set the layout of the panel to this GridLayout, it means that the panel will be divided into a 4x4 grid,
        and components added to this panel will be arranged in this grid layout with 4 rows, 4 columns, and a 10-pixel gap between 
        components horizontally and vertically. This can be useful for creating organized grids of components, such as buttons or labels,
        within your user interface.
        
        */
        panel.add(numbersbutton[1]);
        panel.add(numbersbutton[2]);
        panel.add(numbersbutton[3]);
        panel.add(addButton);
        panel.add(numbersbutton[4]);
        panel.add(numbersbutton[5]);
        panel.add(numbersbutton[6]);
        panel.add(subButton);
        panel.add(numbersbutton[7]);
        panel.add(numbersbutton[8]);
        panel.add(numbersbutton[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numbersbutton[0]);
        panel.add(equButton);
        panel.add(decButton);
        panel.add(divButton);


        panel.setBackground(Color.black);
        frame.add(panel);

    }
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<10;i++){
            if(e.getSource()==numbersbutton[i]){
                text.setText(text.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decButton){
            text.setText(text.getText().concat("."));
        }
        if(e.getSource()==addButton){
            num1 = Double.parseDouble(text.getText());
            operator = '+';
            text.setText("+");

        }
        if(e.getSource()==subButton){
            num1 = Double.parseDouble(text.getText());
            operator = '-';
            text.setText("");
        }
        if(e.getSource()==mulButton){
            num1 = Double.parseDouble(text.getText());
            operator = '*';
            text.setText("");
        }
        if(e.getSource()==divButton){
            num1 = Double.parseDouble(text.getText());
            operator = '/';
            text.setText("");
        }
        if(e.getSource()==equButton){
            num2 = Double.parseDouble(text.getText());
            if (operator == null) {
                operator = '+'; 
            }
    
            switch(operator){
                case '+':
                    r = num1+num2;
                    break;
                case '-':
                    r = num1-num2;
                    break;
                case '/':
                    r = num1/num2;
                    break;
                case '*':
                    r = num1*num2;
                    break;
            }
            text.setText(String.valueOf(r));
            num1 = r;
        }
        if(e.getSource()==clrButton){
            text.setText("");
        }
        if(e.getSource()==delButton){
            String s = text.getText();
            text.setText("");
            for(int i=0;i<s.length()-1;i++){
                text.setText(text.getText()+s.charAt(i));
            }
        }
        if(e.getSource()==negButton){
            double t = Double.parseDouble(text.getText());
            t*=-1;
            text.setText(String.valueOf(t));
        }
        
    }
    public static void main(String args[] )
    {
        new calculator();

    }    

}
p2 = new JPanel();
        p2.setBounds(0,0,350,800);
        p2.setBackground(Color.green);
        frame.add(panel);
