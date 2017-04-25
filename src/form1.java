import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.CardLayout;
import java.awt.Font;


import javax.swing.AbstractAction;
import javax.swing.Action;

import java.awt.Button;
import java.awt.TextField;
import java.awt.Cursor;

import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import javax.swing.JTextField;

import java.awt.TextArea;

import javax.swing.border.TitledBorder;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class form1 {

	private JFrame frmCargoManagementV;

	private JTextField txt_LoginKadi;
	private JTextField txt_LoginSifre;
	private JTextField txt_RegAdSoyad;
	private JPasswordField txt_RegPass;
	private JPasswordField txt_RegPassagain;
	private JTextField txt_RegMail;
	private JTextField txt_RegKadi;
	private JTextField txt_GuncelleSubeAdi;
	private JTextField txt_GuncelleSubeMudur;
	private JTextField txt_GuncelleSubeVergi;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_22;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_49;
	private JPasswordField passwordField;
	private JTextField textField_47;
	private JTextField textField_48;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 window = new form1();
					window.frmCargoManagementV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCargoManagementV = new JFrame();
		frmCargoManagementV.setResizable(false);
		frmCargoManagementV.setIconImage(Toolkit.getDefaultToolkit().getImage(form1.class.getResource("/images/icon.png")));
		frmCargoManagementV.setTitle("Cargo Management v1.0");
		frmCargoManagementV.setBackground(Color.WHITE);
		frmCargoManagementV.setBounds(100, 100, 800, 600);
		frmCargoManagementV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCargoManagementV.getContentPane().setLayout(new CardLayout(0, 0));
		
		//Paneller Buraya
		final JPanel main = new JPanel();
		main.setAutoscrolls(false);
		main.setFont(new Font("Tahoma", Font.PLAIN, 20));
		main.setBackground(new Color(192, 192, 192));
		frmCargoManagementV.getContentPane().add(main, "name_70053018413817");
		main.setLayout(null);
		//******
		final JPanel login = new JPanel();
		login.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		login.setVisible(false);
		login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login.setBackground(new Color(192, 192, 192));
		frmCargoManagementV.getContentPane().add(login, "name_70067586576876");
		login.setLayout(null);
		
		JLabel lbl_LoginKadi = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lbl_LoginKadi.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_LoginKadi.setBounds(185, 236, 113, 25);
		login.add(lbl_LoginKadi);
		
		JLabel lbl_LoginSifre = new JLabel("Sifre :");
		lbl_LoginSifre.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_LoginSifre.setBounds(245, 301, 49, 14);
		login.add(lbl_LoginSifre);
		
		txt_LoginKadi = new JTextField();
		txt_LoginKadi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_LoginKadi.setToolTipText("");
		txt_LoginKadi.setBounds(316, 228, 210, 36);
		login.add(txt_LoginKadi);
		txt_LoginKadi.setColumns(10);
	
		txt_LoginSifre = new JPasswordField();
		txt_LoginSifre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_LoginSifre.setBounds(316, 288, 210, 36);
		login.add(txt_LoginSifre);
		txt_LoginSifre.setColumns(10);
		
		JLabel img_LoginLogo = new JLabel("");
		img_LoginLogo.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		img_LoginLogo.setBounds(304, 28, 177, 96);
		login.add(img_LoginLogo);
		
		JButton btn_LoginGiris = new JButton("Giriþ");
		
		btn_LoginGiris.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btn_LoginGiris.setForeground(Color.WHITE);
		btn_LoginGiris.setFont(new Font("Georgia", Font.PLAIN, 14));
		btn_LoginGiris.setBackground(new Color(128, 128, 128));
		btn_LoginGiris.setBounds(437, 351, 89, 23);
		login.add(btn_LoginGiris);
		
		
		
		JLabel lbl_LoginCpyrght = new JLabel("Nku | Computer Engineering");
		lbl_LoginCpyrght.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbl_LoginCpyrght.setBounds(329, 546, 135, 14);
		login.add(lbl_LoginCpyrght);

		//******
		final JPanel register = new JPanel();
		register.setVisible(false);
		register.setFont(new Font("Tahoma", Font.PLAIN, 20));
		register.setBackground(new Color(192, 192, 192));
		frmCargoManagementV.getContentPane().add(register, "name_70074772378879");
		register.setLayout(null);
		
		JLabel lbl_RegKadi = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lbl_RegKadi.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegKadi.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegKadi.setBounds(195, 239, 113, 25);
		register.add(lbl_RegKadi);
		
		txt_RegAdSoyad = new JTextField();
		txt_RegAdSoyad.setToolTipText("");
		txt_RegAdSoyad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_RegAdSoyad.setColumns(10);
		txt_RegAdSoyad.setBounds(326, 135, 210, 36);
		register.add(txt_RegAdSoyad);
		
		txt_RegPass = new JPasswordField();
		txt_RegPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_RegPass.setColumns(10);
		txt_RegPass.setBounds(326, 280, 210, 36);
		register.add(txt_RegPass);
		
		JLabel img_RegLogo = new JLabel("");
		img_RegLogo.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		img_RegLogo.setBounds(304, 28, 177, 96);
		register.add(img_RegLogo);
		
		JButton btn_RegKayit = new JButton("Kay\u0131t Ol");
		btn_RegKayit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_RegKayit.setForeground(Color.WHITE);
		btn_RegKayit.setFont(new Font("Georgia", Font.PLAIN, 14));
		btn_RegKayit.setBackground(new Color(128, 128, 128));
		btn_RegKayit.setBounds(447, 503, 89, 23);
		register.add(btn_RegKayit);
		
		JLabel lbl_RegCpyrght = new JLabel("Nku | Computer Engineering");
		lbl_RegCpyrght.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbl_RegCpyrght.setBounds(329, 546, 135, 14);
		register.add(lbl_RegCpyrght);
		
		JMenuItem mitem_RegHome = new JMenuItem("Anasayfa");
		mitem_RegHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_RegHome.setIcon(new ImageIcon(form1.class.getResource("/images/home.png")));
		mitem_RegHome.setBackground(new Color(192, 192, 192));
		mitem_RegHome.setBounds(645, 11, 129, 22);
		register.add(mitem_RegHome);
		mitem_RegHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.setVisible(true);
            	register.setVisible(false);
            	
                

            }

        });
		
		JLabel lbl_RegAdSoyad = new JLabel("Ad Soyad :");
		lbl_RegAdSoyad.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegAdSoyad.setVerticalTextPosition(SwingConstants.TOP);
		lbl_RegAdSoyad.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegAdSoyad.setBounds(195, 143, 113, 25);
		register.add(lbl_RegAdSoyad);
		
		JLabel lbl_RegEmail = new JLabel("E-mail :");
		lbl_RegEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegEmail.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegEmail.setBounds(195, 192, 113, 25);
		register.add(lbl_RegEmail);
		
		JLabel lbl_RegSifre = new JLabel("Sifre :");
		lbl_RegSifre.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegSifre.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegSifre.setBounds(195, 288, 113, 25);
		register.add(lbl_RegSifre);
		
		JLabel lbl_RegTekrarsifre = new JLabel("Tekrar Sifre :");
		lbl_RegTekrarsifre.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegTekrarsifre.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegTekrarsifre.setBounds(195, 335, 113, 25);
		register.add(lbl_RegTekrarsifre);
		
		JLabel lbl_RegAdres = new JLabel("Adres :");
		lbl_RegAdres.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_RegAdres.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		lbl_RegAdres.setBounds(195, 378, 113, 25);
		register.add(lbl_RegAdres);
		
		txt_RegPassagain = new JPasswordField();
		txt_RegPassagain.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_RegPassagain.setColumns(10);
		txt_RegPassagain.setBounds(326, 327, 210, 36);
		register.add(txt_RegPassagain);
		
		txt_RegMail = new JTextField();
		txt_RegMail.setToolTipText("");
		txt_RegMail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_RegMail.setColumns(10);
		txt_RegMail.setBounds(326, 184, 210, 36);
		register.add(txt_RegMail);
		
		txt_RegKadi = new JTextField();
		txt_RegKadi.setToolTipText("");
		txt_RegKadi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_RegKadi.setColumns(10);
		txt_RegKadi.setBounds(326, 231, 210, 36);
		register.add(txt_RegKadi);
		
		TextArea txtarea_RegMail = new TextArea();
		txtarea_RegMail.setBounds(326, 375, 210, 111);
		register.add(txtarea_RegMail);
		//*****
		final JPanel administrator = new JPanel();
		administrator.setVisible(false);
		administrator.setFont(new Font("Tahoma", Font.PLAIN, 20));
		administrator.setBackground(new Color(192, 192, 192));
		frmCargoManagementV.getContentPane().add(administrator, "name_70082577530626");
		administrator.setLayout(null);
		
		JLabel lbl_AdminLogo = new JLabel("");
		lbl_AdminLogo.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		lbl_AdminLogo.setBounds(10, 11, 177, 96);
		administrator.add(lbl_AdminLogo);

		
		JLabel lbl_AdminCpyrght = new JLabel("Nku | Computer Engineering");
		lbl_AdminCpyrght.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbl_AdminCpyrght.setBounds(329, 546, 135, 14);
		administrator.add(lbl_AdminCpyrght);
		
		JLabel lbl_AdminPanel = new JLabel("Y\u00F6netici Paneli");
		lbl_AdminPanel.setForeground(new Color(250, 250, 210));
		lbl_AdminPanel.setBackground(Color.WHITE);
		lbl_AdminPanel.setHorizontalTextPosition(SwingConstants.LEADING);
		lbl_AdminPanel.setFont(new Font("Modern No. 20", Font.BOLD, 14));
		lbl_AdminPanel.setBounds(44, 118, 110, 14);
		administrator.add(lbl_AdminPanel);
		
		JPanel panel_AdminSube = new JPanel();
		panel_AdminSube.setBounds(24, 138, 144, 104);
		administrator.add(panel_AdminSube);
		panel_AdminSube.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_AdminSube.setBackground(new Color(220, 220, 220));
		panel_AdminSube.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "\u015Eube \u0130\u015Flemleri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_AdminSube.setLayout(null);
		
		JMenuItem mitem_AdminSube1 = new JMenuItem("G\u00FCncelle");
		mitem_AdminSube1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminSube1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminSube1.setBackground(new Color(211, 211, 211));
		mitem_AdminSube1.setBounds(12, 21, 119, 22);
		panel_AdminSube.add(mitem_AdminSube1);

		JMenuItem mitem_AdminSube2 = new JMenuItem("Ekle");
		mitem_AdminSube2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminSube2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminSube2.setBackground(new Color(211, 211, 211));
		mitem_AdminSube2.setBounds(12, 48, 119, 22);
		panel_AdminSube.add(mitem_AdminSube2);
		
		JMenuItem mitem_AdminSube3 = new JMenuItem("Sil");
		mitem_AdminSube3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminSube3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminSube3.setBackground(new Color(211, 211, 211));
		mitem_AdminSube3.setBounds(12, 75, 119, 22);
		panel_AdminSube.add(mitem_AdminSube3);
		
		JPanel panel_AdminKullanici = new JPanel();
		panel_AdminKullanici.setBounds(24, 242, 144, 104);
		administrator.add(panel_AdminKullanici);
		panel_AdminKullanici.setLayout(null);
		panel_AdminKullanici.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_AdminKullanici.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Kullan\u0131c\u0131 \u0130\u015Flemleri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_AdminKullanici.setBackground(new Color(220, 220, 220));
		
		JMenuItem mitem_AdminKullanici1 = new JMenuItem("G\u00FCncelle");
		mitem_AdminKullanici1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKullanici1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKullanici1.setBackground(new Color(211, 211, 211));
		mitem_AdminKullanici1.setBounds(12, 21, 119, 22);
		panel_AdminKullanici.add(mitem_AdminKullanici1);
		
		JMenuItem mitem_AdminKullanici2 = new JMenuItem("Ekle");
		mitem_AdminKullanici2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKullanici2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKullanici2.setBackground(new Color(211, 211, 211));
		mitem_AdminKullanici2.setBounds(12, 48, 119, 22);
		panel_AdminKullanici.add(mitem_AdminKullanici2);
		
		JMenuItem mitem_AdminKullanici3 = new JMenuItem("Sil");
		mitem_AdminKullanici3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKullanici3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKullanici3.setBackground(new Color(211, 211, 211));
		mitem_AdminKullanici3.setBounds(12, 75, 119, 22);
		panel_AdminKullanici.add(mitem_AdminKullanici3);
		
		JPanel panel_AdminKargo = new JPanel();
		panel_AdminKargo.setBounds(24, 345, 144, 104);
		administrator.add(panel_AdminKargo);
		panel_AdminKargo.setLayout(null);
		panel_AdminKargo.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_AdminKargo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Kargo \u0130\u015Flemleri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_AdminKargo.setBackground(new Color(220, 220, 220));
		
		JMenuItem mitem_AdminKargo1 = new JMenuItem("G\u00FCncelle");
		mitem_AdminKargo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKargo1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKargo1.setBackground(new Color(211, 211, 211));
		mitem_AdminKargo1.setBounds(12, 21, 119, 22);
		panel_AdminKargo.add(mitem_AdminKargo1);
		
		JMenuItem mitem_AdminKargo2 = new JMenuItem("Ekle");
		mitem_AdminKargo2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKargo2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKargo2.setBackground(new Color(211, 211, 211));
		mitem_AdminKargo2.setBounds(12, 48, 119, 22);
		panel_AdminKargo.add(mitem_AdminKargo2);
		
		JMenuItem mitem_AdminKargo3 = new JMenuItem("Sil");
		mitem_AdminKargo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminKargo3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminKargo3.setBackground(new Color(211, 211, 211));
		mitem_AdminKargo3.setBounds(12, 75, 119, 22);
		panel_AdminKargo.add(mitem_AdminKargo3);
		
		JPanel panel_AdminSecenekler = new JPanel();
		panel_AdminSecenekler.setLayout(null);
		panel_AdminSecenekler.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_AdminSecenekler.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Se\u00E7enekler", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_AdminSecenekler.setBackground(new Color(220, 220, 220));
		panel_AdminSecenekler.setBounds(24, 447, 144, 81);
		administrator.add(panel_AdminSecenekler);
		
		JMenuItem mitem_AdminProfil = new JMenuItem("Profil");
		mitem_AdminProfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminProfil.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminProfil.setBackground(new Color(211, 211, 211));
		mitem_AdminProfil.setBounds(12, 21, 119, 22);
		panel_AdminSecenekler.add(mitem_AdminProfil);
		
		JMenuItem mitem_AdminCikisYap = new JMenuItem("\u00C7\u0131k\u0131\u015F Yap");
		mitem_AdminCikisYap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_AdminCikisYap.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_AdminCikisYap.setBackground(new Color(211, 211, 211));
		mitem_AdminCikisYap.setBounds(12, 48, 119, 22);
		panel_AdminSecenekler.add(mitem_AdminCikisYap);
		mitem_AdminCikisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JOptionPane.showConfirmDialog(null, "Çýkmak Ýstediðinize Emin misiniz?");
			}
		});
		JPanel panel_AdminIslemler = new JPanel();
		panel_AdminIslemler.setBackground(new Color(46, 139, 87));
		panel_AdminIslemler.setBounds(205, 92, 547, 443);
		administrator.add(panel_AdminIslemler);
		panel_AdminIslemler.setLayout(new CardLayout(0, 0));
		
		JPanel panel_AdminGiris = new JPanel();
		panel_AdminGiris.setVisible(false);
		panel_AdminGiris.setBackground(new Color(128, 128, 128));
		panel_AdminIslemler.add(panel_AdminGiris, "name_262176805627803");
		panel_AdminGiris.setLayout(null);
		
		JLabel lblYnetimPanelineHogeldiniz = new JLabel("Y\u00D6NET\u0130M PANEL\u0130NE HO\u015EGELD\u0130N\u0130Z");
		lblYnetimPanelineHogeldiniz.setForeground(new Color(255, 255, 255));
		lblYnetimPanelineHogeldiniz.setFont(new Font("Impact", Font.PLAIN, 32));
		lblYnetimPanelineHogeldiniz.setBounds(72, 11, 403, 84);
		panel_AdminGiris.add(lblYnetimPanelineHogeldiniz);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		label_12.setBounds(187, 173, 177, 96);
		panel_AdminGiris.add(label_12);
		
		JLabel lblYandakiMendenIlemlerinizi = new JLabel("Yandaki men\u00FCden islemlerinizi kolayca yapabilirsiniz.");
		lblYandakiMendenIlemlerinizi.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblYandakiMendenIlemlerinizi.setBounds(102, 89, 343, 48);
		panel_AdminGiris.add(lblYandakiMendenIlemlerinizi);
		
		JPanel panel_AdminSubeEkle = new JPanel();
		panel_AdminSubeEkle.setVisible(false);
		
		JPanel panel_AdminSubeGuncelle = new JPanel();
		panel_AdminSubeGuncelle.setLayout(null);
		panel_AdminSubeGuncelle.setVisible(false);
		panel_AdminSubeGuncelle.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminSubeGuncelle, "name_264455502008632");
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 11, 207, 421);
		panel_AdminSubeGuncelle.add(panel_1);
		
		JLabel label = new JLabel("1. \u015Eube");
		label.setFont(new Font("Georgia", Font.BOLD, 18));
		label.setBounds(42, 11, 119, 32);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("2. \u015Eube");
		label_1.setFont(new Font("Georgia", Font.BOLD, 18));
		label_1.setBounds(42, 54, 119, 32);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("3. \u015Eube");
		label_2.setFont(new Font("Georgia", Font.BOLD, 18));
		label_2.setBounds(42, 97, 119, 32);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("4. \u015Eube");
		label_3.setFont(new Font("Georgia", Font.BOLD, 18));
		label_3.setBounds(42, 140, 119, 32);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("5. \u015Eube");
		label_4.setFont(new Font("Georgia", Font.BOLD, 18));
		label_4.setBounds(42, 183, 119, 32);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("6. \u015Eube");
		label_5.setFont(new Font("Georgia", Font.BOLD, 18));
		label_5.setBounds(42, 226, 119, 32);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("7. \u015Eube");
		label_6.setFont(new Font("Georgia", Font.BOLD, 18));
		label_6.setBounds(42, 269, 119, 32);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("8. \u015Eube");
		label_7.setFont(new Font("Georgia", Font.BOLD, 18));
		label_7.setBounds(42, 312, 119, 32);
		panel_1.add(label_7);
		
		JLabel lblGncellemekIstediinizubeyi = new JLabel("G\u00FCncellemek istedi\u011Finiz \u015Fubeyi se\u00E7iniz");
		lblGncellemekIstediinizubeyi.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblGncellemekIstediinizubeyi.setBounds(10, 396, 187, 14);
		panel_1.add(lblGncellemekIstediinizubeyi);
		
		JLabel label_8 = new JLabel("\u015Eube Ad\u0131 :");
		label_8.setForeground(new Color(105, 105, 105));
		label_8.setBounds(227, 48, 102, 25);
		panel_AdminSubeGuncelle.add(label_8);
		
		txt_GuncelleSubeAdi = new JTextField();
		txt_GuncelleSubeAdi.setColumns(10);
		txt_GuncelleSubeAdi.setBounds(351, 48, 134, 25);
		panel_AdminSubeGuncelle.add(txt_GuncelleSubeAdi);
		
		JLabel label_9 = new JLabel("\u015Eube M\u00FCd\u00FCr\u00FC :");
		label_9.setForeground(new Color(105, 105, 105));
		label_9.setBounds(227, 84, 102, 25);
		panel_AdminSubeGuncelle.add(label_9);
		
		txt_GuncelleSubeMudur = new JTextField();
		txt_GuncelleSubeMudur.setColumns(10);
		txt_GuncelleSubeMudur.setBounds(351, 84, 134, 25);
		panel_AdminSubeGuncelle.add(txt_GuncelleSubeMudur);
		
		JLabel label_10 = new JLabel("\u015Eube Vergi No :");
		label_10.setForeground(new Color(105, 105, 105));
		label_10.setBounds(227, 120, 102, 25);
		panel_AdminSubeGuncelle.add(label_10);
		
		txt_GuncelleSubeVergi = new JTextField();
		txt_GuncelleSubeVergi.setColumns(10);
		txt_GuncelleSubeVergi.setBounds(351, 120, 134, 25);
		panel_AdminSubeGuncelle.add(txt_GuncelleSubeVergi);
		
		JLabel label_11 = new JLabel("\u015Eube Adresi :");
		label_11.setForeground(new Color(105, 105, 105));
		label_11.setBounds(227, 245, 80, 25);
		panel_AdminSubeGuncelle.add(label_11);
		
		TextArea txtare_GuncelleSubeAdres = new TextArea();
		txtare_GuncelleSubeAdres.setBounds(313, 240, 172, 123);
		panel_AdminSubeGuncelle.add(txtare_GuncelleSubeAdres);
		
		JButton btn_SubeGuncelle = new JButton("G\u00FCncelle");
		btn_SubeGuncelle.setForeground(Color.WHITE);
		btn_SubeGuncelle.setFont(new Font("Georgia", Font.PLAIN, 14));
		btn_SubeGuncelle.setBackground(new Color(102, 153, 255));
		btn_SubeGuncelle.setBounds(396, 379, 89, 23);
		panel_AdminSubeGuncelle.add(btn_SubeGuncelle);
		
		JLabel label_17 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		label_17.setForeground(new Color(105, 105, 105));
		label_17.setBounds(227, 156, 102, 25);
		panel_AdminSubeGuncelle.add(label_17);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(351, 156, 134, 25);
		panel_AdminSubeGuncelle.add(textField_5);
		
		JLabel label_18 = new JLabel("\u015Eifre :");
		label_18.setForeground(new Color(105, 105, 105));
		label_18.setBounds(227, 192, 102, 25);
		panel_AdminSubeGuncelle.add(label_18);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(351, 192, 134, 25);
		panel_AdminSubeGuncelle.add(textField_6);
		panel_AdminSubeEkle.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminSubeEkle, "name_262221273242372");
		panel_AdminSubeEkle.setLayout(null);
		
		JLabel label_13 = new JLabel("\u015Eube Ad\u0131 :");
		label_13.setForeground(new Color(105, 105, 105));
		label_13.setBounds(154, 54, 102, 25);
		panel_AdminSubeEkle.add(label_13);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(278, 54, 134, 25);
		panel_AdminSubeEkle.add(textField);
		
		JLabel label_14 = new JLabel("\u015Eube M\u00FCd\u00FCr\u00FC :");
		label_14.setForeground(new Color(105, 105, 105));
		label_14.setBounds(154, 90, 102, 25);
		panel_AdminSubeEkle.add(label_14);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(278, 90, 134, 25);
		panel_AdminSubeEkle.add(textField_1);
		
		JLabel label_15 = new JLabel("\u015Eube Vergi No :");
		label_15.setForeground(new Color(105, 105, 105));
		label_15.setBounds(154, 126, 102, 25);
		panel_AdminSubeEkle.add(label_15);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(278, 126, 134, 25);
		panel_AdminSubeEkle.add(textField_2);
		
		JLabel label_16 = new JLabel("\u015Eube Adresi :");
		label_16.setForeground(new Color(105, 105, 105));
		label_16.setBounds(154, 243, 80, 25);
		panel_AdminSubeEkle.add(label_16);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(240, 238, 172, 123);
		panel_AdminSubeEkle.add(textArea);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setForeground(Color.WHITE);
		btnEkle.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnEkle.setBackground(new Color(102, 153, 255));
		btnEkle.setBounds(323, 367, 89, 23);
		panel_AdminSubeEkle.add(btnEkle);
		
		JLabel lblAadakiBilgileriEksiksiz = new JLabel(" A\u015Fa\u011F\u0131daki bilgileri eksiksiz doldurunuz.");
		lblAadakiBilgileriEksiksiz.setBorder(new LineBorder(new Color(128, 0, 0)));
		lblAadakiBilgileriEksiksiz.setForeground(new Color(105, 105, 105));
		lblAadakiBilgileriEksiksiz.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAadakiBilgileriEksiksiz.setBounds(175, 11, 235, 32);
		panel_AdminSubeEkle.add(lblAadakiBilgileriEksiksiz);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd.setForeground(new Color(105, 105, 105));
		lblKullancAd.setBounds(154, 162, 102, 25);
		panel_AdminSubeEkle.add(lblKullancAd);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(278, 162, 134, 25);
		panel_AdminSubeEkle.add(textField_3);
		
		JLabel lblifre = new JLabel("\u015Eifre :");
		lblifre.setForeground(new Color(105, 105, 105));
		lblifre.setBounds(154, 198, 102, 25);
		panel_AdminSubeEkle.add(lblifre);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(278, 198, 134, 25);
		panel_AdminSubeEkle.add(textField_4);
		
		JPanel panel_AdminSubeSil = new JPanel();
		panel_AdminSubeSil.setVisible(false);
		panel_AdminSubeSil.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminSubeSil, "name_262225144964601");
		panel_AdminSubeSil.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 11, 207, 421);
		panel_AdminSubeSil.add(panel);
		
		JLabel label_19 = new JLabel("1. \u015Eube");
		label_19.setFont(new Font("Georgia", Font.BOLD, 18));
		label_19.setBounds(42, 11, 119, 32);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("2. \u015Eube");
		label_20.setFont(new Font("Georgia", Font.BOLD, 18));
		label_20.setBounds(42, 54, 119, 32);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("3. \u015Eube");
		label_21.setFont(new Font("Georgia", Font.BOLD, 18));
		label_21.setBounds(42, 97, 119, 32);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("4. \u015Eube");
		label_22.setFont(new Font("Georgia", Font.BOLD, 18));
		label_22.setBounds(42, 140, 119, 32);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("5. \u015Eube");
		label_23.setFont(new Font("Georgia", Font.BOLD, 18));
		label_23.setBounds(42, 183, 119, 32);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("6. \u015Eube");
		label_24.setFont(new Font("Georgia", Font.BOLD, 18));
		label_24.setBounds(42, 226, 119, 32);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("7. \u015Eube");
		label_25.setFont(new Font("Georgia", Font.BOLD, 18));
		label_25.setBounds(42, 269, 119, 32);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("8. \u015Eube");
		label_26.setFont(new Font("Georgia", Font.BOLD, 18));
		label_26.setBounds(42, 312, 119, 32);
		panel.add(label_26);
		
		JLabel lblSilmekIstediinizubeyi = new JLabel("Silmek istedi\u011Finiz \u015Fubeyi se\u00E7iniz");
		lblSilmekIstediinizubeyi.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblSilmekIstediinizubeyi.setBounds(10, 396, 187, 14);
		panel.add(lblSilmekIstediinizubeyi);
		
		Button button = new Button("Sil");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(235, 382, 227, 50);
		panel_AdminSubeSil.add(button);
		
		JPanel panel_AdminKullaniciGuncelle = new JPanel();
		panel_AdminKullaniciGuncelle.setVisible(false);
		panel_AdminKullaniciGuncelle.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminKullaniciGuncelle, "name_262227170094125");
		panel_AdminKullaniciGuncelle.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBackground(new Color(220, 220, 220));
		panel_2.setBounds(10, 11, 207, 421);
		panel_AdminKullaniciGuncelle.add(panel_2);
		
		JLabel lblGncellemekIstediinizKullanc = new JLabel("G\u00FCncellemek istedi\u011Finiz kullan\u0131c\u0131\u0131 se\u00E7iniz");
		lblGncellemekIstediinizKullanc.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblGncellemekIstediinizKullanc.setBounds(10, 396, 187, 14);
		panel_2.add(lblGncellemekIstediinizKullanc);
		
		JTextPane txtpnBuAlandaSral = new JTextPane();
		txtpnBuAlandaSral.setEditable(false);
		txtpnBuAlandaSral.setBackground(new Color(220, 220, 220));
		txtpnBuAlandaSral.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnBuAlandaSral.setText("Bu alanda s\u0131ral\u0131 bir \u015Fekilde kullan\u0131c\u0131 listesini g\u00F6receksiniz...");
		txtpnBuAlandaSral.setBounds(10, 70, 187, 196);
		panel_2.add(txtpnBuAlandaSral);
		
		textField_12 = new JTextField();
		textField_12.setBounds(37, 11, 160, 28);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblAra = new JLabel("Ara :");
		lblAra.setBounds(10, 18, 46, 14);
		panel_2.add(lblAra);
		
		JLabel lblKullancAd_1 = new JLabel("Ad Soyad");
		lblKullancAd_1.setForeground(new Color(105, 105, 105));
		lblKullancAd_1.setBounds(227, 48, 102, 25);
		panel_AdminKullaniciGuncelle.add(lblKullancAd_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(351, 48, 134, 25);
		panel_AdminKullaniciGuncelle.add(textField_7);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setForeground(new Color(105, 105, 105));
		lblEmail.setBounds(227, 84, 102, 25);
		panel_AdminKullaniciGuncelle.add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(351, 84, 134, 25);
		panel_AdminKullaniciGuncelle.add(textField_8);
		
		JLabel lblKullancAd_2 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd_2.setForeground(new Color(105, 105, 105));
		lblKullancAd_2.setBounds(227, 120, 102, 25);
		panel_AdminKullaniciGuncelle.add(lblKullancAd_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(351, 120, 134, 25);
		panel_AdminKullaniciGuncelle.add(textField_9);
		
		JLabel lblAdres = new JLabel("Adres :");
		lblAdres.setForeground(new Color(105, 105, 105));
		lblAdres.setBounds(227, 192, 80, 25);
		panel_AdminKullaniciGuncelle.add(lblAdres);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(313, 187, 172, 123);
		panel_AdminKullaniciGuncelle.add(textArea_1);
		
		JButton button_1 = new JButton("G\u00FCncelle");
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_1.setBackground(new Color(102, 153, 255));
		button_1.setBounds(396, 333, 89, 23);
		panel_AdminKullaniciGuncelle.add(button_1);
		
		JLabel lblifre_1 = new JLabel("\u015Eifre");
		lblifre_1.setForeground(new Color(105, 105, 105));
		lblifre_1.setBounds(227, 156, 102, 25);
		panel_AdminKullaniciGuncelle.add(lblifre_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(351, 156, 134, 25);
		panel_AdminKullaniciGuncelle.add(textField_10);
		
		JPanel panel_AdminKullaniciEkle = new JPanel();
		panel_AdminKullaniciEkle.setVisible(false);
		panel_AdminKullaniciEkle.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminKullaniciEkle, "name_262229234748540");
		panel_AdminKullaniciEkle.setLayout(null);
		
		JLabel label_27 = new JLabel("Ad Soyad");
		label_27.setForeground(new Color(105, 105, 105));
		label_27.setBounds(153, 93, 102, 25);
		panel_AdminKullaniciEkle.add(label_27);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(277, 93, 134, 25);
		panel_AdminKullaniciEkle.add(textField_11);
		
		JLabel label_28 = new JLabel("E-mail :");
		label_28.setForeground(new Color(105, 105, 105));
		label_28.setBounds(153, 129, 102, 25);
		panel_AdminKullaniciEkle.add(label_28);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(277, 129, 134, 25);
		panel_AdminKullaniciEkle.add(textField_13);
		
		JLabel label_29 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		label_29.setForeground(new Color(105, 105, 105));
		label_29.setBounds(153, 165, 102, 25);
		panel_AdminKullaniciEkle.add(label_29);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(277, 165, 134, 25);
		panel_AdminKullaniciEkle.add(textField_14);
		
		JLabel label_30 = new JLabel("\u015Eifre");
		label_30.setForeground(new Color(105, 105, 105));
		label_30.setBounds(153, 201, 102, 25);
		panel_AdminKullaniciEkle.add(label_30);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(277, 201, 134, 25);
		panel_AdminKullaniciEkle.add(textField_15);
		
		JLabel label_31 = new JLabel("Adres :");
		label_31.setForeground(new Color(105, 105, 105));
		label_31.setBounds(153, 237, 80, 25);
		panel_AdminKullaniciEkle.add(label_31);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(239, 232, 172, 123);
		panel_AdminKullaniciEkle.add(textArea_2);
		
		JButton btnEkle_2 = new JButton("Ekle");
		btnEkle_2.setForeground(Color.WHITE);
		btnEkle_2.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnEkle_2.setBackground(new Color(102, 153, 255));
		btnEkle_2.setBounds(322, 378, 89, 23);
		panel_AdminKullaniciEkle.add(btnEkle_2);
		
		JLabel label_32 = new JLabel(" A\u015Fa\u011F\u0131daki bilgileri eksiksiz doldurunuz.");
		label_32.setForeground(new Color(105, 105, 105));
		label_32.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_32.setBorder(new LineBorder(new Color(128, 0, 0)));
		label_32.setBounds(176, 31, 235, 32);
		panel_AdminKullaniciEkle.add(label_32);
		
		JPanel panel_AdminKullaniciSil = new JPanel();
		panel_AdminKullaniciSil.setVisible(false);
		panel_AdminKullaniciSil.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminKullaniciSil, "name_262231506391033");
		panel_AdminKullaniciSil.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBackground(new Color(220, 220, 220));
		panel_3.setBounds(10, 11, 207, 421);
		panel_AdminKullaniciSil.add(panel_3);
		
		JLabel lblSilmekIstediinizKullanc = new JLabel("Silmek istedi\u011Finiz kullan\u0131c\u0131\u0131 se\u00E7iniz");
		lblSilmekIstediinizKullanc.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblSilmekIstediinizKullanc.setBounds(10, 396, 187, 14);
		panel_3.add(lblSilmekIstediinizKullanc);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Bu alanda s\u0131ral\u0131 bir \u015Fekilde kullan\u0131c\u0131 listesini g\u00F6receksiniz...");
		textPane.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textPane.setEditable(false);
		textPane.setBackground(new Color(220, 220, 220));
		textPane.setBounds(10, 70, 187, 196);
		panel_3.add(textPane);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(37, 11, 160, 28);
		panel_3.add(textField_16);
		
		JLabel label_34 = new JLabel("Ara :");
		label_34.setBounds(10, 18, 46, 14);
		panel_3.add(label_34);
		
		Button button_3 = new Button("Sil");
		button_3.setBounds(247, 382, 227, 50);
		panel_AdminKullaniciSil.add(button_3);
		
		JPanel panel_AdminKargoGuncelle = new JPanel();
		panel_AdminKargoGuncelle.setBackground(new Color(192, 192, 192));
		panel_AdminKargoGuncelle.setVisible(false);
		panel_AdminIslemler.add(panel_AdminKargoGuncelle, "name_264004911917388");
		panel_AdminKargoGuncelle.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBackground(new Color(220, 220, 220));
		panel_4.setBounds(10, 11, 207, 212);
		panel_AdminKargoGuncelle.add(panel_4);
		
		JLabel label_33 = new JLabel("Silmek istedi\u011Finiz kullan\u0131c\u0131\u0131 se\u00E7iniz");
		label_33.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		label_33.setBounds(10, 190, 187, 14);
		panel_4.add(label_33);
		
		JTextPane txtpnBuAlandaSral_1 = new JTextPane();
		txtpnBuAlandaSral_1.setText("Bu alanda s\u0131ral\u0131 bir \u015Fekilde i\u015Flem g\u00F6rmekte olan kargolar\u0131n , kargo takip numaralar\u0131n\u0131 g\u00F6receksiniz...");
		txtpnBuAlandaSral_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnBuAlandaSral_1.setEditable(false);
		txtpnBuAlandaSral_1.setBackground(new Color(220, 220, 220));
		txtpnBuAlandaSral_1.setBounds(10, 77, 187, 88);
		panel_4.add(txtpnBuAlandaSral_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 38, 187, 28);
		panel_4.add(textField_17);
		
		JLabel lblKargoTakipNo = new JLabel("Kargo Takip No:");
		lblKargoTakipNo.setForeground(new Color(105, 105, 105));
		lblKargoTakipNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblKargoTakipNo.setBounds(54, 11, 99, 21);
		panel_4.add(lblKargoTakipNo);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(220, 220, 220));
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(227, 11, 310, 421);
		panel_AdminKargoGuncelle.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblAdSoyad = new JLabel("Ad Soyad :");
		lblAdSoyad.setForeground(new Color(105, 105, 105));
		lblAdSoyad.setBounds(10, 13, 102, 25);
		panel_5.add(lblAdSoyad);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_18.setColumns(10);
		textField_18.setBounds(114, 11, 186, 30);
		panel_5.add(textField_18);
		
		JLabel lblKargoCinsi = new JLabel("Kargo Cinsi");
		lblKargoCinsi.setForeground(new Color(105, 105, 105));
		lblKargoCinsi.setBounds(10, 51, 102, 25);
		panel_5.add(lblKargoCinsi);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_19.setColumns(10);
		textField_19.setBounds(114, 49, 186, 30);
		panel_5.add(textField_19);
		
		JLabel lblArlk = new JLabel("A\u011F\u0131rl\u0131k");
		lblArlk.setForeground(new Color(105, 105, 105));
		lblArlk.setBounds(10, 89, 102, 25);
		panel_5.add(lblArlk);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_20.setColumns(10);
		textField_20.setBounds(114, 87, 186, 30);
		panel_5.add(textField_20);
		
		JLabel lblGnderimAdresi = new JLabel("G\u00F6nderim Adresi :");
		lblGnderimAdresi.setForeground(new Color(105, 105, 105));
		lblGnderimAdresi.setBounds(10, 201, 102, 25);
		panel_5.add(lblGnderimAdresi);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(114, 202, 186, 69);
		panel_5.add(textArea_3);
		
		JLabel lblVarAdresi = new JLabel("Var\u0131\u015F Adresi :");
		lblVarAdresi.setForeground(new Color(105, 105, 105));
		lblVarAdresi.setBounds(10, 282, 102, 25);
		panel_5.add(lblVarAdresi);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(114, 282, 186, 69);
		panel_5.add(textArea_4);
		
		JLabel lblLokasyon = new JLabel("Lokasyon :");
		lblLokasyon.setForeground(new Color(105, 105, 105));
		lblLokasyon.setBounds(10, 125, 102, 25);
		panel_5.add(lblLokasyon);
		
		JButton button_4 = new JButton("G\u00FCncelle");
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_4.setBackground(new Color(102, 153, 255));
		button_4.setBounds(211, 392, 89, 23);
		panel_5.add(button_4);
		
		JRadioButton rdbtnTeslimEdildi = new JRadioButton("Teslim Edildi");
		rdbtnTeslimEdildi.setBackground(new Color(220, 220, 220));
		rdbtnTeslimEdildi.setForeground(new Color(0, 100, 0));
		rdbtnTeslimEdildi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnTeslimEdildi.setBounds(211, 362, 89, 23);
		panel_5.add(rdbtnTeslimEdildi);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setBackground(SystemColor.activeCaption);
		textArea_13.setBounds(114, 122, 186, 69);
		panel_5.add(textArea_13);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(220, 220, 220));
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_6.setBounds(10, 234, 208, 198);
		panel_AdminKargoGuncelle.add(panel_6);
		panel_6.setLayout(null);
		
		JTextPane txtpnBuAlandaKargonun = new JTextPane();
		txtpnBuAlandaKargonun.setText("Bu alanda kargonun g\u00FCncellenmi\u015F lokasyonlar\u0131 alt alta \u00E7\u0131kacakt\u0131r. \u0130stedi\u011Finiz lokasyonu se\u00E7ip yan tarafta de\u011Fi\u015Ftirebilir veya en sona yeni lokasyon ekleyebilirsiniz.");
		txtpnBuAlandaKargonun.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnBuAlandaKargonun.setEditable(false);
		txtpnBuAlandaKargonun.setBackground(new Color(220, 220, 220));
		txtpnBuAlandaKargonun.setBounds(10, 26, 178, 136);
		panel_6.add(txtpnBuAlandaKargonun);
		
		JPanel panel_AdminKargoEkle = new JPanel();
		panel_AdminKargoEkle.setBackground(new Color(192, 192, 192));
		panel_AdminKargoEkle.setVisible(false);
		panel_AdminIslemler.add(panel_AdminKargoEkle, "name_264008204372531");
		panel_AdminKargoEkle.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_7.setBackground(new Color(192, 192, 192));
		panel_7.setBounds(124, 11, 310, 421);
		panel_AdminKargoEkle.add(panel_7);
		
		JLabel label_36 = new JLabel("Ad Soyad :");
		label_36.setForeground(new Color(105, 105, 105));
		label_36.setBounds(10, 57, 102, 25);
		panel_7.add(label_36);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_23.setColumns(10);
		textField_23.setBounds(114, 55, 186, 30);
		panel_7.add(textField_23);
		
		JLabel label_37 = new JLabel("Kargo Cinsi");
		label_37.setForeground(new Color(105, 105, 105));
		label_37.setBounds(10, 95, 102, 25);
		panel_7.add(label_37);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_24.setColumns(10);
		textField_24.setBounds(114, 93, 186, 30);
		panel_7.add(textField_24);
		
		JLabel label_38 = new JLabel("A\u011F\u0131rl\u0131k");
		label_38.setForeground(new Color(105, 105, 105));
		label_38.setBounds(10, 133, 102, 25);
		panel_7.add(label_38);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_25.setColumns(10);
		textField_25.setBounds(114, 131, 186, 30);
		panel_7.add(textField_25);
		
		JLabel label_39 = new JLabel("G\u00F6nderim Adresi :");
		label_39.setForeground(new Color(105, 105, 105));
		label_39.setBounds(10, 201, 102, 25);
		panel_7.add(label_39);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(114, 206, 186, 69);
		panel_7.add(textArea_5);
		
		JLabel label_40 = new JLabel("Var\u0131\u015F Adresi :");
		label_40.setForeground(new Color(105, 105, 105));
		label_40.setBounds(10, 282, 102, 25);
		panel_7.add(label_40);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(114, 282, 186, 69);
		panel_7.add(textArea_6);
		
		JLabel label_41 = new JLabel("Lokasyon :");
		label_41.setForeground(new Color(105, 105, 105));
		label_41.setBounds(10, 171, 102, 25);
		panel_7.add(label_41);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_26.setColumns(10);
		textField_26.setBounds(114, 169, 186, 30);
		panel_7.add(textField_26);
		
		JButton btnEkle_1 = new JButton("Ekle");
		btnEkle_1.setForeground(Color.WHITE);
		btnEkle_1.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnEkle_1.setBackground(new Color(102, 153, 255));
		btnEkle_1.setBounds(211, 362, 89, 23);
		panel_7.add(btnEkle_1);
		
		JLabel lblAadakiFormuEksiksiz = new JLabel("A\u015Fa\u011F\u0131daki Formu Eksiksiz Doldurun ");
		lblAadakiFormuEksiksiz.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblAadakiFormuEksiksiz.setBounds(62, 0, 186, 25);
		panel_7.add(lblAadakiFormuEksiksiz);
		
		JLabel lblkargoTakipNumaras = new JLabel("(Kargo Takip Numaras\u0131 Otomatik olu\u015Fturulacakt\u0131r)");
		lblkargoTakipNumaras.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblkargoTakipNumaras.setBounds(25, 23, 264, 25);
		panel_7.add(lblkargoTakipNumaras);
		
		JPanel panel_AdminKargoSil = new JPanel();
		panel_AdminKargoSil.setBackground(new Color(192, 192, 192));
		panel_AdminKargoSil.setVisible(false);
		panel_AdminIslemler.add(panel_AdminKargoSil, "name_264010485325354");
		panel_AdminKargoSil.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.setBackground(new Color(192, 192, 192));
		panel_8.setBounds(10, 11, 248, 421);
		panel_AdminKargoSil.add(panel_8);
		panel_8.setLayout(null);
		
		JTextPane txtpnBuAlandaHenz = new JTextPane();
		txtpnBuAlandaHenz.setBounds(30, 78, 187, 196);
		panel_8.add(txtpnBuAlandaHenz);
		txtpnBuAlandaHenz.setText("Bu Alanda hen\u00FCz teslim edilmemi\u015F kargolar\u0131 g\u00F6r\u00FCp , silebileceksiniz...");
		txtpnBuAlandaHenz.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnBuAlandaHenz.setEditable(false);
		txtpnBuAlandaHenz.setBackground(new Color(192, 192, 192));
		
		textField_27 = new JTextField();
		textField_27.setBounds(44, 11, 160, 28);
		panel_8.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel label_43 = new JLabel("Ara :");
		label_43.setBounds(10, 18, 46, 14);
		panel_8.add(label_43);
		
		Button button_5 = new Button("Sil");
		button_5.setBounds(10, 361, 227, 50);
		panel_8.add(button_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(192, 192, 192));
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_9.setBounds(289, 11, 248, 421);
		panel_AdminKargoSil.add(panel_9);
		panel_9.setLayout(null);
		
		JTextPane txtpnBuAlandaTeslim = new JTextPane();
		txtpnBuAlandaTeslim.setText("Bu Alanda teslim edilmi\u015F ve veritaban\u0131ndan silinmesini istedi\u011Finiz t\u00FCm kargolar\u0131 g\u00F6receksiniz...");
		txtpnBuAlandaTeslim.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnBuAlandaTeslim.setEditable(false);
		txtpnBuAlandaTeslim.setBackground(new Color(192, 192, 192));
		txtpnBuAlandaTeslim.setBounds(30, 78, 187, 196);
		panel_9.add(txtpnBuAlandaTeslim);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(44, 11, 160, 28);
		panel_9.add(textField_28);
		
		JLabel label_42 = new JLabel("Ara :");
		label_42.setBounds(10, 18, 46, 14);
		panel_9.add(label_42);
		
		Button button_6 = new Button("Sil");
		button_6.setBounds(10, 361, 227, 50);
		panel_9.add(button_6);
		
		JPanel panel_AdminProfil = new JPanel();
		panel_AdminProfil.setBackground(new Color(192, 192, 192));
		panel_AdminIslemler.add(panel_AdminProfil, "name_92284592156288");
		panel_AdminProfil.setLayout(null);
		
		JLabel label_82 = new JLabel("Ad Soyad");
		label_82.setForeground(SystemColor.controlDkShadow);
		label_82.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_82.setBounds(113, 11, 58, 30);
		panel_AdminProfil.add(label_82);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("ERAY YILMAZ");
		textPane_7.setForeground(Color.BLACK);
		textPane_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_7.setBounds(181, 11, 216, 30);
		panel_AdminProfil.add(textPane_7);
		
		JLabel label_88 = new JLabel("Adres");
		label_88.setForeground(SystemColor.controlDkShadow);
		label_88.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_88.setBounds(135, 52, 36, 30);
		panel_AdminProfil.add(label_88);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("Muhittin Mahallesi , T\u00FCt\u00FCn Sokak , Sinem Sitesi , A Blok , No :26");
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_10.setDisabledTextColor(Color.LIGHT_GRAY);
		textPane_10.setBackground(Color.WHITE);
		textPane_10.setBounds(181, 52, 216, 96);
		panel_AdminProfil.add(textPane_10);
		
		JLabel label_89 = new JLabel("Tc Kimlik");
		label_89.setForeground(SystemColor.controlDkShadow);
		label_89.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_89.setBounds(113, 159, 58, 30);
		panel_AdminProfil.add(label_89);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("13369223275");
		textPane_11.setForeground(Color.BLACK);
		textPane_11.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_11.setBounds(181, 159, 216, 30);
		panel_AdminProfil.add(textPane_11);
		
		JLabel label_90 = new JLabel("Kullan\u0131c\u0131 Ad\u0131n\u0131z");
		label_90.setForeground(SystemColor.controlDkShadow);
		label_90.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_90.setBounds(79, 200, 92, 30);
		panel_AdminProfil.add(label_90);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("muhittinsube");
		textPane_12.setForeground(Color.BLACK);
		textPane_12.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_12.setBounds(181, 200, 216, 30);
		panel_AdminProfil.add(textPane_12);
		
		JLabel label_91 = new JLabel("\u015Eifreniz");
		label_91.setForeground(SystemColor.controlDkShadow);
		label_91.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_91.setBounds(127, 241, 44, 30);
		panel_AdminProfil.add(label_91);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setText("12345");
		passwordField_2.setForeground(Color.BLACK);
		passwordField_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField_2.setBounds(181, 242, 216, 30);
		panel_AdminProfil.add(passwordField_2);
		
		JButton btnKadDeitir = new JButton("De\u011Fi\u015Ftir");
		btnKadDeitir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnKadDeitir.setForeground(SystemColor.controlDkShadow);
		btnKadDeitir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnKadDeitir.setBounds(305, 283, 92, 38);
		panel_AdminProfil.add(btnKadDeitir);
		
		JLabel lblYneticiTmBilgileri = new JLabel("Y\u00F6netici T\u00FCm Bilgileri De\u011Fi\u015Ftirebilir *");
		lblYneticiTmBilgileri.setForeground(new Color(105, 105, 105));
		lblYneticiTmBilgileri.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblYneticiTmBilgileri.setBounds(101, 307, 194, 14);
		panel_AdminProfil.add(lblYneticiTmBilgileri);
		
		JMenuItem mitemAdminHome = new JMenuItem("Anasayfa");
		mitemAdminHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitemAdminHome.setIcon(new ImageIcon(form1.class.getResource("/images/home.png")));
		mitemAdminHome.setBackground(new Color(192, 192, 192));
		mitemAdminHome.setBounds(645, 11, 129, 22);
		administrator.add(mitemAdminHome);
		mitemAdminHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.setVisible(true);
            	administrator.setVisible(false);
                

            }

        });
		
		
		//****
		final JPanel officer = new JPanel();
		officer.setVisible(false);
		officer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		officer.setBackground(new Color(192, 192, 192));
		frmCargoManagementV.getContentPane().add(officer, "name_70107170071230");
		officer.setLayout(null);
		
		JLabel lbl_OfficerLogo = new JLabel("");
		lbl_OfficerLogo.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		lbl_OfficerLogo.setBounds(10, 11, 177, 96);
		officer.add(lbl_OfficerLogo);
		
		JLabel lbl_OfficerCpyrght = new JLabel("Nku | Computer Engineering");
		lbl_OfficerCpyrght.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbl_OfficerCpyrght.setBounds(329, 546, 135, 14);
		officer.add(lbl_OfficerCpyrght);
		
		JLabel lblubePaneli = new JLabel("Sube Paneli");
		lblubePaneli.setHorizontalTextPosition(SwingConstants.LEADING);
		lblubePaneli.setForeground(new Color(250, 250, 210));
		lblubePaneli.setFont(new Font("Modern No. 20", Font.BOLD, 14));
		lblubePaneli.setBackground(Color.WHITE);
		lblubePaneli.setBounds(56, 139, 110, 14);
		officer.add(lblubePaneli);
		
		JPanel panel_OfficerKargo = new JPanel();
		panel_OfficerKargo.setLayout(null);
		panel_OfficerKargo.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_OfficerKargo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Kargo \u0130\u015Flemleri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_OfficerKargo.setBackground(new Color(220, 220, 220));
		panel_OfficerKargo.setBounds(22, 164, 144, 104);
		officer.add(panel_OfficerKargo);
		
		JMenuItem mitem_OfficerKargo1 = new JMenuItem("G\u00FCncelle");
		mitem_OfficerKargo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerKargo1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerKargo1.setBackground(new Color(211, 211, 211));
		mitem_OfficerKargo1.setBounds(12, 21, 119, 22);
		panel_OfficerKargo.add(mitem_OfficerKargo1);
		
		JMenuItem mitem_OfficerKargo2 = new JMenuItem("Ekle");
		mitem_OfficerKargo2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerKargo2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerKargo2.setBackground(new Color(211, 211, 211));
		mitem_OfficerKargo2.setBounds(12, 48, 119, 22);
		panel_OfficerKargo.add(mitem_OfficerKargo2);
		
		JMenuItem mitem_OfficerKargo3 = new JMenuItem("Sil");
		mitem_OfficerKargo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerKargo3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerKargo3.setBackground(new Color(211, 211, 211));
		mitem_OfficerKargo3.setBounds(12, 75, 119, 22);
		panel_OfficerKargo.add(mitem_OfficerKargo3);
		
		JPanel panel_OfficerKullanici = new JPanel();
		panel_OfficerKullanici.setLayout(null);
		panel_OfficerKullanici.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_OfficerKullanici.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Kullan\u0131c\u0131 \u0130\u015Flemleri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_OfficerKullanici.setBackground(new Color(220, 220, 220));
		panel_OfficerKullanici.setBounds(22, 266, 144, 81);
		officer.add(panel_OfficerKullanici);
		
		JMenuItem mitem_OfficerKullanici1 = new JMenuItem("G\u00FCncelle");
		mitem_OfficerKullanici1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerKullanici1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerKullanici1.setBackground(new Color(211, 211, 211));
		mitem_OfficerKullanici1.setBounds(12, 21, 119, 22);
		panel_OfficerKullanici.add(mitem_OfficerKullanici1);
		
		JMenuItem mitem_OfficerKullanici2 = new JMenuItem("Ekle");
		mitem_OfficerKullanici2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerKullanici2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerKullanici2.setBackground(new Color(211, 211, 211));
		mitem_OfficerKullanici2.setBounds(12, 48, 119, 22);
		panel_OfficerKullanici.add(mitem_OfficerKullanici2);
		
		JPanel panel_OfficerSecenekler = new JPanel();
		panel_OfficerSecenekler.setBounds(22, 346, 144, 81);
		officer.add(panel_OfficerSecenekler);
		panel_OfficerSecenekler.setLayout(null);
		panel_OfficerSecenekler.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_OfficerSecenekler.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Se\u00E7enekler", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_OfficerSecenekler.setBackground(new Color(220, 220, 220));
		
		JMenuItem mitem_OfficerProfil = new JMenuItem("Profil");
		mitem_OfficerProfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerProfil.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerProfil.setBackground(new Color(211, 211, 211));
		mitem_OfficerProfil.setBounds(12, 21, 119, 22);
		panel_OfficerSecenekler.add(mitem_OfficerProfil);
		
		JMenuItem mitem_OfficerCikisYap = new JMenuItem("\u00C7\u0131k\u0131\u015F Yap");
		mitem_OfficerCikisYap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerCikisYap.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_OfficerCikisYap.setBackground(new Color(211, 211, 211));
		mitem_OfficerCikisYap.setBounds(12, 48, 119, 22);
		panel_OfficerSecenekler.add(mitem_OfficerCikisYap);
		mitem_OfficerCikisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JOptionPane.showConfirmDialog(null, "Çýkmak Ýstediðinize Emin misiniz?");
			}
		});
		JPanel panel_OfficerIslemler = new JPanel();
		panel_OfficerIslemler.setBackground(new Color(128, 128, 128));
		panel_OfficerIslemler.setBounds(205, 92, 547, 443);
		officer.add(panel_OfficerIslemler);
		panel_OfficerIslemler.setLayout(new CardLayout(0, 0));
		
		JPanel panel_OfficerGiris = new JPanel();
		panel_OfficerGiris.setBackground(new Color(128, 128, 128));
		panel_OfficerIslemler.add(panel_OfficerGiris, "name_5648294035959");
		panel_OfficerGiris.setLayout(null);
		
		JLabel lblubePanelineHogeldiniz = new JLabel("\u015EUBE PANEL\u0130NE HO\u015EGELD\u0130N\u0130Z");
		lblubePanelineHogeldiniz.setForeground(Color.WHITE);
		lblubePanelineHogeldiniz.setFont(new Font("Impact", Font.PLAIN, 32));
		lblubePanelineHogeldiniz.setBounds(91, 27, 364, 84);
		panel_OfficerGiris.add(lblubePanelineHogeldiniz);
		
		JLabel label_45 = new JLabel("Yandaki men\u00FCden islemlerinizi kolayca yapabilirsiniz.");
		label_45.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		label_45.setBounds(102, 105, 343, 48);
		panel_OfficerGiris.add(label_45);
		
		JLabel label_46 = new JLabel("");
		label_46.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		label_46.setBounds(185, 173, 177, 96);
		panel_OfficerGiris.add(label_46);
		
		JPanel panel_OfficerKargoGuncelle = new JPanel();
		panel_OfficerKargoGuncelle.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKargoGuncelle, "name_5650475067460");
		panel_OfficerKargoGuncelle.setLayout(null);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_20.setBackground(new Color(220, 220, 220));
		panel_20.setBounds(10, 11, 207, 212);
		panel_OfficerKargoGuncelle.add(panel_20);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Bu alanda s\u0131ral\u0131 bir \u015Fekilde i\u015Flem g\u00F6rmekte olan kargolar\u0131n , kargo takip numaralar\u0131n\u0131 g\u00F6receksiniz...");
		textPane_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textPane_1.setEditable(false);
		textPane_1.setBackground(new Color(192, 192, 192));
		textPane_1.setBounds(10, 77, 187, 88);
		panel_20.add(textPane_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(10, 38, 187, 28);
		panel_20.add(textField_22);
		
		JLabel label_48 = new JLabel("Kargo Takip No:");
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_48.setBounds(54, 11, 99, 21);
		panel_20.add(label_48);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_21.setBackground(new Color(220, 220, 220));
		panel_21.setBounds(227, 11, 310, 421);
		panel_OfficerKargoGuncelle.add(panel_21);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_29.setColumns(10);
		textField_29.setBounds(114, 14, 186, 30);
		panel_21.add(textField_29);
		
		JLabel label_49 = new JLabel("Kargo Takip No :");
		label_49.setForeground(new Color(105, 105, 105));
		label_49.setBounds(10, 16, 102, 25);
		panel_21.add(label_49);
		
		JLabel label_50 = new JLabel("Ad Soyad :");
		label_50.setForeground(new Color(105, 105, 105));
		label_50.setBounds(10, 57, 102, 25);
		panel_21.add(label_50);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_30.setColumns(10);
		textField_30.setBounds(114, 55, 186, 30);
		panel_21.add(textField_30);
		
		JLabel label_51 = new JLabel("Kargo Cinsi");
		label_51.setForeground(new Color(105, 105, 105));
		label_51.setBounds(10, 95, 102, 25);
		panel_21.add(label_51);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_31.setColumns(10);
		textField_31.setBounds(114, 93, 186, 30);
		panel_21.add(textField_31);
		
		JLabel label_52 = new JLabel("A\u011F\u0131rl\u0131k");
		label_52.setForeground(new Color(105, 105, 105));
		label_52.setBounds(10, 133, 102, 25);
		panel_21.add(label_52);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_32.setColumns(10);
		textField_32.setBounds(114, 131, 186, 30);
		panel_21.add(textField_32);
		
		JLabel label_53 = new JLabel("G\u00F6nderim Adresi :");
		label_53.setForeground(new Color(105, 105, 105));
		label_53.setBounds(10, 201, 102, 25);
		panel_21.add(label_53);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(114, 202, 186, 69);
		panel_21.add(textArea_7);
		
		JLabel label_54 = new JLabel("Var\u0131\u015F Adresi :");
		label_54.setForeground(new Color(105, 105, 105));
		label_54.setBounds(10, 282, 102, 25);
		panel_21.add(label_54);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(114, 282, 186, 69);
		panel_21.add(textArea_8);
		
		JLabel label_55 = new JLabel("Lokasyon :");
		label_55.setForeground(new Color(105, 105, 105));
		label_55.setBounds(10, 171, 102, 25);
		panel_21.add(label_55);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_33.setColumns(10);
		textField_33.setBounds(114, 169, 186, 30);
		panel_21.add(textField_33);
		
		JButton button_7 = new JButton("G\u00FCncelle");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_7.setBackground(new Color(102, 153, 255));
		button_7.setBounds(211, 392, 89, 23);
		panel_21.add(button_7);
		
		JRadioButton radioButton = new JRadioButton("Teslim Edildi");
		radioButton.setForeground(new Color(34, 139, 34));
		radioButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		radioButton.setBackground(new Color(220, 220, 220));
		radioButton.setBounds(211, 362, 89, 23);
		panel_21.add(radioButton);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_22.setBackground(new Color(220, 220, 220));
		panel_22.setBounds(10, 234, 208, 198);
		panel_OfficerKargoGuncelle.add(panel_22);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Bu alanda kargonun g\u00FCncellenmi\u015F lokasyonlar\u0131 alt alta \u00E7\u0131kacakt\u0131r. \u0130stedi\u011Finiz lokasyonu se\u00E7ip yan tarafta de\u011Fi\u015Ftirebilir veya en sona yeni lokasyon ekleyebilirsiniz.");
		textPane_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textPane_2.setEditable(false);
		textPane_2.setBackground(new Color(192, 192, 192));
		textPane_2.setBounds(10, 26, 178, 136);
		panel_22.add(textPane_2);
		
		JPanel panel_OfficerKargoEkle = new JPanel();
		panel_OfficerKargoEkle.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKargoEkle, "name_5652257029916");
		panel_OfficerKargoEkle.setLayout(null);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_23.setBackground(new Color(192, 192, 192));
		panel_23.setBounds(149, 11, 310, 421);
		panel_OfficerKargoEkle.add(panel_23);
		
		JLabel label_56 = new JLabel("Ad Soyad :");
		label_56.setForeground(new Color(105, 105, 105));
		label_56.setBounds(10, 57, 102, 25);
		panel_23.add(label_56);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_34.setColumns(10);
		textField_34.setBounds(114, 55, 186, 30);
		panel_23.add(textField_34);
		
		JLabel label_57 = new JLabel("Kargo Cinsi");
		label_57.setForeground(new Color(105, 105, 105));
		label_57.setBounds(10, 95, 102, 25);
		panel_23.add(label_57);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_35.setColumns(10);
		textField_35.setBounds(114, 93, 186, 30);
		panel_23.add(textField_35);
		
		JLabel label_58 = new JLabel("A\u011F\u0131rl\u0131k");
		label_58.setForeground(new Color(105, 105, 105));
		label_58.setBounds(10, 133, 102, 25);
		panel_23.add(label_58);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_36.setColumns(10);
		textField_36.setBounds(114, 131, 186, 30);
		panel_23.add(textField_36);
		
		JLabel label_59 = new JLabel("G\u00F6nderim Adresi :");
		label_59.setForeground(new Color(105, 105, 105));
		label_59.setBounds(10, 201, 102, 25);
		panel_23.add(label_59);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(114, 206, 186, 69);
		panel_23.add(textArea_9);
		
		JLabel label_60 = new JLabel("Var\u0131\u015F Adresi :");
		label_60.setForeground(new Color(105, 105, 105));
		label_60.setBounds(10, 282, 102, 25);
		panel_23.add(label_60);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(114, 282, 186, 69);
		panel_23.add(textArea_10);
		
		JLabel label_61 = new JLabel("Lokasyon :");
		label_61.setForeground(new Color(105, 105, 105));
		label_61.setBounds(10, 171, 102, 25);
		panel_23.add(label_61);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_37.setColumns(10);
		textField_37.setBounds(114, 169, 186, 30);
		panel_23.add(textField_37);
		
		JButton button_8 = new JButton("Ekle");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_8.setBackground(new Color(102, 153, 255));
		button_8.setBounds(211, 362, 89, 23);
		panel_23.add(button_8);
		
		JLabel label_62 = new JLabel("A\u015Fa\u011F\u0131daki Formu Eksiksiz Doldurun ");
		label_62.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		label_62.setBounds(62, 0, 186, 25);
		panel_23.add(label_62);
		
		JLabel label_63 = new JLabel("(Kargo Takip Numaras\u0131 Otomatik olu\u015Fturulacakt\u0131r)");
		label_63.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		label_63.setBounds(25, 23, 264, 25);
		panel_23.add(label_63);
		
		JPanel panel_OfficerKargoSil = new JPanel();
		panel_OfficerKargoSil.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKargoSil, "name_5659108539953");
		panel_OfficerKargoSil.setLayout(null);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_27.setBackground(new Color(220, 220, 220));
		panel_27.setBounds(10, 11, 471, 421);
		panel_OfficerKargoSil.add(panel_27);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Bu Alanda teslim edilmi\u015F ve veritaban\u0131ndan silinmesini istedi\u011Finiz t\u00FCm kargolar\u0131 g\u00F6receksiniz...");
		textPane_6.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textPane_6.setEditable(false);
		textPane_6.setBackground(new Color(192, 192, 192));
		textPane_6.setBounds(10, 78, 451, 277);
		panel_27.add(textPane_6);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(94, 11, 282, 28);
		panel_27.add(textField_49);
		
		JLabel label_80 = new JLabel("Ara :");
		label_80.setBounds(38, 18, 46, 14);
		panel_27.add(label_80);
		
		Button button_13 = new Button("Sil");
		button_13.setBounds(122, 361, 227, 50);
		panel_27.add(button_13);
		
		JPanel panel_OfficerKullaniciGuncelle = new JPanel();
		panel_OfficerKullaniciGuncelle.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKullaniciGuncelle, "name_5655071231145");
		panel_OfficerKullaniciGuncelle.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_24.setBackground(new Color(220, 220, 220));
		panel_24.setBounds(10, 11, 207, 421);
		panel_OfficerKullaniciGuncelle.add(panel_24);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Bu alanda s\u0131ral\u0131 bir \u015Fekilde kullan\u0131c\u0131 listesini g\u00F6receksiniz...");
		textPane_3.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textPane_3.setEditable(false);
		textPane_3.setBackground(new Color(220, 220, 220));
		textPane_3.setBounds(10, 70, 187, 196);
		panel_24.add(textPane_3);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(37, 11, 160, 28);
		panel_24.add(textField_38);
		
		JLabel label_65 = new JLabel("Ara :");
		label_65.setBounds(10, 18, 46, 14);
		panel_24.add(label_65);
		
		JLabel label_66 = new JLabel("Ad Soyad");
		label_66.setForeground(new Color(105, 105, 105));
		label_66.setBounds(227, 37, 102, 25);
		panel_OfficerKullaniciGuncelle.add(label_66);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(351, 37, 134, 25);
		panel_OfficerKullaniciGuncelle.add(textField_39);
		
		JLabel label_67 = new JLabel("E-mail :");
		label_67.setForeground(new Color(105, 105, 105));
		label_67.setBounds(227, 73, 102, 25);
		panel_OfficerKullaniciGuncelle.add(label_67);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(351, 73, 134, 25);
		panel_OfficerKullaniciGuncelle.add(textField_40);
		
		JLabel label_68 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		label_68.setForeground(new Color(105, 105, 105));
		label_68.setBounds(227, 109, 102, 25);
		panel_OfficerKullaniciGuncelle.add(label_68);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(351, 109, 134, 25);
		panel_OfficerKullaniciGuncelle.add(textField_41);
		
		JLabel label_69 = new JLabel("\u015Eifre");
		label_69.setForeground(new Color(105, 105, 105));
		label_69.setBounds(227, 145, 102, 25);
		panel_OfficerKullaniciGuncelle.add(label_69);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(351, 145, 134, 25);
		panel_OfficerKullaniciGuncelle.add(textField_42);
		
		JLabel label_70 = new JLabel("Adres :");
		label_70.setForeground(new Color(105, 105, 105));
		label_70.setBounds(227, 181, 80, 25);
		panel_OfficerKullaniciGuncelle.add(label_70);
		
		TextArea textArea_11 = new TextArea();
		textArea_11.setBounds(313, 176, 172, 123);
		panel_OfficerKullaniciGuncelle.add(textArea_11);
		
		JButton button_9 = new JButton("G\u00FCncelle");
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_9.setBackground(new Color(102, 153, 255));
		button_9.setBounds(396, 322, 89, 23);
		panel_OfficerKullaniciGuncelle.add(button_9);
		
		JPanel panel_OfficerKullaniciEkle = new JPanel();
		panel_OfficerKullaniciEkle.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKullaniciEkle, "name_5656954903375");
		panel_OfficerKullaniciEkle.setLayout(null);
		
		JLabel label_71 = new JLabel(" A\u015Fa\u011F\u0131daki bilgileri eksiksiz doldurunuz.");
		label_71.setForeground(new Color(105, 105, 105));
		label_71.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_71.setBorder(new LineBorder(new Color(128, 0, 0)));
		label_71.setBounds(170, 27, 235, 32);
		panel_OfficerKullaniciEkle.add(label_71);
		
		JLabel label_72 = new JLabel("Ad Soyad");
		label_72.setForeground(new Color(105, 105, 105));
		label_72.setBounds(147, 89, 102, 25);
		panel_OfficerKullaniciEkle.add(label_72);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(271, 89, 134, 25);
		panel_OfficerKullaniciEkle.add(textField_43);
		
		JLabel label_73 = new JLabel("E-mail :");
		label_73.setForeground(new Color(105, 105, 105));
		label_73.setBounds(147, 125, 102, 25);
		panel_OfficerKullaniciEkle.add(label_73);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(271, 125, 134, 25);
		panel_OfficerKullaniciEkle.add(textField_44);
		
		JLabel label_74 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		label_74.setForeground(new Color(105, 105, 105));
		label_74.setBounds(147, 161, 102, 25);
		panel_OfficerKullaniciEkle.add(label_74);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(271, 161, 134, 25);
		panel_OfficerKullaniciEkle.add(textField_45);
		
		JLabel label_75 = new JLabel("\u015Eifre");
		label_75.setForeground(new Color(105, 105, 105));
		label_75.setBounds(147, 197, 102, 25);
		panel_OfficerKullaniciEkle.add(label_75);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(271, 197, 134, 25);
		panel_OfficerKullaniciEkle.add(textField_46);
		
		JLabel label_76 = new JLabel("Adres :");
		label_76.setForeground(new Color(105, 105, 105));
		label_76.setBounds(147, 233, 80, 25);
		panel_OfficerKullaniciEkle.add(label_76);
		
		TextArea textArea_12 = new TextArea();
		textArea_12.setBounds(233, 228, 172, 123);
		panel_OfficerKullaniciEkle.add(textArea_12);
		
		JButton btnEkle_3 = new JButton("Ekle");
		btnEkle_3.setForeground(Color.WHITE);
		btnEkle_3.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnEkle_3.setBackground(new Color(102, 153, 255));
		btnEkle_3.setBounds(316, 374, 89, 23);
		panel_OfficerKullaniciEkle.add(btnEkle_3);
		
		JPanel panel_OfficerKullaniciProfil = new JPanel();
		panel_OfficerKullaniciProfil.setForeground(new Color(105, 105, 105));
		panel_OfficerKullaniciProfil.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel_OfficerKullaniciProfil.setBackground(new Color(192, 192, 192));
		panel_OfficerIslemler.add(panel_OfficerKullaniciProfil, "name_87189870363586");
		panel_OfficerKullaniciProfil.setLayout(null);
		
		JLabel lblKullancAdnz = new JLabel("Kullan\u0131c\u0131 Ad\u0131n\u0131z");
		lblKullancAdnz.setForeground(new Color(105, 105, 105));
		lblKullancAdnz.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKullancAdnz.setBounds(50, 198, 92, 30);
		panel_OfficerKullaniciProfil.add(lblKullancAdnz);
		
		JLabel lblifreniz = new JLabel("\u015Eifreniz");
		lblifreniz.setForeground(SystemColor.controlDkShadow);
		lblifreniz.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblifreniz.setBounds(98, 239, 44, 30);
		panel_OfficerKullaniciProfil.add(lblifreniz);
		
		JLabel lblaltnzube = new JLabel("\u00C7al\u0131\u015Ft\u0131\u011F\u0131n\u0131z \u015Eube");
		lblaltnzube.setForeground(SystemColor.controlDkShadow);
		lblaltnzube.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblaltnzube.setBounds(47, 116, 95, 30);
		panel_OfficerKullaniciProfil.add(lblaltnzube);
		
		JLabel lblTcKimlik = new JLabel("Tc Kimlik");
		lblTcKimlik.setForeground(SystemColor.controlDkShadow);
		lblTcKimlik.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTcKimlik.setBounds(84, 157, 58, 30);
		panel_OfficerKullaniciProfil.add(lblTcKimlik);
		
		JLabel lblAdSoyad_1 = new JLabel("Ad Soyad");
		lblAdSoyad_1.setForeground(SystemColor.controlDkShadow);
		lblAdSoyad_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAdSoyad_1.setBounds(84, 73, 58, 30);
		panel_OfficerKullaniciProfil.add(lblAdSoyad_1);
		
		JTextPane txtpnAsd = new JTextPane();
		txtpnAsd.setEditable(false);
		txtpnAsd.setText("ERAY YILMAZ");
		txtpnAsd.setBounds(152, 73, 216, 30);
		panel_OfficerKullaniciProfil.add(txtpnAsd);
		
		JTextPane txtpnorlumuhttn = new JTextPane();
		txtpnorlumuhttn.setEditable(false);
		txtpnorlumuhttn.setText("\u00C7ORLU/MUHITTIN");
		txtpnorlumuhttn.setBounds(152, 116, 216, 30);
		panel_OfficerKullaniciProfil.add(txtpnorlumuhttn);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setText("13369223275");
		textPane_5.setBounds(152, 157, 216, 30);
		panel_OfficerKullaniciProfil.add(textPane_5);
		
		JTextPane txtpnMuhittinsube = new JTextPane();
		txtpnMuhittinsube.setEditable(false);
		txtpnMuhittinsube.setText("muhittinsube");
		txtpnMuhittinsube.setBounds(152, 198, 216, 30);
		panel_OfficerKullaniciProfil.add(txtpnMuhittinsube);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setText("12345");
		passwordField.setBounds(152, 240, 216, 30);
		panel_OfficerKullaniciProfil.add(passwordField);
		
		JButton btnifreDeitir = new JButton("\u015Eifre De\u011Fi\u015Ftir");
		btnifreDeitir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnifreDeitir.setForeground(new Color(105, 105, 105));
		btnifreDeitir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnifreDeitir.setBounds(245, 291, 123, 38);
		panel_OfficerKullaniciProfil.add(btnifreDeitir);
		
		JLabel lblalanYalnzcaifre = new JLabel("\u00C7al\u0131\u015Fan yaln\u0131zca \u015Fifre de\u011Fi\u015Ftirebilir *");
		lblalanYalnzcaifre.setForeground(SystemColor.controlDkShadow);
		lblalanYalnzcaifre.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblalanYalnzcaifre.setBounds(41, 314, 194, 14);
		panel_OfficerKullaniciProfil.add(lblalanYalnzcaifre);
		
		JMenuItem mitem_OfficerHome = new JMenuItem("Anasayfa");
		mitem_OfficerHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_OfficerHome.setIcon(new ImageIcon(form1.class.getResource("/images/home.png")));
		mitem_OfficerHome.setBackground(new Color(192, 192, 192));
		mitem_OfficerHome.setBounds(645, 11, 129, 22);
		officer.add(mitem_OfficerHome);
		mitem_OfficerHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.setVisible(true);
            	officer.setVisible(false);
                

            }

        });
		//****
		final JPanel user = new JPanel();
		user.setBackground(new Color(192, 192, 192));
		user.setVisible(false);
		
		frmCargoManagementV.getContentPane().add(user, "name_70128809152039");
		user.setLayout(null);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		label_35.setBounds(10, 11, 177, 96);
		user.add(label_35);
		
		JLabel label_44 = new JLabel("Nku | Computer Engineering");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 9));
		label_44.setBounds(329, 546, 135, 14);
		user.add(label_44);
		
		JLabel lblKullancPaneli = new JLabel("Kullan\u0131c\u0131 Paneli");
		lblKullancPaneli.setHorizontalTextPosition(SwingConstants.LEADING);
		lblKullancPaneli.setForeground(new Color(250, 250, 210));
		lblKullancPaneli.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKullancPaneli.setBackground(Color.WHITE);
		lblKullancPaneli.setBounds(39, 139, 120, 14);
		user.add(lblKullancPaneli);
		
		JPanel panel_UserKargo = new JPanel();
		panel_UserKargo.setLayout(null);
		panel_UserKargo.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_UserKargo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Kargo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_UserKargo.setBackground(new Color(220, 220, 220));
		panel_UserKargo.setBounds(22, 164, 144, 81);
		user.add(panel_UserKargo);
		
		JMenuItem mitem_UserKargo1 = new JMenuItem("Kargom Nerede");
		mitem_UserKargo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_UserKargo1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_UserKargo1.setBackground(new Color(211, 211, 211));
		mitem_UserKargo1.setBounds(12, 21, 119, 22);
		panel_UserKargo.add(mitem_UserKargo1);
		
		JMenuItem mitem_UserKargo2 = new JMenuItem("Yeni Kargo");
		mitem_UserKargo2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_UserKargo2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_UserKargo2.setBackground(new Color(211, 211, 211));
		mitem_UserKargo2.setBounds(12, 48, 119, 22);
		panel_UserKargo.add(mitem_UserKargo2);
		
		JPanel panel_UserSecenekler = new JPanel();
		panel_UserSecenekler.setLayout(null);
		panel_UserSecenekler.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		panel_UserSecenekler.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Se\u00E7enekler", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_UserSecenekler.setBackground(new Color(220, 220, 220));
		panel_UserSecenekler.setBounds(22, 245, 144, 81);
		user.add(panel_UserSecenekler);
		
		JMenuItem mitem_UserSecenekler1 = new JMenuItem("Profil");
		mitem_UserSecenekler1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_UserSecenekler1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_UserSecenekler1.setBackground(new Color(211, 211, 211));
		mitem_UserSecenekler1.setBounds(12, 21, 119, 22);
		panel_UserSecenekler.add(mitem_UserSecenekler1);
		
		JMenuItem mitem_UserSecenekler2 = new JMenuItem("\u00C7\u0131k\u0131\u015F Yap");
		mitem_UserSecenekler2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_UserSecenekler2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		mitem_UserSecenekler2.setBackground(new Color(211, 211, 211));
		mitem_UserSecenekler2.setBounds(12, 48, 119, 22);
		panel_UserSecenekler.add(mitem_UserSecenekler2);
		mitem_UserSecenekler2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JOptionPane.showConfirmDialog(null, "Çýkmak Ýstediðinize Emin misiniz?");
			}
		});
		JPanel panel_UserIslemler = new JPanel();
		panel_UserIslemler.setBackground(new Color(192, 192, 192));
		panel_UserIslemler.setBounds(205, 92, 547, 443);
		user.add(panel_UserIslemler);
		panel_UserIslemler.setLayout(new CardLayout(0, 0));
		
		JPanel panel_UserGiris = new JPanel();
		panel_UserGiris.setBackground(new Color(128, 128, 128));
		panel_UserIslemler.add(panel_UserGiris, "name_88458555658670");
		panel_UserGiris.setLayout(null);
		
		JLabel lblHogeldiniz = new JLabel("HO\u015EGELD\u0130N\u0130Z");
		lblHogeldiniz.setForeground(Color.WHITE);
		lblHogeldiniz.setFont(new Font("Impact", Font.PLAIN, 32));
		lblHogeldiniz.setBounds(193, 11, 161, 84);
		panel_UserGiris.add(lblHogeldiniz);
		
		JLabel label_78 = new JLabel("Yandaki men\u00FCden islemlerinizi kolayca yapabilirsiniz.");
		label_78.setForeground(new Color(255, 255, 255));
		label_78.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_78.setBounds(119, 71, 308, 48);
		panel_UserGiris.add(label_78);
		
		JTextPane txtpnkargomNeredeIsimli = new JTextPane();
		txtpnkargomNeredeIsimli.setEnabled(false);
		txtpnkargomNeredeIsimli.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtpnkargomNeredeIsimli.setDisabledTextColor(new Color(255, 255, 255));
		txtpnkargomNeredeIsimli.setForeground(new Color(255, 255, 255));
		txtpnkargomNeredeIsimli.setText("  \"Kargom Nerede\" \u0130simli men\u00FC ile g\u00F6nderdi\u011Finiz kargonun an ve an nerede oldu\u011Funu takip edebilecek , herhangi bir aksilik durumunda bulundu\u011Fu \u015Fubeyle ileti\u015Fim halinde olabileceksiniz...");
		txtpnkargomNeredeIsimli.setFont(new Font("Serif", Font.PLAIN, 16));
		txtpnkargomNeredeIsimli.setEditable(false);
		txtpnkargomNeredeIsimli.setBackground(new Color(128, 128, 128));
		txtpnkargomNeredeIsimli.setBounds(66, 139, 174, 198);
		panel_UserGiris.add(txtpnkargomNeredeIsimli);
		
		JTextPane txtpnyeniKargoIsimli = new JTextPane();
		txtpnyeniKargoIsimli.setEnabled(false);
		txtpnyeniKargoIsimli.setText("  \"Yeni Kargo\" \u0130simli men\u00FC yard\u0131m\u0131yla \u015Fubeye kadar gitmeden evinizden kargo hizmeti alabileceksiniz. Tek yapman\u0131z gereken gerekli yerleri doldurup paketinizi haz\u0131rlamak");
		txtpnyeniKargoIsimli.setForeground(new Color(255, 255, 255));
		txtpnyeniKargoIsimli.setFont(new Font("Serif", Font.PLAIN, 16));
		txtpnyeniKargoIsimli.setEditable(false);
		txtpnyeniKargoIsimli.setDisabledTextColor(new Color(255, 255, 255));
		txtpnyeniKargoIsimli.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtpnyeniKargoIsimli.setBackground(new Color(128, 128, 128));
		txtpnyeniKargoIsimli.setBounds(306, 139, 174, 198);
		panel_UserGiris.add(txtpnyeniKargoIsimli);
		
		JPanel panel_UserKargomNerede = new JPanel();
		panel_UserKargomNerede.setBackground(new Color(192, 192, 192));
		panel_UserIslemler.add(panel_UserKargomNerede, "name_88461657826737");
		panel_UserKargomNerede.setLayout(null);
		
		JLabel lblTeslimBekleyenKargolarnz = new JLabel("Teslim Bekleyen Kargolar\u0131n\u0131z :");
		lblTeslimBekleyenKargolarnz.setFont(new Font("Modern No. 20", Font.PLAIN, 14));
		lblTeslimBekleyenKargolarnz.setBounds(70, 11, 197, 20);
		panel_UserKargomNerede.add(lblTeslimBekleyenKargolarnz);
		
		JButton button_11 = new JButton("Sorgula");
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Georgia", Font.PLAIN, 14));
		button_11.setBackground(SystemColor.controlDkShadow);
		button_11.setBounds(148, 101, 89, 23);
		panel_UserKargomNerede.add(button_11);
		
		JTextPane txtpnBuAlandaListeden = new JTextPane();
		txtpnBuAlandaListeden.setForeground(new Color(105, 105, 105));
		txtpnBuAlandaListeden.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtpnBuAlandaListeden.setText("Bu Alanda listeden se\u00E7ilmi\u015F kargonun lokasyon listesi s\u0131ralanacakt\u0131r.");
		txtpnBuAlandaListeden.setEditable(false);
		txtpnBuAlandaListeden.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnBuAlandaListeden.setBackground(new Color(220, 220, 220));
		txtpnBuAlandaListeden.setBounds(88, 135, 347, 289);
		panel_UserKargomNerede.add(txtpnBuAlandaListeden);
		
		JTextPane txtpnBuAlandaKullancnn = new JTextPane();
		txtpnBuAlandaKullancnn.setText("Bu alanda kullan\u0131c\u0131n\u0131n g\u00F6ndermi\u015F oldu\u011Fu kargolar liste halinde g\u00F6z\u00FCkecektir.");
		txtpnBuAlandaKullancnn.setForeground(new Color(105, 105, 105));
		txtpnBuAlandaKullancnn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtpnBuAlandaKullancnn.setDisabledTextColor(Color.LIGHT_GRAY);
		txtpnBuAlandaKullancnn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnBuAlandaKullancnn.setBackground(new Color(255, 255, 255));
		txtpnBuAlandaKullancnn.setBounds(248, 10, 187, 115);
		panel_UserKargomNerede.add(txtpnBuAlandaKullancnn);
		
		JPanel panel_UserYeniKargo = new JPanel();
		panel_UserYeniKargo.setBackground(new Color(192, 192, 192));
		panel_UserIslemler.add(panel_UserYeniKargo, "name_88463738290840");
		panel_UserYeniKargo.setLayout(null);
		
		JLabel lblGndermekIstediinizKargo = new JLabel("G\u00F6ndermek \u0130stedi\u011Finiz Kargo Hakk\u0131ndaki Bilgileri Doldurunuz.");
		lblGndermekIstediinizKargo.setBorder(new LineBorder(new Color(0, 100, 0)));
		lblGndermekIstediinizKargo.setForeground(new Color(105, 105, 105));
		lblGndermekIstediinizKargo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGndermekIstediinizKargo.setBounds(57, 18, 418, 53);
		panel_UserYeniKargo.add(lblGndermekIstediinizKargo);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_17.setBackground(Color.LIGHT_GRAY);
		panel_17.setBounds(114, 89, 310, 335);
		panel_UserYeniKargo.add(panel_17);
		
		JLabel label_64 = new JLabel("Kargo Cinsi");
		label_64.setForeground(SystemColor.controlDkShadow);
		label_64.setBounds(10, 61, 102, 25);
		panel_17.add(label_64);
		
		textField_47 = new JTextField();
		textField_47.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_47.setColumns(10);
		textField_47.setBounds(114, 59, 186, 30);
		panel_17.add(textField_47);
		
		JLabel label_77 = new JLabel("A\u011F\u0131rl\u0131k");
		label_77.setForeground(SystemColor.controlDkShadow);
		label_77.setBounds(10, 99, 102, 25);
		panel_17.add(label_77);
		
		textField_48 = new JTextField();
		textField_48.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_48.setColumns(10);
		textField_48.setBounds(114, 97, 186, 30);
		panel_17.add(textField_48);
		
		JLabel label_79 = new JLabel("G\u00F6nderim Adresi :");
		label_79.setForeground(SystemColor.controlDkShadow);
		label_79.setBounds(10, 135, 102, 25);
		panel_17.add(label_79);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setBounds(114, 140, 186, 69);
		panel_17.add(textArea_14);
		
		JLabel label_81 = new JLabel("Var\u0131\u015F Adresi :");
		label_81.setForeground(SystemColor.controlDkShadow);
		label_81.setBounds(10, 220, 102, 25);
		panel_17.add(label_81);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setBounds(114, 220, 186, 69);
		panel_17.add(textArea_15);
		
		JButton btnIstekGnder = new JButton("\u0130stek G\u00F6nder");
		btnIstekGnder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIstekGnder.setForeground(Color.WHITE);
		btnIstekGnder.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnIstekGnder.setBackground(new Color(102, 153, 255));
		btnIstekGnder.setBounds(169, 300, 131, 23);
		panel_17.add(btnIstekGnder);
		
		JLabel label_83 = new JLabel("A\u015Fa\u011F\u0131daki Formu Eksiksiz Doldurun ");
		label_83.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		label_83.setBounds(62, 0, 186, 25);
		panel_17.add(label_83);
		
		JLabel label_84 = new JLabel("(Kargo Takip Numaras\u0131 Otomatik olu\u015Fturulacakt\u0131r)");
		label_84.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		label_84.setBounds(25, 23, 264, 25);
		panel_17.add(label_84);
		
		JPanel panel_UserProfil = new JPanel();
		panel_UserProfil.setBackground(new Color(192, 192, 192));
		panel_UserIslemler.add(panel_UserProfil, "name_88465762723244");
		panel_UserProfil.setLayout(null);
		
		JLabel label_47 = new JLabel("Ad Soyad");
		label_47.setForeground(SystemColor.controlDkShadow);
		label_47.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_47.setBounds(139, 73, 58, 30);
		panel_UserProfil.add(label_47);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setForeground(new Color(0, 0, 0));
		textPane_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_4.setText("ERAY YILMAZ");
		textPane_4.setEditable(false);
		textPane_4.setBounds(207, 73, 216, 30);
		panel_UserProfil.add(textPane_4);
		
		JLabel lblAdres_1 = new JLabel("Adres");
		lblAdres_1.setForeground(SystemColor.controlDkShadow);
		lblAdres_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAdres_1.setBounds(161, 114, 36, 30);
		panel_UserProfil.add(lblAdres_1);
		
		JLabel label_85 = new JLabel("Tc Kimlik");
		label_85.setForeground(SystemColor.controlDkShadow);
		label_85.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_85.setBounds(139, 221, 58, 30);
		panel_UserProfil.add(label_85);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setForeground(new Color(0, 0, 0));
		textPane_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_8.setText("13369223275");
		textPane_8.setEditable(false);
		textPane_8.setBounds(207, 221, 216, 30);
		panel_UserProfil.add(textPane_8);
		
		JLabel label_86 = new JLabel("Kullan\u0131c\u0131 Ad\u0131n\u0131z");
		label_86.setForeground(SystemColor.controlDkShadow);
		label_86.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_86.setBounds(105, 262, 92, 30);
		panel_UserProfil.add(label_86);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setForeground(new Color(0, 0, 0));
		textPane_9.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane_9.setText("muhittinsube");
		textPane_9.setEditable(false);
		textPane_9.setBounds(207, 262, 216, 30);
		panel_UserProfil.add(textPane_9);
		
		JLabel label_87 = new JLabel("\u015Eifreniz");
		label_87.setForeground(SystemColor.controlDkShadow);
		label_87.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_87.setBounds(153, 303, 44, 30);
		panel_UserProfil.add(label_87);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(new Color(0, 0, 0));
		passwordField_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField_1.setText("12345");
		passwordField_1.setEditable(false);
		passwordField_1.setBounds(207, 304, 216, 30);
		panel_UserProfil.add(passwordField_1);
		
		JButton button_12 = new JButton("\u015Eifre De\u011Fi\u015Ftir");
		button_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_12.setForeground(SystemColor.controlDkShadow);
		button_12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_12.setBounds(161, 359, 123, 38);
		panel_UserProfil.add(button_12);
		
		JTextPane txtpnMuhittinMahallesi = new JTextPane();
		txtpnMuhittinMahallesi.setText("Muhittin Mahallesi , T\u00FCt\u00FCn Sokak , Sinem Sitesi , A Blok , No :26");
		txtpnMuhittinMahallesi.setForeground(new Color(0, 0, 0));
		txtpnMuhittinMahallesi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtpnMuhittinMahallesi.setEditable(false);
		txtpnMuhittinMahallesi.setDisabledTextColor(Color.LIGHT_GRAY);
		txtpnMuhittinMahallesi.setBackground(new Color(255, 255, 255));
		txtpnMuhittinMahallesi.setBounds(207, 114, 216, 96);
		panel_UserProfil.add(txtpnMuhittinMahallesi);
		
		JButton btnAdresDeitir = new JButton("Adres De\u011Fi\u015Ftir");
		btnAdresDeitir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdresDeitir.setForeground(SystemColor.controlDkShadow);
		btnAdresDeitir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAdresDeitir.setBounds(300, 359, 123, 38);
		panel_UserProfil.add(btnAdresDeitir);
		
		JLabel lblKullancAdresVe = new JLabel("Kullan\u0131c\u0131 adres ve \u015Fifre bilgilerini de\u011Fi\u015Ftirip g\u00FCncelleyebilir *");
		lblKullancAdresVe.setForeground(SystemColor.controlDkShadow);
		lblKullancAdresVe.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblKullancAdresVe.setBounds(139, 408, 284, 14);
		panel_UserProfil.add(lblKullancAdresVe);
		
		JMenuItem mitem_UserHome = new JMenuItem("Anasayfa");
		mitem_UserHome.setIcon(new ImageIcon(form1.class.getResource("/images/home.png")));
		mitem_UserHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mitem_UserHome.setBackground(new Color(192, 192, 192));
		mitem_UserHome.setBounds(645, 11, 129, 22);
		user.add(mitem_UserHome);
		mitem_UserHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	main.setVisible(true);
            	user.setVisible(false);
                

            }

        });
		// Burada Panel Ýçerisindeki iþlemler...
		
		JLabel lblKargoTakip = new JLabel("Kargo Takip Numaras\u0131 :");
		lblKargoTakip.setFont(new Font("Modern No. 20", Font.PLAIN, 14));
		lblKargoTakip.setBounds(321, 135, 143, 20);
		main.add(lblKargoTakip);
		
		TextField textKargoid = new TextField();
		textKargoid.setBounds(215, 161, 347, 32);
		main.add(textKargoid);
		
		JTextPane Panelsonuc = new JTextPane();
		Panelsonuc.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Panelsonuc.setBackground(new Color(220, 220, 220));
		Panelsonuc.setEditable(false);
		Panelsonuc.setBounds(215, 236, 347, 289);
		main.add(Panelsonuc);

		JLabel lblCopyrightMain = new JLabel("Nku | Computer Engineering");
		lblCopyrightMain.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCopyrightMain.setBounds(329, 546, 135, 14);
		main.add(lblCopyrightMain);
		

		JButton btnSorgula = new JButton("Sorgula");
		btnSorgula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//Sorgulama Ýþlemi Buraya Yazýlacak.
			}
		});
		btnSorgula.setBackground(new Color(105, 105, 105));
		btnSorgula.setForeground(new Color(255, 255, 255));
		btnSorgula.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSorgula.setBounds(341, 205, 89, 23);
		main.add(btnSorgula);
		
		JMenuItem mnýtmLogin = new JMenuItem("Giri\u015F Yap");
		mnýtmLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnýtmLogin.setIcon(new ImageIcon(form1.class.getResource("/images/Icon_user.png")));
		mnýtmLogin.setBounds(645, 11, 129, 22);
		mnýtmLogin.setBackground(new Color(192, 192, 192));
		main.add(mnýtmLogin);
		mnýtmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				login.setVisible(true);
                main.setVisible(false);
			}
		});
		JMenuItem mnýtmRegister = new JMenuItem("Kay\u0131t Ol");
		mnýtmRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnýtmRegister.setBackground(new Color(192, 192, 192));
		mnýtmRegister.setIcon(new ImageIcon(form1.class.getResource("/images/register_icon.gif")));
		mnýtmRegister.setBounds(645, 38, 129, 22);
		main.add(mnýtmRegister);
		
		JLabel lblLogoMain = new JLabel("");
		lblLogoMain.setIcon(new ImageIcon(form1.class.getResource("/images/logo.png")));
		lblLogoMain.setBounds(304, 28, 177, 96);
		main.add(lblLogoMain);
		 mnýtmRegister.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                register.setVisible(true);
	                main.setVisible(false);

	            }

	        });
		 
			JMenuItem mitem_LoginHome = new JMenuItem("Anasayfa");
			mitem_LoginHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			mitem_LoginHome.setBackground(new Color(192, 192, 192));
			mitem_LoginHome.setIcon(new ImageIcon(form1.class.getResource("/images/home.png")));
			mitem_LoginHome.setBounds(645, 11, 129, 22);
			login.add(mitem_LoginHome);
			mitem_LoginHome.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	main.setVisible(true);
		            	login.setVisible(false);
		            	
		                

		            }

		        });
			
			//***
			
			btn_LoginGiris.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String kadi=txt_LoginKadi.getText();
					
					
					if(kadi.equals("admin")){
						administrator.setVisible(true);
						login.setVisible(false); 
					}
					else if(kadi.equals("sube")){
						officer.setVisible(true);
						login.setVisible(false);
					}
					else if(kadi.equals("user")){
						user.setVisible(true);
						login.setVisible(false);
						
					}
					else{
						JOptionPane.showMessageDialog(null,"Hatalý Giriþ Denemesi");
					}
					
						
					
				}
			});
			mitem_AdminSube1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(true);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			
			mitem_AdminSube2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					panel_AdminSubeEkle.setVisible(true);
					
				}
			});
			
			mitem_AdminSube3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					panel_AdminSubeSil.setVisible(true);
					
				}
			});
			
			mitem_AdminKullanici1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(true);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			
			mitem_AdminKullanici2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(true);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			mitem_AdminKullanici3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(true);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			
			mitem_AdminKargo1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(true);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			
			mitem_AdminKargo2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(true);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			mitem_AdminKargo3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(true);
					panel_AdminProfil.setVisible(false);
					
					
				}
			});
			mitem_AdminProfil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_AdminGiris.setVisible(false);
					panel_AdminSubeGuncelle.setVisible(false);
					panel_AdminSubeEkle.setVisible(false);
					panel_AdminSubeSil.setVisible(false);
					panel_AdminKullaniciGuncelle.setVisible(false);
					panel_AdminKullaniciEkle.setVisible(false);
					panel_AdminKullaniciSil.setVisible(false);
					panel_AdminKargoGuncelle.setVisible(false);
					panel_AdminKargoEkle.setVisible(false);
					panel_AdminKargoSil.setVisible(false);
					panel_AdminProfil.setVisible(true);
					
					
				}
			});
			
			
			
			mitem_OfficerKargo1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(false);
					panel_OfficerKargoGuncelle.setVisible(true);
					panel_OfficerKargoSil.setVisible(false);
					panel_OfficerKullaniciEkle.setVisible(false);
					panel_OfficerKullaniciGuncelle.setVisible(false);
					panel_OfficerKullaniciProfil.setVisible(false);
					
					
					
				}
			});
			mitem_OfficerKargo2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(true);
					panel_OfficerKargoGuncelle.setVisible(false);
					panel_OfficerKargoSil.setVisible(false);
					panel_OfficerKullaniciEkle.setVisible(false);
					panel_OfficerKullaniciGuncelle.setVisible(false);
					panel_OfficerKullaniciProfil.setVisible(false);
					
					
					
				}
			});	
			
			mitem_OfficerKargo3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(false);
					panel_OfficerKargoGuncelle.setVisible(false);
					panel_OfficerKargoSil.setVisible(true);
					panel_OfficerKullaniciEkle.setVisible(false);
					panel_OfficerKullaniciGuncelle.setVisible(false);
					panel_OfficerKullaniciProfil.setVisible(false);
					
					
					
				}
			});
			
			mitem_OfficerKullanici1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(false);
					panel_OfficerKargoGuncelle.setVisible(false);
					panel_OfficerKargoSil.setVisible(false);
					panel_OfficerKullaniciEkle.setVisible(false);
					panel_OfficerKullaniciGuncelle.setVisible(true);
					panel_OfficerKullaniciProfil.setVisible(false);
					
					
					
				}
			});
			mitem_OfficerKullanici2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(false);
					panel_OfficerKargoGuncelle.setVisible(false);
					panel_OfficerKargoSil.setVisible(false);
					panel_OfficerKullaniciEkle.setVisible(true);
					panel_OfficerKullaniciGuncelle.setVisible(false);
					panel_OfficerKullaniciProfil.setVisible(false);
					
					
					
				}
			});
			
			mitem_OfficerProfil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_OfficerGiris.setVisible(false);
					panel_OfficerKargoEkle.setVisible(false);
					panel_OfficerKargoGuncelle.setVisible(false);
					panel_OfficerKargoSil.setVisible(false);
					panel_OfficerKullaniciEkle.setVisible(false);
					panel_OfficerKullaniciGuncelle.setVisible(false);
					panel_OfficerKullaniciProfil.setVisible(true);
					
					
					
				}
			});
			
			mitem_UserKargo1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_UserGiris.setVisible(false);
					panel_UserKargomNerede.setVisible(true);
					panel_UserYeniKargo.setVisible(false);
					panel_UserProfil.setVisible(false);	
				}
			});
			
			
			mitem_UserKargo2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_UserGiris.setVisible(false);
					panel_UserKargomNerede.setVisible(false);
					panel_UserYeniKargo.setVisible(true);
					panel_UserProfil.setVisible(false);	
				}
			});
			
			mitem_UserSecenekler1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					panel_UserGiris.setVisible(false);
					panel_UserKargomNerede.setVisible(false);
					panel_UserYeniKargo.setVisible(false);
					panel_UserProfil.setVisible(true);	
				}
			});
			
			Action action = new AbstractAction()
			{
			    /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
			    public void actionPerformed(ActionEvent e)
			    {
			    	String kadi=txt_LoginKadi.getText();
					
					
					if(kadi.equals("admin")){
						administrator.setVisible(true);
						login.setVisible(false); 
					}
					else if(kadi.equals("sube")){
						officer.setVisible(true);
						login.setVisible(false);
					}
					else if(kadi.equals("user")){
						user.setVisible(true);
						login.setVisible(false);
						
					}
					else{
						JOptionPane.showMessageDialog(null,"Hatalý Giriþ Denemesi");
					}
			    }
			};
			txt_LoginKadi.addActionListener( action );
			
			
			
			
			
			
	}
}
