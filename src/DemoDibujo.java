import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.*;

public class DemoDibujo extends JFrame {
	
	final static Color BG = Color.BLUE;
	final static Color FG = Color.DARK_GRAY;
	
	// constructor
	public DemoDibujo(){
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		//this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
		//this.setState(Frame.ICONIFIED);
		this.setVisible(true);
		//this.setState(Frame.NORMAL);
	}
	
	// metodo init para inicializar
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	// metodo paint para el dibujado de elementos
	public void paint( Graphics g ){
		Graphics2D g2 = (Graphics2D) g;
		//g2.draw(new Line2D.Double(100, 100, 150, 300));
		//g2.draw(new Line2D.Double(150, 300, 250, 100));
		//g2.draw(new Rectangle2D.Double(50, 50, 150, 300));
		//g2.draw(new RoundRectangle2D.Double(90, 90, 150, 150, 10, 10));
		
		//*********************************************************************
		//					FIGURA IMPOSIBLE
		//*********************************************************************
		//			X + 20		Y + 30
		//*********************************************************************
		//					CARAS SUPERIORES
		g2.setPaint( Color.LIGHT_GRAY );
		g2.fillPolygon(
		new int[]{20, 127, 76, 283, 355, 355, 390, 215, 217, 285, 215, 145, 217, 215, 164, 58},
		new int[]{237, 177, 147, 30, 71, 110, 130, 228, 192, 153, 113, 153, 192, 228, 200, 258}, 16);
		
		g2.fillPolygon(
		new int[]{142, 164, 126, 90, 90, 110, 284, 318}, 
		new int[]{408, 395, 378, 397, 435, 425, 526, 508}, 8);
		
		g2.fillPolygon(
		new int[]{284, 318, 318, 457, 473, 473, 457, 390, 457, 527, 510, 545, 598, 389}, 
		new int[]{588, 569, 526, 450, 459, 498, 490, 526, 569, 526, 520, 498, 526, 649}, 14);

		g2.fillPolygon( new int[]{ 473, 512, 562, 526} , 
						new int[]{ 300, 320, 290, 272}, 4);
		
		g2.fillPolygon( new int[]{ 602, 660, 623, 602} , 
						new int[]{ 273, 240, 219, 231}, 4);
		
		g2.fillPolygon( new int[]{ 562 , 602 , 395 , 355} , 
						new int[]{ 160 , 137 , 28 , 45}, 4);
		
		g2.fillPolygon( new int[]{ 390 , 458, 458, 423} , 
						new int[]{ 190 , 230, 190, 170}, 4);
		
		g2.fillPolygon(
		new int[]{180, 244, 244, 213},
		new int[]{590, 628, 588, 570}, 4);
		
		
		g2.fillPolygon( new int[]{ 615, 575, 540, 540} , 
						new int[]{ 385, 365 , 385, 427}, 4);
		
		//*********************************************************************
		//					CARAS LATERALES IZQUIERDA
		g2.setPaint( Color.DARK_GRAY);
		g2.fillPolygon( new int[]{ 76 , 127 , 90 , 76 } , 
						new int[]{ 147 , 177 , 198 , 190 }, 4);

		g2.fillPolygon( new int[]{ 164 , 215 , 215 , 164} , 
						new int[]{ 200 , 228 , 270 , 240}, 4);
		
		g2.fillPolygon( new int[]{ 20 , 58 , 58 , 20 } , 
						new int[]{ 237 , 258 , 495 , 475}, 4);
		
		g2.fillPolygon( new int[]{ 164 , 126 , 126 , 164 } , 
						new int[]{ 395 , 378 , 335 , 315}, 4);

		g2.fillPolygon(
		new int[]{110, 284, 284, 389, 389, 284, 244, 244, 180, 180, 244, 284, 284, 75, 75, 110}, 
		new int[]{425, 526, 588, 649, 688, 628, 628, 550, 512, 590, 628, 628, 688, 565, 485, 467}, 16);
		
		g2.fillPolygon(
		new int[]{457, 457, 473, 473, 512, 512, 527, 495},
		new int[]{526, 490, 497, 300, 320, 518, 526, 546}, 8);

		g2.fillPolygon(
		new int[]{562, 526, 492, 355, 355, 390, 390, 458, 458, 390, 390, 355, 355, 562},
		new int[]{290, 272, 290, 210, 190, 170, 190, 230, 150, 111, 130, 110, 45, 160}, 14);
		
		g2.fillPolygon( new int[]{ 145, 215, 215 , 181} , 
						new int[]{ 153, 113, 153 , 173}, 4);

		g2.fillPolygon( new int[]{ 615, 615, 575, 575} , 
						new int[]{ 304, 385, 365 , 326}, 4);
		
		//*********************************************************************
		//					CARAS LATERALES DERECHA
		g2.setPaint( Color.GRAY );
		
		g2.fillPolygon(
		new int[]{ 215 , 215 , 390 , 390 , 423 , 423 , 390 , 390 } , 
		new int[]{ 270 , 228 , 130 , 110 , 130 , 170 , 190 , 170 }, 8);
		
		g2.fillPolygon(
		new int[]{58, 164, 164, 195, 195, 177, 142, 164, 164, 90, 90, 110, 110, 58},
		new int[]{258, 200, 240, 258, 418, 428, 408, 395, 315, 355, 435, 425, 467, 494}, 14);
		
		g2.fillPolygon(
		new int[]{284, 318, 318, 284},
		new int[]{526, 508, 569, 588}, 4);
		
		g2.fillPolygon(
		new int[]{284, 318, 318, 284},
		new int[]{628, 647, 668, 688}, 4);
		
		g2.fillPolygon(
		new int[]{389, 598, 598, 389},
		new int[]{649, 526, 569, 688}, 4);
		
		g2.fillPolygon(
		new int[]{390, 457, 457, 421},
		new int[]{526, 490, 526, 546}, 4);
		
		g2.fillPolygon(
		new int[]{512, 512, 562, 562, 602, 602, 615, 542, 542, 615, 615, 602, 660, 660, 580, 547},
		new int[]{519, 320, 290, 160, 137, 273, 304, 345, 425, 385, 304, 273, 240, 475, 518, 500}, 16);
		
		g2.fillPolygon(
		new int[]{215, 215, 250, 286},
		new int[]{113, 153, 173, 153}, 4);
		
		g2.fillPolygon(
		new int[]{180, 213, 213, 180},
		new int[]{590, 570, 531, 512}, 4);
		
		//*********************************************************************
		//					RECTANGULO CON PERSPECTIVA
		
		// primer rectangulo
		/*Rectangle2D.Double rect1 = new Rectangle2D.Double(50, 50, 50, 50);
		g2.setPaint( Color.CYAN );
		g2.fill(rect1);
		
		// pinta 2 cara como un poligono
		g2.setPaint( Color.LIGHT_GRAY);
		int[] x2 = {100, 300, 300, 100};
		int[] y2 = {50, 100, 200, 100};
		g.fillPolygon(x2, y2, 4);

		g2.setPaint( Color.DARK_GRAY );
		int[] x1 = {50, 200, 200, 50};
		int[] y1 = {50, 100, 200, 100};
		g.fillPolygon(x1, y1, 4);*/
		
		// segundo rectangulo
		/*g2.setPaint( Color.BLUE );
		Rectangle2D.Double rect2 = new Rectangle2D.Double(200, 100, 100, 100);
		g2.fill(rect2);*/
		
		
		//*********************************************************************
		//					OJO
		/*g2.setPaint( Color.DARK_GRAY);
		Ellipse2D.Double elipse2 = new Ellipse2D.Double(220, 280, 80, 80);
		g2.fill(elipse2);
		
		g2.setPaint( Color.LIGHT_GRAY);
		Ellipse2D.Double elipse1 = new Ellipse2D.Double(240, 300, 40, 40);
		g2.fill(elipse1);
		
		g2.draw(new Arc2D.Double(160, 160, 200, 200, 200, 140, Arc2D.OPEN));
		g2.draw(new Arc2D.Double(160, 280, 200, 200, 20, 140, Arc2D.OPEN));*/
		
		
		//*********************************************************************
		//					DIBUJA UNA CUADRICULA
		/*for(int i = 0; i <= 500; i+= 10){
			g2.draw(new Line2D.Double( 0, i, 500, i));
			g2.draw(new Line2D.Double( i, 0, i , 500));
		}*/
	}
	
	
}
