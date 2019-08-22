import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Calistir extends JFrame implements ActionListener, ListSelectionListener {
      String[] jlbl= {"Ad","SoyAd","Kilo","Günlük Su Ýhtiyacý"};
	  DefaultListModel<String>[] dlm;
	  DefaultListModel<Integer> dlm_id;
	  JList<String>[] jlist;
 	  JTextField[] jtext;
 	  JTextField[] jtext_gun;
 	  JPanel main_jpn;
	  JButton jbtn;
	  String[] btn_text= {"Ekle","Sil","Güncelle"};
	  Connection baglanti=null;
	  JFrame gun_frm;
	  public Calistir() {
		this.setTitle("Su Ýhtiyacý Hesaplama");
		this.setSize(450, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		dlm=new DefaultListModel[jlbl.length];
		jlist=new JList[dlm.length];
		dlm_id=new DefaultListModel<Integer>();
		jtext=new JTextField[dlm.length-1];
		main_jpn=new JPanel();
		main_jpn.setPreferredSize(new Dimension(450,450));
		for(int i=0;i<dlm.length;i++)
		{
			JPanel jpn=new JPanel();
			jpn.setPreferredSize(new Dimension(100,450));
			jpn.setLayout(new FlowLayout());
		    JLabel jlab=new JLabel(jlbl[i]);
		    jlab.setPreferredSize(new Dimension(100,20));
			dlm[i]=new DefaultListModel<String>();
		    jlist[i]=new JList<String>(dlm[i]);
		    jlist[i].addListSelectionListener(this);
           JScrollPane jscp=new JScrollPane(jlist[i]);
           jscp.setPreferredSize(new Dimension(100,300));
           jpn.add(jlab);
           jpn.add(jscp);
            if(i<jtext.length)
            {
            	jtext[i]=new JTextField();
            	jtext[i].setPreferredSize(new Dimension(100,25));
            	jbtn=new JButton(btn_text[i]);
            	jbtn.setPreferredSize(new Dimension(100,25));
            	jbtn.addActionListener(this);
            	jbtn.setActionCommand(btn_text[i]);
            	jpn.add(jtext[i]);
            	jpn.add(jbtn);
            }
           main_jpn.add(jpn);
		}
		verigetir();
		this.add(main_jpn);
		this.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {//Herhangi jlistler týklanýrsa týklansýn bu fonksiyon çalýsýr
		  JList jsecilen=(JList)arg0.getSource();
		  for(int i=0;i<jlist.length;i++)
			  jlist[i].setSelectedIndex(jsecilen.getSelectedIndex());

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
        int secilen=jlist[0].getSelectedIndex();
		switch(arg0.getActionCommand())
		{
		case "Ekle":Ekle();break; 
		case "Sil":Sil();break; 
		case "Güncelle":Guncelle();break; 
		case "guncelle":guncelle(secilen);break;
		case "cýkýs":cýkýs();break;
		}

	}
	public double sayicevir(String s)
	{   
		double sayi=-1;
		try {
			sayi=Double.parseDouble(s);
			return sayi;
		}catch(Exception ex)
		{
			return sayi;
		}	
	}
	public boolean dogrula(JTextField[] txt)
	{
		int sayac=0;
		for(int i=0;i<txt.length;i++)
			if(txt[i].getText().length()>0)
				  sayac++;
		  if(sayac==txt.length)
			  return true;
	         
	return false;
		  }
public void Ekle() {
	double kilo=sayicevir(jtext[2].getText());
	if(dogrula(jtext)&&kilo!=-1) {
		 double ihtiyac=0.032*kilo;
		    int ihtiyac1=(int)(ihtiyac*100);
		    ihtiyac=ihtiyac1/100.0;
		try {
			baglan();
			PreparedStatement sorgu=baglanti.prepareStatement("insert into Sahýslar(S_Ad,S_SoyAd,S_Kilo,S_Suihtiyac) values(?,?,?,?)");
			sorgu.setString(1, jtext[0].getText());
			sorgu.setString(2, jtext[1].getText());
			sorgu.setDouble(3, kilo);
			sorgu.setDouble(4, ihtiyac);
			sorgu.executeUpdate();
			baglanti.close();
			for(int i=0;i<jtext.length;i++)
				    jtext[i].setText("");
			verigetir();
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
}
public void Sil() {
 int secilen=jlist[0].getSelectedIndex();
 if(secilen>-1)
 {
	 try {
		 baglan();
		 PreparedStatement sorgu=baglanti.prepareStatement("delete from Sahýslar where S_No=?");
		 sorgu.setInt(1, dlm_id.getElementAt(secilen)); 
		 sorgu.executeUpdate();
		 baglanti.close();
		 verigetir();
	 }
	 catch(Exception ex)
	 {
		 JOptionPane.showMessageDialog(this, ex.getMessage());
	 }
 }
	
}	
public void Guncelle() {
 int secilen=jlist[0].getSelectedIndex();
 
	if(secilen>-1)
	{   
		this.setVisible(false);
		gun_frm(dlm,secilen);	
	}
}
public void guncelle(int secilen)
{   double kilo=sayicevir(jtext_gun[2].getText());
	if(dogrula(jtext_gun)&&kilo!=-1&&secilen>-1)
	{
		try {
			baglan();
			PreparedStatement sorgu=baglanti.prepareStatement("update Sahýslar set S_Ad=?,S_SoyAd=?,S_Kilo=?,S_Suihtiyac=? where S_No=?");
			sorgu.setString(1, jtext_gun[0].getText());
			sorgu.setString(2, jtext_gun[1].getText());
			sorgu.setDouble(3, kilo);
			double ihtiyac=0.032*kilo;
			int ihtiyac1=(int)(ihtiyac*100);//Virgulden sonra iki basamak alamak için
            sorgu.setDouble(4,ihtiyac1/100.0);
            sorgu.setInt(5, dlm_id.getElementAt(secilen));
            sorgu.executeUpdate();
            baglanti.close();
            verigetir();//buraya kadar hersey yapýlýrsa jlistleri dolduruyorum
            this.setVisible(true);//Ana formun visible 'ný true(görünür) yapýyorum
            gun_frm.dispose();//ve gun_frm formun yok ediyorum
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, ex.getMessage());
			
		}
		
	}
}
public void cýkýs() {
	this.setVisible(true);
	gun_frm.dispose();
}
public void baglan() {
	
	try {
       Class.forName("org.sqlite.JDBC");
	 baglanti=DriverManager.getConnection("jdbc:sqlite:Suihtiyac.db");	
   }
	catch(Exception ex){
	
		JOptionPane.showMessageDialog(this, ex.getMessage());
}
}
public void verigetir()
{
   try {
	   baglan();
	   Statement sorgu=baglanti.createStatement();
	   ResultSet veri=sorgu.executeQuery("select S_No,S_Ad,S_SoyAd,S_Kilo,S_Suihtiyac from Sahýslar");
	   for(int i=0;i<dlm.length;i++)
		   dlm[i].clear();
	   dlm_id.clear();
	   while(veri.next())
	   {
		   dlm_id.addElement(veri.getInt("S_No"));
		   dlm[0].addElement(veri.getString("S_Ad"));
		   dlm[1].addElement(veri.getString("S_SoyAd"));
		   dlm[2].addElement(veri.getDouble("S_Kilo")+"");
		   dlm[3].addElement(veri.getDouble("S_Suihtiyac")+" Lt"); 
	   }
	   veri.close();
	   baglanti.close();
	   
   }catch(Exception ex)	{
	   
	   JOptionPane.showMessageDialog(this, ex.getMessage());
   }

}
public void gun_frm(DefaultListModel<String>[] dlm,int secilen)
{
    gun_frm=new JFrame("Güncelle");
	gun_frm.setSize(250,200);
	gun_frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//X simgesine basýldýðýnda hiç bir sey yapama
	gun_frm.setLayout(new FlowLayout());
    
	JPanel ana_jpn=new JPanel();
	JPanel jpn_lbl=new JPanel();
	JPanel jpn_jtext=new JPanel();
	ana_jpn.setPreferredSize(new Dimension(250,200));
	jpn_lbl.setPreferredSize(new Dimension(40,130));
	jpn_jtext.setPreferredSize(new Dimension(100,130));
	
	jtext_gun=new JTextField[jtext.length];
	for(int i=0;i<jtext_gun.length;i++)
	{
		jtext_gun[i]=new JTextField();
		jtext_gun[i].setPreferredSize(new Dimension(100,20));
	    JLabel jlb_gun= new JLabel(jlbl[i]+":");
	    jlb_gun.setPreferredSize(new Dimension(40,20));
	    jlb_gun.setHorizontalAlignment(JLabel.RIGHT);
	    jpn_lbl.add(jlb_gun);
	    jpn_jtext.add(jtext_gun[i]);
	    jtext_gun[i].setText(dlm[i].getElementAt(secilen));
	}
	jbtn=new JButton("Güncelle");
	jbtn.setPreferredSize(new Dimension(100,20));
	jbtn.addActionListener(this);
	jbtn.setActionCommand("guncelle");
	jpn_jtext.add(jbtn);
	jbtn=new JButton("Çýk");
	jbtn.setPreferredSize(new Dimension(100,20));
	jbtn.addActionListener(this);
	jbtn.setActionCommand("cýkýs");
	jpn_jtext.add(jbtn);
	ana_jpn.add(jpn_lbl);
	ana_jpn.add(jpn_jtext);
	gun_frm.add(ana_jpn);
	gun_frm.setVisible(true);	
}
public static void main(String[] args) {
		new Calistir();
	}
}
