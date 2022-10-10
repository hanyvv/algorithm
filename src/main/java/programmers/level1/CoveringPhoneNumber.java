package programmers.level1;

public class CoveringPhoneNumber {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }
        for (int i = length - 4; i < length; i++) {
            sb.append(phone_number.charAt(i));
        }
        return sb.toString();
    }
}
