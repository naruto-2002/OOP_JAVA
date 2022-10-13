/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien_dien_file;

/**
 *
 * @author Nguyen Cong Van
 */
public class Family {
    String code, name, type;
    int headIndex, endIndex;
    
    static int cnt = 1;
    
    Family(String name, String type, int headIndex, int endIndex) {
        code = "KH" + (cnt < 10? '0' + Integer.toString(cnt): Integer.toString(cnt));
        cnt++;
        this.name = formName(name);
        this.type = type;
        this.headIndex = headIndex;
        this.endIndex = endIndex;
    }
    
    String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans) {
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    int getMoney() {
        if(type.equals("A")) return 100;
        else if(type.equals("B")) return 500;
        else return 200;
    }
    
    int getMoneyIn() {
        int electricity = endIndex - headIndex;
        if(electricity <= getMoney()) return electricity*450;
        else return getMoney()*450;
    }
    
    int getMoneyPass() {
        int electricity = endIndex - headIndex;
        if(electricity > getMoney()) return (electricity - getMoney())*1000;
        else return 0;
    }
    
    int getTax() {
        return (int) (getMoneyPass()*0.05);
    }
    
    int getTotal() {
        return getMoneyIn() + getMoneyPass() + getTax();
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + getMoneyIn() + " " + getMoneyPass() + " " + getTax() + " " + getTotal();
    }
}
