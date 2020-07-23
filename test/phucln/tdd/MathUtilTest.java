/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phucln.tdd;

//neu dang xai netbean 10
//xoa 2 cai import nay di
import org.junit.Test;
import static org.junit.Assert.*;
import phuc.util.MathUtil;
//add them thu vien jar vao trong libraries
// 2 thu vien ten hamcrest core + junit 4

/**
 *
 * @author ASUS
 */
public class MathUtilTest {

    //class này muốn chạy thì nó có main() riêng, nhấn shift - f6 để chạy
    //mỗi hàm trong class này sẽ biến thành main() //nhiều main() trong
    //1 class luôn, thì hàm cần phải có kí hiệu/chỉ dẫn /annotation @Test
    @Test
    public void testSuccessfulCase() {
        //test các tình huống tham số đưa cho hàm cần test một cách tử tế
//        assertEquals(30, 40);
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));
    }

    //main() khác
    @Test(expected = IllegalArgumentException.class)
    public void testFailedfulCase() {
        //test các tình huống đầu vào cà chớn
        //điều gì xảy ra nếu người dùng muốn tính cF(-5)
        //xin lỗi, tính ko đc, quăng ra 1 message chửi người dùng, đưa âm sao tính
        //ném ra 1 ngoại lệ/Exception bảo rằng tham số/đầu vào vớ vẫn, cà chớn
        //và ngoại lệ là 1 tình huống bất thường ko như dự tính,
        //và nó ko phải là 1 value để có thể so sánh đc
        //ko thể xài hàm assertEquals()
        //ta phải xài chiêu khác
        MathUtil.computeFactorial(-5);
    }
    
    //hàm trả về màu đỏ do ko ném về ngoại lệ như kì vọng
    //code mình còn sai trong tình huống số âm, số dương đã màu xanh rồi
    //hàm còn sai về login, ko sai cú pháp nha, hàm CF()
    //nhưng cho dù viết kiểu cũ sout() bên main() hay assertEq() bên JUnit
    //thì code sai logic/màu đỏ vẫn ko ngăn đc việc ta nhấn nút Clean & Build
    //tức là code ko sai cú pháp, vẫn thoải mái ra được .jar, .war
    //điều này ko hay, ko tốt
    //JUnit CÓ THỂ KẾT HỢP VỚI NGƯỜI KIẾN ĐỂ CẤM RA FILE .JAR .WAR NẾU CODE CÒN 
    //MÀU ĐỎ, DISABLE NÚT BẤM CLEAN & BUILD NẾU MÀU ĐỎ VẪN CÒN TRONG LÚC CHẠY
    //@TEST
    //HÃY NHỚ 2 CON SỐ: 1005 NETBEAN 8, 1204 NETBEAN 10 TRỞ LÊN
}
