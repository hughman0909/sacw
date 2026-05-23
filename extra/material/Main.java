import java.util.*;

/**
 * あるシステムにログインIDとパスワードを入力してる感じのやつ
 */
public class Main {
    public static void main(String args[]) {
        String a = "";
        String b = "I am from Kithub";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String id = sc.nextLine(); // 入力受付し、入力されたものをidに代入
        System.out.print("Enter your Password: ");
        int pass = sc.nextInt(); // 入力受付し、入力されたものをpassに代入
        if (is_okay(id, pass)) {
            System.out.println("you made it!!!"); // クリア
        } else {
            System.out.println("you failed to login"); // 失敗
        }
    }

    /**
     * ログインIDとパスワードが正しいかどうかを確認するクラスメソッド
     * ログインIDはadminでパスワードは123
     * 
     * @param id ログインID
     * @param pass パスワード
     * @return
     */
    public static boolean is_okay(String id, int pass) {
        if (id.equals("admin") && pass == 123) {
            return true;
        } else {
            return false;
        }
    }
}
