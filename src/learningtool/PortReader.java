package learningtool;

import java.util.StringTokenizer;
import jssc.SerialPort;
import jssc.SerialPortException;

public class PortReader {
    static SerialPort serialPort;
    int thumb, index, middle, ring, little;
    double x, y;
    
    public PortReader(String s){
        serialPort = new SerialPort(s);
        thumb = index = middle = ring = little = 0;
        x = y = 0.00;
    }
    
    public void readPort(){
        try {
            System.out.println("port open :" + serialPort.openPort());
            serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            
//            int mask = SerialPort.MASK_RXCHAR + SerialPort.MASK_CTS + SerialPort.MASK_DSR;
//            serialPort.setEventsMask(mask);
            
            String s = serialPort.readString(45);
            StringBuilder sb = new StringBuilder();
            boolean read = false;
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i)=='>')
                    read = true;
                else if (s.charAt(i)=='<')
                    break;
                else if (read==true)
                    sb.append(s.charAt(i));
            }
            
            StringTokenizer st = new StringTokenizer(sb.toString(), " ");
            thumb = Integer.parseInt(st.nextToken());
            index = Integer.parseInt(st.nextToken());
            middle = Integer.parseInt(st.nextToken());
            ring = Integer.parseInt(st.nextToken());
            little = Integer.parseInt(st.nextToken());
            
            //System.out.println(thumb+" "+index+" "+middle+" "+ring+" "+little);
            
            if (thumb>=70 && thumb<=110 && index>=160 && index<=200 && middle>=165 && middle<=205 && ring>=110 && ring<=150 && little>=60 && little<=100)
                System.out.println("ooooo");
            if (thumb>=15 && thumb<=55 && index>=70 && index<=110 && middle>=65 && middle<=105 && ring>=20 && ring<=60 && little>=0 && little<=35)
                System.out.println("aaaaa");
            if (thumb>=165 && thumb<=205 && index>=175 && index<=215 && middle>=175 && middle<=215 && ring>=200 && ring<=240 && little>=200 && little<=240)
                System.out.println("eeeee");
            if (thumb>=35 && thumb<=75 && index>=90 && index<=130 && middle>=180 && middle<=220 && ring>=185 && ring<=225 && little>=170 && little<=210)
                System.out.println("uuuuu");
            if (thumb>=0 && thumb<=40 && index>=230 && index<=270 && middle>=190 && middle<=230 && ring>=180 && ring<=220 && little>=180 && little<=220)
                System.out.println("aaaee");
            
            System.out.println("port closed: "+ serialPort.closePort());
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }
}
