import java.awt.EventQueue;

public class SooSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
	}

}
