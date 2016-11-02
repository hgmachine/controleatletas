package controleatleta;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrameOptions extends JFrame {
    
    private JButton JBoxeButton;
    private JButton JFutebolButton;
    private JButton JCancelButton;
    
    public ButtonFrameOptions () {
        
        super("Selecione o Esporte:");
        setLayout(new FlowLayout());
        
        Icon boxe= new ImageIcon( getClass().getResource("Boxe.gif"));
        Icon futebol= new ImageIcon( getClass().getResource("Futebol.gif"));
        
        JCancelButton= new JButton("Cancelar Aplicação");
        add(JCancelButton);
        
        JBoxeButton= new JButton("Boxe",boxe);
        add(JBoxeButton);
        JFutebolButton= new JButton("Futebol",futebol);
        add(JFutebolButton);
        
        ButtonHandler handler= new ButtonHandler();
        JBoxeButton.addActionListener(handler);
        JFutebolButton.addActionListener(handler);
        JCancelButton.addActionListener(handler);
    }        
    
    private class ButtonHandler implements ActionListener {
        public void actionPerformed( ActionEvent event ) {                
            if ( event.getActionCommand() == "Boxe" ) {
                CadastroBoxeador cadastro1 = new CadastroBoxeador();
                cadastro1.setVisible(true);
                cadastro1.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
                cadastro1.setResizable( false );
                JBoxeButton.setEnabled( false );
            }
            else if ( event.getActionCommand() == "Futebol" ) {
                CadastroJogadorFutebol cadastro2 = new CadastroJogadorFutebol();
                cadastro2.setVisible(true);
                cadastro2.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
                cadastro2.setResizable( false );
                JFutebolButton.setEnabled( false );
            }
            else {
                System.exit(0);
            }             
        }
    }       
}

