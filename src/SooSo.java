import java.awt.EventQueue;

import SooSo.Application.Application;
import SooSo.Application.DBConnecter;

public class SooSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Application ex;
				try {
					ex = new Application();
	                ex.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
	}

}
