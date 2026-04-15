/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int choco = 30;
		int pis = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choco + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");
		System.out.print("シトロン    >");
		String citronBuystr = br.readLine();
		double citronBuy = Double.parseDouble(citronBuystr);

		System.out.print("ショコラ    >");
		String chocoBuystr = br.readLine();
		double chocoBuy = Double.parseDouble(chocoBuystr);

		System.out.print("ピスターシュ    >");
		String pisBuystr = br.readLine();
		double pisBuy = Double.parseDouble(pisBuystr);

		System.out.println("シトロン" + citronBuy + "個");
		System.out.println("ショコラ" + chocoBuy + "個");
		System.out.println("ピスターシュ" + pisBuy + "個");

		double sum1 = citronBuy + chocoBuy + pisBuy;
		int sum2 = (int) (250 * citronBuy + 280 * chocoBuy + 320 * pisBuy);

		System.out.println("\n合計個数" + sum1 + "個");
		System.out.println("合計金額" + sum2 + "円");
		System.out.println("をお買い上げですね。\n承りました。");

		citron = (int) (citron - citronBuy);
		choco = (int) (choco - chocoBuy);
		pis = (int) (pis - pisBuy);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトラン   \\250 ・・・残り" + citron + "個");
		System.out.println("ショコラ   \\280 ・・・残り" + choco + "個");
		System.out.println("ピスターシュ   \\320 ・・・残り" + pis + "個");
	}
}