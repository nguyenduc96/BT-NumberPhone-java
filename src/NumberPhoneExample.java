import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneExample {
    public static void main(String[] args) {
        final String NUMBER_PHONE = "^[0-9]{2}(\\-)+[0]{1}+[0-9]{9}$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại : ");
        String numberPhone = scanner.nextLine();

        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(numberPhone);
        if (matcher.matches()){
            System.out.println("Số điện thoại : " + numberPhone + " hợp lệ");
        } else {
            System.out.println("Số điện thoại : " + numberPhone + " không hợp lệ");
        }

    }
}
