import javax.swing.*;

public class ControlStructures {

    public static void main(String[] args) {

        int num1, num2, p=1;
        char opi=0;
        String msg="" , msgEntr="Type (1) for product\nType (2) for productory\n";
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Type a round number:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Type another round number"));
        opi = (JOptionPane.showInputDialog(msgEntr)).charAt(0);



        switch(opi)
        {
            case '1':
            {
                if(num1>0&&num1>0)
                {
                    p=num1 * num2;
                    msg = msg+"product of "+num1+" by "+num2+" = "+p+"\n\n";
                }
                break;
            }
            case '2':
            {
                for(int i=1;i<=num2; i=i+1)
                {
                    p=p*num1;
                }
                msg=msg+"productory of "+num1+", "+num2+" times is: "+p+"\n\n";
                break;
            }
            default: JOptionPane.showMessageDialog(null,"Invalid option, unable to calculate the results.");


        }
        if (opi>='1' && opi<='3') 
        {
            JOptionPane.showMessageDialog(null,msg);
        }
        System.exit(0);


    }
}
