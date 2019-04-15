package de.hawh.ld.dateofeaster;

public class Main {

    public static void main(String[] args) {
	Main.easter(2019);
    }

    static void easter(int year) {
        int remA = year % 19;
        int quoB = year / 100;
        int remC = year % 100;
        int quoD = quoB / 4;
        int remE = quoB % 4;
        int quoF = (8 * quoB + 13) / 25;
        int remH = (19 * remA + quoB - quoD - quoF + 15) % 30;
        int quoJ = remC / 4;
        int remK = remC % 4;
        int quoL = (remA + 11 * remH) / 319;
        int remM = (2 * remE + 2 * quoJ - remK - remH + quoL + 32) % 7;
        int quoN = (remH - quoL + remM +90) / 25;
        int remO = (remH - quoL + remM + quoN + 19) % 32;

        System.out.printf("Easter is on the %d/%d/%d", remO, quoN, year);

    }
}
