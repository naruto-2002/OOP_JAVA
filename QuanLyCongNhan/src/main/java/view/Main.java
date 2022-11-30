/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.IOFile;
import controller.NgayLVException;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BangChamCong;
import model.CongNhan;
import model.XuongSanXuat;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main extends javax.swing.JFrame {

    DefaultTableModel tmCN;
    DefaultTableModel tmXuong;
    DefaultTableModel tmBCC;
    private List<CongNhan> lcn = new ArrayList<>();
    private List<XuongSanXuat> lxuong = new ArrayList<>();
    private List<BangChamCong> lbcc = new ArrayList<>();
    private String fcn = "src\\main\\java\\controller\\CN.dat";
    private String fxuong = "src\\main\\java\\controller\\XUONG.dat";
    private String fbcc = "src\\main\\java\\controller\\BCC.dat";
    
    public Main() {
        initComponents();
        tmCN = (DefaultTableModel) tbCN.getModel();
        tmXuong = (DefaultTableModel) tbX.getModel();
        tmBCC = (DefaultTableModel) tbBCC.getModel();
        loadDataCN();
        loadDataXuong();
        loadDataBCC();
        eventCN();
        eventXuong();
        eventBCC();
    }
    
    private void loadDataCN() {
        File f = new File(fcn);
        if(f.exists())
            lcn = IOFile.read(fcn);
        showCN();
    }
    
    private void showCN() {
        tmCN.setNumRows(0);
        for(CongNhan i: lcn)
            tmCN.addRow(i.toObjects());
    }
    
    private void loadDataXuong() {
        File f = new File(fxuong);
        if(f.exists())
            lxuong = IOFile.read(fxuong);
        showXuong();
    }
    
    private void showXuong() {
        tmXuong.setNumRows(0);
        for(XuongSanXuat i: lxuong)
            tmXuong.addRow(i.toObjects());
    }
    
    private void loadDataBCC() {
        File f = new File(fbcc);
        if(f.exists())
            lbcc = IOFile.read(fbcc);
        showBCC();
    }
    
    private void showBCC() {
        tmBCC.setNumRows(0);
        for(BangChamCong i: lbcc)
            tmBCC.addRow(i.toObjects());
    }
    
    private void setButtonCN(boolean b) {
        themCNBT.setEnabled(b);
        capnhatCNBT.setEnabled(!b);
        boquaCNBT.setEnabled(!b);
    }
    
    private void setButtonXuong(boolean b) {
        themXBT.setEnabled(b);
        capnhatXBT.setEnabled(!b);
        boquaXBT.setEnabled(!b);
    }
    
    private void setButtonBCC(boolean b) {
        themBCCBT.setEnabled(b);
        capnhatBCCBT.setEnabled(!b);
        boquaBCCBT.setEnabled(!b);
    }
    
    private void eventCN() {
        themCNBT.addActionListener(e -> {
            maCNTF.setText(1000 + lcn.size() + "");
            hotenCNTF.requestFocus();
            setButtonCN(false);
        });
        xoaCNBT.addActionListener(e -> {
            int row = tbCN.getSelectedRow();
            if(row >= 0 && row < tbCN.getRowCount()) {
                lcn.remove(row);
                tmCN.removeRow(row);
            }else {
                JOptionPane.showMessageDialog(this, "Chon dong de xoa");
            }
        });
        luuCNBT.addActionListener(e -> {
            IOFile.write(lcn, fcn);
        });
        capnhatCNBT.addActionListener(e -> {
            try{
                int ma = Integer.parseInt(maCNTF.getText());
                String hoten = hotenCNTF.getText(), dc = dcCNTF.getText();
                if(hoten.isEmpty() || dc.isEmpty()) throw new TrongException();
                int soDT = Integer.parseInt(soDTCNTF.getText());
                int bac = Integer.parseInt(bacCNCB.getSelectedItem().toString());
                CongNhan cn = new CongNhan(ma, hoten, dc, soDT, bac);
                lcn.add(cn);
                tmCN.addRow(cn.toObjects());
                setButtonCN(true);
            } catch(TrongException ex) {
                JOptionPane.showMessageDialog(this, "khong de trong!!!");
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Nhap dung so dien thoai");
            }
        });
        boquaCNBT.addActionListener(e -> {
            setButtonCN(true);
        });
    }
    
    private void eventXuong() {
        themXBT.addActionListener(e -> {
            maXTF.setText(100 + lxuong.size() + "");
            tenXTF.requestFocus();
            setButtonXuong(false);
        });
        suaXBT.addActionListener(e -> {
            try{
                int row = tbX.getSelectedRow();
                if(row >= 0 && row < tbX.getRowCount()) {
                    String ten = tenXTF.getText();
                    if(ten.isEmpty()) throw new TrongException();
                    XuongSanXuat xsx = new XuongSanXuat(Integer.parseInt(maXTF.getText()),
                            ten, Integer.parseInt(hesoCVXCB.getSelectedItem().toString()));
                    lxuong.set(row, xsx);
                    tmXuong.removeRow(row);
                    tmXuong.insertRow(row, xsx.toObjects());
                }else {
                    JOptionPane.showMessageDialog(this, "Chon dong de sua");
                }
            }catch(TrongException ex) {
                JOptionPane.showMessageDialog(this, "Khong de trong!!!");
            }
        });
        luuXBT.addActionListener(e -> {
            IOFile.write(lxuong, fxuong);
        });
        capnhatXBT.addActionListener(e -> {
            try{
               String ten = tenXTF.getText();
               if(ten.isEmpty()) throw new TrongException();
               XuongSanXuat xsx = new XuongSanXuat(Integer.parseInt(maXTF.getText()),
                       ten, Integer.parseInt(hesoCVXCB.getSelectedItem().toString()));
               lxuong.add(xsx);
               tmXuong.addRow(xsx.toObjects());
               setButtonXuong(true);
            }catch(TrongException ex) {
                JOptionPane.showMessageDialog(this, "Khong de trong!!!");
            }
        });
        boquaXBT.addActionListener(e -> {
            setButtonXuong(true);
        });
    }
    
    private int getSongayLV(int ma) {
        int sng = 0;
        for(BangChamCong i: lbcc)
            if(ma == i.getCongNhan().getMa()) sng += i.getSongayLV();
        return sng;
    }
    
    private CongNhan getCN(int ma) {
        for(CongNhan i: lcn)
            if(ma == i.getMa())
                return i;
        return null;
    }
    
    private XuongSanXuat getXuong(int ma) {
        for(XuongSanXuat i: lxuong)
            if(ma == i.getMa())
                return i;
        return null;
    }
    
    private void eventBCC() {
        lamtuoiBCCBT.addActionListener(e -> {
            maCNBCCCB.removeAllItems();
            for(CongNhan i: lcn)
                maCNBCCCB.addItem(Integer.toString(i.getMa()));
            maXBCCCB.removeAllItems();
            for(XuongSanXuat i: lxuong)
                maXBCCCB.addItem(Integer.toString(i.getMa()));
        });
        themBCCBT.addActionListener(e -> {
            soDTCNTF.requestFocus();
            setButtonBCC(false);
        });
        luuBCCBT.addActionListener(e -> {
            IOFile.write(lbcc, fbcc);
        });
        capnhatBCCBT.addActionListener(e -> {
            try{
                int songay = Integer.parseInt(songayLVBCCTF.getText());
                if(getSongayLV(Integer.parseInt(maCNBCCCB.getSelectedItem().toString())) + songay > 31)
                    throw new NgayLVException();
                int maCN = Integer.parseInt(maCNBCCCB.getSelectedItem().toString());
                int maX = Integer.parseInt(maXBCCCB.getSelectedItem().toString());
                BangChamCong bcc = new BangChamCong(getCN(maCN), getXuong(maX), songay);
                lbcc.add(bcc);
                tmBCC.addRow(bcc.toObjects());
                setButtonBCC(true);
                
            }catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Nhap so");
            }catch(NgayLVException ex) {
                JOptionPane.showMessageDialog(this, "So ngay lam viec bi qua");
            }
            
        });
        boquaBCCBT.addActionListener(e -> {
            setButtonBCC(true);
        });
        sapxepBCCBT.addActionListener(e -> {
            int i = sapxepBCCCB.getSelectedIndex();
            if(i == 0) {
                lbcc.sort(new Comparator<BangChamCong>(){
                    @Override
                    public int compare(BangChamCong o1, BangChamCong o2) {
                        String[] t1 = o1.getCongNhan().getHoten().split("\\s+");
                        String[] t2 = o2.getCongNhan().getHoten().split("\\s+");
                        String ten1 = t1[t1.length - 1] + o1.getCongNhan().getHoten();
                        String ten2 = t2[t2.length - 1] + o2.getCongNhan().getHoten();
                        return ten1.compareToIgnoreCase(ten2);
                    }
                });
            }
            if(i == 1) {
                lbcc.sort(new Comparator<BangChamCong>() {
                    @Override
                    public int compare(BangChamCong o1, BangChamCong o2) {
                        return o1.getSongayLV() - o2.getSongayLV();
                    }
                });
            }
            showBCC();
        });
        tkBCCBT.addActionListener(e -> {
            Map<String, Integer> o = lbcc.stream().collect(
                    Collectors.groupingBy(BangChamCong::getMavsTen, Collectors.summingInt(BangChamCong::getTN)));
            tkBCCTFA.append("-------------------------------------------------------------------------\n");
            tkBCCTFA.append("Ma\tHo va ten\tThu nhap\n");
            o.forEach((t, u) -> {
                tkBCCTFA.append(t + "\t" + u + "\n");
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCN = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maCNTF = new javax.swing.JTextField();
        hotenCNTF = new javax.swing.JTextField();
        dcCNTF = new javax.swing.JTextField();
        soDTCNTF = new javax.swing.JTextField();
        bacCNCB = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        themCNBT = new javax.swing.JButton();
        xoaCNBT = new javax.swing.JButton();
        luuCNBT = new javax.swing.JButton();
        capnhatCNBT = new javax.swing.JButton();
        boquaCNBT = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbX = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        maXTF = new javax.swing.JTextField();
        tenXTF = new javax.swing.JTextField();
        hesoCVXCB = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        themXBT = new javax.swing.JButton();
        suaXBT = new javax.swing.JButton();
        luuXBT = new javax.swing.JButton();
        capnhatXBT = new javax.swing.JButton();
        boquaXBT = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBCC = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        maCNBCCCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        maXBCCCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        songayLVBCCTF = new javax.swing.JTextField();
        lamtuoiBCCBT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        sapxepBCCCB = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        themBCCBT = new javax.swing.JButton();
        luuBCCBT = new javax.swing.JButton();
        capnhatBCCBT = new javax.swing.JButton();
        boquaBCCBT = new javax.swing.JButton();
        sapxepBCCBT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tkBCCTFA = new javax.swing.JTextArea();
        tkBCCBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbCN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma", "Ho va ten", "Dia chi", "So dien thoai", "Bac"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCN);

        jLabel1.setText("Ma:");

        jLabel2.setText("Ho va ten:");

        jLabel3.setText("Dia chi:");

        jLabel4.setText("So dien thoai:");

        jLabel5.setText("Bac:");

        maCNTF.setEditable(false);

        bacCNCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maCNTF)
                    .addComponent(hotenCNTF)
                    .addComponent(dcCNTF)
                    .addComponent(soDTCNTF)
                    .addComponent(bacCNCB, 0, 318, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maCNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hotenCNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dcCNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(soDTCNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bacCNCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        themCNBT.setText("Them");

        xoaCNBT.setText("Xoa");

        luuCNBT.setText("Luu vao file");

        capnhatCNBT.setText("Cap nhat");

        boquaCNBT.setText("Bo qua");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(luuCNBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capnhatCNBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boquaCNBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaCNBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themCNBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(themCNBT)
                .addGap(18, 18, 18)
                .addComponent(xoaCNBT)
                .addGap(18, 18, 18)
                .addComponent(luuCNBT)
                .addGap(18, 18, 18)
                .addComponent(capnhatCNBT)
                .addGap(18, 18, 18)
                .addComponent(boquaCNBT)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Cong nhan", p1);

        tbX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma", "Ten", "He so cong viec"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbXMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbX);

        jLabel6.setText("Ma:");

        jLabel7.setText("Ten:");

        jLabel10.setText("He so cong viec:");

        maXTF.setEditable(false);

        hesoCVXCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenXTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesoCVXCB, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maXTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(maXTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenXTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hesoCVXCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        themXBT.setText("Them");

        suaXBT.setText("Sua");

        luuXBT.setText("Luu vao file");

        capnhatXBT.setText("Cap nhat");

        boquaXBT.setText("Bo qua");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(luuXBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capnhatXBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boquaXBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaXBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themXBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(themXBT)
                .addGap(18, 18, 18)
                .addComponent(suaXBT)
                .addGap(18, 18, 18)
                .addComponent(luuXBT)
                .addGap(18, 18, 18)
                .addComponent(capnhatXBT)
                .addGap(18, 18, 18)
                .addComponent(boquaXBT)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(p2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Xuong san xuat", p2);

        tbBCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma cong nhan", "Ho va ten cong nhan", "Ma xuong san xuat", "Ten xuong san xuat", "So ngay lam viec"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBCCMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbBCC);

        jLabel8.setText("Ma cong nhan:");

        jLabel12.setText("Ma xuong san xuat:");

        jLabel13.setText("So ngay lam viec:");

        lamtuoiBCCBT.setText("Lam tuoi 2 ma");

        jLabel9.setText("Sap xep:");

        sapxepBCCCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ho va ten cong nhan", "So ngay lam viec" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lamtuoiBCCBT))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maCNBCCCB, 0, 283, Short.MAX_VALUE)
                            .addComponent(maXBCCCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songayLVBCCTF)
                            .addComponent(sapxepBCCCB, 0, 283, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maCNBCCCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(maXBCCCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lamtuoiBCCBT)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(songayLVBCCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sapxepBCCCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        themBCCBT.setText("Them");

        luuBCCBT.setText("Luu vao file");

        capnhatBCCBT.setText("Cap nhat");

        boquaBCCBT.setText("Bo qua");

        sapxepBCCBT.setText("Sap xep");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(luuBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capnhatBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boquaBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sapxepBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(themBCCBT)
                .addGap(18, 18, 18)
                .addComponent(luuBCCBT)
                .addGap(18, 18, 18)
                .addComponent(capnhatBCCBT)
                .addGap(18, 18, 18)
                .addComponent(boquaBCCBT)
                .addGap(18, 18, 18)
                .addComponent(sapxepBCCBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tkBCCTFA.setColumns(20);
        tkBCCTFA.setRows(5);
        jScrollPane4.setViewportView(tkBCCTFA);

        tkBCCBT.setText("Thong ke thu nhap cua tung cong nhan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(tkBCCBT, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tkBCCBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(p3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Bang cham cong", p3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbXMouseClicked
        // TODO add your handling code here:
        int row = tbX.getSelectedRow();
        if(row >= 0 && row < tbX.getRowCount()) {
            maXTF.setText(tbX.getValueAt(row, 0).toString());
            tenXTF.setText(tbX.getValueAt(row, 1).toString());
            String hscv = tbX.getValueAt(row, 2).toString();
            for(int i = 0; i < hesoCVXCB.getItemCount(); i++) {
                if(hscv.equalsIgnoreCase(hesoCVXCB.getItemAt(i))) {
                    hesoCVXCB.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tbXMouseClicked

    private void tbBCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBCCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBCCMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bacCNCB;
    private javax.swing.JButton boquaBCCBT;
    private javax.swing.JButton boquaCNBT;
    private javax.swing.JButton boquaXBT;
    private javax.swing.JButton capnhatBCCBT;
    private javax.swing.JButton capnhatCNBT;
    private javax.swing.JButton capnhatXBT;
    private javax.swing.JTextField dcCNTF;
    private javax.swing.JComboBox<String> hesoCVXCB;
    private javax.swing.JTextField hotenCNTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton lamtuoiBCCBT;
    private javax.swing.JButton luuBCCBT;
    private javax.swing.JButton luuCNBT;
    private javax.swing.JButton luuXBT;
    private javax.swing.JComboBox<String> maCNBCCCB;
    private javax.swing.JTextField maCNTF;
    private javax.swing.JComboBox<String> maXBCCCB;
    private javax.swing.JTextField maXTF;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JButton sapxepBCCBT;
    private javax.swing.JComboBox<String> sapxepBCCCB;
    private javax.swing.JTextField soDTCNTF;
    private javax.swing.JTextField songayLVBCCTF;
    private javax.swing.JButton suaXBT;
    private javax.swing.JTable tbBCC;
    private javax.swing.JTable tbCN;
    private javax.swing.JTable tbX;
    private javax.swing.JTextField tenXTF;
    private javax.swing.JButton themBCCBT;
    private javax.swing.JButton themCNBT;
    private javax.swing.JButton themXBT;
    private javax.swing.JButton tkBCCBT;
    private javax.swing.JTextArea tkBCCTFA;
    private javax.swing.JButton xoaCNBT;
    // End of variables declaration//GEN-END:variables
}
