import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Soru.*;
public class Calistir extends Sorular implements ActionListener,KeyListener{
    JFrame frm;
	JTextField[] jtext;
    JPanel jpnbulmaca;
    JPanel jpnsorular[],sorujpn,anajpn,jpnbtn;
    JLabel[] jlbsorular;
	JButton btn;
	String[] sayilar;
	DefaultListModel<Integer> dlm;
	int soruno;
    public Calistir()
	{   soruno=0;
    	Randomsayi();
   		switch(sayilar[0])
      {
    	case "0":bulmaca0();bulmacaolustur();boslukbul();break;
    	case "1":bulmaca1();bulmacaolustur();boslukbul();break;
    	case "2":bulmaca2();bulmacaolustur();boslukbul();break;
    	case "3":bulmaca3();bulmacaolustur();boslukbul();break;
    	case "4":bulmaca4();bulmacaolustur();boslukbul();break;
    	case "5":bulmaca5();bulmacaolustur();boslukbul();break;
    	case "6":bulmaca6();bulmacaolustur();boslukbul();break;
    	case "7":bulmaca7();bulmacaolustur();boslukbul();break;
      }
	
	} 
    public boolean dogrumu()
    {
    	boolean durum=true;
    	boolean durum1=true;
    	for(int i=0;i<jtext.length;i++)
    	{
    		durum1=true;
    		for(int j=0;j<dlm.getSize();j++)
    		{   int bostex=dlm.getElementAt(j);
    			if(i==bostex)
    			{
    				durum1=false;
    			}
    		}
    		if(durum1&&!(jtext[i].getBackground().equals(Color.RED)))
    		   durum=false;	
    	}
   return durum; 	
    }
	public void bulmacaolustur()
	{  
         frm=new JFrame("Bulmaca");
         Toolkit tk=Toolkit.getDefaultToolkit();//Pc'nizin çözünürlüðünü bu sýnýf le aliyoruz
         int pcgenislik=(int)tk.getScreenSize().getWidth();//Double döndürür
         int pcyukseklik=(int)tk.getScreenSize().getHeight();//Double döndürür
	     frm.setSize(pcgenislik,pcyukseklik);
	     frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frm.setLayout(new FlowLayout());
	     anajpn=new JPanel();
         anajpn.setPreferredSize(new Dimension(pcgenislik,40*satir+50));
         btn=new JButton("Doðrula");
         btn.setPreferredSize(new Dimension(100,25));
         btn.addActionListener(this);
         jpnbtn=new JPanel();
         jpnbtn.setPreferredSize(new Dimension(pcgenislik,50));
         jpnbtn.add(btn);
		 jpnbulmaca=new JPanel();
		 jpnbulmaca.setPreferredSize(new Dimension(35*satir,35*sutun));//Her bir jtextfield yükseklik=35 ve geniþliði=35 dir
		 jpnbulmaca.setLayout(new GridLayout(satir,sutun));		
		 jtext=new JTextField[satir*sutun];
	   	 jlbsorular=new JLabel[sorular.length];
		 jpnsorular=new JPanel[2];
	
		for(int i=0;i<jtext.length;i++)
	    {
	    	      jtext[i]=new JTextField();
	    		  jtext[i].setHorizontalAlignment(JTextField.CENTER);
	              jtext[i].setText(i+1+"");
	              jtext[i].addKeyListener(this);
	              jtext[i].setName(i+1+"");
	    		  jpnbulmaca.add(jtext[i]); 
	    }
		anajpn.add(jpnbulmaca);
		anajpn.add(jpnbtn);
		frm.add(anajpn);
		for(int i=0;i<jlbsorular.length;i++)
		{
			jlbsorular[i]=new JLabel((i+1)+")"+sorular[i]);
			jlbsorular[i].setPreferredSize(new Dimension(600,16));
			jlbsorular[i].setHorizontalAlignment(JLabel.LEFT);
		    frm.add(jlbsorular[i]);
		}	   
		frm.setVisible(true);
	}
	//Rastgele Sayýlar üretiliyor
	public void Randomsayi()
	{    Random rnd=new Random();
	     sayilar=new String[8];
	   for(int i=0;i<sayilar.length;i++)
		   sayilar[i]="";
		boolean durum=true;
		int sayac=0;
		while(sayac<8)
		{    durum=true;
			int sayi=rnd.nextInt(8);
			
			for(int i=0;i<sayilar.length;i++)
			{	
				if(sayilar[i].equals(""+sayi))
		             durum=false;  
			}
			if(durum)
				 sayilar[sayac++]=""+sayi;
		}
	}
	//Butona týklandýktan sonra jtextlere girdiðimiz karekterler doðruysa Color(red) ve enabled(false) yapýyor
	public void dogrula()
	{    boolean durum=true;
		for(int i=0;i<sorular.length;i++)
		{    durum=true;
			 int sayac=0;//cevaplar için dongu degiskeni
			 int[] no=coz(sorular[i]);//Sorularýn sonlarýndaki numaralarý alýyoruz
		     int bas=no[0]-1;// her cevabýn baslangýc 
	        int bitis=no[1]-1;// her cevabýn bitþi
		   if((bitis-bas)<sutun)//yanlar kontrol ediliyor soldan saða
		   {  
			   int esitsayisi=0;
			   for(int j=bas;j<=bitis;j++) 
			 {    
				   
				   if(jtext[j].getText().length()==0)
					   jtext[j].setText(jtext[j].getName());
				   
				   if(jtext[j].getText().length()>0)
			 {
				 if(jtext[j].getText().charAt(0)==cevaplar[i].charAt(sayac)) 
					 esitsayisi++;	
			 }
			 else
				 {
				   JOptionPane.showMessageDialog(frm, "Kutular boþ olamaz ve kutularýn içine bir tane karekter girilmelidir");
				  	durum=false;
				  	break;
				 }
			   sayac++;
			 }
			   if(esitsayisi==cevaplar[i].length())
				   for(int m=bas;m<=bitis;m++)
					 {
						 jtext[m].setEnabled(false);
						 jtext[m].setBackground(Color.red); 
					 }
		   }
		   else
		   {     int indis=no[0]-1;
		         int son=no[1]-1;
			     int sayac2=0;
		         int esitsayisi1=0;
			 while(son>=indis) //yukardan assaði kontrol ediliyor
		     { 
   
			   if(jtext[indis].getText().length()==0)
				          jtext[indis].setText(jtext[indis].getName());
			     
			         if(jtext[indis].getText().length()>0)
		      	 {
			    	 if(jtext[indis].getText().charAt(0)==cevaplar[i].charAt(sayac2))   
		      	          esitsayisi1++;
		      	 }
			     else
				 {
				 JOptionPane.showMessageDialog(frm, "Kutular boþ olamaz ve kutularýn içine tek karekter girilmelidir");
				  	durum=false;
				  	break;
				 }
			         indis+=sutun;
		     sayac2++; 	
		     }
			 indis=0;
			 indis=no[0]-1;
		          if(esitsayisi1==cevaplar[i].length())
		          { while(son>=indis)
		    	   {
		         	    jtext[indis].setBackground(Color.red);
				    	jtext[indis].setEnabled(false);
		    	     indis+=sutun;
		    	   } 	   
		          }
		          }
		  if(!durum)
			  break;
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	 	dogrula();
	 	boolean durum=dogrumu(); 
	 	if(durum==true)
	 	{    int sonuc=JOptionPane.showConfirmDialog(frm, "Yeni bir bulmacaya geçmek istiyorsanýz OK 'ye týklayýn");
	 		if(sonuc==0&&soruno!=sayilar.length)
	 		{   frm.dispose();
	 			switch(sayilar[++soruno])
	    	  {
	    	    case "0":bulmaca0();bulmacaolustur();boslukbul();break;
	    	    case "1":bulmaca1();bulmacaolustur();boslukbul();break;
	    	    case "2":bulmaca2();bulmacaolustur();boslukbul();break;
	    	    case "3":bulmaca3();bulmacaolustur();boslukbul();break;
	    	    case "4":bulmaca4();bulmacaolustur();boslukbul();break;
	    	    case "5":bulmaca5();bulmacaolustur();boslukbul();break;
	    	    case "6":bulmaca6();bulmacaolustur();boslukbul();break;
	    	    case "7":bulmaca7();bulmacaolustur();boslukbul();break;
	    	  }	
	 	
	 		}
	 	}
	}
	public int[] coz(String soru)//Sorularýn sonlarýndaki yani parentezlerin içindeki numaralrý alýyor ve int dizisine(int[]) ceviriyor ve döndürüyor
	{   
		int baslangic=0;
	    for(int i=0;i<soru.length();i++)
		if((char)soru.charAt(i)=='(')
		{
			baslangic=i;
			break;
		}
		String cvpyeri=soru.substring(baslangic+1,soru.length()-1);
		String[] soruno=cvpyeri.split("-");
	    int[] lokasyon=new int[soruno.length];
	    for(int i=0;i<soruno.length;i++)
	    {
		      lokasyon[i]=Integer.parseInt(soruno[i]);
	    }
return lokasyon;
} 	
	public static void main(String[] arg)
	{ 
		   new Calistir();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {//JTextField' içine veri giriþi yapýldýðý an bu fonksiyon çalýþýyor 
		// TODO Auto-generated method stub
		JTextField txt=(JTextField)arg0.getSource();
		if(txt.getText().length()>txt.getName().length())
		{	
			JOptionPane.showMessageDialog(frm, "Tek Karekter  girilmelidir");
		    txt.setText(txt.getName());
		}
		else
			txt.setText(txt.getText().toUpperCase());
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void boslukbul()//Bulmacadaki X yani bos olan yerleri buluyor X' i koyuyor ve enabled' ný false yapýyor
	{  dlm=new DefaultListModel<Integer>();
	    for(int i=0;i<satir*sutun;i++)
	    	dlm.addElement(i);
		for(int i=0;i<sorular.length;i++)
		{  
			 int sayac=0;//cevaplar için dongu degiskeni
			 int[] no=coz(sorular[i]);
		     int bas=no[0]-1;
	         int bitis=no[1]-1;
		   if((bitis-bas)<sutun)
		   {  
			   for(int j=bas;j<=bitis;j++) //yanlar kontrol ediliyor
                     for(int m=0;m<dlm.getSize();m++)
                    	 if(j==dlm.getElementAt(m))
                    		 dlm.removeElementAt(m);
		   }
		   else
		   {
			     int indis=no[0]-1;
		         int son=no[1]-1; 		        
			  while(son>=indis) //yukardan assaði kontrol ediliyor
		     { 
			   for(int m=0;m<dlm.getSize();m++)
              	 if(indis==dlm.getElementAt(m))
              		 dlm.removeElementAt(m);
		           indis+=sutun;
		     }
		}
	}
		 for(int i=0;i<dlm.getSize();i++)
		    {	
		    	jtext[dlm.getElementAt(i)].setText("X");
		        jtext[dlm.getElementAt(i)].setEnabled(false);
		    }
      }
}
