package uygulamam1;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.*;
import javax.swing.*;

public class Uygulamam1 {

    private static int denemeSayi = 0;

    public static void main(String[] args) {

        JFrame f = new JFrame("Onur Restaurant");
        JLabel l1 = new JLabel("RESTAURANT YİYECEK-İÇECEK MENÜSÜ");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("calibri", Font.ITALIC, 22));
        l1.setBounds(20, 10, 500, 30);

        JLabel yemekler = new JLabel("Yemek Çeşitleri        İçecek Çeşitleri");
        yemekler.setForeground(Color.magenta);
        yemekler.setFont(new Font("Arial", Font.ITALIC, 17));
        yemekler.setBounds(20, 40, 300, 30);

        JLabel l2 = new JLabel("Tavuk Döner : 20 $");
        l2.setFont(new Font("Calibri", Font.BOLD, 15));
        l2.setBounds(20, 72, 200, 20);
        JLabel l3 = new JLabel("Et Döner : 30 $");
        l3.setFont(new Font("Calibri", Font.BOLD, 15));
        l3.setBounds(20, 112, 200, 20);
        JLabel l4 = new JLabel("Lahmacun : 10 $");
        l4.setFont(new Font("Calibri", Font.BOLD, 15));
        l4.setBounds(20, 152, 200, 20);
        JLabel l5 = new JLabel("Kıymalı Pide : 25 $");
        l5.setFont(new Font("Calibri", Font.BOLD, 15));
        l5.setBounds(20, 192, 200, 20);
        JLabel l6 = new JLabel("Tavuklu Pilav : 12 $");
        l6.setFont(new Font("Calibri", Font.BOLD, 15));
        l6.setBounds(20, 232, 200, 20);

        JLabel l17 = new JLabel("Çay : 3 $");
        l17.setFont(new Font("Calibri", Font.BOLD, 15));
        l17.setBounds(180, 110, 200, 20);
        JLabel l18 = new JLabel("Su : 1 $");
        l18.setFont(new Font("Calibri", Font.BOLD, 15));
        l18.setBounds(180, 150, 200, 20);
        JLabel l19 = new JLabel("Ayran : 5 $");
        l19.setFont(new Font("Calibri", Font.BOLD, 15));
        l19.setBounds(180, 190, 200, 20);

        JLabel l7 = new JLabel("Müşterinin satın aldıkları (Porsiyon,Adet) :");
        l7.setForeground(Color.RED);
        l7.setFont(new Font("Calibri", Font.ITALIC, 17));
        l7.setBounds(20, 270, 400, 20);

        JLabel l8 = new JLabel("Tavuk Döner : ");
        l8.setFont(new Font("Calibri", Font.BOLD, 15));
        l8.setBounds(20, 300, 200, 30);
        JLabel l9 = new JLabel("Et Döner : ");
        l9.setFont(new Font("Calibri", Font.BOLD, 15));
        l9.setBounds(20, 340, 200, 30);
        JLabel l10 = new JLabel("Lahmacun : ");
        l10.setFont(new Font("Calibri", Font.BOLD, 15));
        l10.setBounds(20, 380, 200, 30);
        JLabel l11 = new JLabel("Kıymalı Pide : ");
        l11.setFont(new Font("Calibri", Font.BOLD, 15));
        l11.setBounds(20, 420, 200, 30);
        JLabel l12 = new JLabel("Tavuklu Pilav : ");
        l12.setFont(new Font("Calibri", Font.BOLD, 15));
        l12.setBounds(20, 460, 200, 30);

        JLabel l20 = new JLabel("Çay : ");
        l20.setBounds(180, 345, 200, 20);
        JTextField t16 = new JTextField("0");
        t16.setBounds(230, 345, 40, 30);
        t16.setEditable(false);

        JLabel l21 = new JLabel("Su : ");
        l21.setBounds(180, 385, 200, 20);
        JTextField t17 = new JTextField("0");
        t17.setBounds(230, 385, 40, 30);
        t17.setEditable(false);

        JLabel l22 = new JLabel("Ayran : ");
        l22.setBounds(180, 425, 200, 20);
        JTextField t18 = new JTextField("0");
        t18.setBounds(230, 425, 40, 30);
        t18.setEditable(false);

        JLabel l13 = new JLabel("FATURA TUTARI : ");
        l13.setFont(new Font("Calibri", Font.ITALIC, 17));
        l13.setForeground(Color.magenta);
        l13.setBounds(20, 580, 400, 30);

        JLabel l14 = new JLabel("Masa Numarası : ");
        l14.setFont(new Font("Calibri", Font.ITALIC, 16));
        l14.setBounds(330, 370, 200, 30);

        JLabel l15 = new JLabel("Kasiyer ID : ");
        l15.setBounds(320, 105, 100, 40);
        JLabel l16 = new JLabel("Şifre : ");
        l16.setBounds(320, 155, 100, 40);

        JTextField t8 = new JTextField("0");
        t8.setBounds(120, 300, 40, 30);
        t8.setEditable(false);
        JTextField t9 = new JTextField("0");
        t9.setBounds(120, 340, 40, 30);
        t9.setEditable(false);
        JTextField t10 = new JTextField("0");
        t10.setBounds(120, 380, 40, 30);
        t10.setEditable(false);
        JTextField t11 = new JTextField("0");
        t11.setBounds(120, 420, 40, 30);
        t11.setEditable(false);
        JTextField t12 = new JTextField("0");
        t12.setBounds(120, 460, 40, 30);
        t12.setEditable(false);

        String[] masaNum = {"1", "2", "3", "4", "5", "6", "7", "8", "10", "11", "12", "13", "14", "15"};
        JComboBox masa = new JComboBox(masaNum);
        masa.setBounds(450, 376, 50, 20);
        masa.setEnabled(false);
        masa.setSelectedIndex(-1); // Bu ilk başta herhangi bir değer seçmemesini sağlar.

        JTextField t14 = new JTextField();
        t14.setBounds(390, 112, 100, 25);
        JPasswordField t15 = new JPasswordField();
        t15.setBounds(390, 162, 100, 25);

        JCheckBox kontrol = new JCheckBox("Bilgiler doğru girilmiştir.");
        kontrol.setFont(new Font("Calibri", Font.ITALIC, 16));
        kontrol.setBounds(326, 410, 300, 20);
        kontrol.setEnabled(false);

        JButton hesap = new JButton("Faturayı Hesapla");
        hesap.setBounds(20, 510, 200, 40);
        hesap.setEnabled(false);
        hesap.setFocusable(false);
        hesap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kontrol.isSelected() == false && masa.getSelectedIndex() == -1) {

                    JOptionPane.showMessageDialog(f, "Masa numarasını ve bilgilerin doğtuluğunu kontrol edin.", " ONUR RESTAURANT ", JOptionPane.ERROR_MESSAGE);

                } else {
                    int tavukDonerAdet = Integer.parseInt(t8.getText());
                    int etDonerAdet = Integer.parseInt(t9.getText());
                    int LahmacunAdet = Integer.parseInt(t10.getText());
                    int PideAdet = Integer.parseInt(t11.getText());
                    int TPilavAdet = Integer.parseInt(t12.getText());

                    int cayAdet = Integer.parseInt(t16.getText());
                    int suAdet = Integer.parseInt(t17.getText());
                    int ayranAdet = Integer.parseInt(t18.getText());

                    int masaNumara = Integer.parseInt((String) masa.getSelectedItem());

                    int yemekÜcret = ((tavukDonerAdet * 20) + (etDonerAdet * 30) + (LahmacunAdet * 10) + (PideAdet * 25) + (TPilavAdet * 12));
                    int icecekÜcret = ((cayAdet * 3) + (suAdet * 1) + (ayranAdet * 5));
                    int Ücret = yemekÜcret + icecekÜcret;
                    l13.setText(masaNumara + " NUMARALI MASA'NIN FATURA TUTARI: " + Ücret + " $");

                    masa.setSelectedIndex(-1);
                    t8.setText("0");
                    t9.setText("0");
                    t10.setText("0");
                    t11.setText("0");
                    t12.setText("0");
                    t16.setText("0");
                    t17.setText("0");
                    t18.setText("0");

                }

            }
        });

        JButton cıkıs = new JButton("Kasiyer Çıkışı Yap");
        cıkıs.setFont(new Font("Calibri", Font.ITALIC, 16));
        cıkıs.setBackground(Color.white);
        cıkıs.setBounds(320, 460, 170, 20);
        cıkıs.setEnabled(false);
        cıkıs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t8.setEditable(false);
                t9.setEditable(false);
                t10.setEditable(false);
                t11.setEditable(false);
                t12.setEditable(false);
                t16.setEditable(false);
                t17.setEditable(false);
                t18.setEditable(false);

                masa.setEnabled(false);
                kontrol.setEnabled(false);
                kontrol.setSelected(false);
                hesap.setEnabled(false);
                cıkıs.setEnabled(false);
                l13.setText("");

                JOptionPane.showMessageDialog(f, "             Çıkış Başarılı", "Kasiyer Çıkışı Yapıldı", JOptionPane.WARNING_MESSAGE);

            }
        });

        JButton btn = new JButton("Kasiyer Girişi Yap");
        btn.setBounds(320, 210, 170, 20);
        btn.setBackground(Color.GREEN);
        btn.setFont(new Font("Calibri", Font.ITALIC, 16));

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ID = "45";
                String sifre = "samsun55";
                if (t14.getText().equals(ID) && t15.getText().equals(sifre)) {

                    JOptionPane.showMessageDialog(f, "             Giriş Başarılı", "Kullanıcı Adı ve Şifre Doğru", JOptionPane.WARNING_MESSAGE);
                    t14.setText("");
                    t15.setText("");
                    t8.setEditable(true);
                    t9.setEditable(true);
                    t10.setEditable(true);
                    t11.setEditable(true);
                    t12.setEditable(true);
                    t16.setEditable(true);
                    t17.setEditable(true);
                    t18.setEditable(true);
                    cıkıs.setEnabled(true);

                    masa.setEnabled(true);
                    kontrol.setEnabled(true);
                    hesap.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(f, "Kullanıcı Adı veya Şifre Yanlış", "Giriş başarısız.", JOptionPane.ERROR_MESSAGE);
                    denemeSayi++;
                    t8.setEditable(false);
                    t9.setEditable(false);
                    t10.setEditable(false);
                    t11.setEditable(false);
                    t12.setEditable(false);
                    t16.setEditable(false);
                    t17.setEditable(false);
                    t18.setEditable(false);
                    cıkıs.setEnabled(false);
                    masa.setEnabled(false);
                    kontrol.setEnabled(false);
                    hesap.setEnabled(false);

                    if (denemeSayi == 5) {
                        JOptionPane.showMessageDialog(f, "Çok fazla deneme yaptınız. 15 Saniye sonra tekrar deneyiniz.", "DİKKAT", JOptionPane.INFORMATION_MESSAGE);
                        try {
                            btn.setEnabled(false);
                            Thread.sleep(15000);
                            btn.setEnabled(true);

                        } catch (InterruptedException ex) {

                        }

                    }
                    if (denemeSayi == 10) {
                        JOptionPane.showMessageDialog(f, "Çok fazla deneme yaptınız. Sistemden çıkarılıyorsunuz.", "DİKKAT", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(1);

                    }

                }

            }
        });

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(l15);
        f.add(l16);
        f.add(l17);
        f.add(l18);
        f.add(l19);
        f.add(yemekler);
        f.add(masa);
        f.add(l20);
        f.add(l21);
        f.add(l22);

        f.add(t8);
        f.add(t9);
        f.add(t10);
        f.add(t11);
        f.add(t12);
        f.add(masa);
        f.add(t14);
        f.add(t15);
        f.add(t16);
        f.add(t17);
        f.add(t18);

        f.add(kontrol);
        f.add(hesap);
        f.add(btn);
        f.add(cıkıs);

        f.setSize(550, 700);
        f.setLocationRelativeTo(null); // Programı ortada açar.
        f.setLayout(null);
        f.setVisible(true);

    }

}
