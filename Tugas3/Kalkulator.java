package Tugas3;
import javax.swing.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {
    JLabel ljudul = new JLabel("Kalkulator Balok");
    JLabel llebar = new JLabel("Lebar");
    JLabel lpanjang = new JLabel("Panjang");
    JLabel ltinggi = new JLabel("Tinggi");
    JLabel lhasil = new JLabel("Hasil : ");

    JLabel lluas = new JLabel("");
    JLabel lkeliling = new JLabel("");
    JLabel lvolume = new JLabel("");
    JLabel lluasPermukaan = new JLabel("");

    JTextField tflebar = new JTextField();
    JTextField tfpanjang = new JTextField();
    JTextField tftinggi = new JTextField();

    JButton btnhitung = new JButton("Hitung");
    JButton btnreset = new JButton("Reset");

    public Kalkulator(){
        setSize(450,500);
        setLayout(null);

        add(ljudul);
        add(llebar);
        add(lpanjang);
        add(ltinggi);
        add(lhasil);

        add(tflebar);
        add(tfpanjang);
        add(tftinggi);

        add(lluas);
        add(lkeliling);
        add(lvolume);
        add(lluasPermukaan);

        add(btnhitung);
        add(btnreset);


        ljudul.setBounds(200,20,200,25);

        llebar.setBounds(20,70,150,25);
        tflebar.setBounds(180,70,150,25);

        lpanjang.setBounds(20,120,150,25);
        tfpanjang.setBounds(180,120,150,25);

        ltinggi.setBounds(20,170,150,25);
        tftinggi.setBounds(180,170,150,25);

        lhasil.setBounds(200,200,200,25);

        lluas.setBounds(20,240,300,25);
        lkeliling.setBounds(20,280,300,25);
        lvolume.setBounds(20,320,300,25);
        lluasPermukaan.setBounds(20,360,300,25);

        btnhitung.setBounds(50,400,150,25);
        btnreset.setBounds(250,400,150,25);


        btnhitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double panjang = Double.parseDouble(tfpanjang.getText());
                    double lebar = Double.parseDouble(tflebar.getText());
                    double tinggi = Double.parseDouble(tftinggi.getText());

                    double luas = panjang * lebar;
                    double keliling = 2 * (panjang + lebar);
                    double volume = panjang * lebar * tinggi;
                    double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

                    lluas.setText("Luas Persegi Panjang : " + luas);
                    lkeliling.setText("Keliling Persegi Panjang : " + keliling);
                    lvolume.setText("Volume Balok : " + volume);
                    lluasPermukaan.setText("Luas Permukaan Balok : " + luasPermukaan);
                }
                catch(Exception ee) {
                    if(ee.getMessage() == "empty String")
                        JOptionPane.showMessageDialog(null,"Data tidak boleh kosong!");
                    else
                        JOptionPane.showMessageDialog(null,ee.getMessage());
                }


            }
        });

        btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfpanjang.setText("");
                tflebar.setText("");
                tftinggi.setText("");
                lluas.setText("");
                lkeliling.setText("");
                lvolume.setText("");
                lluasPermukaan.setText("");
            }
        });



        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
