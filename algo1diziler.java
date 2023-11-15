//BİRDEN FAZLA DEĞERİN TEK BİR YAPIDA AYNI TİPTE OLMAK ŞARTIYLA TUTULDUĞU YAPILARDIR.
        //DİZİLER SIFIRINCI ELEMANDAN BAŞLAR
        
        String a[] = new String[3];
        a[0]="Bilgisayar";
        a[1]="Muhendisliği";
        String g = a[0];
        System.out.println(a[1]);
        System.out.println(g);
      
        
        //ÇOK BOYUTLU DİZİLERDE İSE DURUM BÖYLEDİR
      
        int A[][] = new int[3][2];   // 3 deki satır , 2 deki sütundur.
        A[0][0]=2;
        

        char DC[][] = new char[2][2];
        DC[0][0]= 'a';
        System.out.println(DC[0][0]);       
      
        
        //ÖNEMLİ
       
        String adSoyad[][]= {{"ALİ","OSMAN","Y"},{"VELİ","X","Z"}}; //burda 2 satır olduğunu , 3 sutun oldugunu anlarız
        System.out.println("2.SATIR 2.SÜTUN = " +adSoyad[1][1]);
       


// 10 elemanlı dizi alınıyor ve negatif olanlar ekrana yazılıyor
      
        int a[]= new int[10];
        Scanner k = new Scanner(System.in);
        for(int i=0; i<10 ; i++){
            a[i]=k.nextInt();
        
        if(a[i]<0){
            System.out.println("Dizinin negatif elemanlarından biridir = " +a[i]);
        }
    }
        
 // Girilen 10 sayının aritmetik ortalamasını, aritmetik ortalamadan küçük sayıları ve indisini bulan programı yapınız.
    
       int toplam=0;
       double ort=0;
       int dizi[]= new int [10];
       Scanner k =new Scanner(System.in);
       for(int i=0;i<dizi.length;i++){
           dizi[i]=k.nextInt();
           toplam=toplam + dizi[i];
       }
               ort= toplam/dizi.length;
               System.out.println("Ortalamanız = " +(double) +ort);
               for(int i=0;i<10;i++){
                   if(ort>dizi[i]){              
                       System.out.println("Dizinin ortalamasından küçük eleman = " +dizi[i]+" "+"indisi: " +i);
                   }
               }
       


// 20 Kişilik bir sınıftaki öğrencilerin adları dizide tutuluyor. İsminin ilk harfi 'B' veya 'b' olanları ekrana yaz.
//Tek yada uc karakterli olanları ekran yaz-

         String ad[]= new String[20];
         String s= " ";
         Scanner k = new Scanner(System.in);
         
         for(int i=0 ; i<20 ; i++){
             ad[i]=k.nextLine();
             if(ad[i].charAt(0)=='B' || ad[i].charAt(0)=='b'){
                 System.out.println("İlk harfi B veya b olan isim bulundu = " + ad[i]);
                 s=s+(ad[i]) +" ";
             }
             if(ad[i].length()==1 || ad[i].length()==3){
                 System.out.println("Tek yada Üç karakterli kelime bulundu = " +ad[i]);
             }
         }
         System.out.println(s);
       


// Klavyeden girilen 5 sayıdan en büyüğünü bulan programı yazınız.(Dizi kullanınız.)
              
         int a[] = new int[5];
         int enBuyuk = 0;
         Scanner k=new Scanner(System.in);
         a[0]=k.nextInt();
         a[0]=enBuyuk;
         for(int i=1; i<a.length;i++){
             a[i]= k.nextInt();
             if(a[i]>enBuyuk){
                 enBuyuk=a[i];
             }
         } 
         System.out.println("En büyük eleman = " +enBuyuk);

     


//Klavyeden rastgele girilen 10 string içinde en uzun karaktere sahip ilk stringi ve indisini bul
      
        Scanner k=new Scanner(System.in);
        String s[]= new String[10];

        for(int i=0;i<10;i++){
            s[i]=k.nextLine();}
            
            int max=s[0].length();
            String ilk=s[0];
            for(int i=0;i<10;i++){
            if(s[i].length()>max){
                max=s[i].length();
                ilk=s[i];}
            }
                                   System.out.println("EN UZUN İLK STRİNG = "+ilk);
                                   
        


//-------8 Kişilik bir sınıftaki öğrencilerin ad soyad numara java notu klavyeden giriliyor.
//Bu sınıftaki en yüsksek notu alan kişinin ad-soyad-no-puan yazıp tebrik eden program?
   

 Scanner k= new Scanner(System.in);
 String adSoyadNumara[]= new String[8];
 int not[]= new int[8];
     

 for(int i=0; i<8 ; i++){
    adSoyadNumara[i]=k.nextLine();

    not[i]=k.nextInt();
 }
 int max=not[0];
 String enyuksek =adSoyadNumara[0];
  for(int i=0;i<8;i++){
      if(max<not[i]){
          max=not[i];
          enyuksek=adSoyadNumara[i];
      }
  }   
        System.out.println(enyuksek + "" +max);
       


// klavyeden 3*4 elemanlı sayısal matris giriliyor . bu değerleri dizide tutan ve en büyük , en küçük değerleri bulup kaçıncı indiste oldugunu soyleyen program--------------------------------------------------------------------


        Scanner k = new Scanner(System.in);
        int dizi[][]= new int [3][4];
        System.out.println("Dizi elemanlarını giriniz.");
        int imax = 0,jmax = 0;
        int max= dizi[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                dizi[i][j]=k.nextInt();
                
                if(dizi[i][j]>max){
                    max=dizi[i][j];
                    imax=i;
                    jmax=j;
                }}}
                       System.out.println("En büyük eleman = " +max +" indisi = " +imax +" "+ jmax);

            int min= dizi[0][0];
            int imin=0,jmin=0;
            for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(dizi[i][j]<min){
                    min=dizi[i][j];
                    imin=i;
                    jmin=j;
                    
                }}}
                            System.out.println("En küçük eleman = " +min +" indisi = "+imin +" "+ jmin);
    }}


//aynı dizinin satır ve sütun toplamını bulan java programını da yazınız.

        Scanner k = new Scanner(System.in);
        int dizi[][]= new int [3][4];
        int toplam=0;
        System.out.println("Dizi elemanlarını giriniz.");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                dizi[i][j]=k.nextInt();     
            }
        }
        
            for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[0][j];
            }
        
        System.out.println("Birinci satır toplamı :" +toplam);
        toplam=0;

         for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[1][j];
            }  
        System.out.println("İkinci satır toplamı :" +toplam);
        toplam=0;

         for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[2][j];
            }
        
        System.out.println("Üçüncü satır toplamı :" +toplam);
        toplam=0;
        System.out.println("");
     
        for(int i=0 ; i<3 ; i++){
            toplam=toplam+dizi[i][0];
        }
        System.out.println("Birinci sütun toplamı : "+toplam);
        toplam=0;
        
        for(int i=0 ; i<3 ; i++){
            toplam=toplam+dizi[i][1];
        }
        System.out.println("İkinci sütun toplamı : "+toplam);
        toplam=0;
        
        for(int i=0 ; i<3 ; i++){
            toplam=toplam+dizi[i][2];
        }
        System.out.println("Üçüncü sütun toplamı : "+toplam);
        toplam=0;
        
        for(int i=0 ; i<3 ; i++){
            toplam=toplam+dizi[i][3];
        }
        System.out.println("Dördüncü sütun toplamı : "+toplam);
        toplam=0;

//----------------------------------------------------------------------------------------------------



Scanner k = new Scanner(System.in);
        int dizi[][]= new int [3][4];
        int toplam=0;
        System.out.println("Dizi elemanlarını giriniz.");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                dizi[i][j]=k.nextInt();     
            }
        }
        
            for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[0][j];
            }
        
        System.out.println("Birinci satır toplamı :" +toplam);
        toplam=0;

         for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[1][j];
            }  
        System.out.println("İkinci satır toplamı :" +toplam);
        toplam=0;

         for(int j=0 ; j<4 ; j++){
                toplam=toplam+dizi[2][j];
            }
        
        System.out.println("Üçüncü satır toplamı :" +toplam);
        toplam=0;
        System.out.println("");
     
       for(int j=0;j<4;j++){
           for(int i=0;i<3;i++){
               toplam=toplam+dizi[i][j];
               if(j==0 && i==2){
                   System.out.println("Birinci sütun toplamı = "+toplam);
                   toplam=0;
               }
               if(j==1 && i==2){
                   System.out.println("İkinci sütun toplamı = "+toplam);
                                      toplam=0;

               }
               if(j==2 && i==2){
                   System.out.println("Üçüncü sütun toplamı = "+toplam);
                                      toplam=0;

               }
               if(j==3 && i==2){
                   System.out.println("Dördüncü sütun toplamı = "+toplam);
                                      toplam=0;

               }
               
           }
       }

      

//2 boyutlu string dizisi klavyeden giriliyor (2*3). Bu diziyi tek bir stringe birleştiren programı yazınız.-------------------------------------------------------------------------------------------------
        

    
        Scanner k=new Scanner(System.in);
        String A[][]=new String[2][3];
        String st="";
        for(int i=0 ; i<A.length;i++){
            for(int j=0; j<A[0].length;j++){
                A[i][j]=k.next();
                st=st+A[i][j];
            }
        }
        System.out.println(st);
        
--- //aynı diziyi tek boyutlu string dizisi haline getiren programı yazınız.
        
        int c=0;
        String tekBoyut[]= new String[6];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                tekBoyut[c]=A[i][j];
                c++;}
            }
for(int i=0;i<6;i++){
    System.out.println(tekBoyut[i]);
}
         



// ÖDEV 3 = 2 boyutlu string dizisi 2 * 2 içindeki en uzun karaktere sahip olan stringi bulup ekrana yaz
        // kaçıncı satır ve sütnda oldugunu ekrana yaz.

  Scanner k= new Scanner(System.in);
  String dizi[][] = new String[2][2];
 
  for(int i=0; i<2 ; i++){
      for(int j=0;j<2;j++){
          dizi[i][j]=k.next();}}
           
  int enUzun = dizi[0][0].length();
  int enUzunİ=0;
  int enUzunJ=0;
  for(int i=0;i<2;i++){
      for(int j=0 ;j<2;j++){
          if(dizi[i][j].length()>enUzun){
              enUzun=dizi[i][j].length();
                enUzunİ=i;
                enUzunJ=j;
      }}}   
            System.out.println("Dizideki en uzun String = "+dizi[enUzunİ][enUzunJ] +" /" + " İndisi = " +enUzunİ +"," +enUzunJ);




----------------------------------------------------------------------------//Ödev 1= sayfa şeklinde 10 karakterli şifreleri yukarıdan aşağıya doğru görüntüleyen programı yapınız   ----------------------------------------------------------------------------------------------------

 String sifre="";
 char c[]={'a','b','c','d','e','1','2','3','4','5'};
 for(int n=0;n<1000;n++){
     for(int i=0;i<4;i++){
         sifre += c[(int)(10.0*Math.random())];}
     System.out.println(sifre);
     sifre="";
 }
      
        // bütün elemanları 1 olan 10 elemanlı matris dizisi oluşturunuz.
      
 int dizi[]=new int[10];
 for(int i=0;i<10;i++){
     dizi[i]=1;
 }
  for(int i=0;i<10;i++){
        System.out.println("Dizinin "+(i+1) +". elemanı : " +dizi[i]);
  }
       


// Kullanıcıdan dizi elemanlarını alma.

        Scanner k = new Scanner(System.in);
        System.out.println("Dizinin uzunluğu kaç elemanlı olsun?");
        int diziUzunluk = k.nextInt();
        String dizi[] = new String[diziUzunluk];
        for(int i=0; i<dizi.length ;i++){
            System.out.print("Dizinin "+i+". İndexini giriniz.");
            dizi[i]=k.next();
        }
        
        System.out.println("******DİZİNİN ELEMANLARI*******");
        for(int i=0;i<diziUzunluk;i++){
            System.out.println(dizi[i]);
        }
      
        //Foreach döngüsü kullanımı
        /*       
        String[] isimler = {"ali", "veli", "onur"};
        for (String eleman : isimler) {
            System.out.println(eleman);
        }

        int[] sayilar = {7, 8, 9, 10};

        for (int b : sayilar) {
            System.out.println(b);
        }
        


      --------------------------------------------------------------------------------------  // Dizinin elemanlarını kullanıcıdan alalım daha sonra dizinin içindeki elemanlar asal mı bak?--------------------------------------------------------------------------------------------------
        Scanner k = new Scanner(System.in);--

        int dizi[] = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            int sayac = 0;
            System.out.println("Dizinin " + i + ". İndexini Girin.");
            dizi[i] = k.nextInt();
            if (dizi[i]==1){
                sayac=1;
            }

            for (int b = 2; b < dizi[i]; b++) {

                if (dizi[i] % b == 0) {
                    sayac++;
                }
                
            }
            if (sayac == 0) {
                System.out.println("Sayı Asaldır.");
                System.out.println("-------------------");
            } else {
                System.out.println("Sayı Asal Değildir.");
                System.out.println("-------------------");

            }}}}

-------------------------------------------------------------------------------------------------------------------Dizinin herhangi bir bloğunda eleman tanımlı değil ise diziyi tamamen okutma---------------------------------------------------------------------------------------------------
   
       int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     System.out.println(myNumbers[1][2]);
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j <myNumbers[i].length; ++j) {
           System.out.println(myNumbers[i][j]);
        }
     }
