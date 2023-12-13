public class Main {
    public static void main(String[] args) {
        String[][]dizi=new String[7][30];
        for (int i=0;i< dizi.length;i++){
            for (int k=0;k<dizi[i].length;k++){
             if (k==0^k==3^k==13^k==20^k==21^k==23^k==28){
                 dizi[i][k]="*";
             }
             else if ((i==0&&k==1)^(i==0&&k==2)^(i==3&&k==1)^(i==3&&k==2)) {
                 dizi[i][k]="*";
             }
             else if ((i==0&&k==5)^(i==0&&k==11)^(i==1&&k==6)^(i==1&&k==10)) {
                 dizi[i][k]="*";
             }
             else if ((i==2&&k==7)^(i==2&&k==9)^(i==3&&k==8)^(i==4&&k==7)^(i==5&&k==6)^(i==6&&k==5)){
                 dizi[i][k]="*";
             } else if ((i==0&&k==14)^(i==0&&k==15)^(i==0&&k==16)^(i==6&&k==14)^(i==6&&k==15)^(i==6&&k==16)) {
                 dizi[i][k]="*";
             }
             else if ((i==1&&k==17)^(i==2&&k==18)^(i==3&&k==18)^(i==4&&k==18)^(i==5&&k==17)^(i==6&&k==16)) {
                 dizi[i][k]="*";
             }
             else if ((i==1&&k==24)^(i==2&&k==25)^(i==3&&k==26)^(i==4&&k==18)^(i==4&&k==27)) {
                 dizi[i][k]="*";
             }
             else {
                 dizi[i][k]=" ";
             }
            }
        }
        for (int i=0;i< dizi.length;i++) {
            for (int k = 0; k < dizi[i].length; k++) {
                if (k == 29) {
                    System.out.print(dizi[i][k] + " ");
                    System.out.println();
                } else {
                    System.out.print(dizi[i][k] + " ");
                }
            }
        }

















    }
}