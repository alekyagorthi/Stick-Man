/* Assignment by J.Alekhya
			 15JG1A0532        */

/*<applet code=Asqlibach.class width=1152 height=720>
</applet>*/
import java.awt.*;
import java.applet.*;
public class Asqlibach extends Applet 
{
Image picture;
AudioClip audioClip,audioClip2;
public void init()
{
picture=getImage(getDocumentBase(),"ale1.jpg");
audioClip=getAudioClip(getCodeBase(),"grp1.wav");
audioClip2=getAudioClip(getCodeBase(),"grp2.wav");

}
    public void paint(Graphics g)
   {
          int j,i,k,m,n,p,l,a;
        try
         {
a=350;
l=25;
m=75;
k=100;          
j=n=250; 
audioClip.play();
          for( i=1;i<=18;i++)
         {    

	Dimension d = getSize();
	g.setColor(Color.WHITE);
	g.fillRect(0,0,d.width,d.height);
	g.drawImage(picture,10,10,this);
	g.setColor(Color.BLACK);    
	//Graphics2D g1.setStroke(new BasicStroke(4));
	g.fillOval(m++,50+a ,50,50);
	g.drawLine(++k,100+a,k,200+a);
	g.setColor(Color.BLACK);
                 g.drawLine(k,200+a,k-i,250+a);
	g.drawLine(k,140+a,k-(--l),190+a);
	g.drawLine(k,140+a,k+l,190+a);
	g.setColor(Color.BLACK);
	g.drawLine(k,200+a,k+i,j-1+a);
	Thread.sleep(40);     
            }

p=100;
for(int q=0;q<20;q++)
{
         if(q%4==0)
	audioClip2.play();
  for(int r=0;r<36;r++)
{
if(r%4==0)
{
 
	Dimension d = getSize();
	g.setColor(Color.WHITE);
	g.fillRect(0,0,d.width,d.height);
}
	g.drawImage(picture,10,10,this);
	g.setColor(Color.BLACK);    
	g.drawLine(++k,100+a,k,200+a);
	g.fillOval(m++,50+a,50,50);
                if(r<18)
                {
                        i--;
                        g.setColor(Color.BLACK);    
	    g.drawLine(k,140+a,k-(++l),190+a);
                        g.drawLine(k,140+a,k+l,190+a);
	    g.drawLine(k,200+a,k+i,n-1+a);
	    g.setColor(Color.BLACK);    
                        g.drawLine(k,200+a,k-i,j-1+a);
                       k++;m++; 
                }
                else 
                {
	       i++;
                        g.setColor(Color.BLACK);
	    g.drawLine(k,140+a,k-(--l),190+a);    
	    g.drawLine(k,140+a,k+l,190+a);
    	    g.drawLine(k,200+a,k-i,n-1+a);
   	    g.setColor(Color.BLACK);    
                     g.drawLine(k,200+a,k+i,j-1+a);
                  }       
	
	Thread.sleep(40);     
            }       
           }
}
catch(InterruptedException e)
{
System.out.println("Exception occured");
}
         
    }
}
      