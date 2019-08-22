package Soru;
import javax.swing.*;

public class Sorular {
	public	String[] cevaplar,sorular;
	public	JLabel[] jlbsorular;
	public	int satir;
	public	int sutun;
	public void bulmaca0()
	{
		String[] soru= {"�nce Kar��t� (1-5)","K�pek (7-8)","G�zde sar�ya �alan kestane rengi (10-12)","Eski yunanda konser verilen basamakl� yer (14-18)","Etken (19-22)","�nce,a��k sar� renkli kam�� (25-27)","Sodyumun simgesi (29-30)","Kans�z (31-36)","Silisyumun simgesi (1-7)","Baston (19-31)","Bir t�r ipekli kuma� (2-32)","M�sra (15-33)","Ger�ek (4-22)","Telefon s�z� (5-17)","Nikelin simgesi (29-35)","Avustrulya veya Yeni zelenda birliklerinin ortak ad� (12-36)"};
	    String[] cvp= {"SONRA","�T","ELA","ODEON","AM�L","SAZ","NA","ANEM�K","S�","ASA","OTOMAN","D�ZE","REEL","ALO","N�","ANZAK"};
	    cevaplar=cvp;
	    sorular=soru;
	    sutun=6;
	    satir=6;
	    jlbsorular=new JLabel[sorular.length];
	}
	public void bulmaca1()
	{
		String[] soru= {"Eski insanlar i�in 4 ayakl� Ferrari (1-2)","Mangalda b�rak�lmayan (4-6)","�o�unun A��k usand�rd��� (7-9)","Olumsuz bir ek (11-12)","B�y�kl���n �an�ndand�r (15-16)","S�kutun geldi�i yer (19-23)","Bir ba�la� (25-26)","Fizikte momenti bile olan temmbellik (31-36)","Genellikler e�yalar i�in kullan�lsada,de�i�ik insanlar i�in kullan�l�r (1-31)","Uzakl�k anlat�r (2-8)","Ta ne zaman olan Kara �im�ek'te konu�an araba abinin ad�(20-32)","Bir �ocu�un elinde g�r�rse bir ebeveyn 'ilerde ba��m�za  kumarbaz m� olacaks�n' alt� y�zl� denilebilen kat� cisim (9-21)","�al���r durumda olan (16-34)","�o�u zarar az� karar;�ok�a insan taraf�ndan bilinme,tan�nma (5-11)","Dili tutulmu� terstende y�nden de okusan�z hep ayn� (6-18)","Kuzu ana ���n�(30-36)"};
		String[] cvp= {"AT","K�L","NAZ","NA","AF","�KRAR","K�","ATALET","ANT�KA","TA","K�T","ZAR","FAAL","�N","LAL","OT"};
		cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
	}
	public void bulmaca2()
	{
		String[] soru= {"K�meye ait varl�klardan her biri (1-6)","A��k elle y�ze vurulan tokat (7-11)","Namaz vaktini bildiren �a�r� (13-16)","�eki�me,Bozu�ma (22-25)","Do�um yapt�ran kad�n (25-27)","Ma�ra (29-30)","Kenevir (31-36)","Elman�n yenmeyen i� k�sm� (1-31)","Karadeniz B�lgesinde ya�ayan halk (2-14)","Berilyumun Simgesi (26-32)","Birine ge�i�i olarak b�rak�lan (3-33)","Engel (4-22)","Utanma (5-11)","Eyer (23-35)","Adet (18-36)"};
		String[] cvp= {"ELEMAN","�AMAR","EZAN","N�ZA","EBE","�N","KETENE","E�ELEK","LAZ","BE","EMANET","MAN�","AR","Z�N","TANE"};
		cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
	}
  public void bulmaca3()
  {
	  String[] soru= {"Madensel, madenle ilgili (1-7)","Alkol (8-13)","Beylik (16-21)","An�sle ilgili (22-25)","Bir harfin okunu�u (27-28)","�nsan�n ve omurgal� hayvanlar�n �at�s�n� olu�turan t�rl� bi�iminde sert organlar�n genel ad� (29-33)","�ncesiz (38-42)","G�z (43-45)","Bir ya��� t�r� (47-49)","Bir harfin okunu�u (1-8)","Bir t�r s�rmal� ve k�stekli b��ak (22-43)","D�l e�i (2-30)","B�t�n olarak, ba�tan sona(3-45)","��z�mleme (4-39)","Taze yumu�ak ve tuzsuz beyaz peynir (5-19)","F�r�nda pi�irilen tatl� ��rek(33-47)","�ncirin d�llenmesi sa�layan sinek(6-27)","Lantan elementinin simgesi (41-48)","Cevizin ye�il kabu�u (21-49)"};
		String[] cvp= {"METAL�K","ETANOL","EMARET","ANAL","KE","KEM�K","EZEL�","AYN","KAR","ME","AKVA","ETENE","TAMAMEN","ANAL�Z","LOR","KEK","�LEK","LA","TET�R"};
		cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca4()
  {
       String[] soru= {"A��k olma (1-2)","�nce ve k���k bir nesne ile sert bir yerevuruldu�unda ��kan ses (4-6)","Kertenkele derisinin sepilenmesiyle elde edilen bir deri t�r� (7-11)","O yer (13-15)","Kriptonun simgesi (17-18)","Ku�atma (20-24)","Uyar� (27-30)","U�ra��lan �ey,me�ale (31-36)","Telefon S�z� (1-13)","L�tesyum elementinin simgesi (25-31)","Asker (2-20)","A��k belli (9-33)","Tantal'�n simgesi (4-10)","A�abey (22-34)","Ayn� �rktan olanlardan her biri (5-35)","Uygun bulan,kabul eden (18-36)"};
	   String[] cvp= {"A�","TIK","LEZAR","ORA","KR","�HATA","�KAZ","U�RA�I","ALO","LU","�ER�","ZAH�R","TA","AKA","IRKTA�","RAZI"};
       cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca5()
  {
       String[] soru= {"Tatile ��km�� kimse (1-7)","Ulamak ��i (8-12)","Kuru t�t�n yapra��n� and�ran k�z�l�ms� kahverengi, t�t�n rengi (15-18)","Silisyumun simgesi (20-21)","Mallar, para ile al�nan �eyler (24-28)","Selin s�r�kleyip getirdi�i kum ve toprak kar���m� (29-31)","��te (33-35)","�stanbulun bir il�esi (36-41)","Bir harfin okunu�u (43-44)","Od (46-49)","Bir �eyin tutulup �ekilecek yeri (1-43)","Kar���k renkli, �ok renkli, alaca (2-16)","D���nce (30-44)","�zerinde tan�t�c� yaz� veya resim bulunan levha (3-38)","Cemaate namaz k�ld�ran kimse (4-25)","Lantan elementinin simgesi (39-46)","Lantan elementini simgesi (5-12)","Bir i�i yerine getirmek i�in verilen s�z (26-47)","K�lte (20-48)","Y�celme (7-35)"};
	   String[] cvp= {"TAT�LC�","ULAMA","TABA","S�","EMVAL","M�L","AHA","ADALAR","�E","ATE�","TUTAMA�","ALA","�DE","TABELA","�MAM","LA","LA","VAAT","SAHRE","�T�LA"};
       cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca6()
  {
	  String[] soru= {"Bar�n�lacak yer, melce (1-7)","Y�netme, y�netim (8-12)","B�y�me geli�me, �o�alma (15-18)","�lave (20-21)","Seyrek dokunmu� delikli bir kuma� t�r� (22-27)","�ki atli k�zak (31-35)","�tmek, vurmak (37-42)","Tende bulunan ufak koyu renkli leke (43-45)","�zme, s�k�nt� verme (47-49)","Bin say�s�n� �le�tirme say� s�fat� (1-29)","Say� (2-23)","Bir harfin okunu�u (37-44)","Oru� tutulan ay (3-45)","Uzakla�mak (4-39)","Neon Elementinin simgesi (5-12)","Yukar�dan A�a��ya do�ru gelmek (26-47)","Y�k�nt�, D�k�nt�, ��k�nt� (20-48)","Maden K�m�r�n�n dam�t�lmas�yla elde edilen kat� yak�t (7-21)","A�abey (35-49)"};
      String[] cvp= {"BARINAK","�DARE","NEMA","EK","ETAM�N","ZANKA","KAKMAK","BEN","EZA","B�NER","ADET","KE","RAMAZAN","IRAMAK","NE","�NME","ENKAZ","KOK","AKA"};
	    cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca7()
  {
	  String[] soru= {"D�� kar��t� (1-2)","��l (4-8)","Hayvan �i�e�i (9-11)","Ba��bo� hayvan (13-16)","Mezra (17-22)","Ak�m, �s�, ses vb'ni ge�iren madde, nakil,yal�tkan kar��t� (26-32)","Bir t�r yaban mersini (33-36)","Anne (38-40)","Binmeye yarayan (41-45)","Talyum elementini simgesi (47-48)","Ak�ll�ca (49-55)","Kar f�rt�nal� (59-64)","Sahip (1-17)","Boyut (33-57)","Resesif (2-50)","Asl� pikrik asit olan patlay�c� bir madde (11-59)","Birinin memleketini sormak i�in kullan�lan bir s�z (20-60)","Kur'an surelerini olu�turan k�s�mlardan her biri (5-29)","��i gaz, s�v� veya kat� herhangi bir maddeyi alabilen oyuk nesne (45-61)","M�rekkep konulan k���k kap (6-38)"," Nikelin simgesi (54-62)","Radon elementinin simgesi (7-15)","Enteklekt�el olmaya �zenen ancak bunu i�in gerekli olan niteli�i kazanmam�� kimse (31-63)","Yeni bir bestecilik ����r�na g�re, ton ve makam temeline ba�l� kalmadan olu�turulan beste (8-48)"};
      String[] cvp= {"��","SAHRA","YEM","YONT","EKENEK","�LETKEN","EN�R","ANA","B�NEK","TL","AK�LANE","T�P�L�","�YE","EBAT","�EK�N�K","MEL�N�T","NEREL�","AYET","KAP","HOKKA","N�","RN","ENTEL","ATONAL"};
	    cevaplar=cvp;
		sorular=soru;
		sutun=8;
		satir=8;
		jlbsorular=new JLabel[sorular.length];
  }
}

