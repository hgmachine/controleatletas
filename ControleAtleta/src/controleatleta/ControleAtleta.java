package controleatleta;

import javax.swing.JFrame;

public class ControleAtleta {
    
    public static void main(String[] args) {
        
        ButtonFrameOptions buttonOptions= new ButtonFrameOptions();
        buttonOptions.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE ); 
        buttonOptions.setResizable( false );
        buttonOptions.setSize(260,320);
        buttonOptions.setVisible( true );
    }
}
