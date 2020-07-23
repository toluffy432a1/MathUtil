/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static phuc.util.MathUtil.computeFactorial;

/**
 *
 * @author ASUS
 */

public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("5! = " + computeFactorial(5));
        
        //khi ta viết code xong, ta/dev phải test xem hàm/class/app chạy có 
        //đúng không, việc này gọi là UnitTest, test mức hàm, mức class, mức đvi
        //test = cách đưa data vào hàm, class, chạy hàm, xem kết quả trả về
        //(actual value) rồi ta so kết quả trả về có đúng như ta đã mong đợi
        //hoặc là tính toán trước đó, mong đợi: expected value
        //nếu actual = expected hàm chạy đúng/xử lí đúng như mong đợi
        //nếu không bằng nhau, hàm sai rồi, hoặc ta mong đợi sai
        //trong main() ta sout() kết quả actual so sánh với mong đợi expected
        //việc này gọi là kiểm thử bằng mắt, tự dùng mắt so sánh và luận két quả
        
        //expected: 1; hi vọng hàm này chạy về con số 1
        //nếu khi chạy không in ra 1 mà in ra 10 ( ví dụ ), 10 được gọi là actual value
        System.out.println("1! = " + computeFactorial(1));

        //expected: 1, hy vọng hàm tính 0! sẽ là 1, thực tế (Actual) phải chạy
        System.out.println("0! = " + computeFactorial(0));

        //expected: 2
        System.out.println("2! = " + computeFactorial(2));

        //expected: 6
        System.out.println("3! = " + computeFactorial(3));

        //expected: Error nếu đưa error
        System.out.println("-5! = " + computeFactorial(-5));
    }
    //cách test = mắt có rủi ro nhỏ: tự so sánh data, luận, nhiều kq quá
    //dễ bị rối mắt và sai sót
    //trong giang hồ người ta độ ra 1 kĩ thuật để test app/hàm chạy có đúng không
    //bằng cách: gọi hàm với data đưa vào, lấy kq actual tự so sánh luôn với
    //expected, nếu đúng, khớp, bằng, in ra màu xanh
    //              sai, lệch, ko bằng, in ra màu đỏ
    //và quan trọng hơn
    //nếu gọi nhiều hàm, gọi nhiều lần như đoạn code trên thì
    //XANH: tất cả phải xanh
    //ĐỎ: 1 trong đám bị đỏ, coi như cả đám đỏ
    //màu xanh: khớp giữa expected và actual, do đó nếu có 1 cái không khớp
    //màu đỏ -> chứng minh 1 điều hàm lúc đúng lúc sai -> không tốt
    //để lama2 điều này ta cần 1 đồ chơi/thư viện phụ trợ
    //để nó tự so sánh giùm expected vs actual, in ra màu sắc
    //thư viện này mang tên là: Junit, testNG (Java)
    //                          xUnit, NUnit, MSUnit  (C#)
    //                          PHPUnit
    //                          CPPUnit
    //                          ...
    //.jar, .dll, ...
    
}
