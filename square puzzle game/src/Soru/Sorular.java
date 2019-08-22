package Soru;
import javax.swing.*;

public class Sorular {
	public	String[] cevaplar,sorular;
	public	JLabel[] jlbsorular;
	public	int satir;
	public	int sutun;
	public void bulmaca0()
	{
		String[] soru= {"Önce Karþýtý (1-5)","Köpek (7-8)","Gözde sarýya çalan kestane rengi (10-12)","Eski yunanda konser verilen basamaklý yer (14-18)","Etken (19-22)","Ýnce,açýk sarý renkli kamýþ (25-27)","Sodyumun simgesi (29-30)","Kansýz (31-36)","Silisyumun simgesi (1-7)","Baston (19-31)","Bir tür ipekli kumaþ (2-32)","Mýsra (15-33)","Gerçek (4-22)","Telefon sözü (5-17)","Nikelin simgesi (29-35)","Avustrulya veya Yeni zelenda birliklerinin ortak adý (12-36)"};
	    String[] cvp= {"SONRA","ÝT","ELA","ODEON","AMÝL","SAZ","NA","ANEMÝK","SÝ","ASA","OTOMAN","DÝZE","REEL","ALO","NÝ","ANZAK"};
	    cevaplar=cvp;
	    sorular=soru;
	    sutun=6;
	    satir=6;
	    jlbsorular=new JLabel[sorular.length];
	}
	public void bulmaca1()
	{
		String[] soru= {"Eski insanlar için 4 ayaklý Ferrari (1-2)","Mangalda býrakýlmayan (4-6)","Çoðunun Aþýk usandýrdýðý (7-9)","Olumsuz bir ek (11-12)","Büyüklüðün Þanýndandýr (15-16)","Sükutun geldiði yer (19-23)","Bir baðlaç (25-26)","Fizikte momenti bile olan temmbellik (31-36)","Genellikler eþyalar için kullanýlsada,deðiþik insanlar için kullanýlýr (1-31)","Uzaklýk anlatýr (2-8)","Ta ne zaman olan Kara þimþek'te konuþan araba abinin adý(20-32)","Bir çocuðun elinde görürse bir ebeveyn 'ilerde baþýmýza  kumarbaz mý olacaksýn' altý yüzlü denilebilen katý cisim (9-21)","Çalýþýr durumda olan (16-34)","Çoðu zarar azý karar;çokça insan tarafýndan bilinme,tanýnma (5-11)","Dili tutulmuþ terstende yönden de okusanýz hep ayný (6-18)","Kuzu ana öðünü(30-36)"};
		String[] cvp= {"AT","KÜL","NAZ","NA","AF","ÝKRAR","KÝ","ATALET","ANTÝKA","TA","KÝT","ZAR","FAAL","ÜN","LAL","OT"};
		cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
	}
	public void bulmaca2()
	{
		String[] soru= {"Kümeye ait varlýklardan her biri (1-6)","Açýk elle yüze vurulan tokat (7-11)","Namaz vaktini bildiren çaðrý (13-16)","Çekiþme,Bozuþma (22-25)","Doðum yaptýran kadýn (25-27)","Maðra (29-30)","Kenevir (31-36)","Elmanýn yenmeyen iç kýsmý (1-31)","Karadeniz Bölgesinde yaþayan halk (2-14)","Berilyumun Simgesi (26-32)","Birine geçiçi olarak býrakýlan (3-33)","Engel (4-22)","Utanma (5-11)","Eyer (23-35)","Adet (18-36)"};
		String[] cvp= {"ELEMAN","ÞAMAR","EZAN","NÝZA","EBE","ÝN","KETENE","EÞELEK","LAZ","BE","EMANET","MANÝ","AR","ZÝN","TANE"};
		cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
	}
  public void bulmaca3()
  {
	  String[] soru= {"Madensel, madenle ilgili (1-7)","Alkol (8-13)","Beylik (16-21)","Anüsle ilgili (22-25)","Bir harfin okunuþu (27-28)","Ýnsanýn ve omurgalý hayvanlarýn çatýsýný oluþturan türlü biçiminde sert organlarýn genel adý (29-33)","Öncesiz (38-42)","Göz (43-45)","Bir yaðýþ türü (47-49)","Bir harfin okunuþu (1-8)","Bir tür sýrmalý ve köstekli býçak (22-43)","Döl eþi (2-30)","Bütün olarak, baþtan sona(3-45)","Çözümleme (4-39)","Taze yumuþak ve tuzsuz beyaz peynir (5-19)","Fýrýnda piþirilen tatlý çörek(33-47)","Ýncirin döllenmesi saðlayan sinek(6-27)","Lantan elementinin simgesi (41-48)","Cevizin yeþil kabuðu (21-49)"};
		String[] cvp= {"METALÝK","ETANOL","EMARET","ANAL","KE","KEMÝK","EZELÝ","AYN","KAR","ME","AKVA","ETENE","TAMAMEN","ANALÝZ","LOR","KEK","ÝLEK","LA","TETÝR"};
		cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca4()
  {
       String[] soru= {"Açýk olma (1-2)","Ýnce ve küçük bir nesne ile sert bir yerevurulduðunda çýkan ses (4-6)","Kertenkele derisinin sepilenmesiyle elde edilen bir deri türü (7-11)","O yer (13-15)","Kriptonun simgesi (17-18)","Kuþatma (20-24)","Uyarý (27-30)","Uðraþýlan þey,meþale (31-36)","Telefon Sözü (1-13)","Lütesyum elementinin simgesi (25-31)","Asker (2-20)","Açýk belli (9-33)","Tantal'ýn simgesi (4-10)","Aðabey (22-34)","Ayný ýrktan olanlardan her biri (5-35)","Uygun bulan,kabul eden (18-36)"};
	   String[] cvp= {"AÇ","TIK","LEZAR","ORA","KR","ÝHATA","ÝKAZ","UÐRAÞI","ALO","LU","ÇERÝ","ZAHÝR","TA","AKA","IRKTAÞ","RAZI"};
       cevaplar=cvp;
		sorular=soru;
		sutun=6;
		satir=6;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca5()
  {
       String[] soru= {"Tatile çýkmýþ kimse (1-7)","Ulamak Ýþi (8-12)","Kuru tütün yapraðýný andýran kýzýlýmsý kahverengi, tütün rengi (15-18)","Silisyumun simgesi (20-21)","Mallar, para ile alýnan þeyler (24-28)","Selin sürükleyip getirdiði kum ve toprak karýþýmý (29-31)","Ýþte (33-35)","Ýstanbulun bir ilçesi (36-41)","Bir harfin okunuþu (43-44)","Od (46-49)","Bir þeyin tutulup çekilecek yeri (1-43)","Karýþýk renkli, çok renkli, alaca (2-16)","Düþünce (30-44)","Üzerinde tanýtýcý yazý veya resim bulunan levha (3-38)","Cemaate namaz kýldýran kimse (4-25)","Lantan elementinin simgesi (39-46)","Lantan elementini simgesi (5-12)","Bir iþi yerine getirmek için verilen söz (26-47)","Külte (20-48)","Yücelme (7-35)"};
	   String[] cvp= {"TATÝLCÝ","ULAMA","TABA","SÝ","EMVAL","MÝL","AHA","ADALAR","ÇE","ATEÞ","TUTAMAÇ","ALA","ÝDE","TABELA","ÝMAM","LA","LA","VAAT","SAHRE","ÝTÝLA"};
       cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca6()
  {
	  String[] soru= {"Barýnýlacak yer, melce (1-7)","Yönetme, yönetim (8-12)","Büyüme geliþme, çoðalma (15-18)","Ýlave (20-21)","Seyrek dokunmuþ delikli bir kumaþ türü (22-27)","Ýki atli kýzak (31-35)","Ýtmek, vurmak (37-42)","Tende bulunan ufak koyu renkli leke (43-45)","Üzme, sýkýntý verme (47-49)","Bin sayýsýný üleþtirme sayý sýfatý (1-29)","Sayý (2-23)","Bir harfin okunuþu (37-44)","Oruç tutulan ay (3-45)","Uzaklaþmak (4-39)","Neon Elementinin simgesi (5-12)","Yukarýdan Aþaðýya doðru gelmek (26-47)","Yýkýntý, Döküntü, çöküntü (20-48)","Maden Kömürünün damýtýlmasýyla elde edilen katý yakýt (7-21)","Aðabey (35-49)"};
      String[] cvp= {"BARINAK","ÝDARE","NEMA","EK","ETAMÝN","ZANKA","KAKMAK","BEN","EZA","BÝNER","ADET","KE","RAMAZAN","IRAMAK","NE","ÝNME","ENKAZ","KOK","AKA"};
	    cevaplar=cvp;
		sorular=soru;
		sutun=7;
		satir=7;
		jlbsorular=new JLabel[sorular.length];
  }
  public void bulmaca7()
  {
	  String[] soru= {"Dýþ karþýtý (1-2)","Çöl (4-8)","Hayvan çiçeði (9-11)","Baþýboþ hayvan (13-16)","Mezra (17-22)","Akým, ýsý, ses vb'ni geçiren madde, nakil,yalýtkan karþýtý (26-32)","Bir tür yaban mersini (33-36)","Anne (38-40)","Binmeye yarayan (41-45)","Talyum elementini simgesi (47-48)","Akýllýca (49-55)","Kar fýrtýnalý (59-64)","Sahip (1-17)","Boyut (33-57)","Resesif (2-50)","Aslý pikrik asit olan patlayýcý bir madde (11-59)","Birinin memleketini sormak için kullanýlan bir söz (20-60)","Kur'an surelerini oluþturan kýsýmlardan her biri (5-29)","Ýçi gaz, sývý veya katý herhangi bir maddeyi alabilen oyuk nesne (45-61)","Mürekkep konulan küçük kap (6-38)"," Nikelin simgesi (54-62)","Radon elementinin simgesi (7-15)","Enteklektüel olmaya özenen ancak bunu için gerekli olan niteliði kazanmamýþ kimse (31-63)","Yeni bir bestecilik çýðýrýna göre, ton ve makam temeline baðlý kalmadan oluþturulan beste (8-48)"};
      String[] cvp= {"ÝÇ","SAHRA","YEM","YONT","EKENEK","ÝLETKEN","ENÝR","ANA","BÝNEK","TL","AKÝLANE","TÝPÝLÝ","ÝYE","EBAT","ÇEKÝNÝK","MELÝNÝT","NERELÝ","AYET","KAP","HOKKA","NÝ","RN","ENTEL","ATONAL"};
	    cevaplar=cvp;
		sorular=soru;
		sutun=8;
		satir=8;
		jlbsorular=new JLabel[sorular.length];
  }
}

