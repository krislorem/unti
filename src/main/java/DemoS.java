import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *
 * @author GK_L2
 */
public class DemoS {

    private JButton button1;
    private JCheckBox checkBox1;
    private JPasswordField passwordField1;
    private JEditorPane editorPane1;
    private JTree tree1;
    private JFormattedTextField formattedTextField1;
    private JList list1;
    private JScrollBar scrollBar1;
    private JRadioButton radioButton1;
    private JTable table1;
    private JProgressBar progressBar1;
    private JScrollBar scrollBar2;
    private JComboBox comboBox1;

    public DemoS (JCheckBox checkBox1, JPasswordField passwordField1) {
        this.checkBox1 = checkBox1;
        this.passwordField1 = passwordField1;
        button1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addKeyListener(new KeyAdapter() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }
}
