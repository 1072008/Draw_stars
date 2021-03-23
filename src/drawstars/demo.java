package drawstars;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame(); //�s�ج[
		f.setLayout(null);
		f.setSize(1000,1000); //�����j�p
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		
		
		f.add(new mycanvas());
		f.setVisible(true);

	}

}

class mycanvas extends Canvas
{

	public mycanvas() {
		super();
		setSize(1000,1000);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(100, 100, 200, 200); //�y�Ц�m
		/*g.drawLine(348, 120, 261, 388);
		g.drawLine(261, 388, 488, 225);
		g.drawLine(488, 225, 211, 225);
		g.drawLine(211, 225, 432, 388);
		g.drawLine(432, 388, 348, 120);
	*/
		for(int j=0;j<32;j++) {
		int [] X=new int [5];
		int [] Y=new int [5];
		
		X[0]=348;
		X[1]=261;
		X[2]=488;
		X[3]=211;
		X[4]=432;
		
		Y[0]=120;
		Y[1]=388;
		Y[2]=225;
		Y[3]=225;
		Y[4]=388;
		
		int max=200;
		int min=100;
		Random r=new Random();
		int offsetx=r.nextInt((max-min)+1)+min;
		int offsety=r.nextInt((max-min)+1)+min;
		double s=r.nextDouble();
		for(int i=0;i<5;i++) {
			
			
			
			double sx=s;
			double sy=s;
			
			int x1=X[i%5];
			int x2=X[(i+1)%5];
			int y1=Y[i%5];
			int y2=Y[(i+1)%5];
			
			x1=(int)(x1*sx);
			x2=(int)(x2*sx);
			y1=(int)(y1*sy);
			y2=(int)(y2*sy);
			
			x1=x1+offsetx;
			y1=y1+offsety;
			x2=x2+offsetx;
			y2=y2+offsety;
			
			g.drawLine(x1, y1, x2, y2);
		}
		
		
		}	
		
	}
	
}

