
package Handling;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author rhyze
 */

public class Program extends JFrame {
    
    JFrame frame = new JFrame();
    JLabel labeljudul = new JLabel ("Ini Judul");
    
    JLabel labeljenkel = new JLabel ("Jenis Kelamin :");
    JRadioButton radiolaki = new JRadioButton(" Laki-Laki ");
    JRadioButton radiocewe = new JRadioButton(" Perempuan ");
    ButtonGroup buttonjenkel = new ButtonGroup();
    JTextField fieldjenkel = new JTextField("Belum Dipilih");//
    
    JLabel labelagama = new JLabel ("Agama :");
    String pilihagama []
           = {"Islam", "Katolik", "Protestan", "Hindu", "Buddha", "Konghuchu"};
    JComboBox comboagama = new JComboBox(pilihagama);
    JTextField fieldagama = new JTextField("Islam");
    
    JLabel labeltujuan = new JLabel ("Setelah lulus :");
    JCheckBox cektujuan1 = new JCheckBox ("Lanjut Studi");
    JCheckBox cektujuan2 = new JCheckBox ("Bekerja");
    JTextField fieldtujuan = new JTextField("Belum Dipilih");
    
    JLabel labelberangkat = new JLabel ("Metode Berangkat:");
    JTextField berangkat1 = new JTextField("Jalan Kaki");
    JTextField berangkat2 = new JTextField("Kendaraan Bermotor");
    JTextField berangkat3 = new JTextField("Diantar");
    JTextField berangkat4 = new JTextField("Ojek");
    JTextField hasilberangkat = new JTextField();
    
    Font font = new Font("Helvetica", Font.BOLD, 30);
    Font font1 = new Font("Helvetica", Font.BOLD, 20);
    Font font2 = new Font("Helvetica", Font.BOLD, 15);
    Font font3 = new Font("Courier", Font.BOLD, 23);
    
    public Program() {
        frame.setTitle("Ini Title");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.add(labeljudul);
        labeljudul.setBounds(370, 20, 100, 20);
        labeljudul.setFont(font1);
        
        frame.add(labeljenkel);
        labeljenkel.setBounds(50, 70, 150, 20);
        labeljenkel.setFont(font2);
        frame.add(radiolaki);
        radiolaki.setBounds(200, 70, 100, 20);
        frame.add(radiocewe);
        radiocewe.setBounds(300, 70, 100, 20);
        buttonjenkel.add(radiolaki);
        buttonjenkel.add(radiocewe);
        
         radiolaki.addItemListener((ItemEvent event) -> {
            if (event.getSource() == radiolaki) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    fieldjenkel.setText("Laki-Laki");
                }
            }
        } );
         radiocewe.addItemListener((ItemEvent event) -> {
            if (event.getSource() == radiocewe) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    fieldjenkel.setText("Perempuan");
                }
            }
        } );
        frame.add(fieldjenkel);
        fieldjenkel.setBounds(200, 100, 200, 35);
        fieldjenkel.setEditable(false);
        
        frame.add(labelagama);
        labelagama.setBounds(50, 140, 150, 20);
        labelagama.setFont(font2);
        frame.add(comboagama);
        comboagama.setBounds(200, 140, 200, 20);
        
         comboagama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (comboagama.getSelectedIndex() == 0) {
                    fieldagama.setText("Islam");
                } 
                else if (comboagama.getSelectedIndex() == 1) {
                    fieldagama.setText("Katolik");
                } 
                else if (comboagama.getSelectedIndex() == 2) {
                    fieldagama.setText("Protestan");
                } 
                else if (comboagama.getSelectedIndex() == 3) {
                    fieldagama.setText("Hindu");
                } 
                else if (comboagama.getSelectedIndex() == 4) {
                    fieldagama.setText("Buddha");
                }
                else if (comboagama.getSelectedIndex() == 5) {
                    fieldagama.setText("Konghuchu");
                }
            }
        } );
        frame.add(fieldagama);
        fieldagama.setBounds(200, 170, 200, 35);
        fieldagama.setEditable(false);
        
        frame.add(labeltujuan);
        labeltujuan.setBounds(50, 210, 150, 20);
        labeltujuan.setFont(font2);
        frame.add(cektujuan1);
        cektujuan1.setBounds(200, 210, 100, 20);
        frame.add(cektujuan2);
        cektujuan2.setBounds(300, 210, 150, 20);
        
        cektujuan1.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cektujuan1) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    fieldtujuan.setText("Lanjut Studi");
                     cektujuan2.setSelected(false);
                }
            }
        } );
         cektujuan2.addItemListener((ItemEvent event) -> {
            if (event.getSource() ==  cektujuan2) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    fieldtujuan.setText("Bekerja");
                    cektujuan1.setSelected(false);
                }
            }
        } );
        frame.add(fieldtujuan);
        fieldtujuan.setBounds(200, 240, 200, 35);
        fieldtujuan.setEditable(false);
        
         fieldjenkel.setHorizontalAlignment(JTextField.CENTER);
          fieldagama.setHorizontalAlignment(JTextField.CENTER);
           fieldtujuan.setHorizontalAlignment(JTextField.CENTER);
        
        frame.add(labelberangkat);
        labelberangkat.setBounds(270, 330, 400, 50);
        labelberangkat.setFont(font);
        
        frame.add(berangkat1);
        berangkat1.setBounds(25, 400, 150, 40);
        berangkat1.setEditable(false);
        berangkat1.setHorizontalAlignment(JTextField.CENTER);
        berangkat1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilberangkat.setText(berangkat1.getText());
            }
        } );
        
        frame.add(berangkat2);
        berangkat2.setBounds(225, 400, 150, 40);
        berangkat2.setEditable(false);
        berangkat2.setHorizontalAlignment(JTextField.CENTER);
        berangkat2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilberangkat.setText(berangkat2.getText());
            }
        } );
        
        frame.add(berangkat3);
        berangkat3.setBounds(425, 400, 150, 40);
        berangkat3.setEditable(false);
        berangkat3.setHorizontalAlignment(JTextField.CENTER);
        berangkat3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilberangkat.setText(berangkat3.getText());
            }
        } );
        
        frame.add(berangkat4);
        berangkat4.setBounds(625, 400, 150, 40);
        berangkat4.setEditable(false);
        berangkat4.setHorizontalAlignment(JTextField.CENTER);
        berangkat4.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                hasilberangkat.setText(berangkat4.getText());
            }
        } );
         
        frame.add(hasilberangkat);
        hasilberangkat.setBounds(25, 450, 750, 50);
        hasilberangkat.setEditable(false);
        hasilberangkat.setFont(font);
        hasilberangkat.setHorizontalAlignment(JTextField.CENTER);
        hasilberangkat.addMouseMotionListener(new MouseAdapter() {
           
            @Override
            public void mouseMoved(MouseEvent e) {
                hasilberangkat.setText(hasilberangkat.getText());
            }
        } );
        hasilberangkat.setFont(font3);
     
    }
    
   
}
    

